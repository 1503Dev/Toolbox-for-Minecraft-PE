package defpackage;

import android.view.View;

/* renamed from: y12  reason: default package */
public final class y12 extends c22 {
    public final View h;

    public y12(l02 l02Var, gx1 gx1Var, int i, View view) {
        super(l02Var, "W/9c3Hd1yf7t5yHhoE/TlmEcdgBJrlLUo34Voj/Idw5FIbJ80EX+SS3nO2jLEMGu", "gqK1fJWMt2lYn7O2X7ompi2Bw14HxMMjzTnJdiQom2Q=", gx1Var, i, 57);
        this.h = view;
    }

    @Override // defpackage.c22
    public final void b() {
        if (this.h != null) {
            l92 l92Var = x92.J2;
            w82 w82Var = w82.d;
            Boolean bool = (Boolean) w82Var.c.a(l92Var);
            Boolean bool2 = (Boolean) w82Var.c.a(x92.z8);
            p02 p02Var = new p02((String) this.e.invoke(null, this.h, this.a.a.getResources().getDisplayMetrics(), bool, bool2));
            cy1 w = dy1.w();
            long longValue = p02Var.a.longValue();
            w.j();
            dy1.z((dy1) w.Q, longValue);
            long longValue2 = p02Var.b.longValue();
            w.j();
            dy1.A((dy1) w.Q, longValue2);
            long longValue3 = p02Var.c.longValue();
            w.j();
            dy1.B((dy1) w.Q, longValue3);
            if (bool2.booleanValue()) {
                long longValue4 = p02Var.e.longValue();
                w.j();
                dy1.y((dy1) w.Q, longValue4);
            }
            if (bool.booleanValue()) {
                long longValue5 = p02Var.d.longValue();
                w.j();
                dy1.C((dy1) w.Q, longValue5);
            }
            gx1 gx1Var = this.d;
            gx1Var.j();
            ey1.Q((ey1) gx1Var.Q, (dy1) w.h());
        }
    }
}