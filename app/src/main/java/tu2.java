package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: tu2  reason: default package */
public final /* synthetic */ class tu2 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tu2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        JSONObject jSONObject;
        switch (this.a) {
            case 0:
                Context a = br2.a(((yu2) this.b).e);
                ArrayList arrayList = new ArrayList();
                try {
                    PackageInfo b = c81.a(a).b(a.getApplicationInfo().packageName, 4096);
                    if (b.requestedPermissions != null && b.requestedPermissionsFlags != null) {
                        int i = 0;
                        while (true) {
                            String[] strArr = b.requestedPermissions;
                            if (i < strArr.length) {
                                if ((b.requestedPermissionsFlags[i] & 2) != 0) {
                                    arrayList.add(strArr[i]);
                                }
                                i++;
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                return arrayList;
            case 1:
                t94 t94Var = (t94) this.b;
                ar3 ar3Var = t94Var.b;
                String str = t94Var.d.f;
                String str2 = t94Var.c;
                ar3Var.getClass();
                l92 l92Var = x92.n3;
                w82 w82Var = w82.d;
                JSONObject jSONObject2 = null;
                if (((Boolean) w82Var.c.a(l92Var)).booleanValue() && str != null && str2 != null) {
                    if (!ar3Var.d) {
                        ar3Var.a();
                    }
                    Map map = (Map) ar3Var.a.get(str2);
                    if (map != null) {
                        jSONObject = (JSONObject) map.get(str);
                        if (jSONObject == null) {
                            String f = nu2.f(ar3Var.e, str, str2);
                            if (f != null) {
                                jSONObject = (JSONObject) map.get(f);
                            }
                        }
                        ar3 ar3Var2 = t94Var.b;
                        ar3Var2.getClass();
                        if (((Boolean) w82Var.c.a(x92.o3)).booleanValue()) {
                            jSONObject2 = ar3Var2.b;
                        }
                        return new u94(jSONObject, jSONObject2);
                    }
                }
                jSONObject = null;
                ar3 ar3Var22 = t94Var.b;
                ar3Var22.getClass();
                if (((Boolean) w82Var.c.a(x92.o3)).booleanValue()) {
                }
                return new u94(jSONObject, jSONObject2);
            default:
                final ya4 ya4Var = (ya4) this.b;
                final ArrayList arrayList2 = ya4Var.b.g;
                if (arrayList2 == null) {
                    return new mc4() { // from class: ta4
                        @Override // defpackage.mc4
                        public final void b(Object obj) {
                            Bundle bundle = (Bundle) obj;
                        }
                    };
                }
                if (arrayList2.isEmpty()) {
                    return new mc4() { // from class: wa4
                        @Override // defpackage.mc4
                        public final void b(Object obj) {
                            ((Bundle) obj).putInt("native_version", 0);
                        }
                    };
                }
                return new mc4() { // from class: xa4
                    /* JADX WARN: Code restructure failed: missing block: B:57:0x0101, code lost:
                        if (r1 == 3) goto L54;
                     */
                    @Override // defpackage.mc4
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void b(Object obj) {
                        String str3;
                        String str4;
                        JSONArray optJSONArray;
                        ya4 ya4Var2 = ya4.this;
                        ArrayList<String> arrayList3 = arrayList2;
                        Bundle bundle = (Bundle) obj;
                        ya4Var2.getClass();
                        bundle.putInt("native_version", 3);
                        bundle.putStringArrayList("native_templates", arrayList3);
                        bundle.putStringArrayList("native_custom_templates", ya4Var2.b.h);
                        String str5 = "landscape";
                        if (ya4Var2.b.i.P > 3) {
                            bundle.putBoolean("enable_native_media_orientation", true);
                            int i2 = ya4Var2.b.i.W;
                            String str6 = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "unknown" : "square" : "portrait" : "landscape" : "any";
                            if (!"unknown".equals(str6)) {
                                bundle.putString("native_media_orientation", str6);
                            }
                        }
                        int i3 = ya4Var2.b.i.R;
                        if (i3 == 0) {
                            str5 = "any";
                        } else if (i3 == 1) {
                            str5 = "portrait";
                        } else if (i3 != 2) {
                            str5 = "unknown";
                        }
                        if (!"unknown".equals(str5)) {
                            bundle.putString("native_image_orientation", str5);
                        }
                        bundle.putBoolean("native_multiple_images", ya4Var2.b.i.S);
                        bundle.putBoolean("use_custom_mute", ya4Var2.b.i.V);
                        nc2 nc2Var = ya4Var2.b.i;
                        if (nc2Var.X != 0) {
                            bundle.putBoolean("sccg_tap", nc2Var.Y);
                            bundle.putInt("sccg_dir", ya4Var2.b.i.X);
                        }
                        PackageInfo packageInfo = ya4Var2.c;
                        int i4 = packageInfo == null ? 0 : packageInfo.versionCode;
                        if (i4 > ya4Var2.d.a()) {
                            ya4Var2.d.s();
                            ya4Var2.d.h(i4);
                        }
                        JSONObject m = ya4Var2.d.m();
                        String str7 = null;
                        if (m != null && (optJSONArray = m.optJSONArray(ya4Var2.b.f)) != null) {
                            str7 = optJSONArray.toString();
                        }
                        if (!TextUtils.isEmpty(str7)) {
                            bundle.putString("native_advanced_settings", str7);
                        }
                        int i5 = ya4Var2.b.k;
                        if (i5 > 1) {
                            bundle.putInt("max_num_ads", i5);
                        }
                        gi2 gi2Var = ya4Var2.b.b;
                        if (gi2Var != null) {
                            if (TextUtils.isEmpty(gi2Var.R)) {
                                if (gi2Var.P >= 2) {
                                    int i6 = gi2Var.S;
                                    if (i6 != 2) {
                                    }
                                    str3 = "l";
                                } else {
                                    int i7 = gi2Var.Q;
                                    if (i7 != 1) {
                                        if (i7 != 2) {
                                            sv2.d("Instream ad video aspect ratio " + i7 + " is wrong.");
                                        }
                                        str3 = "p";
                                    }
                                    str3 = "l";
                                }
                                str4 = "ia_var";
                            } else {
                                str3 = gi2Var.R;
                                str4 = "ad_tag";
                            }
                            bundle.putString(str4, str3);
                            bundle.putBoolean("instr", true);
                        }
                        if (ya4Var2.b.a() != null) {
                            bundle.putBoolean("has_delayed_banner_listener", true);
                        }
                    }
                };
        }
    }
}