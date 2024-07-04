package defpackage;

import java.util.List;

/* renamed from: t33  reason: default package */
public final class t33 {
    public final id4 a;
    public final w33 b;
    public final uj5 c;
    public final uj5 d;
    public final uj5 e;
    public final uj5 f;
    public final uj5 g;
    public final uj5 h;
    public final uj5 i;

    public t33(w33 w33Var, id4 id4Var) {
        this.b = w33Var;
        this.a = id4Var;
        this.c = kj5.b(new ih3(1, w33Var.A));
        gp1 gp1Var = new gp1(3, id4Var);
        uj5 b = kj5.b(eb1.Q);
        this.d = b;
        uj5 b2 = kj5.b(zw4.S);
        this.e = b2;
        uj5 b3 = kj5.b(p5.Q);
        this.f = b3;
        uj5 b4 = kj5.b(n9.U);
        this.g = b4;
        int i = oj5.b;
        nj5 nj5Var = new nj5(4);
        nj5Var.a(ml4.GMS_SIGNALS, b);
        nj5Var.a(ml4.BUILD_URL, b2);
        nj5Var.a(ml4.HTTP, b3);
        nj5Var.a(ml4.PRE_PROCESS, b4);
        oj5 d = nj5Var.d();
        t23 t23Var = w33Var.g;
        zk4 zk4Var = lp5.R;
        uj5 b5 = kj5.b(new k93(gp1Var, t23Var, zk4Var, d, 1));
        this.h = b5;
        int i2 = sj5.c;
        List G = ea2.G(0);
        List G2 = ea2.G(1);
        G2.add(b5);
        this.i = kj5.b(new ct2(zk4Var, w33Var.k, new ql4(new sj5(G, G2)), 2));
    }
}