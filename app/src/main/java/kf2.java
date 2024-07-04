package defpackage;

import java.util.Map;

/* renamed from: kf2  reason: default package */
public final /* synthetic */ class kf2 implements mg2 {
    public final /* synthetic */ oi3 P;

    public /* synthetic */ kf2(oi3 oi3Var) {
        this.P = oi3Var;
    }

    @Override // defpackage.mg2
    public final void b(Object obj, Map map) {
        y03 y03Var = (y03) obj;
        lg2.b(map, this.P);
        String str = (String) map.get("u");
        if (str == null) {
            sv2.g("URL missing from click GMSG.");
        } else {
            zw4.J(lg2.a(y03Var, str), new eg3(2, y03Var), zw2.a);
        }
    }
}