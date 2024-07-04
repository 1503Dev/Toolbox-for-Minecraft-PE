package defpackage;

import android.content.Context;
import java.util.Map;

/* renamed from: qg2  reason: default package */
public final class qg2 implements mg2 {
    public final Context P;

    public qg2(Context context) {
        this.P = context;
    }

    @Override // defpackage.mg2
    public final void b(Object obj, Map map) {
        char c;
        jv5 jv5Var = jv5.A;
        if (!jv5Var.w.j(this.P)) {
            return;
        }
        String str = (String) map.get("eventName");
        String str2 = (String) map.get("eventId");
        int hashCode = str.hashCode();
        if (hashCode != 94399) {
            if (hashCode != 94401) {
                if (hashCode == 94407 && str.equals("_ai")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (str.equals("_ac")) {
                    c = 0;
                }
                c = 65535;
            }
        } else {
            if (str.equals("_aa")) {
                c = 2;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    sv2.d("logScionEvent gmsg contained unsupported eventName");
                    return;
                } else {
                    jv5Var.w.b(this.P, "_aa", str2, null);
                    return;
                }
            }
            jv5Var.w.b(this.P, "_ai", str2, null);
            return;
        }
        jv5Var.w.b(this.P, "_ac", str2, null);
    }
}