package defpackage;

import java.util.Map;

/* renamed from: df2  reason: default package */
public final class df2 implements mg2 {
    public final ef2 P;

    public df2(ef2 ef2Var) {
        this.P = ef2Var;
    }

    @Override // defpackage.mg2
    public final void b(Object obj, Map map) {
        String str = (String) map.get("name");
        if (str == null) {
            sv2.g("App event with no name parameter.");
        } else {
            this.P.t(str, (String) map.get("info"));
        }
    }
}