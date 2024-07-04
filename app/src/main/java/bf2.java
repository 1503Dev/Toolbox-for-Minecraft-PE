package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bf2  reason: default package */
public final class bf2 implements mg2 {
    public final /* synthetic */ int P;
    public final Object Q;

    public /* synthetic */ bf2(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // defpackage.mg2
    public final void b(Object obj, Map map) {
        char c;
        s2 s2Var;
        Bundle bundle = null;
        bundle = null;
        r0 = null;
        Activity activity = null;
        switch (this.P) {
            case 0:
                if (((cf2) this.Q) != null) {
                    String str = (String) map.get("name");
                    if (str == null) {
                        sv2.f("Ad metadata with no name parameter.");
                        str = "";
                    }
                    if (map.containsKey("info")) {
                        try {
                            bundle = mq2.a(new JSONObject((String) map.get("info")));
                        } catch (JSONException e) {
                            sv2.e("Failed to convert ad metadata to JSON.", e);
                        }
                    }
                    if (bundle == null) {
                        sv2.d("Failed to convert ad metadata to Bundle.");
                        return;
                    } else {
                        ((cf2) this.Q).l(bundle, str);
                        return;
                    }
                }
                return;
            case 1:
                l92 l92Var = x92.T7;
                w82 w82Var = w82.d;
                if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                    String str2 = (String) map.get("action");
                    String str3 = (String) map.get("adUnitId");
                    String str4 = (String) map.get("redirectUrl");
                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                        String str5 = (String) map.get("format");
                        if (str2.equals("load") && !TextUtils.isEmpty(str5)) {
                            qu3 qu3Var = (qu3) this.Q;
                            synchronized (qu3Var) {
                                switch (str5.hashCode()) {
                                    case -1999289321:
                                        if (str5.equals("NATIVE")) {
                                            c = 3;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1372958932:
                                        if (str5.equals("INTERSTITIAL")) {
                                            c = 2;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -428325382:
                                        if (str5.equals("APP_OPEN_AD")) {
                                            c = 0;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 543046670:
                                        if (str5.equals("REWARDED")) {
                                            c = 4;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1854800829:
                                        if (str5.equals("REWARDED_INTERSTITIAL")) {
                                            c = 5;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1951953708:
                                        if (str5.equals("BANNER")) {
                                            c = 1;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    default:
                                        c = 65535;
                                        break;
                                }
                                if (c != 0) {
                                    if (c != 1) {
                                        if (c != 2) {
                                            if (c != 3) {
                                                if (c != 4) {
                                                    if (c == 5) {
                                                        yl0.b(qu3Var.Q, str3, qu3.u4(), new ou3(qu3Var, str3, str4));
                                                    }
                                                } else {
                                                    xl0.b(qu3Var.Q, str3, qu3.u4(), new nu3(qu3Var, str3, str4));
                                                }
                                            } else {
                                                Context context = qu3Var.Q;
                                                uf0.g(context, "context cannot be null");
                                                t42 t42Var = n62.f.b;
                                                tk2 tk2Var = new tk2();
                                                t42Var.getClass();
                                                jn2 jn2Var = (jn2) new xx1(t42Var, context, str3, tk2Var).d(context, false);
                                                try {
                                                    jn2Var.M0(new fo2(new fn2(qu3Var, str3, str4)));
                                                } catch (RemoteException e2) {
                                                    sv2.h("Failed to add google native ad listener", e2);
                                                }
                                                try {
                                                    jn2Var.q2(new d25(new pu3(qu3Var, str4)));
                                                } catch (RemoteException e3) {
                                                    sv2.h("Failed to set AdListener.", e3);
                                                }
                                                try {
                                                    s2Var = new s2(context, jn2Var.b());
                                                } catch (RemoteException e4) {
                                                    sv2.e("Failed to build AdLoader.", e4);
                                                    s2Var = new s2(context, new je4(new af4()));
                                                }
                                                s2Var.a(qu3.u4());
                                            }
                                        } else {
                                            fy.b(qu3Var.Q, str3, qu3.u4(), new mu3(qu3Var, str3, str4));
                                        }
                                    } else {
                                        i3 i3Var = new i3(qu3Var.Q);
                                        i3Var.setAdSize(h3.h);
                                        i3Var.setAdUnitId(str3);
                                        i3Var.setAdListener(new lu3(qu3Var, str3, i3Var, str4));
                                        i3Var.a(qu3.u4());
                                    }
                                } else {
                                    u6.b(qu3Var.Q, str3, qu3.u4(), new ku3(qu3Var, str3, str4));
                                }
                            }
                            return;
                        } else if (str2.equals("show")) {
                            qu3 qu3Var2 = (qu3) this.Q;
                            synchronized (qu3Var2) {
                                ju3 ju3Var = qu3Var2.R;
                                l13 l13Var = ju3Var.S;
                                if (l13Var != null && !l13Var.c0()) {
                                    activity = ju3Var.S.g();
                                    break;
                                }
                                Object obj2 = qu3Var2.P.get(str3);
                                if (obj2 != null) {
                                    l92 l92Var2 = x92.U7;
                                    if (!((Boolean) w82Var.c.a(l92Var2)).booleanValue() || (obj2 instanceof u6) || (obj2 instanceof fy) || (obj2 instanceof xl0) || (obj2 instanceof yl0)) {
                                        qu3Var2.P.remove(str3);
                                    }
                                    qu3Var2.x4(qu3.v4(obj2), str4);
                                    if (obj2 instanceof u6) {
                                        ((u6) obj2).c(activity);
                                    } else if (obj2 instanceof fy) {
                                        ((fy) obj2).e(activity);
                                    } else if (obj2 instanceof xl0) {
                                        ((xl0) obj2).d(activity, q05.R);
                                    } else if (obj2 instanceof yl0) {
                                        ((yl0) obj2).c(activity);
                                    } else if (((Boolean) w82Var.c.a(l92Var2)).booleanValue() && ((obj2 instanceof i3) || (obj2 instanceof b70))) {
                                        Intent intent = new Intent();
                                        intent.setClassName(qu3Var2.Q, "com.google.android.gms.ads.OutOfContextTestingActivity");
                                        intent.putExtra("adUnit", str3);
                                        cu5 cu5Var = jv5.A.c;
                                        cu5.l(qu3Var2.Q, intent);
                                    }
                                }
                            }
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                rk3 rk3Var = (rk3) ((WeakReference) this.Q).get();
                if (rk3Var != null) {
                    rk3Var.h.J();
                    if (((Boolean) w82.d.c.a(x92.t8)).booleanValue()) {
                        rk3Var.i.w();
                        if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                            rk3Var.i.s();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ bf2(rk3 rk3Var) {
        this.P = 2;
        this.Q = new WeakReference(rk3Var);
    }
}