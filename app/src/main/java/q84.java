package defpackage;

import android.os.Bundle;

/* renamed from: q84  reason: default package */
public final class q84 implements mc4 {
    public final by5 a;
    public final xv2 b;
    public final boolean c;

    public q84(by5 by5Var, xv2 xv2Var, boolean z) {
        this.a = by5Var;
        this.b = xv2Var;
        this.c = z;
    }

    @Override // defpackage.mc4
    public final void b(Object obj) {
        String str;
        Bundle bundle = (Bundle) obj;
        m92 m92Var = x92.o4;
        w82 w82Var = w82.d;
        if (this.b.R >= ((Integer) w82Var.c.a(m92Var)).intValue()) {
            bundle.putString("app_open_version", "2");
        }
        if (((Boolean) w82Var.c.a(x92.p4)).booleanValue()) {
            bundle.putBoolean("app_switched", this.c);
        }
        by5 by5Var = this.a;
        if (by5Var != null) {
            int i = by5Var.P;
            if (i == 1) {
                str = "p";
            } else if (i == 2) {
                str = "l";
            } else {
                return;
            }
            bundle.putString("avo", str);
        }
    }
}