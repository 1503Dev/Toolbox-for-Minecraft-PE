package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;

/* renamed from: c14  reason: default package */
public final class c14 {
    public static on4 e(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 112202875) {
            if (hashCode == 714893483 && str.equals("nativeDisplay")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("video")) {
                c = 2;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    return null;
                }
                return on4.VIDEO;
            }
            return on4.NATIVE_DISPLAY;
        }
        return on4.HTML_DISPLAY;
    }

    public static qn4 f(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -1104128070) {
            if (str.equals("beginToRender")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 1318088141) {
            if (hashCode == 1988248512 && str.equals("onePixel")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("definedByJavascript")) {
                c = 1;
            }
            c = 65535;
        }
        return c != 0 ? c != 1 ? c != 2 ? qn4.UNSPECIFIED : qn4.ONE_PIXEL : qn4.DEFINED_BY_JAVASCRIPT : qn4.BEGIN_TO_RENDER;
    }

    public static rn4 g(String str) {
        return "native".equals(str) ? rn4.NATIVE : "javascript".equals(str) ? rn4.JAVASCRIPT : rn4.NONE;
    }

    public final va0 a(String str, WebView webView, String str2, int i, int i2, String str3) {
        String valueOf;
        String str4;
        String concat;
        if (((Boolean) w82.d.c.a(x92.i4)).booleanValue()) {
            in4 in4Var = mu2.Q;
            if (in4Var.P) {
                if (!TextUtils.isEmpty("Google")) {
                    if (!TextUtils.isEmpty(str)) {
                        sh3 sh3Var = new sh3("Google", str);
                        rn4 g = g("javascript");
                        on4 e = e(d14.a(i2));
                        rn4 rn4Var = rn4.NONE;
                        if (g == rn4Var) {
                            concat = "Omid html session error; Unable to parse impression owner: javascript";
                        } else {
                            if (e == null) {
                                valueOf = d14.b(i2);
                                str4 = "Omid html session error; Unable to parse creative type: ";
                            } else {
                                rn4 g2 = g(str2);
                                if (e == on4.VIDEO && g2 == rn4Var) {
                                    valueOf = String.valueOf(str2);
                                    str4 = "Omid html session error; Video events owner unknown for video creative: ";
                                } else {
                                    ln4 ln4Var = new ln4(sh3Var, webView, str3, mn4.HTML);
                                    kn4 a = kn4.a(e, f(tr0.a(i)), g, g2);
                                    if (in4Var.P) {
                                        return new va0(new nn4(a, ln4Var));
                                    }
                                    throw new IllegalStateException("Method called before OM SDK activation");
                                }
                            }
                            concat = str4.concat(valueOf);
                        }
                        sv2.g(concat);
                    } else {
                        throw new IllegalArgumentException("Version is null or empty");
                    }
                } else {
                    throw new IllegalArgumentException("Name is null or empty");
                }
            }
        }
        return null;
    }

    public final void b(View view, hw hwVar) {
        if (((Boolean) w82.d.c.a(x92.i4)).booleanValue() && mu2.Q.P) {
            Object c0 = va0.c0(hwVar);
            if (c0 instanceof jn4) {
                ((jn4) c0).c(view);
            }
        }
    }

    public final void c(hw hwVar) {
        if (((Boolean) w82.d.c.a(x92.i4)).booleanValue() && mu2.Q.P) {
            Object c0 = va0.c0(hwVar);
            if (c0 instanceof jn4) {
                ((jn4) c0).d();
            }
        }
    }

    public final boolean d(Context context) {
        if (!((Boolean) w82.d.c.a(x92.i4)).booleanValue()) {
            sv2.g("Omid flag is disabled");
            return false;
        }
        in4 in4Var = mu2.Q;
        if (in4Var.P) {
            return true;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            if (!in4Var.P) {
                in4Var.P = true;
                co4 a = co4.a();
                a.getClass();
                a.b = new tn4(new Handler(), applicationContext, a);
                vn4 vn4Var = vn4.S;
                if (applicationContext instanceof Application) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(vn4Var);
                }
                WindowManager windowManager = jo4.a;
                jo4.c = applicationContext.getResources().getDisplayMetrics().density;
                jo4.a = (WindowManager) applicationContext.getSystemService("window");
                xn4.b.a = applicationContext.getApplicationContext();
            }
            return in4Var.P;
        }
        throw new IllegalArgumentException("Application Context cannot be null");
    }
}