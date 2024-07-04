package defpackage;

import java.util.Map;

/* renamed from: kg2  reason: default package */
public final class kg2 implements mg2 {
    @Override // defpackage.mg2
    public final /* bridge */ /* synthetic */ void b(Object obj, Map map) {
        y03 y03Var = (y03) obj;
        if (map.keySet().contains("start")) {
            y03Var.P0(true);
        }
        if (map.keySet().contains("stop")) {
            y03Var.P0(false);
        }
    }
}