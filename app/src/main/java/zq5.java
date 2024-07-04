package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

/* renamed from: zq5  reason: default package */
public final class zq5 {
    public static final zq5 a = new zq5();

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fd, code lost:
        if (r4.contains(r2) == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static pn5 a(Context context, fx3 fx3Var) {
        long j;
        List list;
        boolean z;
        Context applicationContext;
        String str;
        int i;
        String str2;
        Date date = fx3Var.a;
        if (date != null) {
            j = date.getTime();
        } else {
            j = -1;
        }
        long j2 = j;
        int i2 = fx3Var.c;
        Set set = fx3Var.d;
        if (!set.isEmpty()) {
            list = Collections.unmodifiableList(new ArrayList(set));
        } else {
            list = null;
        }
        xk0 xk0Var = x64.b().g;
        mv2 mv2Var = n62.f.a;
        String l = mv2.l(context);
        int i3 = 0;
        if (!fx3Var.g.contains(l)) {
            xk0Var.getClass();
            if (!new ArrayList(xk0Var.a).contains(l)) {
                z = false;
                Bundle bundle = fx3Var.e.getBundle(AdMobAdapter.class.getName());
                applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    String packageName = applicationContext.getPackageName();
                    StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                    while (true) {
                        i = i3 + 1;
                        if (i < stackTrace.length) {
                            StackTraceElement stackTraceElement = stackTrace[i3];
                            String className = stackTraceElement.getClassName();
                            if (!"loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) || (!mv2.c.equalsIgnoreCase(className) && !mv2.d.equalsIgnoreCase(className) && !mv2.e.equalsIgnoreCase(className) && !mv2.f.equalsIgnoreCase(className) && !mv2.g.equalsIgnoreCase(className) && !mv2.h.equalsIgnoreCase(className))) {
                                i3 = i;
                            }
                        } else {
                            str2 = null;
                            break;
                        }
                    }
                    str2 = stackTrace[i].getClassName();
                    if (packageName != null) {
                        StringTokenizer stringTokenizer = new StringTokenizer(packageName, ".");
                        StringBuilder sb = new StringBuilder();
                        if (stringTokenizer.hasMoreElements()) {
                            sb.append(stringTokenizer.nextToken());
                            for (int i4 = 2; i4 > 0 && stringTokenizer.hasMoreElements(); i4--) {
                                sb.append(".");
                                sb.append(stringTokenizer.nextToken());
                            }
                            packageName = sb.toString();
                        }
                        if (str2 != null) {
                        }
                    }
                    str2 = null;
                    str = str2;
                } else {
                    str = null;
                }
                boolean z2 = fx3Var.j;
                xk0 xk0Var2 = x64.b().g;
                int i5 = fx3Var.f;
                xk0Var2.getClass();
                return new pn5(8, j2, bundle, i2, list, z, Math.max(i5, -1), false, null, null, null, null, fx3Var.e, fx3Var.h, Collections.unmodifiableList(new ArrayList(fx3Var.i)), null, str, z2, null, Math.max(-1, -1), (String) Collections.max(Arrays.asList(null, ""), new Comparator() { // from class: yp5
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        List list2 = xk0.b;
                        return list2.indexOf((String) obj) - list2.indexOf((String) obj2);
                    }
                }), new ArrayList(fx3Var.b), fx3Var.k, null);
            }
        }
        z = true;
        Bundle bundle2 = fx3Var.e.getBundle(AdMobAdapter.class.getName());
        applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
        }
        boolean z22 = fx3Var.j;
        xk0 xk0Var22 = x64.b().g;
        int i52 = fx3Var.f;
        xk0Var22.getClass();
        return new pn5(8, j2, bundle2, i2, list, z, Math.max(i52, -1), false, null, null, null, null, fx3Var.e, fx3Var.h, Collections.unmodifiableList(new ArrayList(fx3Var.i)), null, str, z22, null, Math.max(-1, -1), (String) Collections.max(Arrays.asList(null, ""), new Comparator() { // from class: yp5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list2 = xk0.b;
                return list2.indexOf((String) obj) - list2.indexOf((String) obj2);
            }
        }), new ArrayList(fx3Var.b), fx3Var.k, null);
    }
}