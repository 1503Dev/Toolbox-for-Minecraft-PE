package defpackage;

import java.util.Map;

/* renamed from: bg2  reason: default package */
public final class bg2 implements mg2 {
    @Override // defpackage.mg2
    public final void b(Object obj, Map map) {
        sv2.f("Received log message: ".concat(String.valueOf((String) map.get("string"))));
    }
}