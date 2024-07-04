package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

public class c extends ViewGroup {
    public boolean P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public float V;
    public boolean W;
    public int[] a0;
    public int[] b0;
    public Drawable c0;
    public int d0;
    public int e0;
    public int f0;
    public int g0;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends ViewGroup.MarginLayoutParams {
        public float a;
        public int b;

        public a(int i, int i2) {
            super(i, i2);
            this.b = -1;
            this.a = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lj0.LinearLayoutCompat_Layout);
            this.a = obtainStyledAttributes.getFloat(lj0.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.b = obtainStyledAttributes.getInt(lj0.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = -1;
        }
    }

    public c(Context context) {
        this(context, null);
    }

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Drawable drawable;
        int resourceId;
        this.P = true;
        this.Q = -1;
        this.R = 0;
        this.T = 8388659;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lj0.LinearLayoutCompat, i, 0);
        int i2 = obtainStyledAttributes.getInt(lj0.LinearLayoutCompat_android_orientation, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = obtainStyledAttributes.getInt(lj0.LinearLayoutCompat_android_gravity, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = obtainStyledAttributes.getBoolean(lj0.LinearLayoutCompat_android_baselineAligned, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.V = obtainStyledAttributes.getFloat(lj0.LinearLayoutCompat_android_weightSum, -1.0f);
        this.Q = obtainStyledAttributes.getInt(lj0.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.W = obtainStyledAttributes.getBoolean(lj0.LinearLayoutCompat_measureWithLargestChild, false);
        int i4 = lj0.LinearLayoutCompat_divider;
        if (obtainStyledAttributes.hasValue(i4) && (resourceId = obtainStyledAttributes.getResourceId(i4, 0)) != 0) {
            drawable = z5.b(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(i4);
        }
        setDividerDrawable(drawable);
        this.f0 = obtainStyledAttributes.getInt(lj0.LinearLayoutCompat_showDividers, 0);
        this.g0 = obtainStyledAttributes.getDimensionPixelSize(lj0.LinearLayoutCompat_dividerPadding, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final void d(Canvas canvas, int i) {
        this.c0.setBounds(getPaddingLeft() + this.g0, i, (getWidth() - getPaddingRight()) - this.g0, this.e0 + i);
        this.c0.draw(canvas);
    }

    public final void e(Canvas canvas, int i) {
        this.c0.setBounds(i, getPaddingTop() + this.g0, this.d0 + i, (getHeight() - getPaddingBottom()) - this.g0);
        this.c0.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f */
    public a generateDefaultLayoutParams() {
        int i = this.S;
        if (i == 0) {
            return new a(-2, -2);
        }
        if (i == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: g */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.Q < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.Q;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.Q == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i3 = this.R;
            if (this.S == 1 && (i = this.T & 112) != 48) {
                if (i == 16) {
                    i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.U) / 2;
                } else if (i == 80) {
                    i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.U;
                }
            }
            return i3 + ((ViewGroup.MarginLayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.Q;
    }

    public Drawable getDividerDrawable() {
        return this.c0;
    }

    public int getDividerPadding() {
        return this.g0;
    }

    public int getDividerWidth() {
        return this.d0;
    }

    public int getGravity() {
        return this.T;
    }

    public int getOrientation() {
        return this.S;
    }

    public int getShowDividers() {
        return this.f0;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.V;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public final boolean i(int i) {
        if (i == 0) {
            return (this.f0 & 1) != 0;
        } else if (i == getChildCount()) {
            return (this.f0 & 4) != 0;
        } else if ((this.f0 & 2) != 0) {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        int left2;
        int bottom;
        if (this.c0 == null) {
            return;
        }
        int i2 = 0;
        if (this.S == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && i(i2)) {
                    d(canvas, (childAt.getTop() - ((ViewGroup.MarginLayoutParams) ((a) childAt.getLayoutParams())).topMargin) - this.e0);
                }
                i2++;
            }
            if (i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.e0;
                } else {
                    bottom = childAt2.getBottom() + ((ViewGroup.MarginLayoutParams) ((a) childAt2.getLayoutParams())).bottomMargin;
                }
                d(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean a2 = c51.a(this);
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && i(i2)) {
                a aVar = (a) childAt3.getLayoutParams();
                if (a2) {
                    left2 = childAt3.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                } else {
                    left2 = (childAt3.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.d0;
                }
                e(canvas, left2);
            }
            i2++;
        }
        if (i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 == null) {
                if (a2) {
                    right = getPaddingLeft();
                } else {
                    left = getWidth();
                    i = getPaddingRight();
                    right = (left - i) - this.d0;
                }
            } else {
                a aVar2 = (a) childAt4.getLayoutParams();
                if (a2) {
                    left = childAt4.getLeft();
                    i = ((ViewGroup.MarginLayoutParams) aVar2).leftMargin;
                    right = (left - i) - this.d0;
                } else {
                    right = childAt4.getRight() + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
                }
            }
            e(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019b  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z2;
        int i14;
        int paddingTop;
        int i15;
        int i16;
        int i17 = 8;
        int i18 = 5;
        if (this.S == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i19 = i3 - i;
            int paddingRight = i19 - getPaddingRight();
            int paddingRight2 = (i19 - paddingLeft2) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i20 = this.T;
            int i21 = i20 & 112;
            int i22 = 8388615 & i20;
            if (i21 != 16) {
                if (i21 != 80) {
                    paddingTop = getPaddingTop();
                } else {
                    paddingTop = ((getPaddingTop() + i4) - i2) - this.U;
                }
            } else {
                paddingTop = getPaddingTop() + (((i4 - i2) - this.U) / 2);
            }
            int i23 = 0;
            while (i23 < virtualChildCount) {
                View childAt = getChildAt(i23);
                if (childAt == null) {
                    paddingTop += 0;
                } else if (childAt.getVisibility() != i17) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    a aVar = (a) childAt.getLayoutParams();
                    int i24 = aVar.b;
                    if (i24 < 0) {
                        i24 = i22;
                    }
                    WeakHashMap<View, String> weakHashMap = a41.a;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i24, getLayoutDirection()) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != i18) {
                            i16 = ((ViewGroup.MarginLayoutParams) aVar).leftMargin + paddingLeft2;
                            if (i(i23)) {
                                paddingTop += this.e0;
                            }
                            int i25 = paddingTop + ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                            int i26 = i25 + 0;
                            childAt.layout(i16, i26, measuredWidth + i16, measuredHeight + i26);
                            paddingTop = e1.d(measuredHeight, ((ViewGroup.MarginLayoutParams) aVar).bottomMargin, 0, i25);
                            i23 += 0;
                        } else {
                            i15 = paddingRight - measuredWidth;
                        }
                    } else {
                        i15 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft2 + ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
                    }
                    i16 = i15 - ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                    if (i(i23)) {
                    }
                    int i252 = paddingTop + ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                    int i262 = i252 + 0;
                    childAt.layout(i16, i262, measuredWidth + i16, measuredHeight + i262);
                    paddingTop = e1.d(measuredHeight, ((ViewGroup.MarginLayoutParams) aVar).bottomMargin, 0, i252);
                    i23 += 0;
                }
                i23++;
                i17 = 8;
                i18 = 5;
            }
            return;
        }
        boolean a2 = c51.a(this);
        int paddingTop2 = getPaddingTop();
        int i27 = i4 - i2;
        int paddingBottom = i27 - getPaddingBottom();
        int paddingBottom2 = (i27 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i28 = this.T;
        int i29 = 8388615 & i28;
        int i30 = i28 & 112;
        boolean z3 = this.P;
        int[] iArr = this.a0;
        int[] iArr2 = this.b0;
        WeakHashMap<View, String> weakHashMap2 = a41.a;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i29, getLayoutDirection());
        if (absoluteGravity2 != 1) {
            if (absoluteGravity2 != 5) {
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = ((getPaddingLeft() + i3) - i) - this.U;
            }
        } else {
            paddingLeft = getPaddingLeft() + (((i3 - i) - this.U) / 2);
        }
        if (a2) {
            i5 = virtualChildCount2 - 1;
            i6 = -1;
        } else {
            i5 = 0;
            i6 = 1;
        }
        int i31 = 0;
        while (i31 < virtualChildCount2) {
            int i32 = (i6 * i31) + i5;
            View childAt2 = getChildAt(i32);
            if (childAt2 == null) {
                paddingLeft += 0;
                i7 = i5;
            } else {
                i7 = i5;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    i8 = virtualChildCount2;
                    a aVar2 = (a) childAt2.getLayoutParams();
                    i9 = i6;
                    if (z3) {
                        i10 = i30;
                        if (((ViewGroup.MarginLayoutParams) aVar2).height != -1) {
                            i11 = childAt2.getBaseline();
                            i12 = aVar2.b;
                            if (i12 < 0) {
                                i12 = i10;
                            }
                            i13 = i12 & 112;
                            z2 = z3;
                            if (i13 == 16) {
                                if (i13 != 48) {
                                    if (i13 != 80) {
                                        i14 = paddingTop2;
                                    } else {
                                        i14 = (paddingBottom - measuredHeight2) - ((ViewGroup.MarginLayoutParams) aVar2).bottomMargin;
                                        if (i11 != -1) {
                                            i14 -= iArr2[2] - (childAt2.getMeasuredHeight() - i11);
                                        }
                                    }
                                } else {
                                    int i33 = ((ViewGroup.MarginLayoutParams) aVar2).topMargin + paddingTop2;
                                    if (i11 != -1) {
                                        i14 = (iArr[1] - i11) + i33;
                                    } else {
                                        i14 = i33;
                                    }
                                }
                            } else {
                                i14 = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop2) + ((ViewGroup.MarginLayoutParams) aVar2).topMargin) - ((ViewGroup.MarginLayoutParams) aVar2).bottomMargin;
                            }
                            if (i(i32)) {
                                paddingLeft += this.d0;
                            }
                            int i34 = paddingLeft + ((ViewGroup.MarginLayoutParams) aVar2).leftMargin;
                            int i35 = i34 + 0;
                            childAt2.layout(i35, i14, measuredWidth2 + i35, measuredHeight2 + i14);
                            i31 += 0;
                            paddingLeft = e1.d(measuredWidth2, ((ViewGroup.MarginLayoutParams) aVar2).rightMargin, 0, i34);
                            i31++;
                            i5 = i7;
                            i6 = i9;
                            virtualChildCount2 = i8;
                            i30 = i10;
                            z3 = z2;
                        }
                    } else {
                        i10 = i30;
                    }
                    i11 = -1;
                    i12 = aVar2.b;
                    if (i12 < 0) {
                    }
                    i13 = i12 & 112;
                    z2 = z3;
                    if (i13 == 16) {
                    }
                    if (i(i32)) {
                    }
                    int i342 = paddingLeft + ((ViewGroup.MarginLayoutParams) aVar2).leftMargin;
                    int i352 = i342 + 0;
                    childAt2.layout(i352, i14, measuredWidth2 + i352, measuredHeight2 + i14);
                    i31 += 0;
                    paddingLeft = e1.d(measuredWidth2, ((ViewGroup.MarginLayoutParams) aVar2).rightMargin, 0, i342);
                    i31++;
                    i5 = i7;
                    i6 = i9;
                    virtualChildCount2 = i8;
                    i30 = i10;
                    z3 = z2;
                }
            }
            i8 = virtualChildCount2;
            i9 = i6;
            i10 = i30;
            z2 = z3;
            i31++;
            i5 = i7;
            i6 = i9;
            virtualChildCount2 = i8;
            i30 = i10;
            z3 = z2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0871  */
    /* JADX WARN: Removed duplicated region for block: B:442:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        boolean z;
        char c;
        int i3;
        boolean z2;
        int max;
        int i4;
        float f;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        char c2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f2;
        int max2;
        boolean z3;
        int i15;
        boolean z4;
        int baseline;
        int i16;
        int max3;
        int i17;
        int i18;
        float f3;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        View view;
        a aVar;
        int max4;
        int max5;
        int i27;
        boolean z5;
        int i28;
        boolean z6;
        int baseline2;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        boolean z7;
        boolean z8;
        int i35;
        int i36;
        int i37;
        a aVar2;
        int i38;
        int i39;
        boolean z9;
        boolean z10;
        int i40;
        int i41 = -2;
        int i42 = 8;
        float f4 = 0.0f;
        int i43 = 1073741824;
        if (this.S == 1) {
            this.U = 0;
            int virtualChildCount = getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i44 = this.Q;
            boolean z11 = this.W;
            float f5 = 0.0f;
            boolean z12 = false;
            boolean z13 = true;
            boolean z14 = false;
            int i45 = 0;
            int i46 = 0;
            int i47 = 0;
            int i48 = 0;
            int i49 = 0;
            int i50 = RecyclerView.UNDEFINED_DURATION;
            int i51 = 0;
            int i52 = 0;
            while (i49 < virtualChildCount) {
                View childAt = getChildAt(i49);
                if (childAt == null) {
                    this.U += i45;
                } else if (childAt.getVisibility() == i42) {
                    i49 += 0;
                } else {
                    if (i(i49)) {
                        this.U += this.e0;
                    }
                    a aVar3 = (a) childAt.getLayoutParams();
                    float f6 = aVar3.a;
                    f5 += f6;
                    if (mode2 == i43 && ((ViewGroup.MarginLayoutParams) aVar3).height == 0 && f6 > f4) {
                        int i53 = this.U;
                        this.U = Math.max(i53, ((ViewGroup.MarginLayoutParams) aVar3).topMargin + i53 + ((ViewGroup.MarginLayoutParams) aVar3).bottomMargin);
                        z12 = true;
                        i38 = i46;
                        i39 = virtualChildCount;
                        i37 = mode2;
                        aVar2 = aVar3;
                    } else {
                        if (((ViewGroup.MarginLayoutParams) aVar3).height == 0 && f6 > f4) {
                            ((ViewGroup.MarginLayoutParams) aVar3).height = i41;
                            i35 = 0;
                        } else {
                            i35 = RecyclerView.UNDEFINED_DURATION;
                        }
                        if (f5 == f4) {
                            i36 = this.U;
                        } else {
                            i36 = 0;
                        }
                        i37 = mode2;
                        aVar2 = aVar3;
                        i38 = i46;
                        i39 = virtualChildCount;
                        int i54 = i35;
                        measureChildWithMargins(childAt, i, 0, i2, i36);
                        if (i54 != i50) {
                            ((ViewGroup.MarginLayoutParams) aVar2).height = i54;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i55 = this.U;
                        this.U = Math.max(i55, i55 + measuredHeight + ((ViewGroup.MarginLayoutParams) aVar2).topMargin + ((ViewGroup.MarginLayoutParams) aVar2).bottomMargin + 0);
                        if (z11) {
                            i47 = Math.max(measuredHeight, i47);
                        }
                    }
                    if (i44 >= 0 && i44 == i49 + 1) {
                        this.R = this.U;
                    }
                    if (i49 < i44 && aVar2.a > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (mode != 1073741824 && ((ViewGroup.MarginLayoutParams) aVar2).width == -1) {
                        z9 = true;
                        z14 = true;
                    } else {
                        z9 = false;
                    }
                    int i56 = ((ViewGroup.MarginLayoutParams) aVar2).leftMargin + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
                    int measuredWidth = childAt.getMeasuredWidth() + i56;
                    int max6 = Math.max(i48, measuredWidth);
                    int combineMeasuredStates = View.combineMeasuredStates(i52, childAt.getMeasuredState());
                    if (z13 && ((ViewGroup.MarginLayoutParams) aVar2).width == -1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (aVar2.a > 0.0f) {
                        if (!z9) {
                            i56 = measuredWidth;
                        }
                        i40 = Math.max(i51, i56);
                        i46 = i38;
                    } else {
                        int i57 = i51;
                        if (!z9) {
                            i56 = measuredWidth;
                        }
                        i46 = Math.max(i38, i56);
                        i40 = i57;
                    }
                    i49 += 0;
                    i52 = combineMeasuredStates;
                    z13 = z10;
                    i51 = i40;
                    i48 = max6;
                    i49++;
                    i45 = 0;
                    i41 = -2;
                    i50 = RecyclerView.UNDEFINED_DURATION;
                    i42 = 8;
                    f4 = 0.0f;
                    i43 = 1073741824;
                    virtualChildCount = i39;
                    mode2 = i37;
                }
                i39 = virtualChildCount;
                i37 = mode2;
                i49++;
                i45 = 0;
                i41 = -2;
                i50 = RecyclerView.UNDEFINED_DURATION;
                i42 = 8;
                f4 = 0.0f;
                i43 = 1073741824;
                virtualChildCount = i39;
                mode2 = i37;
            }
            int i58 = i46;
            int i59 = virtualChildCount;
            int i60 = mode2;
            int i61 = i51;
            int i62 = i52;
            if (this.U > 0 && i(i59)) {
                this.U += this.e0;
            }
            if (z11) {
                i30 = i60;
                if (i30 == Integer.MIN_VALUE || i30 == 0) {
                    int i63 = 0;
                    this.U = 0;
                    int i64 = 0;
                    while (i64 < i59) {
                        View childAt2 = getChildAt(i64);
                        if (childAt2 == null) {
                            this.U += i63;
                        } else if (childAt2.getVisibility() == 8) {
                            i64 += 0;
                        } else {
                            a aVar4 = (a) childAt2.getLayoutParams();
                            int i65 = this.U;
                            this.U = Math.max(i65, i65 + i47 + ((ViewGroup.MarginLayoutParams) aVar4).topMargin + ((ViewGroup.MarginLayoutParams) aVar4).bottomMargin + 0);
                        }
                        i64++;
                        i63 = 0;
                    }
                }
            } else {
                i30 = i60;
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop() + this.U;
            this.U = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, 0);
            int i66 = (16777215 & resolveSizeAndState) - this.U;
            if (!z12 && (i66 == 0 || f5 <= 0.0f)) {
                i32 = Math.max(i58, i61);
                if (z11 && i30 != 1073741824) {
                    for (int i67 = 0; i67 < i59; i67++) {
                        View childAt3 = getChildAt(i67);
                        if (childAt3 != null && childAt3.getVisibility() != 8 && ((a) childAt3.getLayoutParams()).a > 0.0f) {
                            childAt3.measure(View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i47, 1073741824));
                        }
                    }
                }
                i31 = i;
            } else {
                float f7 = this.V;
                if (f7 > 0.0f) {
                    f5 = f7;
                }
                int i68 = 0;
                this.U = 0;
                while (i68 < i59) {
                    View childAt4 = getChildAt(i68);
                    if (childAt4.getVisibility() == 8) {
                        i33 = i30;
                    } else {
                        a aVar5 = (a) childAt4.getLayoutParams();
                        float f8 = aVar5.a;
                        if (f8 > 0.0f) {
                            int i69 = (int) ((i66 * f8) / f5);
                            f5 -= f8;
                            i66 -= i69;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) aVar5).leftMargin + ((ViewGroup.MarginLayoutParams) aVar5).rightMargin, ((ViewGroup.MarginLayoutParams) aVar5).width);
                            if (((ViewGroup.MarginLayoutParams) aVar5).height != 0 || i30 != 1073741824 ? (i69 = i69 + childAt4.getMeasuredHeight()) < 0 : i69 <= 0) {
                                i69 = 0;
                            }
                            childAt4.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i69, 1073741824));
                            i62 = View.combineMeasuredStates(i62, childAt4.getMeasuredState() & (-256));
                        }
                        int i70 = ((ViewGroup.MarginLayoutParams) aVar5).leftMargin + ((ViewGroup.MarginLayoutParams) aVar5).rightMargin;
                        int measuredWidth2 = childAt4.getMeasuredWidth() + i70;
                        i48 = Math.max(i48, measuredWidth2);
                        if (mode != 1073741824) {
                            i33 = i30;
                            i34 = -1;
                            if (((ViewGroup.MarginLayoutParams) aVar5).width == -1) {
                                z7 = true;
                                if (!z7) {
                                    i70 = measuredWidth2;
                                }
                                int max7 = Math.max(i58, i70);
                                if (!z13 && ((ViewGroup.MarginLayoutParams) aVar5).width == i34) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                int i71 = this.U;
                                this.U = Math.max(i71, childAt4.getMeasuredHeight() + i71 + ((ViewGroup.MarginLayoutParams) aVar5).topMargin + ((ViewGroup.MarginLayoutParams) aVar5).bottomMargin + 0);
                                z13 = z8;
                                i58 = max7;
                            }
                        } else {
                            i33 = i30;
                            i34 = -1;
                        }
                        z7 = false;
                        if (!z7) {
                        }
                        int max72 = Math.max(i58, i70);
                        if (!z13) {
                        }
                        z8 = false;
                        int i712 = this.U;
                        this.U = Math.max(i712, childAt4.getMeasuredHeight() + i712 + ((ViewGroup.MarginLayoutParams) aVar5).topMargin + ((ViewGroup.MarginLayoutParams) aVar5).bottomMargin + 0);
                        z13 = z8;
                        i58 = max72;
                    }
                    i68++;
                    i30 = i33;
                }
                i31 = i;
                this.U = getPaddingBottom() + getPaddingTop() + this.U;
                i32 = i58;
            }
            if (z13 || mode == 1073741824) {
                i32 = i48;
            }
            setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + i32, getSuggestedMinimumWidth()), i31, i62), resolveSizeAndState);
            if (z14) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                for (int i72 = 0; i72 < i59; i72++) {
                    View childAt5 = getChildAt(i72);
                    if (childAt5.getVisibility() != 8) {
                        a aVar6 = (a) childAt5.getLayoutParams();
                        if (((ViewGroup.MarginLayoutParams) aVar6).width == -1) {
                            int i73 = ((ViewGroup.MarginLayoutParams) aVar6).height;
                            ((ViewGroup.MarginLayoutParams) aVar6).height = childAt5.getMeasuredHeight();
                            measureChildWithMargins(childAt5, makeMeasureSpec, 0, i2, 0);
                            ((ViewGroup.MarginLayoutParams) aVar6).height = i73;
                        }
                    }
                }
                return;
            }
            return;
        }
        this.U = 0;
        int virtualChildCount2 = getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i);
        int mode4 = View.MeasureSpec.getMode(i2);
        if (this.a0 == null || this.b0 == null) {
            this.a0 = new int[4];
            this.b0 = new int[4];
        }
        int[] iArr = this.a0;
        int[] iArr2 = this.b0;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z15 = this.P;
        boolean z16 = this.W;
        if (mode3 == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        float f9 = 0.0f;
        boolean z17 = false;
        boolean z18 = true;
        boolean z19 = false;
        int i74 = 0;
        int i75 = 0;
        int i76 = 0;
        int i77 = 0;
        int i78 = 0;
        int i79 = 0;
        while (i75 < virtualChildCount2) {
            boolean z20 = z16;
            View childAt6 = getChildAt(i75);
            if (childAt6 == null) {
                this.U += 0;
                i17 = i74;
                i18 = i76;
            } else {
                i17 = i74;
                i18 = i76;
                if (childAt6.getVisibility() == 8) {
                    i75 += 0;
                } else {
                    if (i(i75)) {
                        this.U += this.d0;
                    }
                    a aVar7 = (a) childAt6.getLayoutParams();
                    float f10 = aVar7.a;
                    float f11 = f9 + f10;
                    if (mode3 == 1073741824 && ((ViewGroup.MarginLayoutParams) aVar7).width == 0 && f10 > 0.0f) {
                        if (z) {
                            i29 = i75;
                            this.U = ((ViewGroup.MarginLayoutParams) aVar7).leftMargin + ((ViewGroup.MarginLayoutParams) aVar7).rightMargin + this.U;
                        } else {
                            i29 = i75;
                            int i80 = this.U;
                            this.U = Math.max(i80, ((ViewGroup.MarginLayoutParams) aVar7).leftMargin + i80 + ((ViewGroup.MarginLayoutParams) aVar7).rightMargin);
                        }
                        if (z15) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            aVar = aVar7;
                            i21 = i17;
                            i24 = i18;
                            i23 = i29;
                            view = childAt6;
                            i25 = mode3;
                            i26 = i77;
                        } else {
                            z17 = true;
                            aVar = aVar7;
                            max5 = i17;
                            i24 = i18;
                            i23 = i29;
                            i27 = 1073741824;
                            view = childAt6;
                            i25 = mode3;
                            i26 = i77;
                            if (mode4 == i27) {
                            }
                            z5 = false;
                            int i81 = ((ViewGroup.MarginLayoutParams) aVar).topMargin + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                            int measuredHeight2 = view.getMeasuredHeight() + i81;
                            int combineMeasuredStates2 = View.combineMeasuredStates(i79, view.getMeasuredState());
                            if (!z15) {
                            }
                            i28 = max5;
                            int max8 = Math.max(i26, measuredHeight2);
                            if (!z18) {
                            }
                            z6 = false;
                            if (aVar.a > 0.0f) {
                            }
                            i75 = i23 + 0;
                            i77 = max8;
                            i79 = combineMeasuredStates2;
                            z18 = z6;
                            f9 = f11;
                            i74 = i28;
                            i75++;
                            z16 = z20;
                            mode3 = i25;
                        }
                    } else {
                        int i82 = i75;
                        if (((ViewGroup.MarginLayoutParams) aVar7).width == 0) {
                            f3 = 0.0f;
                            if (f10 > 0.0f) {
                                ((ViewGroup.MarginLayoutParams) aVar7).width = -2;
                                i19 = 0;
                                if (f11 != f3) {
                                    i20 = this.U;
                                } else {
                                    i20 = 0;
                                }
                                i21 = i17;
                                i22 = i19;
                                i23 = i82;
                                i24 = i18;
                                i25 = mode3;
                                i26 = i77;
                                view = childAt6;
                                measureChildWithMargins(childAt6, i, i20, i2, 0);
                                if (i22 == Integer.MIN_VALUE) {
                                    aVar = aVar7;
                                    ((ViewGroup.MarginLayoutParams) aVar).width = i22;
                                } else {
                                    aVar = aVar7;
                                }
                                int measuredWidth3 = view.getMeasuredWidth();
                                if (!z) {
                                    max4 = e1.d(((ViewGroup.MarginLayoutParams) aVar).leftMargin + measuredWidth3, ((ViewGroup.MarginLayoutParams) aVar).rightMargin, 0, this.U);
                                } else {
                                    int i83 = this.U;
                                    max4 = Math.max(i83, i83 + measuredWidth3 + ((ViewGroup.MarginLayoutParams) aVar).leftMargin + ((ViewGroup.MarginLayoutParams) aVar).rightMargin + 0);
                                }
                                this.U = max4;
                                if (z20) {
                                    max5 = Math.max(measuredWidth3, i21);
                                    i27 = 1073741824;
                                    if (mode4 == i27 && ((ViewGroup.MarginLayoutParams) aVar).height == -1) {
                                        z5 = true;
                                        z19 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    int i812 = ((ViewGroup.MarginLayoutParams) aVar).topMargin + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                                    int measuredHeight22 = view.getMeasuredHeight() + i812;
                                    int combineMeasuredStates22 = View.combineMeasuredStates(i79, view.getMeasuredState());
                                    if (!z15 && (baseline2 = view.getBaseline()) != -1) {
                                        int i84 = aVar.b;
                                        if (i84 < 0) {
                                            i84 = this.T;
                                        }
                                        int i85 = (((i84 & 112) >> 4) & (-2)) >> 1;
                                        i28 = max5;
                                        iArr[i85] = Math.max(iArr[i85], baseline2);
                                        iArr2[i85] = Math.max(iArr2[i85], measuredHeight22 - baseline2);
                                    } else {
                                        i28 = max5;
                                    }
                                    int max82 = Math.max(i26, measuredHeight22);
                                    if (!z18 && ((ViewGroup.MarginLayoutParams) aVar).height == -1) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (aVar.a > 0.0f) {
                                        if (!z5) {
                                            i812 = measuredHeight22;
                                        }
                                        i76 = Math.max(i24, i812);
                                    } else {
                                        int i86 = i24;
                                        if (!z5) {
                                            i812 = measuredHeight22;
                                        }
                                        i78 = Math.max(i78, i812);
                                        i76 = i86;
                                    }
                                    i75 = i23 + 0;
                                    i77 = max82;
                                    i79 = combineMeasuredStates22;
                                    z18 = z6;
                                    f9 = f11;
                                    i74 = i28;
                                    i75++;
                                    z16 = z20;
                                    mode3 = i25;
                                }
                            }
                        } else {
                            f3 = 0.0f;
                        }
                        i19 = RecyclerView.UNDEFINED_DURATION;
                        if (f11 != f3) {
                        }
                        i21 = i17;
                        i22 = i19;
                        i23 = i82;
                        i24 = i18;
                        i25 = mode3;
                        i26 = i77;
                        view = childAt6;
                        measureChildWithMargins(childAt6, i, i20, i2, 0);
                        if (i22 == Integer.MIN_VALUE) {
                        }
                        int measuredWidth32 = view.getMeasuredWidth();
                        if (!z) {
                        }
                        this.U = max4;
                        if (z20) {
                        }
                    }
                    max5 = i21;
                    i27 = 1073741824;
                    if (mode4 == i27) {
                    }
                    z5 = false;
                    int i8122 = ((ViewGroup.MarginLayoutParams) aVar).topMargin + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                    int measuredHeight222 = view.getMeasuredHeight() + i8122;
                    int combineMeasuredStates222 = View.combineMeasuredStates(i79, view.getMeasuredState());
                    if (!z15) {
                    }
                    i28 = max5;
                    int max822 = Math.max(i26, measuredHeight222);
                    if (!z18) {
                    }
                    z6 = false;
                    if (aVar.a > 0.0f) {
                    }
                    i75 = i23 + 0;
                    i77 = max822;
                    i79 = combineMeasuredStates222;
                    z18 = z6;
                    f9 = f11;
                    i74 = i28;
                    i75++;
                    z16 = z20;
                    mode3 = i25;
                }
            }
            i74 = i17;
            i76 = i18;
            i25 = mode3;
            i75++;
            z16 = z20;
            mode3 = i25;
        }
        int i87 = i74;
        int i88 = i76;
        boolean z21 = z16;
        int i89 = mode3;
        int i90 = i77;
        if (this.U > 0 && i(virtualChildCount2)) {
            this.U += this.d0;
        }
        int i91 = iArr[1];
        if (i91 == -1 && iArr[0] == -1 && iArr[2] == -1) {
            c = 3;
            if (iArr[3] == -1) {
                max = i90;
                i3 = i79;
                z2 = z15;
                if (!z21) {
                    i4 = i89;
                    if (i4 == Integer.MIN_VALUE || i4 == 0) {
                        int i92 = 0;
                        this.U = 0;
                        int i93 = 0;
                        while (i93 < virtualChildCount2) {
                            View childAt7 = getChildAt(i93);
                            if (childAt7 == null) {
                                this.U += i92;
                            } else if (childAt7.getVisibility() == 8) {
                                i93 += 0;
                            } else {
                                a aVar8 = (a) childAt7.getLayoutParams();
                                int i94 = this.U;
                                if (z) {
                                    max3 = e1.d(((ViewGroup.MarginLayoutParams) aVar8).leftMargin + i87, ((ViewGroup.MarginLayoutParams) aVar8).rightMargin, 0, i94);
                                } else {
                                    max3 = Math.max(i94, i94 + i87 + ((ViewGroup.MarginLayoutParams) aVar8).leftMargin + ((ViewGroup.MarginLayoutParams) aVar8).rightMargin + 0);
                                }
                                this.U = max3;
                            }
                            i93++;
                            i92 = 0;
                        }
                    }
                } else {
                    i4 = i89;
                }
                int paddingRight = getPaddingRight() + getPaddingLeft() + this.U;
                this.U = paddingRight;
                int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, 0);
                int i95 = (16777215 & resolveSizeAndState2) - this.U;
                if (z17 && (i95 == 0 || f9 <= 0.0f)) {
                    i11 = Math.max(i78, i88);
                    if (z21 && i4 != 1073741824) {
                        for (int i96 = 0; i96 < virtualChildCount2; i96++) {
                            View childAt8 = getChildAt(i96);
                            if (childAt8 != null && childAt8.getVisibility() != 8 && ((a) childAt8.getLayoutParams()).a > 0.0f) {
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i87, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt8.getMeasuredHeight(), 1073741824));
                            }
                        }
                    }
                    i10 = 0;
                    i7 = i2;
                    i8 = virtualChildCount2;
                    i6 = i3;
                } else {
                    f = this.V;
                    if (f > 0.0f) {
                        f9 = f;
                    }
                    max = -1;
                    iArr[3] = -1;
                    iArr[2] = -1;
                    iArr[1] = -1;
                    iArr[0] = -1;
                    iArr2[3] = -1;
                    iArr2[2] = -1;
                    iArr2[1] = -1;
                    iArr2[0] = -1;
                    this.U = 0;
                    i5 = 0;
                    i6 = i3;
                    while (i5 < virtualChildCount2) {
                        View childAt9 = getChildAt(i5);
                        if (childAt9 != null && childAt9.getVisibility() != 8) {
                            a aVar9 = (a) childAt9.getLayoutParams();
                            float f12 = aVar9.a;
                            if (f12 > 0.0f) {
                                i13 = virtualChildCount2;
                                int i97 = (int) ((i95 * f12) / f9);
                                float f13 = f9 - f12;
                                i14 = i95 - i97;
                                int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) aVar9).topMargin + ((ViewGroup.MarginLayoutParams) aVar9).bottomMargin, ((ViewGroup.MarginLayoutParams) aVar9).height);
                                if (((ViewGroup.MarginLayoutParams) aVar9).width != 0 || i4 != 1073741824 ? (i97 = i97 + childAt9.getMeasuredWidth()) < 0 : i97 <= 0) {
                                    i97 = 0;
                                }
                                childAt9.measure(View.MeasureSpec.makeMeasureSpec(i97, 1073741824), childMeasureSpec2);
                                i6 = View.combineMeasuredStates(i6, childAt9.getMeasuredState() & (-16777216));
                                f9 = f13;
                            } else {
                                i13 = virtualChildCount2;
                                i14 = i95;
                            }
                            if (z) {
                                f2 = f9;
                                i12 = i4;
                                max2 = e1.d(childAt9.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) aVar9).leftMargin, ((ViewGroup.MarginLayoutParams) aVar9).rightMargin, 0, this.U);
                            } else {
                                f2 = f9;
                                i12 = i4;
                                int i98 = this.U;
                                max2 = Math.max(i98, childAt9.getMeasuredWidth() + i98 + ((ViewGroup.MarginLayoutParams) aVar9).leftMargin + ((ViewGroup.MarginLayoutParams) aVar9).rightMargin + 0);
                            }
                            this.U = max2;
                            if (mode4 != 1073741824 && ((ViewGroup.MarginLayoutParams) aVar9).height == -1) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            int i99 = ((ViewGroup.MarginLayoutParams) aVar9).topMargin + ((ViewGroup.MarginLayoutParams) aVar9).bottomMargin;
                            int measuredHeight3 = childAt9.getMeasuredHeight() + i99;
                            max = Math.max(max, measuredHeight3);
                            if (!z3) {
                                i99 = measuredHeight3;
                            }
                            int max9 = Math.max(i78, i99);
                            if (z18) {
                                i15 = -1;
                                if (((ViewGroup.MarginLayoutParams) aVar9).height == -1) {
                                    z4 = true;
                                    if (z2 && (baseline = childAt9.getBaseline()) != i15) {
                                        i16 = aVar9.b;
                                        if (i16 < 0) {
                                            i16 = this.T;
                                        }
                                        int i100 = (((i16 & 112) >> 4) & (-2)) >> 1;
                                        iArr[i100] = Math.max(iArr[i100], baseline);
                                        iArr2[i100] = Math.max(iArr2[i100], measuredHeight3 - baseline);
                                    }
                                    i78 = max9;
                                    z18 = z4;
                                    f9 = f2;
                                }
                            } else {
                                i15 = -1;
                            }
                            z4 = false;
                            if (z2) {
                                i16 = aVar9.b;
                                if (i16 < 0) {
                                }
                                int i1002 = (((i16 & 112) >> 4) & (-2)) >> 1;
                                iArr[i1002] = Math.max(iArr[i1002], baseline);
                                iArr2[i1002] = Math.max(iArr2[i1002], measuredHeight3 - baseline);
                            }
                            i78 = max9;
                            z18 = z4;
                            f9 = f2;
                        } else {
                            i12 = i4;
                            i13 = virtualChildCount2;
                            i14 = i95;
                        }
                        i5++;
                        virtualChildCount2 = i13;
                        i95 = i14;
                        i4 = i12;
                    }
                    i7 = i2;
                    i8 = virtualChildCount2;
                    this.U = getPaddingRight() + getPaddingLeft() + this.U;
                    i9 = iArr[1];
                    if (i9 != -1 && iArr[0] == -1 && iArr[2] == -1) {
                        c2 = 3;
                        if (iArr[3] == -1) {
                            i10 = 0;
                            i11 = i78;
                        }
                    } else {
                        c2 = 3;
                    }
                    max = Math.max(max, Math.max(iArr2[c2], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c2], Math.max(iArr[0], Math.max(i9, iArr[2]))));
                    i10 = 0;
                    i11 = i78;
                }
                if (!z18 || mode4 == 1073741824) {
                    i11 = max;
                }
                setMeasuredDimension(resolveSizeAndState2 | ((-16777216) & i6), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + i11, getSuggestedMinimumHeight()), i7, i6 << 16));
                if (!z19) {
                    int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                    int i101 = i8;
                    for (int i102 = i10; i102 < i101; i102++) {
                        View childAt10 = getChildAt(i102);
                        if (childAt10.getVisibility() != 8) {
                            a aVar10 = (a) childAt10.getLayoutParams();
                            if (((ViewGroup.MarginLayoutParams) aVar10).height == -1) {
                                int i103 = ((ViewGroup.MarginLayoutParams) aVar10).width;
                                ((ViewGroup.MarginLayoutParams) aVar10).width = childAt10.getMeasuredWidth();
                                measureChildWithMargins(childAt10, i, 0, makeMeasureSpec3, 0);
                                ((ViewGroup.MarginLayoutParams) aVar10).width = i103;
                            }
                        }
                    }
                    return;
                }
                return;
            }
        } else {
            c = 3;
        }
        i3 = i79;
        z2 = z15;
        max = Math.max(i90, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c], Math.max(iArr[0], Math.max(i91, iArr[2]))));
        if (!z21) {
        }
        int paddingRight2 = getPaddingRight() + getPaddingLeft() + this.U;
        this.U = paddingRight2;
        int resolveSizeAndState22 = View.resolveSizeAndState(Math.max(paddingRight2, getSuggestedMinimumWidth()), i, 0);
        int i952 = (16777215 & resolveSizeAndState22) - this.U;
        if (z17) {
        }
        f = this.V;
        if (f > 0.0f) {
        }
        max = -1;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        this.U = 0;
        i5 = 0;
        i6 = i3;
        while (i5 < virtualChildCount2) {
        }
        i7 = i2;
        i8 = virtualChildCount2;
        this.U = getPaddingRight() + getPaddingLeft() + this.U;
        i9 = iArr[1];
        if (i9 != -1) {
        }
        c2 = 3;
        max = Math.max(max, Math.max(iArr2[c2], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c2], Math.max(iArr[0], Math.max(i9, iArr[2]))));
        i10 = 0;
        i11 = i78;
        if (!z18) {
        }
        i11 = max;
        setMeasuredDimension(resolveSizeAndState22 | ((-16777216) & i6), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + i11, getSuggestedMinimumHeight()), i7, i6 << 16));
        if (!z19) {
        }
    }

    public void setBaselineAligned(boolean z) {
        this.P = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.Q = i;
            return;
        }
        StringBuilder b = e5.b("base aligned child index out of range (0, ");
        b.append(getChildCount());
        b.append(")");
        throw new IllegalArgumentException(b.toString());
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.c0) {
            return;
        }
        this.c0 = drawable;
        if (drawable != null) {
            this.d0 = drawable.getIntrinsicWidth();
            this.e0 = drawable.getIntrinsicHeight();
        } else {
            this.d0 = 0;
            this.e0 = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.g0 = i;
    }

    public void setGravity(int i) {
        if (this.T != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.T = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.T;
        if ((8388615 & i3) != i2) {
            this.T = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.W = z;
    }

    public void setOrientation(int i) {
        if (this.S != i) {
            this.S = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f0) {
            requestLayout();
        }
        this.f0 = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.T;
        if ((i3 & 112) != i2) {
            this.T = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.V = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}