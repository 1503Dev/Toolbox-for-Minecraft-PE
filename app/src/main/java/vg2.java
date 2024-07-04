package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: vg2  reason: default package */
public final class vg2 implements mg2 {
    public final o82 P;
    public final zr3 Q;
    public final wl4 R;
    public final tn2 T;
    public final r04 U;
    public zy5 V = null;
    public final wv2 S = new wv2(null);

    public vg2(o82 o82Var, tn2 tn2Var, r04 r04Var, zr3 zr3Var, wl4 wl4Var) {
        this.P = o82Var;
        this.T = tn2Var;
        this.U = r04Var;
        this.Q = zr3Var;
        this.R = wl4Var;
    }

    public static int a(Map map) {
        String str = (String) map.get("o");
        if (str != null) {
            if ("p".equalsIgnoreCase(str)) {
                return 7;
            }
            if ("l".equalsIgnoreCase(str)) {
                return 6;
            }
            return "c".equalsIgnoreCase(str) ? 14 : -1;
        }
        return -1;
    }

    public static Uri c(Context context, rz1 rz1Var, Uri uri, View view, Activity activity) {
        if (rz1Var == null) {
            return uri;
        }
        try {
            boolean z = false;
            if (rz1Var.b(uri)) {
                String[] strArr = rz1.c;
                int i = 0;
                while (true) {
                    if (i >= 3) {
                        break;
                    }
                    if (uri.getPath().endsWith(strArr[i])) {
                        z = true;
                        break;
                    }
                    i++;
                }
            }
            if (z) {
                return rz1Var.a(uri, context, view, activity);
            }
            return uri;
        } catch (sz1 unused) {
            return uri;
        } catch (Exception e) {
            jv5.A.g.f("OpenGmsgHandler.maybeAddClickSignalsToUri", e);
            return uri;
        }
    }

    public static Uri d(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            sv2.e("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e);
        }
        return uri;
    }

