package defpackage;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: ah2  reason: default package */
public final class ah2 implements mg2 {
    public final /* synthetic */ int P = 1;
    public final Object Q;

    public ah2(wi3 wi3Var) {
        this.Q = wi3Var;
    }

    @Override // defpackage.mg2
    public final void b(Object obj, Map map) {
        switch (this.P) {
            case 0:
                String str = (String) map.get("action");
                if ("grant".equals(str)) {
                    qr2 qr2Var = null;
                    try {
                        int parseInt = Integer.parseInt((String) map.get("amount"));
                        String str2 = (String) map.get("type");
                        if (!TextUtils.isEmpty(str2)) {
                            qr2Var = new qr2(str2, parseInt);
                        }
                    } catch (NumberFormatException e) {
                        sv2.h("Unable to parse reward amount.", e);
                    }
                    ((zg2) this.Q).E(qr2Var);
                    return;
                } else if ("video_start".equals(str)) {
                    ((zg2) this.Q).d();
                    return;
                } else if ("video_complete".equals(str)) {
                    ((zg2) this.Q).c();
                    return;
                } else {
                    return;
                }
            default:
                rk3 rk3Var = (rk3) ((WeakReference) this.Q).get();
                if (rk3Var != null) {
                    rk3Var.g.a();
                    return;
                }
                return;
        }
    }
}