package defpackage;

import android.graphics.Typeface;

/* renamed from: af1  reason: default package */
public final class af1 implements zc1 {
    public final /* synthetic */ gf1 a;

    public af1(gf1 gf1Var) {
        this.a = gf1Var;
    }

    @Override // defpackage.zc1
    public final void a(rc1 rc1Var) {
        Typeface typeface;
        int i;
        if (this.a.b(rc1Var)) {
            gf1 gf1Var = this.a;
            gf1Var.getClass();
            int l = rc1Var.b.l("font_style");
            gf1Var.U = l;
            if (l != 0) {
                i = 1;
                if (l != 1) {
                    i = 2;
                    if (l != 2) {
                        i = 3;
                        if (l != 3) {
                            return;
                        }
                    }
                }
                typeface = gf1Var.getTypeface();
            } else {
                typeface = gf1Var.getTypeface();
                i = 0;
            }
            gf1Var.setTypeface(typeface, i);
        }
    }
}