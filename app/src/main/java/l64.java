package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: l64  reason: default package */
public final class l64 extends im2 {
    public final Context P;
    public final q23 Q;
    public final ki4 R;
    public final vl3 S;
    public gf2 T;

    public l64(w33 w33Var, Context context, String str) {
        ki4 ki4Var = new ki4();
        this.R = ki4Var;
        this.S = new vl3();
        this.Q = w33Var;
        ki4Var.c = str;
        this.P = context;
    }

    @Override // defpackage.jn2
    public final void C1(u2 u2Var) {
        ki4 ki4Var = this.R;
        ki4Var.j = u2Var;
        if (u2Var != null) {
            ki4Var.e = u2Var.P;
        }
    }

    @Override // defpackage.jn2
    public final void H3(ge2 ge2Var, zr5 zr5Var) {
        this.S.d = ge2Var;
        this.R.b = zr5Var;
    }

    @Override // defpackage.jn2
    public final void M0(je2 je2Var) {
        this.S.c = je2Var;
    }

    @Override // defpackage.jn2
    public final void Q3(c13 c13Var) {
        this.R.s = c13Var;
    }

    @Override // defpackage.jn2
    public final void R0(xd2 xd2Var) {
        this.S.a = xd2Var;
    }

    @Override // defpackage.jn2
    public final void R1(gi2 gi2Var) {
        ki4 ki4Var = this.R;
        ki4Var.n = gi2Var;
        ki4Var.d = new zq4(false, true, false);
    }

    @Override // defpackage.jn2
    public final ik2 b() {
        vl3 vl3Var = this.S;
        vl3Var.getClass();
        wl3 wl3Var = new wl3(vl3Var);
        ki4 ki4Var = this.R;
        ArrayList arrayList = new ArrayList();
        if (wl3Var.c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (wl3Var.a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (wl3Var.b != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!wl3Var.f.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (wl3Var.e != null) {
            arrayList.add(Integer.toString(7));
        }
        ki4Var.f = arrayList;
        ki4 ki4Var2 = this.R;
        ArrayList arrayList2 = new ArrayList(wl3Var.f.R);
        int i = 0;
        while (true) {
            os0 os0Var = wl3Var.f;
            if (i >= os0Var.R) {
                break;
            }
            arrayList2.add((String) os0Var.h(i));
            i++;
        }
        ki4Var2.g = arrayList2;
        ki4 ki4Var3 = this.R;
        if (ki4Var3.b == null) {
            ki4Var3.b = zr5.d();
        }
        return new p64(this.P, this.Q, this.R, wl3Var, this.T);
    }

    @Override // defpackage.jn2
    public final void e1(String str, de2 de2Var, ae2 ae2Var) {
        vl3 vl3Var = this.S;
        vl3Var.f.put(str, de2Var);
        if (ae2Var != null) {
            vl3Var.g.put(str, ae2Var);
        }
    }

    @Override // defpackage.jn2
    public final void e2(ni2 ni2Var) {
        this.S.e = ni2Var;
    }

    @Override // defpackage.jn2
    public final void j3(nc2 nc2Var) {
        this.R.h = nc2Var;
    }

    @Override // defpackage.jn2
    public final void q2(gf2 gf2Var) {
        this.T = gf2Var;
    }

    @Override // defpackage.jn2
    public final void w0(rg0 rg0Var) {
        ki4 ki4Var = this.R;
        ki4Var.k = rg0Var;
        if (rg0Var != null) {
            ki4Var.e = rg0Var.P;
            ki4Var.l = rg0Var.Q;
        }
    }

    @Override // defpackage.jn2
    public final void x0(vd2 vd2Var) {
        this.S.b = vd2Var;
    }
}