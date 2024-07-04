package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bz2  reason: default package */
public final class bz2 implements mg2 {
    public boolean P;

    public static int a(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                mv2 mv2Var = n62.f.a;
                i = mv2.k(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                sv2.g("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (vz3.m()) {
            StringBuilder b = sd1.b("Parse pixels for ", str, ", got string ", str2, ", int ");
            b.append(i);
            b.append(".");
            vz3.k(b.toString());
        }
        return i;
    }

    public static void c(vx2 vx2Var, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                int parseInt = Integer.parseInt(str);
                sx2 sx2Var = vx2Var.V;
                if (sx2Var != null) {
                    sx2Var.b(parseInt);
                }
            } catch (NumberFormatException unused) {
                sv2.g(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            int parseInt2 = Integer.parseInt(str2);
            sx2 sx2Var2 = vx2Var.V;
            if (sx2Var2 != null) {
                sx2Var2.D(parseInt2);
            }
        }
        if (str3 != null) {
            int parseInt3 = Integer.parseInt(str3);
            sx2 sx2Var3 = vx2Var.V;
            if (sx2Var3 != null) {
                sx2Var3.B(parseInt3);
            }
        }
        if (str4 != null) {
            int parseInt4 = Integer.parseInt(str4);
            sx2 sx2Var4 = vx2Var.V;
            if (sx2Var4 != null) {
                sx2Var4.C(parseInt4);
            }
        }
        if (str5 != null) {
            int parseInt5 = Integer.parseInt(str5);
            sx2 sx2Var5 = vx2Var.V;
            if (sx2Var5 != null) {
                sx2Var5.d(parseInt5);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:235|(1:(11:238|239|(1:(6:242|243|244|245|246|(2:258|(2:260|261)(1:262))(4:250|(1:252)|253|(2:255|256)(1:257)))(1:265))(3:267|(1:269)|270)|266|243|244|245|246|(1:248)|258|(0)(0))(1:271))(3:273|(1:275)|276)|272|239|(0)(0)|266|243|244|245|246|(0)|258|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x04cb, code lost:
        r14 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:293:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.mg2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Object obj, Map map) {
        Integer num;
        Integer num2;
        int f;
        int min;
        int h;
        int min2;
        vx2 vx2Var;
        Context context;
        boolean z;
        int i;
        String[] split;
        vx2 vx2Var2;
        sx2 sx2Var;
        gy2 gy2Var = (gy2) obj;
        String str = (String) map.get("action");
        if (str == null) {
            sv2.g("Action missing from video GMSG.");
            return;
        }
        Integer num3 = null;
        if (map.containsKey("playerId")) {
            num = Integer.valueOf(Integer.parseInt((String) map.get("playerId")));
        } else {
            num = null;
        }
        if (gy2Var.t() != null && (vx2Var2 = gy2Var.t().d) != null && (sx2Var = vx2Var2.V) != null) {
            num2 = sx2Var.A();
        } else {
            num2 = null;
        }
        if (num != null && num2 != null && !num.equals(num2) && !str.equals("load")) {
            sv2.f(String.format(Locale.US, "Event intended for player %s, but sent to player %d - event ignored", num, num2));
            return;
        }
        if (sv2.j(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            sv2.b("Video GMSG: " + str + " " + jSONObject.toString());
        }
        if ("background".equals(str)) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                sv2.g("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                gy2Var.setBackgroundColor(Color.parseColor(str2));
            } catch (IllegalArgumentException unused) {
                sv2.g("Invalid color parameter in background video GMSG.");
            }
        } else if ("playerBackground".equals(str)) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                sv2.g("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                gy2Var.H(Color.parseColor(str3));
            } catch (IllegalArgumentException unused2) {
                sv2.g("Invalid color parameter in playerBackground video GMSG.");
            }
        } else if ("decoderProps".equals(str)) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                sv2.g("No MIME types specified for decoder properties inspection.");
                HashMap hashMap = new HashMap();
                hashMap.put("event", "decoderProps");
                hashMap.put("error", "missingMimeTypes");
                gy2Var.a("onVideoEvent", hashMap);
                return;
            }
            HashMap hashMap2 = new HashMap();
            for (String str5 : str4.split(",")) {
                hashMap2.put(str5, x23.a(str5.trim()));
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put("event", "decoderProps");
            hashMap3.put("mimeTypes", hashMap2);
            gy2Var.a("onVideoEvent", hashMap3);
        } else {
            wx2 t = gy2Var.t();
            if (t == null) {
                sv2.g("Could not get underlay container for a video GMSG.");
                return;
            }
            boolean equals = "new".equals(str);
            boolean equals2 = "position".equals(str);
            if (!equals && !equals2) {
                q13 q = gy2Var.q();
                if (q != null) {
                    if ("timeupdate".equals(str)) {
                        String str6 = (String) map.get("currentTime");
                        if (str6 == null) {
                            sv2.g("currentTime parameter missing from timeupdate video GMSG.");
                            return;
                        }
                        try {
                            float parseFloat = Float.parseFloat(str6);
                            synchronized (q.Q) {
                                q.Y = parseFloat;
                            }
                            return;
                        } catch (NumberFormatException unused3) {
                            sv2.g("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                            return;
                        }
                    } else if ("skip".equals(str)) {
                        synchronized (q.Q) {
                            z = q.W;
                            i = q.T;
                            q.T = 3;
                        }
                        zw2.e.execute(new p13(q, i, 3, z, z));
                        return;
                    }
                }
                vx2 vx2Var3 = t.d;
                if (vx2Var3 == null) {
                    HashMap hashMap4 = new HashMap();
                    hashMap4.put("event", "no_video_view");
                    gy2Var.a("onVideoEvent", hashMap4);
                    return;
                } else if ("click".equals(str)) {
                    int a = a(gy2Var.getContext(), map, "x", 0);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, a, a(context, map, "y", 0), 0);
                    sx2 sx2Var2 = vx2Var3.V;
                    if (sx2Var2 != null) {
                        sx2Var2.dispatchTouchEvent(obtain);
                    }
                    obtain.recycle();
                    return;
                } else if ("currentTime".equals(str)) {
                    String str7 = (String) map.get("time");
                    if (str7 == null) {
                        sv2.g("Time parameter missing from currentTime video GMSG.");
                        return;
                    }
                    try {
                        int parseFloat2 = (int) (Float.parseFloat(str7) * 1000.0f);
                        sx2 sx2Var3 = vx2Var3.V;
                        if (sx2Var3 != null) {
                            sx2Var3.v(parseFloat2);
                            return;
                        }
                        return;
                    } catch (NumberFormatException unused4) {
                        sv2.g("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                        return;
                    }
                } else if ("hide".equals(str)) {
                    vx2Var3.setVisibility(4);
                    return;
                } else if ("load".equals(str)) {
                    if (vx2Var3.V != null) {
                        if (!TextUtils.isEmpty(vx2Var3.f0)) {
                            vx2Var3.V.g(vx2Var3.f0, vx2Var3.g0, num);
                            return;
                        } else {
                            vx2Var3.c("no_src", new String[0]);
                            return;
                        }
                    }
                    return;
                } else if ("loadControl".equals(str)) {
                    c(vx2Var3, map);
                    return;
                } else if ("muted".equals(str)) {
                    if (Boolean.parseBoolean((String) map.get("muted"))) {
                        sx2 sx2Var4 = vx2Var3.V;
                        if (sx2Var4 != null) {
                            oy2 oy2Var = sx2Var4.Q;
                            oy2Var.e = true;
                            oy2Var.a();
                            sx2Var4.k();
                            return;
                        }
                        return;
                    }
                    sx2 sx2Var5 = vx2Var3.V;
                    if (sx2Var5 != null) {
                        oy2 oy2Var2 = sx2Var5.Q;
                        oy2Var2.e = false;
                        oy2Var2.a();
                        sx2Var5.k();
                        return;
                    }
                    return;
                } else if ("pause".equals(str)) {
                    sx2 sx2Var6 = vx2Var3.V;
                    if (sx2Var6 != null) {
                        sx2Var6.t();
                        return;
                    }
                    return;
                } else if ("play".equals(str)) {
                    sx2 sx2Var7 = vx2Var3.V;
                    if (sx2Var7 != null) {
                        sx2Var7.u();
                        return;
                    }
                    return;
                } else if ("show".equals(str)) {
                    vx2Var3.setVisibility(0);
                    return;
                } else if ("src".equals(str)) {
                    String str8 = (String) map.get("src");
                    if (map.containsKey("periodicReportIntervalMs")) {
                        try {
                            num3 = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                        } catch (NumberFormatException unused5) {
                            sv2.g("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                        }
                    }
                    String[] strArr = {str8};
                    String str9 = (String) map.get("demuxed");
                    if (str9 != null) {
                        try {
                            JSONArray jSONArray = new JSONArray(str9);
                            String[] strArr2 = new String[jSONArray.length()];
                            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                strArr2[i2] = jSONArray.getString(i2);
                            }
                            strArr = strArr2;
                        } catch (JSONException unused6) {
                            sv2.g("Malformed demuxed URL list for playback: ".concat(str9));
                            strArr = new String[]{str8};
                        }
                    }
                    if (num3 != null) {
                        gy2Var.H0(num3.intValue());
                    }
                    vx2Var3.f0 = str8;
                    vx2Var3.g0 = strArr;
                    return;
                } else if ("touchMove".equals(str)) {
                    Context context2 = gy2Var.getContext();
                    int a2 = a(context2, map, "dx", 0);
                    int a3 = a(context2, map, "dy", 0);
                    float f2 = a2;
                    float f3 = a3;
                    sx2 sx2Var8 = vx2Var3.V;
                    if (sx2Var8 != null) {
                        sx2Var8.z(f2, f3);
                    }
                    if (!this.P) {
                        gy2Var.u();
                        this.P = true;
                        return;
                    }
                    return;
                } else if ("volume".equals(str)) {
                    String str10 = (String) map.get("volume");
                    if (str10 == null) {
                        sv2.g("Level parameter missing from volume video GMSG.");
                        return;
                    }
                    try {
                        float parseFloat3 = Float.parseFloat(str10);
                        sx2 sx2Var9 = vx2Var3.V;
                        if (sx2Var9 != null) {
                            oy2 oy2Var3 = sx2Var9.Q;
                            oy2Var3.f = parseFloat3;
                            oy2Var3.a();
                            sx2Var9.k();
                            return;
                        }
                        return;
                    } catch (NumberFormatException unused7) {
                        sv2.g("Could not parse volume parameter from volume video GMSG: ".concat(str10));
                        return;
                    }
                } else if ("watermark".equals(str)) {
                    vx2Var3.i();
                    return;
                } else {
                    sv2.g("Unknown video action: ".concat(str));
                    return;
                }
            }
            Context context3 = gy2Var.getContext();
            int a4 = a(context3, map, "x", 0);
            int a5 = a(context3, map, "y", 0);
            int a6 = a(context3, map, "w", -1);
            l92 l92Var = x92.g3;
            w82 w82Var = w82.d;
            if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                if (a6 == -1) {
                    min = gy2Var.f();
                    int a7 = a(context3, map, "h", -1);
                    if (!((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                        if (a7 == -1) {
                            min2 = gy2Var.h();
                            int i3 = Integer.parseInt((String) map.get("player"));
                            boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
                            if (!equals && t.d == null) {
                                fy2 fy2Var = new fy2((String) map.get("flags"));
                                if (t.d == null) {
                                    ea2.B((la2) t.b.o().Q, t.b.l(), "vpr2");
                                    Context context4 = t.a;
                                    y03 y03Var = t.b;
                                    vx2 vx2Var4 = new vx2(context4, y03Var, i3, parseBoolean, (la2) y03Var.o().Q, fy2Var);
                                    t.d = vx2Var4;
                                    t.c.addView(vx2Var4, 0, new ViewGroup.LayoutParams(-1, -1));
                                    t.d.a(a4, a5, min, min2);
                                    t.b.K();
                                }
                                vx2 vx2Var5 = t.d;
                                if (vx2Var5 != null) {
                                    c(vx2Var5, map);
                                    return;
                                }
                                return;
                            }
                            uf0.b("The underlay may only be modified from the UI thread.");
                            vx2Var = t.d;
                            if (vx2Var != null) {
                                vx2Var.a(a4, a5, min, min2);
                                return;
                            }
                            return;
                        }
                        h = gy2Var.h();
                    } else {
                        if (vz3.m()) {
                            vz3.k("Calculate height with original height " + a7 + ", videoHost.getVideoBoundingHeight() " + gy2Var.h() + ", y " + a5 + ".");
                        }
                        h = gy2Var.h() - a5;
                    }
                    min2 = Math.min(a7, h);
                    int i32 = Integer.parseInt((String) map.get("player"));
                    boolean parseBoolean2 = Boolean.parseBoolean((String) map.get("spherical"));
                    if (!equals) {
                    }
                    uf0.b("The underlay may only be modified from the UI thread.");
                    vx2Var = t.d;
                    if (vx2Var != null) {
                    }
                } else {
                    f = gy2Var.f();
                }
            } else {
                if (vz3.m()) {
                    vz3.k("Calculate width with original width " + a6 + ", videoHost.getVideoBoundingWidth() " + gy2Var.f() + ", x " + a4 + ".");
                }
                f = gy2Var.f() - a4;
            }
            min = Math.min(a6, f);
            int a72 = a(context3, map, "h", -1);
            if (!((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            }
            min2 = Math.min(a72, h);
            int i322 = Integer.parseInt((String) map.get("player"));
            boolean parseBoolean22 = Boolean.parseBoolean((String) map.get("spherical"));
            if (!equals) {
            }
            uf0.b("The underlay may only be modified from the UI thread.");
            vx2Var = t.d;
            if (vx2Var != null) {
            }
        }
    }
}