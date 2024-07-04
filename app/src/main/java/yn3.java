package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: yn3  reason: default package */
public final class yn3 {
    public final Context a;
    public final mn3 b;
    public final rz1 c;
    public final xv2 d;
    public final uj1 e;
    public final j52 f;
    public final Executor g;
    public final nc2 h;
    public final po3 i;
    public final qq3 j;
    public final ScheduledExecutorService k;
    public final tp3 l;
    public final zr3 m;
    public final wl4 n;
    public final gn4 o;
    public final r04 p;

    public yn3(Context context, mn3 mn3Var, rz1 rz1Var, xv2 xv2Var, uj1 uj1Var, j52 j52Var, yw2 yw2Var, li4 li4Var, po3 po3Var, qq3 qq3Var, ScheduledExecutorService scheduledExecutorService, zr3 zr3Var, wl4 wl4Var, gn4 gn4Var, r04 r04Var, tp3 tp3Var) {
        this.a = context;
        this.b = mn3Var;
        this.c = rz1Var;
        this.d = xv2Var;
        this.e = uj1Var;
        this.f = j52Var;
        this.g = yw2Var;
        this.h = li4Var.i;
        this.i = po3Var;
        this.j = qq3Var;
        this.k = scheduledExecutorService;
        this.m = zr3Var;
        this.n = wl4Var;
        this.o = gn4Var;
        this.p = r04Var;
        this.l = tp3Var;
    }

    public static Integer d(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final n84 e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new n84(optString, optString2);
    }

