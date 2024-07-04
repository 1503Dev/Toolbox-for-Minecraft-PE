package defpackage;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: qk3  reason: default package */
public final class qk3 implements mg2 {
    public final WeakReference P;

    @Override // defpackage.mg2
    public final void b(Object obj, Map map) {
        rk3 rk3Var = (rk3) this.P.get();
        if (rk3Var != null && "_ac".equals((String) map.get("eventName"))) {
            rk3Var.h.J();
            if (((Boolean) w82.d.c.a(x92.t8)).booleanValue()) {
                rk3Var.i.w();
                if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                    rk3Var.i.s();
                }
            }
        }
    }
}