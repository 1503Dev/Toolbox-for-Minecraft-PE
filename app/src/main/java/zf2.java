package defpackage;

import java.util.Map;

/* renamed from: zf2  reason: default package */
public final class zf2 implements mg2 {
    @Override // defpackage.mg2
    public final void b(Object obj, Map map) {
        y03 y03Var = (y03) obj;
        if (y03Var.M() != null) {
            ((qf4) y03Var.M()).t4(3);
        }
        qn5 N = y03Var.N();
        if (N != null) {
            N.c();
            return;
        }
        qn5 O = y03Var.O();
        if (O != null) {
            O.c();
        } else {
            sv2.g("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}