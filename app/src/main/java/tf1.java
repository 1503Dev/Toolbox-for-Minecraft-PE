package defpackage;

import android.graphics.Typeface;

/* renamed from: tf1  reason: default package */
public final class tf1 implements zc1 {
    public final /* synthetic */ yf1 a;

    public tf1(yf1 yf1Var) {
        this.a = yf1Var;
    }

    @Override // defpackage.zc1
    public final void a(rc1 rc1Var) {
        Typeface typeface;
        if (this.a.b(rc1Var)) {
            yf1 yf1Var = this.a;
            yf1Var.getClass();
            int l = rc1Var.b.l("font_family");
            yf1Var.V = l;
            if (l != 0) {
                if (l != 1) {
                    if (l != 2) {
                        if (l == 3) {
                            typeface = Typeface.MONOSPACE;
                        } else {
                            return;
                        }
                    } else {
                        typeface = Typeface.SANS_SERIF;
                    }
                } else {
                    typeface = Typeface.SERIF;
                }
            } else {
                typeface = Typeface.DEFAULT;
            }
            yf1Var.setTypeface(typeface);
        }
    }
}