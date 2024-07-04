package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public final class Snackbar$SnackbarLayout extends q9 {
    public Snackbar$SnackbarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getLayoutParams().width == -1) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
            }
        }
    }

    @Override // defpackage.q9, android.view.View
    public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }
}