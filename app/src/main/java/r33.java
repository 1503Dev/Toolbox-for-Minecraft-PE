package defpackage;

import android.content.pm.PackageInfo;
import java.util.List;

/* renamed from: r33  reason: default package */
public final class r33 {
    public final le4 a;
    public final w33 b;
    public final uj5 c;
    public final bd4 d;
    public final bp3 e;
    public final p14 f;
    public final r73 g;
    public final wr3 h;
    public final es3 i;
    public final dh3 j;
    public final ve4 k;
    public final rd4 l;
    public final uj5 m;
    public final uj5 n;
    public final uj5 o;
    public final uj5 p;
    public final uj5 q;
    public final uj5 r;

    public r33(w33 w33Var, le4 le4Var) {
        this.b = w33Var;
        this.a = le4Var;
        this.c = kj5.b(new ih3(1, w33Var.A));
        ne4 ne4Var = new ne4(le4Var);
        oe4 oe4Var = new oe4(le4Var);
        qe4 qe4Var = new qe4(le4Var);
        j33 j33Var = vj.T;
        t23 t23Var = w33Var.g;
        uj5 uj5Var = w33Var.k;
        zk4 zk4Var = lp5.R;
        this.d = new bd4(t23Var, uj5Var, ne4Var, oe4Var, qe4Var);
        me4 me4Var = new me4(le4Var);
        this.e = new bp3(s45.R, t23Var, me4Var, zk4Var, 1);
        uj5 uj5Var2 = w33Var.Y;
        this.f = new p14(j33Var, ne4Var, t23Var, uj5Var2, uj5Var, zk4Var, me4Var, 2);
        this.g = new r73(yf.T, zk4Var, t23Var, 3);
        this.h = new wr3(gv4.U, zk4Var, me4Var, 1);
        this.i = new es3(gw.V, uj5Var, t23Var, 2);
        this.j = new dh3(1, zk4Var);
        this.k = new ve4(uj5Var2, new pe4(le4Var), qe4Var, me4Var, uj5Var);
        this.l = new rd4(me4Var, uj5Var2, uj5Var);
        ch3 ch3Var = new ch3(2, le4Var);
        uj5 b = kj5.b(eb1.Q);
        this.m = b;
        uj5 b2 = kj5.b(zw4.S);
        this.n = b2;
        uj5 b3 = kj5.b(p5.Q);
        this.o = b3;
        uj5 b4 = kj5.b(n9.U);
        this.p = b4;
        int i = oj5.b;
        nj5 nj5Var = new nj5(4);
        nj5Var.a(ml4.GMS_SIGNALS, b);
        nj5Var.a(ml4.BUILD_URL, b2);
        nj5Var.a(ml4.HTTP, b3);
        nj5Var.a(ml4.PRE_PROCESS, b4);
        uj5 b5 = kj5.b(new k93(ch3Var, w33Var.g, zk4Var, nj5Var.d(), 1));
        this.q = b5;
        int i2 = sj5.c;
        List G = ea2.G(0);
        List G2 = ea2.G(1);
        G2.add(b5);
        this.r = kj5.b(new ct2(zk4Var, w33Var.k, new ql4(new sj5(G, G2)), 2));
    }

    public final gd4 a() {
        yw2 yw2Var = zw2.a;
        tv2.C(yw2Var);
        String b = pt4.b(this.a.a.P.getString("ms"));
        PackageInfo packageInfo = this.a.a.U;
        return new gd4(yw2Var, b);
    }
}