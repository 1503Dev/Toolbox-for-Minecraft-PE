package defpackage;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: yr3  reason: default package */
public final class yr3 {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final /* synthetic */ zr3 b;

    public yr3(zr3 zr3Var) {
        this.b = zr3Var;
    }

    public final void a(String str, String str2) {
        this.a.put(str, str2);
    }

    public final void b(yh4 yh4Var) {
        this.a.put("aai", yh4Var.w);
        if (((Boolean) w82.d.c.a(x92.W5)).booleanValue()) {
            String str = yh4Var.n0;
            if (!TextUtils.isEmpty(str)) {
                this.a.put("rid", str);
            }
        }
    }

    public final void c() {
        this.b.b.execute(new fn1(4, this));
    }
}