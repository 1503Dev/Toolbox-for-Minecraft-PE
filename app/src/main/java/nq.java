package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* renamed from: nq  reason: default package */
public class nq extends ViewGroup {
    public int P;
    public int Q;
    public boolean R;

    public nq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public nq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.R = false;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ij0.FlowLayout, 0, 0);
        this.P = obtainStyledAttributes.getDimensionPixelSize(ij0.FlowLayout_lineSpacing, 0);
        this.Q = obtainStyledAttributes.getDimensionPixelSize(ij0.FlowLayout_itemSpacing, 0);
        obtainStyledAttributes.recycle();
    }

    public boolean a() {
        return this.R;
    }

    public int getItemSpacing() {
        return this.Q;
    }

    public int getLineSpacing() {
        return this.P;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int paddingRight;
        int i5;
        int i6;
        if (getChildCount() == 0) {
            return;
        }
        WeakHashMap<View, String> weakHashMap = a41.a;
        boolean z2 = true;
        if (getLayoutDirection() != 1) {
            z2 = false;
        }
        if (z2) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (z2) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int i7 = (i3 - i) - paddingRight;
        int i8 = paddingLeft;
        int i9 = paddingTop;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i6 = marginLayoutParams.getMarginStart();
                    i5 = marginLayoutParams.getMarginEnd();
                } else {
                    i5 = 0;
                    i6 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i8 + i6;
                if (!this.R && measuredWidth > i7) {
                    i9 = this.P + paddingTop;
                    i8 = paddingLeft;
                }
                int i11 = i8 + i6;
                int measuredWidth2 = childAt.getMeasuredWidth() + i11;
                int measuredHeight = childAt.getMeasuredHeight() + i9;
                if (z2) {
                    i11 = i7 - measuredWidth2;
                    measuredWidth2 = (i7 - i8) - i6;
                }
                childAt.layout(i11, i9, measuredWidth2, measuredHeight);
                i8 += childAt.getMeasuredWidth() + i6 + i5 + this.Q;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            i3 = Integer.MAX_VALUE;
        } else {
            i3 = size;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i3 - getPaddingRight();
        int i6 = paddingTop;
        int i7 = 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i5 = marginLayoutParams.leftMargin + 0;
                    i4 = marginLayoutParams.rightMargin + 0;
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                if (childAt.getMeasuredWidth() + paddingLeft + i5 > paddingRight && !a()) {
                    paddingLeft = getPaddingLeft();
                    i6 = this.P + paddingTop;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i5;
                int measuredHeight = childAt.getMeasuredHeight() + i6;
                if (measuredWidth > i7) {
                    i7 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i5 + i4 + this.Q + paddingLeft;
                if (i8 == getChildCount() - 1) {
                    i7 += i4;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i7;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            size = Math.min(paddingRight2, size);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 1073741824) {
                size2 = paddingBottom;
            }
        } else {
            size2 = Math.min(paddingBottom, size2);
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i) {
        this.Q = i;
    }

    public void setLineSpacing(int i) {
        this.P = i;
    }

    public void setSingleLine(boolean z) {
        this.R = z;
    }
}