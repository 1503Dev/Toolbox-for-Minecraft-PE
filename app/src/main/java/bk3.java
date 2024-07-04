package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import java.lang.reflect.Method;
import javax.annotation.ParametersAreNonnullByDefault;

/* renamed from: bk3  reason: default package */
public final class bk3 implements nd3, bi3 {
    public final it2 P;
    public final Context Q;
    public final qt2 R;
    public final View S;
    public String T;
    public final s52 U;

    public bk3(it2 it2Var, Context context, qt2 qt2Var, WebView webView, s52 s52Var) {
        this.P = it2Var;
        this.Q = context;
        this.R = qt2Var;
        this.S = webView;
        this.U = s52Var;
    }

    @Override // defpackage.nd3
    public final void K() {
        View view = this.S;
        if (view != null && this.T != null) {
            qt2 qt2Var = this.R;
            Context context = view.getContext();
            String str = this.T;
            if (qt2Var.j(context) && (context instanceof Activity)) {
                if (qt2.k(context)) {
                    qt2Var.d(new ka2(context, str), "setScreenName");
                } else if (qt2Var.e(context, "com.google.firebase.analytics.FirebaseAnalytics", qt2Var.h, false)) {
                    Method method = (Method) qt2Var.i.get("setCurrentScreen");
                    if (method == null) {
                        try {
                            method = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                            qt2Var.i.put("setCurrentScreen", method);
                        } catch (Exception unused) {
                            qt2Var.c("setCurrentScreen", false);
                            method = null;
                        }
                    }
                    try {
                        method.invoke(qt2Var.h.get(), (Activity) context, str, context.getPackageName());
                    } catch (Exception unused2) {
                        qt2Var.c("setCurrentScreen", false);
                    }
                }
            }
        }
        this.P.a(true);
    }

    @Override // defpackage.bi3
    public final void e() {
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a4  */
    @Override // defpackage.bi3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        String str;
        m23 m23Var;
        String f;
        s52 s52Var;
        String str2;
        if (this.U == s52.a0) {
            return;
        }
        qt2 qt2Var = this.R;
        Context context = this.Q;
        if (qt2Var.j(context)) {
            if (qt2.k(context)) {
                synchronized (qt2Var.j) {
                    if (((m23) qt2Var.j.get()) != null) {
                        try {
                            m23Var = (m23) qt2Var.j.get();
                            f = m23Var.f();
                        } catch (Exception unused) {
                            qt2Var.c("getCurrentScreenNameOrScreenClass", false);
                        }
                        if (f == null) {
                            f = m23Var.h();
                            if (f == null) {
                                str = "";
                            }
                        }
                        str = f;
                    }
                    str = "";
                }
            } else if (qt2Var.e(context, "com.google.android.gms.measurement.AppMeasurement", qt2Var.g, true)) {
                try {
                    String str3 = (String) qt2Var.m(context, "getCurrentScreenName").invoke(qt2Var.g.get(), new Object[0]);
                    if (str3 == null) {
                        str3 = (String) qt2Var.m(context, "getCurrentScreenClass").invoke(qt2Var.g.get(), new Object[0]);
                    }
                    if (str3 == null) {
                        str = "";
                    } else {
                        str = str3;
                    }
                } catch (Exception unused2) {
                    qt2Var.c("getCurrentScreenName", false);
                }
            }
            this.T = str;
            s52Var = this.U;
            String valueOf = String.valueOf(str);
            if (s52Var != s52.X) {
                str2 = "/Rewarded";
            } else {
                str2 = "/Interstitial";
            }
            this.T = valueOf.concat(str2);
        }
        str = "";
        this.T = str;
        s52Var = this.U;
        String valueOf2 = String.valueOf(str);
        if (s52Var != s52.X) {
        }
        this.T = valueOf2.concat(str2);
    }

    @Override // defpackage.nd3
    public final void j() {
        this.P.a(false);
    }

    @Override // defpackage.nd3
    @ParametersAreNonnullByDefault
    public final void l(cr2 cr2Var, String str, String str2) {
        if (this.R.j(this.Q)) {
            try {
                qt2 qt2Var = this.R;
                Context context = this.Q;
                qt2Var.i(context, qt2Var.f(context), this.P.R, ((ar2) cr2Var).P, ((ar2) cr2Var).Q);
            } catch (RemoteException e) {
                sv2.h("Remote Exception to get reward item.", e);
            }
        }
    }

    @Override // defpackage.nd3
    public final void m() {
    }

    @Override // defpackage.nd3
    public final void o() {
    }

    @Override // defpackage.nd3
    public final void q() {
    }
}