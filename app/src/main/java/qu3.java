package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.d3;
import java.util.HashMap;

/* renamed from: qu3  reason: default package */
public final class qu3 extends im3 {
    public final HashMap P = new HashMap();
    public final Context Q;
    public final ju3 R;
    public final ez4 S;
    public cu3 T;

    public qu3(Context context, ju3 ju3Var, yw2 yw2Var) {
        this.Q = context;
        this.R = ju3Var;
        this.S = yw2Var;
    }

    public static d3 u4() {
        return new d3(new d3.a());
    }

    public static String v4(Object obj) {
        rl0 c;
        mq3 mq3Var;
        if (obj instanceof l20) {
            c = ((l20) obj).e;
        } else if (obj instanceof u6) {
            c = ((u6) obj).a();
        } else if (obj instanceof fy) {
            c = ((fy) obj).a();
        } else if (obj instanceof xl0) {
            c = ((xl0) obj).a();
        } else if (obj instanceof yl0) {
            c = ((yl0) obj).a();
        } else if (obj instanceof i3) {
            c = ((i3) obj).getResponseInfo();
        } else {
            if (obj instanceof b70) {
                c = ((b70) obj).c();
            }
            return "";
        }
        if (c == null || (mq3Var = c.a) == null) {
            return "";
        }
        try {
            return mq3Var.f();
        } catch (RemoteException unused) {
        }
    }

    @Override // defpackage.gn3
    public final void h3(String str, hw hwVar, hw hwVar2) {
        String string;
        String string2;
        String string3;
        Context context = (Context) va0.c0(hwVar);
        ViewGroup viewGroup = (ViewGroup) va0.c0(hwVar2);
        if (context != null && viewGroup != null) {
            Object obj = this.P.get(str);
            if (obj != null) {
                this.P.remove(str);
            }
            if (obj instanceof i3) {
                i3 i3Var = (i3) obj;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setTag("layout");
                ru3.b(linearLayout, -1, -1);
                linearLayout.setGravity(17);
                linearLayout.addView(i3Var);
                i3Var.setTag("ad_view");
                viewGroup.addView(linearLayout);
            } else if (obj instanceof b70) {
                b70 b70Var = (b70) obj;
                f70 f70Var = new f70(context);
                f70Var.setTag("ad_view_tag");
                ru3.b(f70Var, -1, -1);
                viewGroup.addView(f70Var);
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setTag("layout_tag");
                linearLayout2.setOrientation(1);
                ru3.b(linearLayout2, -1, -1);
                linearLayout2.setBackgroundColor(-1);
                f70Var.addView(linearLayout2);
                Resources a = jv5.A.g.a();
                if (a == null) {
                    string = "Headline";
                } else {
                    string = a.getString(ri0.native_headline);
                }
                linearLayout2.addView(ru3.a(context, string, 16973894, -9210245, 0.0f, "headline_header_tag"));
                View a2 = ru3.a(context, pt4.b(b70Var.b()), 16973892, -16777216, 12.0f, "headline_tag");
                f70Var.setHeadlineView(a2);
                linearLayout2.addView(a2);
                if (a == null) {
                    string2 = "Body";
                } else {
                    string2 = a.getString(ri0.native_body);
                }
                linearLayout2.addView(ru3.a(context, string2, 16973894, -9210245, 0.0f, "body_header_tag"));
                View a3 = ru3.a(context, pt4.b(b70Var.a()), 16973892, -16777216, 12.0f, "body_tag");
                f70Var.setBodyView(a3);
                linearLayout2.addView(a3);
                if (a == null) {
                    string3 = "Media View";
                } else {
                    string3 = a.getString(ri0.native_media_view);
                }
                linearLayout2.addView(ru3.a(context, string3, 16973894, -9210245, 0.0f, "media_view_header_tag"));
                f50 f50Var = new f50(context);
                f50Var.setTag("media_view_tag");
                f70Var.setMediaView(f50Var);
                linearLayout2.addView(f50Var);
                f70Var.setNativeAd(b70Var);
            }
        }
    }

    public final synchronized void t4(Object obj, String str, String str2) {
        this.P.put(str, obj);
        w4(v4(obj), str2);
    }

    public final synchronized void w4(String str, String str2) {
        try {
            zw4.J(this.T.a(str), new vi1(this, str2), this.S);
        } catch (NullPointerException e) {
            jv5.A.g.f("OutOfContextTester.setAdAsOutOfContext", e);
            this.R.e(str2);
        }
    }

    public final synchronized void x4(String str, String str2) {
        try {
            zw4.J(this.T.a(str), new ka2(this, str2), this.S);
        } catch (NullPointerException e) {
            jv5.A.g.f("OutOfContextTester.setAdAsShown", e);
            this.R.e(str2);
        }
    }
}