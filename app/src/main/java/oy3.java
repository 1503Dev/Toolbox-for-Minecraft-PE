package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: oy3  reason: default package */
public final class oy3 implements bl4 {
    public static final Pattern S = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    public final String P;
    public final hm4 Q;
    public final qm4 R;

    public oy3(String str, qm4 qm4Var, hm4 hm4Var) {
        this.P = str;
        this.R = qm4Var;
        this.Q = hm4Var;
    }

    @Override // defpackage.bl4
    public final Object e(Object obj) {
        vu3 vu3Var;
        String str;
        ny3 ny3Var = (ny3) obj;
        int optInt = ny3Var.a.optInt("http_timeout_millis", 60000);
        tq2 tq2Var = ny3Var.b;
        int i = tq2Var.g;
        String str2 = "";
        if (i == -2) {
            HashMap hashMap = new HashMap();
            if (ny3Var.b.e && !TextUtils.isEmpty(this.P)) {
                if (((Boolean) w82.d.c.a(x92.B0)).booleanValue()) {
                    String str3 = this.P;
                    if (TextUtils.isEmpty(str3)) {
                        str = "";
                    } else {
                        Matcher matcher = S.matcher(str3);
                        str = "";
                        while (matcher.find()) {
                            String group = matcher.group(1);
                            if (group != null) {
                                Locale locale = Locale.ROOT;
                                if (group.toLowerCase(locale).startsWith("id=") || group.toLowerCase(locale).startsWith("ide=")) {
                                    if (!TextUtils.isEmpty(str)) {
                                        str = str.concat("; ");
                                    }
                                    str = str.concat(group);
                                }
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str)) {
                        hashMap.put("Cookie", str);
                    }
                } else {
                    hashMap.put("Cookie", this.P);
                }
            }
            if (ny3Var.b.d) {
                z63.a(hashMap, ny3Var.a);
            }
            tq2 tq2Var2 = ny3Var.b;
            if (tq2Var2 != null && !TextUtils.isEmpty(tq2Var2.c)) {
                str2 = ny3Var.b.c;
            }
            qm4 qm4Var = this.R;
            hm4 hm4Var = this.Q;
            hm4Var.k0(true);
            qm4Var.b(hm4Var);
            return new ky3(ny3Var.b.f, optInt, hashMap, str2.getBytes(zs4.c), "", ny3Var.b.d);
        }
        if (i == 1) {
            List list = tq2Var.a;
            if (list != null) {
                str2 = TextUtils.join(", ", list);
                sv2.d(str2);
            }
            vu3Var = new vu3(2, "Error building request URL: ".concat(String.valueOf(str2)));
        } else {
            vu3Var = new vu3(1);
        }
        qm4 qm4Var2 = this.R;
        hm4 hm4Var2 = this.Q;
        hm4Var2.b(vu3Var);
        hm4Var2.k0(false);
        qm4Var2.b(hm4Var2);
        throw vu3Var;
    }
}