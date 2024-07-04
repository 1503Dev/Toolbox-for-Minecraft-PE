package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@Deprecated
/* renamed from: la2  reason: default package */
public final class la2 {
    public final LinkedList a = new LinkedList();
    public final LinkedHashMap b;
    public final Object c;

    public la2(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.b = linkedHashMap;
        this.c = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str);
    }

    public static final ja2 d() {
        jv5.A.j.getClass();
        return new ja2(SystemClock.elapsedRealtime(), null, null);
    }

    public final kt1 a() {
        kt1 kt1Var;
        boolean booleanValue = ((Boolean) w82.d.c.a(x92.x1)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.c) {
            for (ja2 ja2Var : this.a) {
                long j = ja2Var.a;
                String str = ja2Var.b;
                ja2 ja2Var2 = ja2Var.c;
                if (ja2Var2 != null && j > 0) {
                    sb.append(str);
                    sb.append('.');
                    sb.append(j - ja2Var2.a);
                    sb.append(',');
                    if (booleanValue) {
                        if (!hashMap.containsKey(Long.valueOf(ja2Var2.a))) {
                            hashMap.put(Long.valueOf(ja2Var2.a), new StringBuilder(str));
                        } else {
                            StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(ja2Var2.a));
                            sb2.append('+');
                            sb2.append(str);
                        }
                    }
                }
            }
            this.a.clear();
            String str2 = null;
            if (!TextUtils.isEmpty(null)) {
                sb.append((String) null);
            } else if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            StringBuilder sb3 = new StringBuilder();
            if (booleanValue) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    sb3.append((CharSequence) entry.getValue());
                    sb3.append('.');
                    long longValue = ((Long) entry.getKey()).longValue();
                    jv5 jv5Var = jv5.A;
                    jv5Var.j.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    jv5Var.j.getClass();
                    sb3.append((longValue - SystemClock.elapsedRealtime()) + currentTimeMillis);
                    sb3.append(',');
                }
                if (sb3.length() > 0) {
                    sb3.setLength(sb3.length() - 1);
                }
                str2 = sb3.toString();
            }
            kt1Var = new kt1(sb.toString(), str2);
        }
        return kt1Var;
    }

    public final void b(String str, String str2) {
        ca2 ca2Var;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        yu2 yu2Var = jv5.A.g;
        synchronized (yu2Var.a) {
            ca2Var = yu2Var.h;
        }
        if (ca2Var == null) {
            return;
        }
        synchronized (this.c) {
            ia2 ia2Var = (ia2) ca2Var.c.get(str);
            if (ia2Var == null) {
                ia2Var = ia2.a;
            }
            LinkedHashMap linkedHashMap = this.b;
            linkedHashMap.put(str, ia2Var.a((String) linkedHashMap.get(str), str2));
        }
    }

    public final void c(ja2 ja2Var, long j, String... strArr) {
        synchronized (this.c) {
            for (int i = 0; i <= 0; i++) {
                this.a.add(new ja2(j, strArr[i], ja2Var));
            }
        }
    }
}