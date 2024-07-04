package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;

/* renamed from: z1  reason: default package */
public final class z1 extends FrameLayout {
    public ob1 P;
    public a2 Q;
    public String R;
    public String S;
    public String T;
    public String U;
    public ImageView V;
    public zd1 W;
    public rc1 a0;
    public boolean b0;
    public boolean c0;
    public boolean d0;
    public boolean e0;
    public boolean f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;

    /* renamed from: z1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a {
    }

    public z1(Context context, rc1 rc1Var, a2 a2Var) {
        super(context);
        this.f0 = true;
        this.Q = a2Var;
        this.S = a2Var.a;
        ic1 ic1Var = rc1Var.b;
        this.R = ic1Var.q("id");
        this.T = ic1Var.q("close_button_filepath");
        this.b0 = ic1Var.j("trusted_demand_source");
        this.e0 = ic1Var.j("close_button_snap_to_webview");
        this.j0 = ic1Var.l("close_button_width");
        this.k0 = ic1Var.l("close_button_height");
        ob1 ob1Var = ga1.h().k().b.get(this.R);
        this.P = ob1Var;
        if (ob1Var != null) {
            ob1 ob1Var2 = this.P;
            setLayoutParams(new FrameLayout.LayoutParams(ob1Var2.W, ob1Var2.a0));
            setBackgroundColor(0);
            addView(this.P);
            return;
        }
        throw new RuntimeException("AdColonyAdView container cannot be null");
    }

    public final void a() {
        int width;
        int i;
        if (!this.b0 && !this.d0) {
            if (this.a0 != null) {
                ic1 ic1Var = new ic1();
                eb1.m(ic1Var, "success", false);
                this.a0.a(ic1Var).b();
                this.a0 = null;
                return;
            }
            return;
        }
        ga1.h().l().getClass();
        Rect g = he1.g();
        int i2 = this.h0;
        if (i2 <= 0) {
            i2 = g.width();
        }
        int i3 = this.i0;
        if (i3 <= 0) {
            i3 = g.height();
        }
        int width2 = (g.width() - i2) / 2;
        int height = (g.height() - i3) / 2;
        this.P.setLayoutParams(new FrameLayout.LayoutParams(g.width(), g.height()));
        ka1 webView = getWebView();
        if (webView != null) {
            rc1 rc1Var = new rc1("WebView.set_bounds", 0);
            ic1 ic1Var2 = new ic1();
            eb1.l(width2, ic1Var2, "x");
            eb1.l(height, ic1Var2, "y");
            eb1.l(i2, ic1Var2, "width");
            eb1.l(i3, ic1Var2, "height");
            rc1Var.b = ic1Var2;
            webView.setBounds(rc1Var);
            float f = he1.f();
            ic1 ic1Var3 = new ic1();
            eb1.l(eg1.s(eg1.w()), ic1Var3, "app_orientation");
            eb1.l((int) (i2 / f), ic1Var3, "width");
            eb1.l((int) (i3 / f), ic1Var3, "height");
            eb1.l(eg1.b(webView), ic1Var3, "x");
            eb1.l(eg1.j(webView), ic1Var3, "y");
            eb1.j(ic1Var3, "ad_session_id", this.R);
            new rc1(this.P.c0, ic1Var3, "MRAID.on_size_change").b();
        }
        ImageView imageView = this.V;
        if (imageView != null) {
            this.P.removeView(imageView);
        }
        Context context = ga1.P;
        if (context != null && !this.c0 && webView != null) {
            ga1.h().l().getClass();
            float f2 = he1.f();
            int i4 = (int) (this.j0 * f2);
            int i5 = (int) (this.k0 * f2);
            if (this.e0) {
                width = webView.getCurrentWidth() + webView.getCurrentX();
            } else {
                width = g.width();
            }
            if (this.e0) {
                i = webView.getCurrentY();
            } else {
                i = 0;
            }
            ImageView imageView2 = new ImageView(context.getApplicationContext());
            this.V = imageView2;
            imageView2.setImageURI(Uri.fromFile(new File(this.T)));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i5);
            layoutParams.setMargins(width - i4, i, 0, 0);
            this.V.setOnClickListener(new y1(context));
            this.P.addView(this.V, layoutParams);
            this.P.a(this.V, js.CLOSE_AD);
        }
        if (this.a0 != null) {
            ic1 ic1Var4 = new ic1();
            eb1.m(ic1Var4, "success", true);
            this.a0.a(ic1Var4).b();
            this.a0 = null;
        }
    }

    public x1 getAdSize() {
        return null;
    }

    public String getClickOverride() {
        return this.U;
    }

    public ob1 getContainer() {
        return this.P;
    }

    public a2 getListener() {
        return this.Q;
    }

    public zd1 getOmidManager() {
        return this.W;
    }

    public int getOrientation() {
        return this.g0;
    }

    public boolean getTrustedDemandSource() {
        return this.b0;
    }

    public ka1 getWebView() {
        ob1 ob1Var = this.P;
        if (ob1Var == null) {
            return null;
        }
        return ob1Var.R.get(2);
    }

    public String getZoneId() {
        return this.S;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f0) {
            this.f0 = false;
        }
    }

    public void setClickOverride(String str) {
        this.U = str;
    }

    public void setExpandMessage(rc1 rc1Var) {
        this.a0 = rc1Var;
    }

    public void setExpandedHeight(int i) {
        ga1.h().l().getClass();
        this.i0 = (int) (he1.f() * i);
    }

    public void setExpandedWidth(int i) {
        ga1.h().l().getClass();
        this.h0 = (int) (he1.f() * i);
    }

    public void setListener(a2 a2Var) {
        this.Q = a2Var;
    }

    public void setNoCloseButton(boolean z) {
        this.c0 = this.b0 && z;
    }

    public void setOmidManager(zd1 zd1Var) {
        this.W = zd1Var;
    }

    public void setOnDestroyListenerOrCall(a aVar) {
    }

    public void setOrientation(int i) {
        this.g0 = i;
    }

    public void setUserInteraction(boolean z) {
        this.d0 = z;
    }
}