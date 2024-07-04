package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.WeakHashMap;

public class SnackbarContentLayout extends LinearLayout {
    public TextView P;
    public Button Q;
    public int R;
    public int S;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ij0.SnackbarLayout);
        this.R = obtainStyledAttributes.getDimensionPixelSize(ij0.SnackbarLayout_android_maxWidth, -1);
        this.S = obtainStyledAttributes.getDimensionPixelSize(ij0.SnackbarLayout_maxActionInlineWidth, -1);
        obtainStyledAttributes.recycle();
    }

    public final boolean a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.P.getPaddingTop() == i2 && this.P.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.P;
        WeakHashMap<View, String> weakHashMap = a41.a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.Q;
    }

    public TextView getMessageView() {
        return this.P;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.P = (TextView) findViewById(fi0.snackbar_text);
        this.Q = (Button) findViewById(fi0.snackbar_action);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
        if (a(1, r0, r0 - r1) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
        if (a(0, r0, r0) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
        r3 = true;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.R > 0) {
            int measuredWidth = getMeasuredWidth();
            int i3 = this.R;
            if (measuredWidth > i3) {
                i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                super.onMeasure(i, i2);
            }
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(rh0.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(rh0.design_snackbar_padding_vertical);
        boolean z = false;
        boolean z2 = this.P.getLayout().getLineCount() > 1;
        if (!z2 || this.S <= 0 || this.Q.getMeasuredWidth() <= this.S) {
            if (!z2) {
                dimensionPixelSize = dimensionPixelSize2;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
    }
}