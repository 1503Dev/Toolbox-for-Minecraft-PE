package defpackage;

import java.util.Map;

/* renamed from: eg2  reason: default package */
public final class eg2 implements mg2 {
    @Override // defpackage.mg2
    public final /* bridge */ /* synthetic */ void b(Object obj, Map map) {
        y03 y03Var = (y03) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            y03Var.i();
        } else if ("resume".equals(str)) {
            y03Var.b();
        }
    }
}