package defpackage;

import android.animation.ValueAnimator;
import com.warkiz.widget.IndicatorSeekBar;

/* renamed from: hx  reason: default package */
public final class hx implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ int b;
    public final /* synthetic */ IndicatorSeekBar c;

    public hx(IndicatorSeekBar indicatorSeekBar, float f, int i) {
        this.c = indicatorSeekBar;
        this.a = f;
        this.b = i;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        IndicatorSeekBar indicatorSeekBar = this.c;
        indicatorSeekBar.V = indicatorSeekBar.m0;
        float f = this.a;
        int i = ((f - indicatorSeekBar.s0[this.b]) > 0.0f ? 1 : ((f - indicatorSeekBar.s0[this.b]) == 0.0f ? 0 : -1));
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (i > 0) {
            indicatorSeekBar.m0 = f - floatValue;
        } else {
            indicatorSeekBar.m0 = floatValue + f;
        }
        IndicatorSeekBar indicatorSeekBar2 = this.c;
        indicatorSeekBar2.s(indicatorSeekBar2.m0);
        this.c.setSeekListener(false);
        IndicatorSeekBar indicatorSeekBar3 = this.c;
        gx gxVar = indicatorSeekBar3.G0;
        if (gxVar != null && indicatorSeekBar3.J0) {
            gxVar.b();
            this.c.t();
        }
        this.c.invalidate();
    }
}