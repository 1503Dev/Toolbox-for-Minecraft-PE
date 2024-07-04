package defpackage;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.TrafficStats;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* renamed from: g13  reason: default package */
public class g13 extends WebViewClient implements vj1, oi3 {
    public static final /* synthetic */ int r0 = 0;
    public final y03 P;
    public final j52 Q;
    public final HashMap R;
    public final Object S;
    public vj1 T;
    public zp5 U;
    public h23 V;
    public i23 W;
    public cf2 X;
    public ef2 Y;
    public oi3 Z;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public boolean d0;
    public boolean e0;
    public b16 f0;
    public xn2 g0;
    public o82 h0;
    public tn2 i0;
    public ys2 j0;
    public gn4 k0;
    public boolean l0;
    public boolean m0;
    public int n0;
    public boolean o0;
    public final HashSet p0;
    public d13 q0;

    public g13(l13 l13Var, j52 j52Var, boolean z) {
        xn2 xn2Var = new xn2(l13Var, l13Var.s0(), new k92(l13Var.getContext()));
        this.R = new HashMap();
        this.S = new Object();
        this.Q = j52Var;
        this.P = l13Var;
        this.c0 = z;
        this.g0 = xn2Var;
        this.i0 = null;
        this.p0 = new HashSet(Arrays.asList(((String) w82.d.c.a(x92.D4)).split(",")));
    }

