package defpackage;

import android.graphics.Typeface;

/* renamed from: vf1  reason: default package */
public final class vf1 implements zc1 {
    public final /* synthetic */ yf1 a;

    public vf1(yf1 yf1Var) {
        this.a = yf1Var;
    }

    @Override // defpackage.zc1
    public final void a(rc1 rc1Var) {
        Typeface typeface;
        int i;
        if (this.a.b(rc1Var)) {
            yf1 yf1Var = this.a;
            yf1Var.getClass();
            int l = rc1Var.b.l("font_style");
            yf1Var.U = l;
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
                typeface = yf1Var.getTypeface();
            } else {
                typeface = yf1Var.getTypeface();
                i = 0;
            }
            yf1Var.setTypeface(typeface, i);
        }
    }
}