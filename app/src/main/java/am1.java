package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: am1  reason: default package */
public final /* synthetic */ class am1 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ am1(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        boolean z2;
        String str;
        switch (this.P) {
            case 0:
                y02 y02Var = (y02) this.Q;
                y02Var.getClass();
                jv5 jv5Var = jv5.A;
                r42 r42Var = jv5Var.m;
                Context context = y02Var.a;
                String str2 = y02Var.d;
                String str3 = y02Var.e;
                r42Var.getClass();
                p92 p92Var = x92.S3;
                w82 w82Var = w82.d;
                String h = r42.h(context, r42Var.i(context, (String) w82Var.c.a(p92Var), str2, str3).toString(), str3);
                if (TextUtils.isEmpty(h)) {
                    sv2.b("Not linked for in app preview.");
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(h.trim());
                        String optString = jSONObject.optString("gct");
                        r42Var.f = jSONObject.optString("status");
                        if (((Boolean) w82Var.c.a(x92.M7)).booleanValue()) {
                            if (!"0".equals(r42Var.f) && !"2".equals(r42Var.f)) {
                                z2 = false;
                                r42Var.d(z2);
                                nl5 b = jv5Var.g.b();
                                if (z2) {
                                    str = "";
                                } else {
                                    str = str2;
                                }
                                b.v(str);
                            }
                            z2 = true;
                            r42Var.d(z2);
                            nl5 b2 = jv5Var.g.b();
                            if (z2) {
                            }
                            b2.v(str);
                        }
                        synchronized (r42Var.a) {
                            r42Var.c = optString;
                        }
                        z = true;
                    } catch (JSONException e) {
                        sv2.h("Fail to get in app preview response json.", e);
                    }
                    if (z) {
                        r42.e(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
                        return;
                    } else if ("2".equals(r42Var.f)) {
                        sv2.b("Creative is not pushed for this device.");
                        r42.e(context, "There was no creative pushed from DFP to the device.", false, false);
                        return;
                    } else if ("1".equals(r42Var.f)) {
                        sv2.b("The app is not linked for creative preview.");
                        r42Var.b(context, str2, str3);
                        return;
                    } else if ("0".equals(r42Var.f)) {
                        sv2.b("Device is linked for in app preview.");
                        r42.e(context, "The device is successfully linked for creative preview.", false, true);
                        return;
                    } else {
                        return;
                    }
                }
                z = false;
                if (z) {
                }
                break;
            case 1:
                rx2 rx2Var = ((qx2) this.Q).h0;
                if (rx2Var != null) {
                    vx2 vx2Var = (vx2) rx2Var;
                    vx2Var.c("pause", new String[0]);
                    vx2Var.b();
                    vx2Var.W = false;
                    return;
                }
                return;
            case 2:
                jv5.A.y.P.remove((gz2) this.Q);
                return;
            default:
                am3 am3Var = (am3) this.Q;
                if (am3Var.V == null) {
                    View view = new View(am3Var.S.getContext());
                    am3Var.V = view;
                    view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                }
                if (am3Var.S != am3Var.V.getParent()) {
                    am3Var.S.addView(am3Var.V);
                    return;
                }
                return;
        }
    }
}