    public static WebResourceResponse b() {
        if (((Boolean) w82.d.c.a(x92.w0)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    public static final boolean f(boolean z, y03 y03Var) {
        return (!z || y03Var.L().b() || y03Var.a0().equals("interstitial_mb")) ? false : true;
    }

    @Override // defpackage.vj1
    public final void J() {
        vj1 vj1Var = this.T;
        if (vj1Var != null) {
            vj1Var.J();
        }
    }

    public final void a(vj1 vj1Var, cf2 cf2Var, zp5 zp5Var, ef2 ef2Var, b16 b16Var, boolean z, og2 og2Var, o82 o82Var, nj2 nj2Var, ys2 ys2Var, final r04 r04Var, final gn4 gn4Var, zr3 zr3Var, wl4 wl4Var, ch2 ch2Var, final oi3 oi3Var, bh2 bh2Var, bf2 bf2Var) {
        mg2 mg2Var;
        o82 o82Var2 = o82Var == null ? new o82(this.P.getContext(), ys2Var) : o82Var;
        this.i0 = new tn2(this.P, nj2Var);
        this.j0 = ys2Var;
        l92 l92Var = x92.D0;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            u("/adMetadata", new bf2(0, cf2Var));
        }
        if (ef2Var != null) {
            u("/appEvent", new df2(ef2Var));
        }
        u("/backButton", lg2.e);
        u("/refresh", lg2.f);
        u("/canOpenApp", new mg2() { // from class: of2
            @Override // defpackage.mg2
            public final void b(Object obj, Map map) {
                boolean z2;
                u13 u13Var = (u13) obj;
                zf2 zf2Var = lg2.a;
                if (!((Boolean) w82.d.c.a(x92.T6)).booleanValue()) {
                    sv2.g("canOpenAppGmsgHandler disabled.");
                    return;
                }
                String str = (String) map.get("package_name");
                if (TextUtils.isEmpty(str)) {
                    sv2.g("Package name missing in canOpenApp GMSG.");
                    return;
                }
                HashMap hashMap = new HashMap();
                if (u13Var.getContext().getPackageManager().getLaunchIntentForPackage(str) != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Boolean valueOf = Boolean.valueOf(z2);
                hashMap.put(str, valueOf);
                vz3.k("/canOpenApp;" + str + ";" + valueOf);
                ((pi2) u13Var).a("openableApp", hashMap);
            }
        });
        u("/canOpenURLs", new mg2() { // from class: nf2
            @Override // defpackage.mg2
            public final void b(Object obj, Map map) {
                u13 u13Var = (u13) obj;
                zf2 zf2Var = lg2.a;
                String str = (String) map.get("urls");
                if (TextUtils.isEmpty(str)) {
                    sv2.g("URLs missing in canOpenURLs GMSG.");
                    return;
                }
                String[] split = str.split(",");
                HashMap hashMap = new HashMap();
                PackageManager packageManager = u13Var.getContext().getPackageManager();
                for (String str2 : split) {
                    String[] split2 = str2.split(";", 2);
                    boolean z2 = true;
                    if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                        z2 = false;
                    }
                    Boolean valueOf = Boolean.valueOf(z2);
                    hashMap.put(str2, valueOf);
                    vz3.k("/canOpenURLs;" + str2 + ";" + valueOf);
                }
                ((pi2) u13Var).a("openableURLs", hashMap);
            }
        });
        u("/canOpenIntents", new mg2() { // from class: if2
            /* JADX WARN: Can't wrap try/catch for region: R(14:(3:10|11|12)|(12:51|52|15|(10:17|(1:19)|20|(1:22)|23|(1:25)|26|(1:28)|29|(2:31|(1:33)))|34|35|36|(1:38)|39|40|42|43)|14|15|(0)|34|35|36|(0)|39|40|42|43|8) */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x00cf, code lost:
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x00d0, code lost:
                defpackage.jv5.A.g.f(r9.toString(), r0);
                r15 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x00e5, code lost:
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x00e6, code lost:
                r8 = "Error constructing openable urls response.";
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x00ec, code lost:
                defpackage.sv2.e(r8, r0);
             */
            /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00e0  */
            @Override // defpackage.mg2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void b(Object obj, Map map) {
                pi2 pi2Var;
                JSONObject jSONObject;
                String optString;
                String optString2;
                String optString3;
                String optString4;
                String optString5;
                String optString6;
                String optString7;
                Intent parseUri;
                ResolveInfo resolveInfo;
                u13 u13Var = (u13) obj;
                zf2 zf2Var = lg2.a;
                PackageManager packageManager = u13Var.getContext().getPackageManager();
                try {
                } catch (JSONException unused) {
                    pi2Var = (pi2) u13Var;
                    jSONObject = new JSONObject();
                }
                try {
                    JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                    JSONObject jSONObject2 = new JSONObject();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                            optString = jSONObject3.optString("id");
                            optString2 = jSONObject3.optString("u");
                            optString3 = jSONObject3.optString("i");
                            optString4 = jSONObject3.optString("m");
                            optString5 = jSONObject3.optString("p");
                            optString6 = jSONObject3.optString("c");
                            optString7 = jSONObject3.optString("intent_url");
                        } catch (JSONException e) {
                            e = e;
                            String str = "Error parsing the intent data.";
                        }
                        if (!TextUtils.isEmpty(optString7)) {
                            try {
                                parseUri = Intent.parseUri(optString7, 0);
                            } catch (URISyntaxException e2) {
                                sv2.e("Error parsing the url: ".concat(String.valueOf(optString7)), e2);
                            }
                            boolean z2 = true;
                            if (parseUri == null) {
                                parseUri = new Intent();
                                if (!TextUtils.isEmpty(optString2)) {
                                    parseUri.setData(Uri.parse(optString2));
                                }
                                if (!TextUtils.isEmpty(optString3)) {
                                    parseUri.setAction(optString3);
                                }
                                if (!TextUtils.isEmpty(optString4)) {
                                    parseUri.setType(optString4);
                                }
                                if (!TextUtils.isEmpty(optString5)) {
                                    parseUri.setPackage(optString5);
                                }
                                if (!TextUtils.isEmpty(optString6)) {
                                    String[] split = optString6.split("/", 2);
                                    if (split.length == 2) {
                                        parseUri.setComponent(new ComponentName(split[0], split[1]));
                                    }
                                }
                            }
                            Intent intent = parseUri;
                            resolveInfo = packageManager.resolveActivity(intent, 65536);
                            if (resolveInfo == null) {
                                z2 = false;
                            }
                            jSONObject2.put(optString, z2);
                        }
                        parseUri = null;
                        boolean z22 = true;
                        if (parseUri == null) {
                        }
                        Intent intent2 = parseUri;
                        resolveInfo = packageManager.resolveActivity(intent2, 65536);
                        if (resolveInfo == null) {
                        }
                        jSONObject2.put(optString, z22);
                    }
                    ((pi2) u13Var).p("openableIntents", jSONObject2);
                } catch (JSONException unused2) {
                    pi2Var = (pi2) u13Var;
                    jSONObject = new JSONObject();
                    pi2Var.p("openableIntents", jSONObject);
                }
            }
        });
        u("/close", lg2.a);
        u("/customClose", lg2.b);
        u("/instrument", lg2.i);
        u("/delayPageLoaded", lg2.k);
        u("/delayPageClosed", lg2.l);
        u("/getLocationInfo", lg2.m);
        u("/log", lg2.c);
        u("/mraid", new rg2(o82Var2, this.i0, nj2Var));
        xn2 xn2Var = this.g0;
        if (xn2Var != null) {
            u("/mraidLoaded", xn2Var);
        }
        o82 o82Var3 = o82Var2;
        u("/open", new vg2(o82Var2, this.i0, r04Var, zr3Var, wl4Var));
        u("/precache", new pz2());
        u("/touch", new mg2() { // from class: lf2
            @Override // defpackage.mg2
            public final void b(Object obj, Map map) {
                e23 e23Var = (e23) obj;
                zf2 zf2Var = lg2.a;
                String str = (String) map.get("tx");
                String str2 = (String) map.get("ty");
                String str3 = (String) map.get("td");
                try {
                    int parseInt = Integer.parseInt(str);
                    int parseInt2 = Integer.parseInt(str2);
                    int parseInt3 = Integer.parseInt(str3);
                    rz1 r = e23Var.r();
                    if (r != null) {
                        r.b.g(parseInt, parseInt2, parseInt3);
                    }
                } catch (NumberFormatException unused) {
                    sv2.g("Could not parse touch parameters from gmsg.");
                }
            }
        });
        u("/video", lg2.g);
        u("/videoMeta", lg2.h);
        if (r04Var == null || gn4Var == null) {
            u("/click", new kf2(oi3Var));
            mg2Var = new mg2() { // from class: mf2
                @Override // defpackage.mg2
                public final void b(Object obj, Map map) {
                    u13 u13Var = (u13) obj;
                    zf2 zf2Var = lg2.a;
                    String str = (String) map.get("u");
                    if (str == null) {
                        sv2.g("URL missing from httpTrack GMSG.");
                    } else {
                        new xt2(u13Var.getContext(), ((f23) u13Var).k().P, str).b();
                    }
                }
            };
        } else {
            u("/click", new mg2() { // from class: pi4
                @Override // defpackage.mg2
                public final void b(Object obj, Map map) {
                    oi3 oi3Var2 = oi3.this;
                    gn4 gn4Var2 = gn4Var;
                    r04 r04Var2 = r04Var;
                    y03 y03Var = (y03) obj;
                    lg2.b(map, oi3Var2);
                    String str = (String) map.get("u");
                    if (str == null) {
                        sv2.g("URL missing from click GMSG.");
                    } else {
                        zw4.J(lg2.a(y03Var, str), new ej4(y03Var, gn4Var2, r04Var2), zw2.a);
                    }
                }
            });
            mg2Var = new mg2() { // from class: oi4
                @Override // defpackage.mg2
                public final void b(Object obj, Map map) {
                    gn4 gn4Var2 = gn4.this;
                    r04 r04Var2 = r04Var;
                    p03 p03Var = (p03) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        sv2.g("URL missing from httpTrack GMSG.");
                    } else if (!p03Var.z().i0) {
                        gn4Var2.a(str, null);
                    } else {
                        jv5.A.j.getClass();
                        r04Var2.a(new s04(System.currentTimeMillis(), ((r13) p03Var).C().b, str, 2));
                    }
                }
            };
        }
        u("/httpTrack", mg2Var);
        if (jv5.A.w.j(this.P.getContext())) {
            u("/logScionEvent", new qg2(this.P.getContext()));
        }
        if (og2Var != null) {
            u("/setInterstitialProperties", new ng2(og2Var));
        }
        if (ch2Var != null) {
            if (((Boolean) w82Var.c.a(x92.x7)).booleanValue()) {
                u("/inspectorNetworkExtras", ch2Var);
            }
        }
        if (((Boolean) w82Var.c.a(x92.Q7)).booleanValue() && bh2Var != null) {
            u("/shareSheet", bh2Var);
        }
        if (((Boolean) w82Var.c.a(x92.T7)).booleanValue() && bf2Var != null) {
            u("/inspectorOutOfContextTest", bf2Var);
        }
        if (((Boolean) w82Var.c.a(x92.S8)).booleanValue()) {
            u("/bindPlayStoreOverlay", lg2.p);
            u("/presentPlayStoreOverlay", lg2.q);
            u("/expandPlayStoreOverlay", lg2.r);
            u("/collapsePlayStoreOverlay", lg2.s);
            u("/closePlayStoreOverlay", lg2.t);
            if (((Boolean) w82Var.c.a(x92.A2)).booleanValue()) {
                u("/setPAIDPersonalizationEnabled", lg2.v);
                u("/resetPAID", lg2.u);
            }
        }
        this.T = vj1Var;
        this.U = zp5Var;
        this.X = cf2Var;
        this.Y = ef2Var;
        this.f0 = b16Var;
        this.h0 = o82Var3;
        this.Z = oi3Var;
        this.a0 = z;
        this.k0 = gn4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f2, code lost:
        r14 = r3.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fa, code lost:
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fe, code lost:
        if (android.text.TextUtils.isEmpty(r14) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0100, code lost:
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0102, code lost:
        r6 = r14.split(";")[0].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x010d, code lost:
        r14 = r3.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0115, code lost:
        if (android.text.TextUtils.isEmpty(r14) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0118, code lost:
        r14 = r14.split(";");
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x011d, code lost:
        if (r14.length != 1) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0122, code lost:
        if (r0 >= r14.length) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0130, code lost:
        if (r14[r0].trim().startsWith("charset") == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0132, code lost:
        r1 = r14[r0].trim().split("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013f, code lost:
        if (r1.length <= 1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0141, code lost:
        r4 = r1[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0148, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014b, code lost:
        r7 = r4;
        r14 = r3.getHeaderFields();
        r10 = new java.util.HashMap(r14.size());
        r14 = r14.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0165, code lost:
        if (r14.hasNext() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0167, code lost:
        r0 = r14.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0171, code lost:
        if (r0.getKey() == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0177, code lost:
        if (r0.getValue() == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0183, code lost:
        if (r0.getValue().isEmpty() != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0185, code lost:
        r10.put(r0.getKey(), r0.getValue().get(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01b2, code lost:
        return defpackage.jv5.A.e.c(r6, r7, r3.getResponseCode(), r3.getResponseMessage(), r10, r3.getInputStream());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WebResourceResponse c(String str, Map map) {
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = 0;
            while (true) {
                i++;
                if (i <= 20) {
                    URLConnection openConnection = url.openConnection();
                    openConnection.setConnectTimeout(10000);
                    openConnection.setReadTimeout(10000);
                    for (Map.Entry entry : map.entrySet()) {
                        openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    if (openConnection instanceof HttpURLConnection) {
                        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                        jv5.A.c.s(this.P.getContext(), this.P.k().P, httpURLConnection, 60000);
                        rv2 rv2Var = new rv2();
                        rv2Var.a(httpURLConnection, null);
                        int responseCode = httpURLConnection.getResponseCode();
                        rv2Var.b(httpURLConnection, responseCode);
                        if (responseCode < 300 || responseCode >= 400) {
                            break;
                        }
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (headerField != null) {
                            if (headerField.startsWith("tel:")) {
                                return null;
                            }
                            URL url2 = new URL(url, headerField);
                            String protocol = url2.getProtocol();
                            if (protocol == null) {
                                sv2.g("Protocol is null");
                                return b();
                            } else if (!protocol.equals("http") && !protocol.equals("https")) {
                                sv2.g("Unsupported scheme: " + protocol);
                                return b();
                            } else {
                                sv2.b("Redirecting to " + headerField);
                                httpURLConnection.disconnect();
                                url = url2;
                            }
                        } else {
                            throw new IOException("Missing Location header in redirect");
                        }
                    } else {
                        throw new IOException("Invalid protocol.");
                    }
                } else {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
            }
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    public final void d(Map map, List list, String str) {
        if (vz3.m()) {
            vz3.k("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                vz3.k("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((mg2) it.next()).b(this.P, map);
        }
    }

    public final void e(final View view, final ys2 ys2Var, final int i) {
        if (!ys2Var.g() || i <= 0) {
            return;
        }
        ys2Var.Y(view);
        if (ys2Var.g()) {
            cu5.i.postDelayed(new Runnable() { // from class: z03
                @Override // java.lang.Runnable
                public final void run() {
                    g13.this.e(view, ys2Var, i - 1);
                }
            }, 100L);
        }
    }

    public final WebResourceResponse h(String str, Map map) {
        v42 a;
        try {
            if (((Boolean) pb2.a.d()).booleanValue() && this.k0 != null && "oda".equals(Uri.parse(str).getScheme())) {
                this.k0.a(str, null);
                return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
            }
            String b = rt2.b(this.P.getContext(), str, this.o0);
            if (!b.equals(str)) {
                return c(b, map);
            }
            y42 c = y42.c(Uri.parse(str));
            if (c != null && (a = jv5.A.i.a(c)) != null && a.d()) {
                return new WebResourceResponse("", "", a.c());
            }
            if (!rv2.c() || !((Boolean) ib2.b.d()).booleanValue()) {
                return null;
            }
            return c(str, map);
        } catch (Exception | NoClassDefFoundError e) {
            jv5.A.g.f("AdWebViewClient.interceptRequest", e);
            return b();
        }
    }

    public final void i() {
        if (this.V != null && ((this.l0 && this.n0 <= 0) || this.m0 || this.b0)) {
            if (((Boolean) w82.d.c.a(x92.x1)).booleanValue() && this.P.o() != null) {
                ea2.B((la2) this.P.o().Q, this.P.l(), "awfllc");
            }
            h23 h23Var = this.V;
            boolean z = false;
            if (!this.m0 && !this.b0) {
                z = true;
            }
            h23Var.d(z);
            this.V = null;
        }
        this.P.W();
    }

    public final void l() {
        ys2 ys2Var = this.j0;
        if (ys2Var != null) {
            ys2Var.b();
            this.j0 = null;
        }
        d13 d13Var = this.q0;
        if (d13Var != null) {
            ((View) this.P).removeOnAttachStateChangeListener(d13Var);
        }
        synchronized (this.S) {
            this.R.clear();
            this.T = null;
            this.U = null;
            this.V = null;
            this.W = null;
            this.X = null;
            this.Y = null;
            this.a0 = false;
            this.c0 = false;
            this.d0 = false;
            this.f0 = null;
            this.h0 = null;
            this.g0 = null;
            tn2 tn2Var = this.i0;
            if (tn2Var != null) {
                tn2Var.g(true);
                this.i0 = null;
            }
            this.k0 = null;
        }
    }

    public final void m(Uri uri) {
        ca2 ca2Var;
        String str;
        String path = uri.getPath();
        List list = (List) this.R.get(path);
        if (path != null && list != null) {
            String encodedQuery = uri.getEncodedQuery();
            l92 l92Var = x92.C4;
            w82 w82Var = w82.d;
            if (((Boolean) w82Var.c.a(l92Var)).booleanValue() && this.p0.contains(path) && encodedQuery != null) {
                if (encodedQuery.length() >= ((Integer) w82Var.c.a(x92.E4)).intValue()) {
                    vz3.k("Parsing gmsg query params on BG thread: ".concat(path));
                    cu5 cu5Var = jv5.A.c;
                    cu5Var.getClass();
                    rn5 rn5Var = new rn5(0, uri);
                    ExecutorService executorService = cu5Var.h;
                    rz4 rz4Var = new rz4(rn5Var);
                    executorService.execute(rz4Var);
                    zw4.J(rz4Var, new e13(this, list, path, uri), zw2.e);
                    return;
                }
            }
            cu5 cu5Var2 = jv5.A.c;
            d(cu5.h(uri), list, path);
            return;
        }
        vz3.k("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
        if (((Boolean) w82.d.c.a(x92.I5)).booleanValue()) {
            yu2 yu2Var = jv5.A.g;
            synchronized (yu2Var.a) {
                ca2Var = yu2Var.h;
            }
            if (ca2Var != null) {
                if (path != null && path.length() >= 2) {
                    str = path.substring(1);
                } else {
                    str = "null";
                }
                zw2.a.execute(new qz3(3, str));
            }
        }
    }

    public final void n() {
        ys2 ys2Var = this.j0;
        if (ys2Var != null) {
            WebView m0 = this.P.m0();
            WeakHashMap<View, String> weakHashMap = a41.a;
            if (m0.isAttachedToWindow()) {
                e(m0, ys2Var, 10);
                return;
            }
            d13 d13Var = this.q0;
            if (d13Var != null) {
                ((View) this.P).removeOnAttachStateChangeListener(d13Var);
            }
            d13 d13Var2 = new d13(this, ys2Var);
            this.q0 = d13Var2;
            ((View) this.P).addOnAttachStateChangeListener(d13Var2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        vz3.k("Loading resource: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            m(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.S) {
            if (this.P.c0()) {
                vz3.k("Blank page loaded, 1...");
                this.P.F0();
                return;
            }
            this.l0 = true;
            i23 i23Var = this.W;
            if (i23Var != null) {
                i23Var.mo3a();
                this.W = null;
            }
            i();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.b0 = true;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.P.K0(renderProcessGoneDetail.rendererPriorityAtExit(), renderProcessGoneDetail.didCrash());
    }

    public final void p(tw2 tw2Var, boolean z) {
        boolean V = this.P.V();
        boolean f = f(V, this.P);
        t(new AdOverlayInfoParcel(tw2Var, f ? null : this.T, V ? null : this.U, this.f0, this.P.k(), this.P, f || !z ? null : this.Z));
    }

    @Override // defpackage.oi3
    public final void s() {
        oi3 oi3Var = this.Z;
        if (oi3Var != null) {
            oi3Var.s();
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return h(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        vz3.k("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            m(parse);
        } else {
            if (this.a0 && webView == this.P.m0()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    vj1 vj1Var = this.T;
                    if (vj1Var != null) {
                        vj1Var.J();
                        ys2 ys2Var = this.j0;
                        if (ys2Var != null) {
                            ys2Var.W(str);
                        }
                        this.T = null;
                    }
                    oi3 oi3Var = this.Z;
                    if (oi3Var != null) {
                        oi3Var.w();
                        this.Z = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (this.P.m0().willNotDraw()) {
                sv2.g("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    rz1 r = this.P.r();
                    if (r != null && r.b(parse)) {
                        Context context = this.P.getContext();
                        y03 y03Var = this.P;
                        parse = r.a(parse, context, (View) y03Var, y03Var.g());
                    }
                } catch (sz1 unused) {
                    sv2.g("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                o82 o82Var = this.h0;
                if (o82Var == null || o82Var.b()) {
                    p(new tw2("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null), true);
                } else {
                    this.h0.a(str);
                }
            }
        }
        return true;
    }

    public final void t(AdOverlayInfoParcel adOverlayInfoParcel) {
        tw2 tw2Var;
        tn2 tn2Var = this.i0;
        boolean z = false;
        if (tn2Var != null) {
            synchronized (tn2Var.Z) {
                if (tn2Var.g0 != null) {
                    z = true;
                }
            }
        }
        ea2 ea2Var = jv5.A.b;
        ea2.z(this.P.getContext(), adOverlayInfoParcel, true ^ z);
        ys2 ys2Var = this.j0;
        if (ys2Var != null) {
            String str = adOverlayInfoParcel.a0;
            if (str == null && (tw2Var = adOverlayInfoParcel.P) != null) {
                str = tw2Var.Q;
            }
            ys2Var.W(str);
        }
    }

    public final void u(String str, mg2 mg2Var) {
        synchronized (this.S) {
            List list = (List) this.R.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.R.put(str, list);
            }
            list.add(mg2Var);
        }
    }

    @Override // defpackage.oi3
    public final void w() {
        oi3 oi3Var = this.Z;
        if (oi3Var != null) {
            oi3Var.w();
        }
    }
}