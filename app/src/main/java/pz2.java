package defpackage;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pz2  reason: default package */
public final class pz2 implements mg2 {
    public static final Integer a(String str, Map map) {
        if (map.containsKey(str)) {
            try {
                return Integer.valueOf(Integer.parseInt((String) map.get(str)));
            } catch (NumberFormatException unused) {
                sv2.g("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019a  */
    @Override // defpackage.mg2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Object obj, Map map) {
        gz2 gz2Var;
        String str;
        oz2 oz2Var;
        Integer a;
        Integer a2;
        Integer a3;
        Integer a4;
        gz2 gz2Var2;
        gz2 gz2Var3;
        gy2 gy2Var = (gy2) obj;
        if (sv2.j(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            sv2.b("Precache GMSG: ".concat(jSONObject.toString()));
        }
        hz2 hz2Var = jv5.A.y;
        if (map.containsKey("abort")) {
            if (!hz2Var.g(gy2Var)) {
                str = "Precache abort but no precache task running.";
            } else {
                return;
            }
        } else {
            String str2 = (String) map.get("src");
            Integer a5 = a("periodicReportIntervalMs", map);
            Integer a6 = a("exoPlayerRenderingIntervalMs", map);
            Integer a7 = a("exoPlayerIdleIntervalMs", map);
            fy2 fy2Var = new fy2((String) map.get("flags"));
            boolean z = fy2Var.k;
            if (str2 != null) {
                String[] strArr = {str2};
                String str3 = (String) map.get("demuxed");
                if (str3 != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(str3);
                        String[] strArr2 = new String[jSONArray.length()];
                        for (int i = 0; i < jSONArray.length(); i++) {
                            strArr2[i] = jSONArray.getString(i);
                        }
                        strArr = strArr2;
                    } catch (JSONException unused) {
                        sv2.g("Malformed demuxed URL list for precache: ".concat(str3));
                        strArr = null;
                    }
                }
                if (strArr == null) {
                    strArr = new String[]{str2};
                }
                if (z) {
                    Iterator it = hz2Var.iterator();
                    while (it.hasNext()) {
                        gz2Var2 = (gz2) it.next();
                        if (gz2Var2.b == gy2Var && str2.equals(gz2Var2.d)) {
                            gz2Var3 = gz2Var2;
                            break;
                        }
                    }
                    gz2Var3 = null;
                } else {
                    Iterator it2 = hz2Var.iterator();
                    while (it2.hasNext()) {
                        gz2Var2 = (gz2) it2.next();
                        if (gz2Var2.b == gy2Var) {
                            gz2Var3 = gz2Var2;
                            break;
                        }
                    }
                    gz2Var3 = null;
                }
                if (gz2Var3 != null) {
                    str = "Precache task is already running.";
                } else if (gy2Var.j() == null) {
                    str = "Precache requires a dependency provider.";
                } else {
                    Integer a8 = a("player", map);
                    if (a8 == null) {
                        a8 = 0;
                    }
                    if (a5 != null) {
                        gy2Var.H0(a5.intValue());
                    }
                    if (a6 != null) {
                        a6.intValue();
                        gy2Var.x0();
                    }
                    if (a7 != null) {
                        a7.intValue();
                        gy2Var.P();
                    }
                    int intValue = a8.intValue();
                    Object obj2 = gy2Var.j().R;
                    if (intValue > 0) {
                        int i2 = yx2.Q.get();
                        if (i2 < fy2Var.g) {
                            oz2Var = new wz2(gy2Var, fy2Var);
                        } else if (i2 < fy2Var.b) {
                            oz2Var = new tz2(gy2Var, fy2Var);
                        } else {
                            oz2Var = new rz2(gy2Var);
                        }
                    } else {
                        oz2Var = new qz2(gy2Var);
                    }
                    new gz2(gy2Var, oz2Var, str2, strArr).b();
                    a = a("minBufferMs", map);
                    if (a != null) {
                        oz2Var.s(a.intValue());
                    }
                    a2 = a("maxBufferMs", map);
                    if (a2 != null) {
                        oz2Var.q(a2.intValue());
                    }
                    a3 = a("bufferForPlaybackMs", map);
                    if (a3 != null) {
                        oz2Var.o(a3.intValue());
                    }
                    a4 = a("bufferForPlaybackAfterRebufferMs", map);
                    if (a4 == null) {
                        oz2Var.p(a4.intValue());
                        return;
                    }
                    return;
                }
            } else {
                Iterator it3 = hz2Var.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        gz2 gz2Var4 = (gz2) it3.next();
                        if (gz2Var4.b == gy2Var) {
                            gz2Var = gz2Var4;
                            break;
                        }
                    } else {
                        gz2Var = null;
                        break;
                    }
                }
                if (gz2Var != null) {
                    oz2Var = gz2Var.c;
                    a = a("minBufferMs", map);
                    if (a != null) {
                    }
                    a2 = a("maxBufferMs", map);
                    if (a2 != null) {
                    }
                    a3 = a("bufferForPlaybackMs", map);
                    if (a3 != null) {
                    }
                    a4 = a("bufferForPlaybackAfterRebufferMs", map);
                    if (a4 == null) {
                    }
                } else {
                    str = "Precache must specify a source.";
                }
            }
        }
        sv2.g(str);
    }
}