    public final dz4 a(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return zw4.C(null);
        }
        final String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            return zw4.C(null);
        }
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        final boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        final int optInt = jSONObject.optInt("width", -1);
        final int optInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return zw4.C(new lc2(null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        final mn3 mn3Var = this.b;
        mn3Var.a.getClass();
        bx2 bx2Var = new bx2();
        dl2.a.a(new fk2(optString, bx2Var));
        by4 E = zw4.E(zw4.E(bx2Var, new at4() { // from class: ln3
            @Override // defpackage.at4
            public final Object apply(Object obj) {
                mn3 mn3Var2 = mn3.this;
                double d = optDouble;
                boolean z2 = optBoolean;
                mn3Var2.getClass();
                byte[] bArr = ((yu1) obj).b;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inDensity = (int) (d * 160.0d);
                if (!z2) {
                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                }
                l92 l92Var = x92.c5;
                w82 w82Var = w82.d;
                if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                    options.inJustDecodeBounds = true;
                    mn3Var2.a(bArr, options);
                    options.inJustDecodeBounds = false;
                    int i = options.outWidth * options.outHeight;
                    if (i > 0) {
                        options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i - 1) / ((Integer) w82Var.c.a(x92.d5)).intValue())) / 2);
                    }
                }
                return mn3Var2.a(bArr, options);
            }
        }, mn3Var.c), new at4() { // from class: wn3
            @Override // defpackage.at4
            public final Object apply(Object obj) {
                String str = optString;
                return new lc2(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), optDouble, optInt, optInt2);
            }
        }, this.g);
        if (jSONObject.optBoolean("require")) {
            return zw4.F(E, new cb3(1, E), zw2.f);
        }
        return zw4.B(E, Exception.class, new vn3(), zw2.f);
    }

    public final dz4 b(JSONArray jSONArray, boolean z, boolean z2) {
        int i;
        if (jSONArray != null && jSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            if (z2) {
                i = jSONArray.length();
            } else {
                i = 1;
            }
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(a(jSONArray.optJSONObject(i2), z));
            }
            return zw4.E(new ly4(nv4.t(arrayList)), new at4() { // from class: un3
                @Override // defpackage.at4
                public final Object apply(Object obj) {
                    ArrayList arrayList2 = new ArrayList();
                    for (lc2 lc2Var : (List) obj) {
                        if (lc2Var != null) {
                            arrayList2.add(lc2Var);
                        }
                    }
                    return arrayList2;
                }
            }, this.g);
        }
        return zw4.C(Collections.emptyList());
    }

    public final ay4 c(JSONObject jSONObject, final yh4 yh4Var, final ci4 ci4Var) {
        final zr5 zr5Var;
        final String optString = jSONObject.optString("base_url");
        final String optString2 = jSONObject.optString("html");
        int i = 0;
        int optInt = jSONObject.optInt("width", 0);
        int optInt2 = jSONObject.optInt("height", 0);
        if (optInt == 0) {
            if (optInt2 == 0) {
                zr5Var = zr5.d();
                final po3 po3Var = this.i;
                po3Var.getClass();
                final ay4 F = zw4.F(zw4.C(null), new ky4() { // from class: jo3
                    @Override // defpackage.ky4
                    public final dz4 e(Object obj) {
                        po3 po3Var2 = po3.this;
                        zr5 zr5Var2 = zr5Var;
                        yh4 yh4Var2 = yh4Var;
                        ci4 ci4Var2 = ci4Var;
                        String str = optString;
                        String str2 = optString2;
                        l13 a = po3Var2.c.a(zr5Var2, yh4Var2, ci4Var2);
                        ax2 ax2Var = new ax2(a);
                        if (po3Var2.a.b != null) {
                            po3Var2.a(a);
                            a.A0(new k23(5, 0, 0));
                        } else {
                            np3 np3Var = po3Var2.d.a;
                            a.R().a(np3Var, np3Var, np3Var, np3Var, np3Var, false, null, new o82(po3Var2.e, null), null, null, po3Var2.i, po3Var2.h, po3Var2.f, po3Var2.g, null, np3Var, null, null);
                            po3.b(a);
                        }
                        a.R().V = new fn2(po3Var2, a, ax2Var);
                        a.X(str, str2);
                        return ax2Var;
                    }
                }, po3Var.b);
                return zw4.F(F, new ky4() { // from class: xn3
                    @Override // defpackage.ky4
                    public final dz4 e(Object obj) {
                        dz4 dz4Var = F;
                        y03 y03Var = (y03) obj;
                        if (y03Var == null || y03Var.q() == null) {
                            throw new l44(1, "Retrieve video view in html5 ad response failed.");
                        }
                        return dz4Var;
                    }
                }, zw2.f);
            }
        } else {
            i = optInt;
        }
        zr5Var = new zr5(this.a, new h3(i, optInt2));
        final po3 po3Var2 = this.i;
        po3Var2.getClass();
        final ay4 F2 = zw4.F(zw4.C(null), new ky4() { // from class: jo3
            @Override // defpackage.ky4
            public final dz4 e(Object obj) {
                po3 po3Var22 = po3.this;
                zr5 zr5Var2 = zr5Var;
                yh4 yh4Var2 = yh4Var;
                ci4 ci4Var2 = ci4Var;
                String str = optString;
                String str2 = optString2;
                l13 a = po3Var22.c.a(zr5Var2, yh4Var2, ci4Var2);
                ax2 ax2Var = new ax2(a);
                if (po3Var22.a.b != null) {
                    po3Var22.a(a);
                    a.A0(new k23(5, 0, 0));
                } else {
                    np3 np3Var = po3Var22.d.a;
                    a.R().a(np3Var, np3Var, np3Var, np3Var, np3Var, false, null, new o82(po3Var22.e, null), null, null, po3Var22.i, po3Var22.h, po3Var22.f, po3Var22.g, null, np3Var, null, null);
                    po3.b(a);
                }
                a.R().V = new fn2(po3Var22, a, ax2Var);
                a.X(str, str2);
                return ax2Var;
            }
        }, po3Var2.b);
        return zw4.F(F2, new ky4() { // from class: xn3
            @Override // defpackage.ky4
            public final dz4 e(Object obj) {
                dz4 dz4Var = F2;
                y03 y03Var = (y03) obj;
                if (y03Var == null || y03Var.q() == null) {
                    throw new l44(1, "Retrieve video view in html5 ad response failed.");
                }
                return dz4Var;
            }
        }, zw2.f);
    }
}