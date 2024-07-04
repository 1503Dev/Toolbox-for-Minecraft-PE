package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;

/* renamed from: jw0  reason: default package */
public final class jw0 extends z61 {
    public final /* synthetic */ TextPaint f;
    public final /* synthetic */ z61 g;
    public final /* synthetic */ iw0 h;

    public jw0(iw0 iw0Var, TextPaint textPaint, z61 z61Var) {
        this.h = iw0Var;
        this.f = textPaint;
        this.g = z61Var;
    }

    @Override // defpackage.z61
    public final void S0(int i) {
        this.g.S0(i);
    }

    @Override // defpackage.z61
    public final void T0(Typeface typeface, boolean z) {
        this.h.d(this.f, typeface);
        this.g.T0(typeface, z);
    }
}