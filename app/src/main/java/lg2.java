package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: lg2  reason: default package */
public final class lg2 {
    public static final zf2 a = new zf2();
    public static final ag2 b = new ag2();
    public static final bg2 c = new bg2();
    public static final cg2 d = new cg2();
    public static final dg2 e = new dg2();
    public static final eg2 f = new eg2();
    public static final bz2 g = new bz2();
    public static final cz2 h = new cz2();
    public static final ff2 i = new ff2();
    public static final yg2 j = new yg2();
    public static final jg2 k = new jg2();
    public static final kg2 l = new kg2();
    public static final pf2 m = new pf2();
    public static final qf2 n = new qf2();
    public static final rf2 o = new rf2();
    public static final sf2 p = new sf2();
    public static final tf2 q = new tf2();
    public static final uf2 r = new uf2();
    public static final vf2 s = new vf2();
    public static final wf2 t = new wf2();
    public static final xf2 u = new xf2();
    public static final yf2 v = new yf2();

    public static dz4 a(y03 y03Var, String str) {
        String uri;
        String f2;
        Uri parse = Uri.parse(str);
        try {
            rz1 r2 = y03Var.r();
            if (r2 != null && r2.b(parse)) {
                parse = r2.a(parse, y03Var.getContext(), y03Var.x(), y03Var.g());
            }
        } catch (sz1 unused) {
            sv2.g("Unable to append parameter to URL: ".concat(str));
        }
        Context context = y03Var.getContext();
        jv5 jv5Var = jv5.A;
        if (!jv5Var.w.j(context) || (f2 = jv5Var.w.f(context)) == null) {
            uri = parse.toString();
        } else {
            p92 p92Var = x92.Y;
            w82 w82Var = w82.d;
            String str2 = (String) w82Var.c.a(p92Var);
            String uri2 = parse.toString();
            if (((Boolean) w82Var.c.a(x92.X)).booleanValue() && uri2.contains(str2)) {
                jv5Var.w.b(context, "_ac", f2, null);
                uri = rt2.c(context, uri2).replace(str2, f2);
            } else if (!TextUtils.isEmpty(parse.getQueryParameter("fbs_aeid"))) {
                uri = uri2;
            } else {
                String uri3 = rt2.a(rt2.c(context, uri2), "fbs_aeid", f2).toString();
                jv5Var.w.b(context, "_ac", f2, null);
                uri = uri3;
            }
        }
        long longValue = ((Long) lb2.e.d()).longValue();
        if (longValue > 0 && longValue <= 231004600) {
            sy4 r3 = sy4.r(y03Var.t0());
            jf2 jf2Var = new at4() { // from class: jf2
                @Override // defpackage.at4
                public final Object apply(Object obj) {
                    Throwable th = (Throwable) obj;
                    zf2 zf2Var = lg2.a;
                    if (((Boolean) lb2.i.d()).booleanValue()) {
                        jv5.A.g.f("prepareClickUrl.attestation1", th);
                        return "failure_click_attok";
                    }
                    return "failure_click_attok";
                }
            };
            yw2 yw2Var = zw2.f;
            return zw4.z(zw4.E(zw4.z(r3, Throwable.class, jf2Var, yw2Var), new og4(1, uri), yw2Var), Throwable.class, new pg4(1, uri), yw2Var);
        }
        return zw4.C(uri);
    }

    public static void b(Map map, oi3 oi3Var) {
        if (((Boolean) w82.d.c.a(x92.s8)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && oi3Var != null) {
            oi3Var.w();
        }
    }
}