    @Override // defpackage.mg2
    public final void b(Object obj, Map map) {
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        c23 c23Var;
        tw2 tw2Var;
        boolean z5;
        String str2;
        vj1 vj1Var = (vj1) obj;
        y03 y03Var = (y03) vj1Var;
        String b = rt2.b(y03Var.getContext(), (String) map.get("u"), true);
        String str3 = (String) map.get("a");
        if (str3 == null) {
            str2 = "Action missing from an open GMSG.";
        } else {
            o82 o82Var = this.P;
            if (o82Var != null && !o82Var.b()) {
                this.P.a(b);
                return;
            }
            yh4 z6 = y03Var.z();
            ci4 C = y03Var.C();
            boolean z7 = false;
            if (z6 != null && C != null) {
                boolean z8 = z6.i0;
                str = C.b;
                z = z8;
            } else {
                str = "";
                z = false;
            }
            l92 l92Var = x92.r8;
            w82 w82Var = w82.d;
            if (((Boolean) w82Var.c.a(l92Var)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("0")) {
                z2 = false;
            } else {
                z2 = true;
            }
            if ("expand".equalsIgnoreCase(str3)) {
                if (y03Var.V()) {
                    str2 = "Cannot expand WebView that is already expanded.";
                } else {
                    f(false);
                    ((c23) vj1Var).E0(a(map), "1".equals(map.get("custom_close")), z2);
                    return;
                }
            } else if ("webapp".equalsIgnoreCase(str3)) {
                f(false);
                if (b != null) {
                    ((c23) vj1Var).n0(b, a(map), "1".equals(map.get("custom_close")), z2);
                    return;
                }
                ((c23) vj1Var).v0(a(map), (String) map.get("html"), (String) map.get("baseurl"), "1".equals(map.get("custom_close")), z2);
                return;
            } else {
                boolean z9 = z2;
                if ("chrome_custom_tab".equalsIgnoreCase(str3)) {
                    Context context = y03Var.getContext();
                    if (((Boolean) w82Var.c.a(x92.J3)).booleanValue()) {
                        if (((Boolean) w82Var.c.a(x92.P3)).booleanValue()) {
                            vz3.k("User opt out chrome custom tab.");
                        } else {
                            if (((Boolean) w82Var.c.a(x92.N3)).booleanValue()) {
                                String str4 = (String) w82Var.c.a(x92.O3);
                                if (!str4.isEmpty() && context != null) {
                                    String packageName = context.getPackageName();
                                    Iterator b2 = vw2.a(new ts4(';')).b(str4);
                                    while (b2.hasNext()) {
                                        if (((String) b2.next()).equals(packageName)) {
                                            z7 = true;
                                            break;
                                        }
                                    }
                                }
                            } else {
                                z7 = true;
                                break;
                            }
                        }
                    }
                    boolean a = ua2.a(y03Var.getContext());
                    if (z7) {
                        if (!a) {
                            h(4);
                        } else {
                            f(true);
                            if (TextUtils.isEmpty(b)) {
                                sv2.g("Cannot open browser with null or empty url");
                                h(7);
                                return;
                            }
                            Uri d = d(c(y03Var.getContext(), y03Var.r(), Uri.parse(b), y03Var.x(), y03Var.g()));
                            if (!z || this.U == null || !g(vj1Var, y03Var.getContext(), d.toString(), str)) {
                                this.V = new sg2(this);
                                c23Var = (c23) vj1Var;
                                tw2Var = new tw2(null, d.toString(), null, null, null, null, null, null, new va0(this.V), true);
                                z5 = z9;
                            } else {
                                return;
                            }
                        }
                    }
                    map.put("use_first_package", "true");
                    map.put("use_running_process", "true");
                    e(vj1Var, map, z, str, z9);
                    return;
                }
                if (!"app".equalsIgnoreCase(str3) || !"true".equalsIgnoreCase((String) map.get("system_browser"))) {
                    if ("open_app".equalsIgnoreCase(str3)) {
                        if (((Boolean) w82Var.c.a(x92.T6)).booleanValue()) {
                            f(true);
                            String str5 = (String) map.get("p");
                            if (str5 == null) {
                                str2 = "Package name missing from open app action.";
                            } else if (!z || this.U == null || !g(vj1Var, y03Var.getContext(), str5, str)) {
                                PackageManager packageManager = y03Var.getContext().getPackageManager();
                                if (packageManager == null) {
                                    str2 = "Cannot get package manager from open app action.";
                                } else {
                                    Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str5);
                                    if (launchIntentForPackage != null) {
                                        c23Var = (c23) vj1Var;
                                        tw2Var = new tw2(launchIntentForPackage, this.V);
                                        z5 = z9;
                                    } else {
                                        return;
                                    }
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        f(true);
                        String str6 = (String) map.get("intent_url");
                        Intent intent = null;
                        if (!TextUtils.isEmpty(str6)) {
                            try {
                                intent = Intent.parseUri(str6, 0);
                            } catch (URISyntaxException e) {
                                sv2.e("Error parsing the url: ".concat(String.valueOf(str6)), e);
                            }
                        }
                        if (intent != null && intent.getData() != null) {
                            Uri data = intent.getData();
                            if (!Uri.EMPTY.equals(data)) {
                                Uri d2 = d(c(y03Var.getContext(), y03Var.r(), data, y03Var.x(), y03Var.g()));
                                if (!TextUtils.isEmpty(intent.getType())) {
                                    if (((Boolean) w82.d.c.a(x92.U6)).booleanValue()) {
                                        intent.setDataAndType(d2, intent.getType());
                                    }
                                }
                                intent.setData(d2);
                            }
                        }
                        if (((Boolean) w82.d.c.a(x92.g7)).booleanValue() && "intent_async".equalsIgnoreCase(str3) && map.containsKey("event_id")) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        HashMap hashMap = new HashMap();
                        if (z3) {
                            this.V = new tg2(z9, vj1Var, hashMap, map);
                            z4 = false;
                        } else {
                            z4 = z9;
                        }
                        if (intent != null) {
                            if (z && this.U != null && g(vj1Var, y03Var.getContext(), intent.getData().toString(), str)) {
                                if (!z3) {
                                    return;
                                }
                            } else {
                                c23Var = (c23) vj1Var;
                                tw2Var = new tw2(intent, this.V);
                                z5 = z4;
                            }
                        } else {
                            if (!TextUtils.isEmpty(b)) {
                                b = d(c(y03Var.getContext(), y03Var.r(), Uri.parse(b), y03Var.x(), y03Var.g())).toString();
                            }
                            if (z && this.U != null && g(vj1Var, y03Var.getContext(), b, str)) {
                                if (!z3) {
                                    return;
                                }
                            } else {
                                ((c23) vj1Var).r0(new tw2((String) map.get("i"), b, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e"), this.V), z4);
                                return;
                            }
                        }
                        hashMap.put((String) map.get("event_id"), Boolean.TRUE);
                        ((pi2) vj1Var).a("openIntentAsync", hashMap);
                        return;
                    }
                }
                e(vj1Var, map, z, str, z9);
                return;
                c23Var.r0(tw2Var, z5);
                return;
            }
        }
        sv2.g(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0102, code lost:
        if (defpackage.ug2.b(r11, new java.util.ArrayList(), r5) == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0145, code lost:
        r5 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(vj1 vj1Var, Map map, boolean z, String str, boolean z2) {
        Uri uri;
        Uri.Builder scheme;
        ResolveInfo b;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo b2;
        boolean z3 = true;
        f(true);
        y03 y03Var = (y03) vj1Var;
        Context context = y03Var.getContext();
        rz1 r = y03Var.r();
        View x = y03Var.x();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str2 = (String) map.get("u");
        Intent intent = null;
        if (!TextUtils.isEmpty(str2)) {
            Uri d = d(c(context, r, Uri.parse(str2), x, null));
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("use_first_package"));
            boolean parseBoolean2 = Boolean.parseBoolean((String) map.get("use_running_process"));
            if (!Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                if (!((Boolean) w82.d.c.a(x92.H3)).booleanValue()) {
                    z3 = false;
                }
            }
            if ("http".equalsIgnoreCase(d.getScheme())) {
                scheme = d.buildUpon().scheme("https");
            } else if ("https".equalsIgnoreCase(d.getScheme())) {
                scheme = d.buildUpon().scheme("http");
            } else {
                uri = null;
                ArrayList arrayList = new ArrayList();
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.addFlags(268435456);
                intent2.setData(d);
                intent2.setAction("android.intent.action.VIEW");
                if (uri != null) {
                    intent = new Intent("android.intent.action.VIEW");
                    intent.addFlags(268435456);
                    intent.setData(uri);
                    intent.setAction("android.intent.action.VIEW");
                }
                if (z3) {
                    cu5 cu5Var = jv5.A.c;
                    cu5.x(context, intent2);
                    cu5.x(context, intent);
                }
                b = ug2.b(intent2, arrayList, context);
                if (b == null) {
                    if (intent != null && (b2 = ug2.b(intent, new ArrayList(), context)) != null) {
                        intent = ug2.a(intent2, b2);
                    }
                    if (!arrayList.isEmpty()) {
                        if (parseBoolean2 && activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                            int size = arrayList.size();
                            int i = 0;
                            loop0: while (i < size) {
                                ResolveInfo resolveInfo = (ResolveInfo) arrayList.get(i);
                                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                                while (true) {
                                    int i2 = i + 1;
                                    if (it.hasNext()) {
                                        if (it.next().processName.equals(resolveInfo.activityInfo.packageName)) {
                                            intent = ug2.a(intent2, resolveInfo);
                                            break loop0;
                                        }
                                    }
                                }
                            }
                        }
                        if (parseBoolean) {
                            b = (ResolveInfo) arrayList.get(0);
                        }
                    }
                    intent = intent2;
                }
                intent = ug2.a(intent2, b);
            }
            uri = scheme.build();
            ArrayList arrayList2 = new ArrayList();
            Intent intent22 = new Intent("android.intent.action.VIEW");
            intent22.addFlags(268435456);
            intent22.setData(d);
            intent22.setAction("android.intent.action.VIEW");
            if (uri != null) {
            }
            if (z3) {
            }
            b = ug2.b(intent22, arrayList2, context);
            if (b == null) {
            }
            intent = ug2.a(intent22, b);
        }
        if (z && this.U != null && intent != null && g(vj1Var, y03Var.getContext(), intent.getData().toString(), str)) {
            return;
        }
        try {
            ((c23) vj1Var).r0(new tw2(intent, this.V), z2);
        } catch (ActivityNotFoundException e) {
            sv2.g(e.getMessage());
        }
    }

    public final void f(boolean z) {
        tn2 tn2Var = this.T;
        if (tn2Var != null) {
            tn2Var.g(z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
        if (((java.lang.Boolean) defpackage.w82.d.c.a(defpackage.x92.d7)).booleanValue() != false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(vj1 vj1Var, Context context, String str, String str2) {
        boolean z;
        String str3;
        zr3 zr3Var = this.Q;
        if (zr3Var != null) {
            a14.t4(context, zr3Var, this.R, this.U, str2, "offline_open");
        }
        jv5 jv5Var = jv5.A;
        if (jv5Var.g.g(context)) {
            r04 r04Var = this.U;
            wv2 wv2Var = this.S;
            r04Var.getClass();
            r04Var.d(new p04(r04Var, wv2Var, str2));
            return false;
        }
        co2 D = cu5.D(context);
        boolean a = new ha0(context).a();
        boolean g = jv5Var.e.g(context);
        y03 y03Var = (y03) vj1Var;
        if (y03Var.L().b() && y03Var.g() == null) {
            z = true;
        } else {
            z = false;
        }
        if (!a) {
            if (!new ha0(context).a() && Build.VERSION.SDK_INT >= 33) {
            }
            r04 r04Var2 = this.U;
            r04Var2.getClass();
            r04Var2.d(new yn2(r04Var2, str2));
            if (this.Q != null) {
                HashMap hashMap = new HashMap();
                if (!a) {
                    str3 = "notifications_disabled";
                } else if (g) {
                    str3 = "notification_channel_disabled";
                } else if (D == null) {
                    str3 = "work_manager_unavailable";
                } else {
                    if (!((Boolean) w82.d.c.a(x92.b7)).booleanValue()) {
                        str3 = "notification_flow_disabled";
                    } else {
                        if (z) {
                            str3 = "fullscreen_no_activity";
                        }
                        a14.u4(context, this.Q, this.R, this.U, str2, "dialog_not_shown", hashMap);
                    }
                }
                hashMap.put("dialog_not_shown_reason", str3);
                a14.u4(context, this.Q, this.R, this.U, str2, "dialog_not_shown", hashMap);
            }
            return false;
        }
        if (!g && D != null && !z) {
            if (((Boolean) w82.d.c.a(x92.b7)).booleanValue()) {
                if (y03Var.L().b()) {
                    a14.v4(y03Var.g(), null, D, this.Q, this.U, this.R, str2, str, true);
                } else {
                    ((c23) vj1Var).c(D, this.U, this.Q, this.R, str2, str);
                }
                zr3 zr3Var2 = this.Q;
                if (zr3Var2 != null) {
                    a14.t4(context, zr3Var2, this.R, this.U, str2, "dialog_impression");
                }
                vj1Var.J();
                return true;
            }
        }
        r04 r04Var22 = this.U;
        r04Var22.getClass();
        r04Var22.d(new yn2(r04Var22, str2));
        if (this.Q != null) {
        }
        return false;
    }

    public final void h(int i) {
        if (this.Q == null) {
            return;
        }
        if (((Boolean) w82.d.c.a(x92.k7)).booleanValue()) {
            wl4 wl4Var = this.R;
            String j = dt4.j(i);
            vl4 b = vl4.b("cct_action");
            b.a("cct_open_status", j);
            wl4Var.a(b);
            return;
        }
        yr3 a = this.Q.a();
        a.a("action", "cct_action");
        a.a("cct_open_status", dt4.j(i));
        a.c();
    }
}