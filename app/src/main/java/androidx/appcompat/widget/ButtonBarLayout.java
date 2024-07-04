package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

public class ButtonBarLayout extends LinearLayout {
    public boolean P;
    public int Q;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Q = -1;
        int[] iArr = lj0.ButtonBarLayout;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        this.P = obtainStyledAttributes.getBoolean(lj0.ButtonBarLayout_allowStacking, true);
        obtainStyledAttributes.recycle();
    }

    private void setStacked(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 5 : 80);
        View findViewById = findViewById(hi0.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(0, super.getMinimumHeight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        int i4;
        int paddingBottom;
        boolean z3;
        boolean z4;
        boolean z5;
        int size = View.MeasureSpec.getSize(i);
        int i5 = 0;
        if (this.P) {
            if (size > this.Q) {
                if (getOrientation() == 1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    setStacked(false);
                }
            }
            this.Q = size;
        }
        if (getOrientation() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z && View.MeasureSpec.getMode(i) == 1073741824) {
            i3 = View.MeasureSpec.makeMeasureSpec(size, RecyclerView.UNDEFINED_DURATION);
            z2 = true;
        } else {
            i3 = i;
            z2 = false;
        }
        super.onMeasure(i3, i2);
        if (this.P) {
            if (getOrientation() == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    setStacked(true);
                    z2 = true;
                }
            }
        }
        if (z2) {
            super.onMeasure(i, i2);
        }
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            i4 = -1;
            if (i6 < childCount) {
                if (getChildAt(i6).getVisibility() == 0) {
                    break;
                }
                i6++;
            } else {
                i6 = -1;
                break;
            }
        }
        if (i6 >= 0) {
            View childAt = getChildAt(i6);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (getOrientation() == 1) {
                i5 = 1;
            }
            if (i5 != 0) {
                int i7 = i6 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i7 >= childCount2) {
                        break;
                    } else if (getChildAt(i7).getVisibility() == 0) {
                        i4 = i7;
                        break;
                    } else {
                        i7++;
                    }
                }
                if (i4 >= 0) {
                    paddingBottom = getChildAt(i4).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                } else {
                    i5 = measuredHeight;
                }
            } else {
                paddingBottom = getPaddingBottom();
            }
            i5 = paddingBottom + measuredHeight;
        }
        WeakHashMap<View, String> weakHashMap = a41.a;
        if (getMinimumHeight() != i5) {
            setMinimumHeight(i5);
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.P != z) {
            this.P = z;
            if (!z && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}