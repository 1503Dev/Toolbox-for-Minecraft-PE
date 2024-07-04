package defpackage;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: k13  reason: default package */
public final class k13 {
    public static final l13 a(final Context context, final k23 k23Var, final String str, final boolean z, final boolean z2, final rz1 rz1Var, final va2 va2Var, final xv2 xv2Var, final zw5 zw5Var, final uj1 uj1Var, final j52 j52Var, final yh4 yh4Var, final ci4 ci4Var) {
        x92.a(context);
        try {
            qt4 qt4Var = new qt4() { // from class: h13
                @Override // defpackage.qt4
                public final Object a() {
                    Context context2 = context;
                    k23 k23Var2 = k23Var;
                    String str2 = str;
                    boolean z3 = z;
                    boolean z4 = z2;
                    rz1 rz1Var2 = rz1Var;
                    va2 va2Var2 = va2Var;
                    xv2 xv2Var2 = xv2Var;
                    yn5 yn5Var = zw5Var;
                    uj1 uj1Var2 = uj1Var;
                    j52 j52Var2 = j52Var;
                    yh4 yh4Var2 = yh4Var;
                    ci4 ci4Var2 = ci4Var;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i = o13.N0;
                        l13 l13Var = new l13(new o13(new j23(context2), k23Var2, str2, z3, rz1Var2, va2Var2, xv2Var2, yn5Var, uj1Var2, j52Var2, yh4Var2, ci4Var2));
                        l13Var.setWebViewClient(jv5.A.e.d(l13Var, j52Var2, z4));
                        l13Var.setWebChromeClient(new x03(l13Var));
                        return l13Var;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            Object a = qt4Var.a();
            StrictMode.setThreadPolicy(threadPolicy);
            return (l13) a;
        } catch (Throwable th) {
            throw new j13(th);
        }
    }
}