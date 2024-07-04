package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: hk3  reason: default package */
public final class hk3 implements ga3 {
    public final Map a;
    public final Map b;
    public final Map c;
    public final uj5 d;
    public final wl3 e;

    public hk3(Map map, Map map2, Map map3, uj5 uj5Var, wl3 wl3Var) {
        this.a = map;
        this.b = map2;
        this.c = map3;
        this.d = uj5Var;
        this.e = wl3Var;
    }

    @Override // defpackage.ga3
    public final e14 a(int i, String str) {
        e14 a;
        e14 e14Var = (e14) this.a.get(str);
        if (e14Var != null) {
            return e14Var;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            k34 k34Var = (k34) this.c.get(str);
            if (k34Var != null) {
                return new f14(k34Var, new at4() { // from class: ia3
                    @Override // defpackage.at4
                    public final Object apply(Object obj) {
                        return new ka3((List) obj);
                    }
                });
            }
            e14 e14Var2 = (e14) this.b.get(str);
            if (e14Var2 == null) {
                return null;
            }
            return new f14(e14Var2, new at4() { // from class: ja3
                @Override // defpackage.at4
                public final Object apply(Object obj) {
                    return new ka3((ea3) obj);
                }
            });
        } else if (this.e.d == null || (a = ((ga3) this.d.c()).a(i, str)) == null) {
            return null;
        } else {
            return new f14(a, new at4() { // from class: ja3
                @Override // defpackage.at4
                public final Object apply(Object obj) {
                    return new ka3((ea3) obj);
                }
            });
        }
    }
}