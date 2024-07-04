package defpackage;

import java.util.Map;

/* renamed from: fa3  reason: default package */
public final class fa3 implements ga3 {
    public final Map a;

    public fa3(Map map) {
        this.a = map;
    }

    @Override // defpackage.ga3
    public final e14 a(int i, String str) {
        return (e14) this.a.get(str);
    }
}