package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsoluteLayout;
import android.widget.ImageView;
import defpackage.fb1;
import java.io.File;
import java.util.regex.Pattern;

/* renamed from: ld1  reason: default package */
public final class ld1 extends fb1 {
    public int A0;
    public int B0;
    public boolean C0;
    public boolean D0;
    public final int w0;
    public ImageView x0;
    public String y0;
    public String z0;

    /* renamed from: ld1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class a extends fb1.c {
        public a() {
            super();
        }

        @Override // defpackage.fb1.c, defpackage.ka1.b, android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            new f().a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: ld1$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class b extends fb1.d {
        public b() {
            super();
        }

        @Override // defpackage.fb1.d, defpackage.ka1.b, android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            new f().a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: ld1$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class c extends fb1.e {
        public c() {
            super();
        }

        @Override // defpackage.fb1.e, defpackage.ka1.b, android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            new f().a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: ld1$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class d extends fb1.f {
        public d() {
            super();
        }

        @Override // defpackage.fb1.f, defpackage.ka1.b, android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            new f().a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: ld1$e */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class e extends fb1.g {
        public e() {
            super();
        }

        @Override // defpackage.fb1.g, defpackage.ka1.b, android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            new f().a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: ld1$f */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class f {
        public f() {
        }

        public final void a() {
            if (ld1.this.getModuleInitialized()) {
                return;
            }
            ga1.h().l().getClass();
            float f = he1.f();
            ic1 info = ld1.this.getInfo();
            ld1 ld1Var = ld1.this;
            eb1.l(eg1.s(eg1.w()), info, "app_orientation");
            eb1.l(eg1.b(ld1Var), info, "x");
            eb1.l(eg1.j(ld1Var), info, "y");
            eb1.l((int) (ld1Var.getCurrentWidth() / f), info, "width");
            eb1.l((int) (ld1Var.getCurrentHeight() / f), info, "height");
            eb1.j(info, "ad_session_id", ld1Var.getAdSessionId());
        }
    }

    public ld1(Context context, int i, rc1 rc1Var, int i2) {
        super(context, i, rc1Var);
        this.w0 = i2;
        this.y0 = "";
        this.z0 = "";
    }

    @Override // defpackage.fb1
    public /* synthetic */ int getAdc3ModuleId() {
        return this.w0;
    }

    @Override // defpackage.fb1, defpackage.ka1
    public /* synthetic */ WebViewClient getWebViewClientApi21() {
        return new b();
    }

    @Override // defpackage.fb1, defpackage.ka1
    public /* synthetic */ WebViewClient getWebViewClientApi23() {
        return new c();
    }

    @Override // defpackage.fb1, defpackage.ka1
    public /* synthetic */ WebViewClient getWebViewClientApi24() {
        return new d();
    }

    @Override // defpackage.fb1, defpackage.ka1
    public /* synthetic */ WebViewClient getWebViewClientApi26() {
        return new e();
    }

    @Override // defpackage.fb1, defpackage.ka1
    public /* synthetic */ WebViewClient getWebViewClientDefault() {
        return new a();
    }

    @Override // defpackage.fb1, defpackage.ka1
    public final void i(rc1 rc1Var, int i, ob1 ob1Var) {
        ic1 ic1Var = rc1Var.b;
        this.y0 = ic1Var.q("ad_choices_filepath");
        this.z0 = ic1Var.q("ad_choices_url");
        this.A0 = ic1Var.l("ad_choices_width");
        this.B0 = ic1Var.l("ad_choices_height");
        this.C0 = ic1Var.j("ad_choices_snap_to_webview");
        this.D0 = ic1Var.j("disable_ad_choices");
        super.i(rc1Var, i, ob1Var);
    }

    @Override // defpackage.ka1
    public final /* synthetic */ boolean l(ic1 ic1Var, String str) {
        if (super.l(ic1Var, str)) {
            return true;
        }
        setEnableMessages(false);
        return true;
    }

    @Override // defpackage.ka1
    public final void m() {
        boolean z;
        Context context;
        super.m();
        boolean z2 = false;
        if (this.y0.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.z0.length() > 0) {
                z2 = true;
            }
            if (z2 && (context = ga1.P) != null && getParentContainer() != null && !this.D0) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(-1);
                gradientDrawable.setShape(1);
                ImageView imageView = new ImageView(context);
                imageView.setImageURI(Uri.fromFile(new File(this.y0)));
                imageView.setBackground(gradientDrawable);
                imageView.setOnClickListener(new md1(this));
                j21 j21Var = j21.a;
                this.x0 = imageView;
                z();
                addView(this.x0);
            }
        }
    }

    @Override // defpackage.ka1
    public final void q() {
        boolean z;
        if (getMraidFilepath().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Pattern compile = Pattern.compile("script\\s*src\\s*=\\s*\"mraid.js\"");
            hy.d("Pattern.compile(pattern)", compile);
            String str = "script src=\"file://" + getMraidFilepath() + '\"';
            String mUrl = getMUrl();
            hy.e("input", mUrl);
            hy.e("replacement", str);
            String replaceFirst = compile.matcher(mUrl).replaceFirst(str);
            hy.d("nativePattern.matcher(in…replaceFirst(replacement)", replaceFirst);
            setMUrl(s(replaceFirst, getInfo().n("device_info").q("iab_filepath")));
        }
    }

    @Override // defpackage.ka1
    public /* synthetic */ void setBounds(rc1 rc1Var) {
        super.setBounds(rc1Var);
        z();
    }

    public final void z() {
        int width;
        int height;
        ImageView imageView = this.x0;
        if (imageView == null) {
            return;
        }
        ga1.h().l().getClass();
        Rect g = he1.g();
        if (this.C0) {
            width = getCurrentWidth() + getCurrentX();
        } else {
            width = g.width();
        }
        if (this.C0) {
            height = getCurrentHeight() + getCurrentY();
        } else {
            height = g.height();
        }
        ga1.h().l().getClass();
        float f2 = he1.f();
        int i = (int) (this.A0 * f2);
        int i2 = (int) (this.B0 * f2);
        imageView.setLayoutParams(new AbsoluteLayout.LayoutParams(i, i2, width - i, height - i2));
    }
}