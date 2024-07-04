package defpackage;

import java.util.List;

/* renamed from: k43  reason: default package */
public final class k43 {
    public final uj5 a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;

    public k43(w33 w33Var, g43 g43Var, ts1 ts1Var, ln1 ln1Var) {
        sa3 sa3Var = new sa3(ts1Var);
        pa3 pa3Var = new pa3(ts1Var);
        int i = sj5.c;
        List G = ea2.G(0);
        List G2 = ea2.G(2);
        G2.add(g43Var.g1);
        G2.add(g43Var.h1);
        uj5 b = kj5.b(new f63(1, new sj5(G, G2)));
        this.a = b;
        List G3 = ea2.G(4);
        List G4 = ea2.G(3);
        G3.add(g43Var.x1);
        G3.add(g43Var.y1);
        G3.add(g43Var.z1);
        G4.add(g43Var.H1);
        G4.add(g43Var.I1);
        G4.add(g43Var.J1);
        G3.add(g43Var.A1);
        uj5 b2 = kj5.b(new j63(1, new sj5(G3, G4)));
        this.b = b2;
        hd3 hd3Var = new hd3(pa3Var, new qa3(ts1Var), g43Var.N0, new ra3(ts1Var), g43Var.o);
        uj5 b3 = kj5.b(gw.W);
        this.c = b3;
        List G5 = ea2.G(1);
        List G6 = ea2.G(1);
        G6.add(g43Var.L1);
        G5.add(g43Var.M1);
        this.d = kj5.b(new q93(new vb3(sa3Var, pa3Var, b, b2, g43Var.K1, hd3Var, b3, new ne3(new sj5(G5, G6))), new p93(ln1Var), new o93(ln1Var), w33Var.m, 0));
    }
}