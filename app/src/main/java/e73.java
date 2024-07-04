package defpackage;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: e73  reason: default package */
public final class e73 {
    public final String a;
    public final jk2 b;
    public final Executor c;
    public j73 d;
    public final c73 e = new c73(this);
    public final d73 f = new d73(this);

    public e73(String str, jk2 jk2Var, yw2 yw2Var) {
        this.a = str;
        this.b = jk2Var;
        this.c = yw2Var;
    }

    public static /* bridge */ /* synthetic */ boolean a(e73 e73Var, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(e73Var.a);
    }
}