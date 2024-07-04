package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;

/* renamed from: q9  reason: default package */
public class q9 extends FrameLayout {
    public static final a S = new a();
    public int P;
    public final float Q;
    public final float R;

    /* renamed from: q9$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    public q9(Context context, AttributeSet attributeSet) {
        super(yw0.d(context, attributeSet, 0, 0), attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ij0.SnackbarLayout);
        int i = ij0.SnackbarLayout_elevation;
        if (obtainStyledAttributes.hasValue(i)) {
            float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(i, 0);
            WeakHashMap<View, String> weakHashMap = a41.a;
            if (Build.VERSION.SDK_INT >= 21) {
                setElevation(dimensionPixelSize);
            }
        }
        this.P = obtainStyledAttributes.getInt(ij0.SnackbarLayout_animationMode, 0);
        this.Q = obtainStyledAttributes.getFloat(ij0.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
        this.R = obtainStyledAttributes.getFloat(ij0.SnackbarLayout_actionTextColorAlpha, 1.0f);
        obtainStyledAttributes.recycle();
        setOnTouchListener(S);
        setFocusable(true);
    }

    public float getActionTextColorAlpha() {
        return this.R;
    }

    public int getAnimationMode() {
        return this.P;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.Q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a41.m(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setAnimationMode(int i) {
        this.P = i;
    }

    public void setOnAttachStateChangeListener(o9 o9Var) {
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : S);
        super.setOnClickListener(onClickListener);
    }

    public void setOnLayoutChangeListener(p9 p9Var) {
    }
}