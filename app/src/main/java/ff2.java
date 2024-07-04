package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: ff2  reason: default package */
public final class ff2 implements mg2 {
    @Override // defpackage.mg2
    public final void b(Object obj, Map map) {
        y03 y03Var = (y03) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                sv2.g("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str4)) {
                sv2.g("No timestamp given for CSI tick.");
            } else {
                try {
                    long parseLong = Long.parseLong(str4);
                    jv5 jv5Var = jv5.A;
                    jv5Var.j.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    jv5Var.j.getClass();
                    long elapsedRealtime = (parseLong - currentTimeMillis) + SystemClock.elapsedRealtime();
                    if (true == TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    ka2 o = y03Var.o();
                    la2 la2Var = (la2) o.Q;
                    ja2 ja2Var = (ja2) ((Map) o.P).get(str3);
                    String[] strArr = {str2};
                    if (ja2Var != null) {
                        la2Var.c(ja2Var, elapsedRealtime, strArr);
                    }
                    ((Map) o.P).put(str2, new ja2(elapsedRealtime, null, null));
                } catch (NumberFormatException e) {
                    sv2.h("Malformed timestamp for CSI tick.", e);
                }
            }
        } else if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                sv2.g("No value given for CSI experiment.");
            } else {
                ((la2) y03Var.o().Q).b("e", str5);
            }
        } else if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                sv2.g("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                sv2.g("No name given for CSI extra.");
            } else {
                ((la2) y03Var.o().Q).b(str6, str7);
            }
        }
    }
}