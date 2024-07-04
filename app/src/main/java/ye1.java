package defpackage;

import android.graphics.Typeface;

/* renamed from: ye1  reason: default package */
public final class ye1 implements zc1 {
    public final /* synthetic */ gf1 a;

    public ye1(gf1 gf1Var) {
        this.a = gf1Var;
    }

    @Override // defpackage.zc1
    public final void a(rc1 rc1Var) {
        Typeface typeface;
        if (this.a.b(rc1Var)) {
            gf1 gf1Var = this.a;
            gf1Var.getClass();
            int l = rc1Var.b.l("font_family");
            gf1Var.V = l;
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
            gf1Var.setTypeface(typeface);
        }
    }
}