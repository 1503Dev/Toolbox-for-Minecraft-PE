package defpackage;

import java.util.Map;

/* renamed from: jg2  reason: default package */
public final class jg2 implements mg2 {
    @Override // defpackage.mg2
    public final void b(Object obj, Map map) {
        g13 R;
        y03 y03Var = (y03) obj;
        if (map.keySet().contains("start")) {
            g13 R2 = y03Var.R();
            synchronized (R2.S) {
            }
            R2.n0++;
            R2.i();
        } else if (map.keySet().contains("stop")) {
            R.n0--;
            y03Var.R().i();
        } else if (map.keySet().contains("cancel")) {
            g13 R3 = y03Var.R();
            j52 j52Var = R3.Q;
            if (j52Var != null) {
                j52Var.b(10005);
            }
            R3.m0 = true;
            R3.i();
            R3.P.destroy();
        }
    }
}