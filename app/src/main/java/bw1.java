package defpackage;

import android.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: bw1  reason: default package */
public final class bw1 {
    public static long a(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException e) {
            if (!"0".equals(str) && !"-1".equals(str)) {
                Log.e("Volley", rv1.d("Unable to parse dateStr: %s, falling back to 0", str), e);
                return 0L;
            }
            rv1.c("Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static nu1 b(yu1 yu1Var) {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = yu1Var.c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long a = str != null ? a(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            int i2 = 0;
            j = 0;
            j2 = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j2 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            z = false;
            j = 0;
            j2 = 0;
        }
        String str3 = (String) map.get("Expires");
        long a2 = str3 != null ? a(str3) : 0L;
        String str4 = (String) map.get("Last-Modified");
        long a3 = str4 != null ? a(str4) : 0L;
        String str5 = (String) map.get("ETag");
        if (z) {
            j4 = currentTimeMillis + (j * 1000);
            if (i != 0) {
                j5 = j4;
            } else {
                Long.signum(j2);
                j5 = (j2 * 1000) + j4;
            }
            j3 = j5;
        } else {
            j3 = 0;
            if (a <= 0 || a2 < a) {
                j4 = 0;
            } else {
                j4 = currentTimeMillis + (a2 - a);
                j3 = j4;
            }
        }
        nu1 nu1Var = new nu1();
        nu1Var.a = yu1Var.b;
        nu1Var.b = str5;
        nu1Var.f = j4;
        nu1Var.e = j3;
        nu1Var.c = a;
        nu1Var.d = a3;
        nu1Var.g = map;
        nu1Var.h = yu1Var.d;
        return nu1Var;
    }
}