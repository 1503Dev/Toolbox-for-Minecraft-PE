package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: xi4  reason: default package */
public final class xi4 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String a(String str) {
        char c;
        if (TextUtils.isEmpty(str)) {
            return "unspecified";
        }
        switch (str.hashCode()) {
            case 1743582862:
                if (str.equals("requester_type_0")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1743582863:
                if (str.equals("requester_type_1")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1743582864:
                if (str.equals("requester_type_2")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1743582865:
                if (str.equals("requester_type_3")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1743582866:
                if (str.equals("requester_type_4")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1743582867:
                if (str.equals("requester_type_5")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1743582868:
                if (str.equals("requester_type_6")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1743582869:
                if (str.equals("requester_type_7")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1743582870:
                if (str.equals("requester_type_8")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return "0";
            case 1:
                return "1";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case '\b':
                return "8";
            default:
                return str;
        }
    }

    public static String b(pn5 pn5Var) {
        Bundle bundle = pn5Var.R;
        return bundle == null ? "unspecified" : bundle.getString("query_info_type");
    }

    public static void c(final fs3 fs3Var, final xr3 xr3Var, final String str, final Pair... pairArr) {
        if (!((Boolean) w82.d.c.a(x92.W5)).booleanValue()) {
            return;
        }
        zw2.a.execute(new Runnable() { // from class: wz3
            @Override // java.lang.Runnable
            public final void run() {
                ConcurrentHashMap concurrentHashMap;
                fs3 fs3Var2 = fs3.this;
                xr3 xr3Var2 = xr3Var;
                String str2 = str;
                Pair[] pairArr2 = pairArr;
                if (xr3Var2 == null) {
                    fs3Var2.getClass();
                    concurrentHashMap = new ConcurrentHashMap(fs3Var2.a);
                } else {
                    concurrentHashMap = xr3Var2.a;
                }
                if (!TextUtils.isEmpty("action") && !TextUtils.isEmpty(str2)) {
                    concurrentHashMap.put("action", str2);
                }
                for (Pair pair : pairArr2) {
                    String str3 = (String) pair.first;
                    String str4 = (String) pair.second;
                    if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                        concurrentHashMap.put(str3, str4);
                    }
                }
                fs3Var2.a(concurrentHashMap, false);
            }
        });
    }

    public static int d(li4 li4Var) {
        if (li4Var.q) {
            return 2;
        }
        pn5 pn5Var = li4Var.d;
        sw2 sw2Var = pn5Var.h0;
        if (sw2Var == null && pn5Var.m0 == null) {
            return 1;
        }
        if (sw2Var == null || pn5Var.m0 == null) {
            return sw2Var != null ? 3 : 4;
        }
        return 5;
    }
}