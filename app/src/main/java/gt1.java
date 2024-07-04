package defpackage;

import java.util.List;

/* renamed from: gt1  reason: default package */
public final class gt1 {
    public final List a;
    public final pl1[] b;

    public gt1(List list) {
        this.a = list;
        this.b = new pl1[list.size()];
    }

    public final void a(nk1 nk1Var, pt1 pt1Var) {
        boolean z;
        for (int i = 0; i < this.b.length; i++) {
            pt1Var.a();
            pt1Var.b();
            pl1 q = nk1Var.q(pt1Var.d, 3);
            cu1 cu1Var = (cu1) this.a.get(i);
            String str = cu1Var.k;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            } else {
                z = true;
            }
            tv2.H("Invalid closed caption mime type provided: ".concat(String.valueOf(str)), z);
            String str2 = cu1Var.a;
            if (str2 == null) {
                pt1Var.b();
                str2 = pt1Var.e;
            }
            bs1 bs1Var = new bs1();
            bs1Var.a = str2;
            bs1Var.j = str;
            bs1Var.d = cu1Var.d;
            bs1Var.c = cu1Var.c;
            bs1Var.B = cu1Var.C;
            bs1Var.l = cu1Var.m;
            q.e(new cu1(bs1Var));
            this.b[i] = q;
        }
    }
}