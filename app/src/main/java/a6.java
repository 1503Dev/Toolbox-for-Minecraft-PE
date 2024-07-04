package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: a6  reason: default package */
public final class a6 extends SeekBar {
    public final b6 P;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int i = ih0.seekBarStyle;
        b6 b6Var = new b6(this);
        this.P = b6Var;
        b6Var.a(attributeSet, i);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        b6 b6Var = this.P;
        Drawable drawable = b6Var.e;
        if (drawable != null && drawable.isStateful() && drawable.setState(b6Var.d.getDrawableState())) {
            b6Var.d.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.P.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.P.d(canvas);
    }
}