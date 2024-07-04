package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: zl4  reason: default package */
public final class zl4 {
    public final kd a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();

    public zl4(dk dkVar) {
        this.a = dkVar;
    }

    public final void a(String str, String str2) {
        if (!this.b.containsKey(str)) {
            this.b.put(str, new ArrayList());
        }
        ((List) this.b.get(str)).add(str2);
    }
}