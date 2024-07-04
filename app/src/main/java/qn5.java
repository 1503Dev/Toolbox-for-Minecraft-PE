package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: qn5  reason: default package */
public class qn5 extends oo2 implements bn1 {
    public static final int k0 = Color.argb(0, 0, 0, 0);
    public final Activity Q;
    public AdOverlayInfoParcel R;
    public y03 S;
    public xj5 T;
    public zs5 U;
    public FrameLayout W;
    public WebChromeClient.CustomViewCallback X;
    public e25 a0;
    public uz3 d0;
    public boolean e0;
    public boolean f0;
    public boolean V = false;
    public boolean Y = false;
    public boolean Z = false;
    public boolean b0 = false;
    public int j0 = 1;
    public final Object c0 = new Object();
    public boolean g0 = false;
    public boolean h0 = false;
    public boolean i0 = true;

    public qn5(Activity activity) {
        this.Q = activity;
    }

    @Override // defpackage.po2
    public final void D3(int i, int i2, Intent intent) {
    }

    @Override // defpackage.po2
    public final void E() {
        this.f0 = true;
    }

    @Override // defpackage.po2
    public final void G() {
        if (((Boolean) w82.d.c.a(x92.Z3)).booleanValue() && this.S != null && (!this.Q.isFinishing() || this.T == null)) {
            this.S.onPause();
        }
        O1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Runnable, uz3] */
    public final void O1() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zp5 zp5Var;
        if (this.Q.isFinishing() && !this.g0) {
            this.g0 = true;
            y03 y03Var = this.S;
            if (y03Var != null) {
                y03Var.O0(this.j0 - 1);
                synchronized (this.c0) {
                    try {
                        if (!this.e0 && this.S.Y()) {
                            l92 l92Var = x92.X3;
                            w82 w82Var = w82.d;
                            if (((Boolean) w82Var.c.a(l92Var)).booleanValue() && !this.h0 && (adOverlayInfoParcel = this.R) != null && (zp5Var = adOverlayInfoParcel.R) != null) {
                                zp5Var.n3();
                            }
                            ?? r1 = new Runnable() { // from class: uz3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    qn5.this.d();
                                }
                            };
                            this.d0 = r1;
                            cu5.i.postDelayed(r1, ((Long) w82Var.c.a(x92.J0)).longValue());
                            return;
                        }
                    } finally {
                    }
                }
            }
            d();
        }
    }

    @Override // defpackage.po2
    public final void a0(hw hwVar) {
        u4((Configuration) va0.c0(hwVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0083 A[Catch: vi4 -> 0x0111, TryCatch #3 {vi4 -> 0x0111, blocks: (B:9:0x0017, B:13:0x0034, B:15:0x0038, B:17:0x0041, B:18:0x0043, B:20:0x004b, B:21:0x0059, B:23:0x0060, B:29:0x006d, B:31:0x0071, B:33:0x0076, B:36:0x0083, B:38:0x0087, B:40:0x008d, B:44:0x0095, B:49:0x009a, B:51:0x00a0, B:52:0x00a3, B:54:0x00a9, B:56:0x00ad, B:57:0x00b0, B:59:0x00b6, B:60:0x00b9, B:67:0x00e8, B:69:0x00ec, B:70:0x00f3, B:71:0x00f4, B:73:0x00f8, B:75:0x0105, B:26:0x0067, B:28:0x006b, B:34:0x007f, B:77:0x0109, B:78:0x0110, B:41:0x008e, B:43:0x0092), top: B:84:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0105 A[Catch: vi4 -> 0x0111, TryCatch #3 {vi4 -> 0x0111, blocks: (B:9:0x0017, B:13:0x0034, B:15:0x0038, B:17:0x0041, B:18:0x0043, B:20:0x004b, B:21:0x0059, B:23:0x0060, B:29:0x006d, B:31:0x0071, B:33:0x0076, B:36:0x0083, B:38:0x0087, B:40:0x008d, B:44:0x0095, B:49:0x009a, B:51:0x00a0, B:52:0x00a3, B:54:0x00a9, B:56:0x00ad, B:57:0x00b0, B:59:0x00b6, B:60:0x00b9, B:67:0x00e8, B:69:0x00ec, B:70:0x00f3, B:71:0x00f4, B:73:0x00f8, B:75:0x0105, B:26:0x0067, B:28:0x006b, B:34:0x007f, B:77:0x0109, B:78:0x0110, B:41:0x008e, B:43:0x0092), top: B:84:0x0017 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a2(Bundle bundle) {
        boolean z;
        AdOverlayInfoParcel adOverlayInfoParcel;
        int i;
        this.Q.requestWindowFeature(1);
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        } else {
            z = false;
        }
        this.Y = z;
        try {
            try {
                Bundle bundleExtra = this.Q.getIntent().getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
                bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
                adOverlayInfoParcel = (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            } catch (Exception unused) {
                adOverlayInfoParcel = null;
            }
            this.R = adOverlayInfoParcel;
            if (adOverlayInfoParcel != null) {
                if (adOverlayInfoParcel.b0.R > 7500000) {
                    this.j0 = 4;
                }
                if (this.Q.getIntent() != null) {
                    this.i0 = this.Q.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
                }
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.R;
                tl5 tl5Var = adOverlayInfoParcel2.d0;
                if (tl5Var != null) {
                    boolean z2 = tl5Var.P;
                    this.Z = z2;
                    if (z2) {
                        if (adOverlayInfoParcel2.Z != 5 && tl5Var.U != -1) {
                            new lm5(this).b();
                        }
                    }
                    if (bundle == null) {
                        if (this.i0) {
                            wd3 wd3Var = this.R.m0;
                            if (wd3Var != null) {
                                synchronized (wd3Var) {
                                    ScheduledFuture scheduledFuture = wd3Var.R;
                                    if (scheduledFuture != null) {
                                        scheduledFuture.cancel(true);
                                    }
                                }
                            }
                            zp5 zp5Var = this.R.R;
                            if (zp5Var != null) {
                                zp5Var.c();
                            }
                        }
                        AdOverlayInfoParcel adOverlayInfoParcel3 = this.R;
                        if (adOverlayInfoParcel3.Z != 1) {
                            vj1 vj1Var = adOverlayInfoParcel3.Q;
                            if (vj1Var != null) {
                                vj1Var.J();
                            }
                            oi3 oi3Var = this.R.n0;
                            if (oi3Var != null) {
                                oi3Var.w();
                            }
                        }
                    }
                    Activity activity = this.Q;
                    AdOverlayInfoParcel adOverlayInfoParcel4 = this.R;
                    e25 e25Var = new e25(activity, adOverlayInfoParcel4.c0, adOverlayInfoParcel4.b0.P, adOverlayInfoParcel4.l0);
                    this.a0 = e25Var;
                    e25Var.setId(1000);
                    jv5.A.e.j(this.Q);
                    AdOverlayInfoParcel adOverlayInfoParcel5 = this.R;
                    i = adOverlayInfoParcel5.Z;
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 5) {
                                    t4(false);
                                    return;
                                }
                                throw new vi4("Could not determine ad overlay type.");
                            }
                            t4(true);
                            return;
                        }
                        this.T = new xj5(adOverlayInfoParcel5.S);
                        t4(false);
                        return;
                    }
                    t4(false);
                } else if (adOverlayInfoParcel2.Z == 5) {
                    this.Z = true;
                    if (adOverlayInfoParcel2.Z != 5) {
                        new lm5(this).b();
                    }
                    if (bundle == null) {
                    }
                    Activity activity2 = this.Q;
                    AdOverlayInfoParcel adOverlayInfoParcel42 = this.R;
                    e25 e25Var2 = new e25(activity2, adOverlayInfoParcel42.c0, adOverlayInfoParcel42.b0.P, adOverlayInfoParcel42.l0);
                    this.a0 = e25Var2;
                    e25Var2.setId(1000);
                    jv5.A.e.j(this.Q);
                    AdOverlayInfoParcel adOverlayInfoParcel52 = this.R;
                    i = adOverlayInfoParcel52.Z;
                    if (i != 1) {
                    }
                } else {
                    this.Z = false;
                    if (bundle == null) {
                    }
                    Activity activity22 = this.Q;
                    AdOverlayInfoParcel adOverlayInfoParcel422 = this.R;
                    e25 e25Var22 = new e25(activity22, adOverlayInfoParcel422.c0, adOverlayInfoParcel422.b0.P, adOverlayInfoParcel422.l0);
                    this.a0 = e25Var22;
                    e25Var22.setId(1000);
                    jv5.A.e.j(this.Q);
                    AdOverlayInfoParcel adOverlayInfoParcel522 = this.R;
                    i = adOverlayInfoParcel522.Z;
                    if (i != 1) {
                    }
                }
            } else {
                throw new vi4("Could not get info for ad overlay.");
            }
        } catch (vi4 e) {
            sv2.g(e.getMessage());
            this.j0 = 4;
            this.Q.finish();
        }
    }

    public final void c() {
        this.j0 = 3;
        this.Q.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.R;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.Z != 5) {
            return;
        }
        this.Q.overridePendingTransition(0, 0);
    }

    public final void d() {
        y03 y03Var;
        zp5 zp5Var;
        if (this.h0) {
            return;
        }
        this.h0 = true;
        y03 y03Var2 = this.S;
        if (y03Var2 != null) {
            this.a0.removeView(y03Var2.x());
            xj5 xj5Var = this.T;
            if (xj5Var != null) {
                this.S.G(xj5Var.d);
                this.S.w0(false);
                ViewGroup viewGroup = this.T.c;
                View x = this.S.x();
                xj5 xj5Var2 = this.T;
                viewGroup.addView(x, xj5Var2.a, xj5Var2.b);
                this.T = null;
            } else if (this.Q.getApplicationContext() != null) {
                this.S.G(this.Q.getApplicationContext());
            }
            this.S = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.R;
        if (adOverlayInfoParcel != null && (zp5Var = adOverlayInfoParcel.R) != null) {
            zp5Var.A(this.j0);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.R;
        if (adOverlayInfoParcel2 != null && (y03Var = adOverlayInfoParcel2.S) != null) {
            hw o0 = y03Var.o0();
            View x2 = this.R.S.x();
            if (o0 != null && x2 != null) {
                jv5.A.v.b(x2, o0);
            }
        }
    }

    public final void e() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.R;
        if (adOverlayInfoParcel != null && this.V) {
            x4(adOverlayInfoParcel.Y);
        }
        if (this.W != null) {
            this.Q.setContentView(this.a0);
            this.f0 = true;
            this.W.removeAllViews();
            this.W = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.X;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.X = null;
        }
        this.V = false;
    }

    @Override // defpackage.po2
    public final void f() {
        this.j0 = 1;
    }

    @Override // defpackage.po2
    public final void i0(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.Y);
    }

    @Override // defpackage.po2
    public final void k() {
        zp5 zp5Var;
        e();
        AdOverlayInfoParcel adOverlayInfoParcel = this.R;
        if (adOverlayInfoParcel != null && (zp5Var = adOverlayInfoParcel.R) != null) {
            zp5Var.Z();
        }
        if (!((Boolean) w82.d.c.a(x92.Z3)).booleanValue() && this.S != null && (!this.Q.isFinishing() || this.T == null)) {
            this.S.onPause();
        }
        O1();
    }

    @Override // defpackage.po2
    public final void m() {
    }

    @Override // defpackage.po2
    public final void n() {
        y03 y03Var = this.S;
        if (y03Var != null) {
            try {
                this.a0.removeView(y03Var.x());
            } catch (NullPointerException unused) {
            }
        }
        O1();
    }

    @Override // defpackage.po2
    public final void q() {
        zp5 zp5Var;
        AdOverlayInfoParcel adOverlayInfoParcel = this.R;
        if (adOverlayInfoParcel != null && (zp5Var = adOverlayInfoParcel.R) != null) {
            zp5Var.d3();
        }
        u4(this.Q.getResources().getConfiguration());
        if (!((Boolean) w82.d.c.a(x92.Z3)).booleanValue()) {
            y03 y03Var = this.S;
            if (y03Var != null && !y03Var.c0()) {
                this.S.onResume();
            } else {
                sv2.g("The webview does not exist. Ignoring action.");
            }
        }
    }

    @Override // defpackage.po2
    public final void s() {
        if (((Boolean) w82.d.c.a(x92.Z3)).booleanValue()) {
            y03 y03Var = this.S;
            if (y03Var != null && !y03Var.c0()) {
                this.S.onResume();
            } else {
                sv2.g("The webview does not exist. Ignoring action.");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0049, code lost:
        if (r30.Q.getResources().getConfiguration().orientation == 1) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005c, code lost:
        if (r30.Q.getResources().getConfiguration().orientation == 2) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005e, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0060, code lost:
        r5 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t4(boolean z) {
        g13 g13Var;
        boolean z2;
        boolean z3;
        e25 e25Var;
        int i;
        k23 k23Var;
        String str;
        uj1 uj1Var;
        y03 y03Var;
        AdOverlayInfoParcel adOverlayInfoParcel;
        boolean z4;
        if (!this.f0) {
            this.Q.requestWindowFeature(1);
        }
        Window window = this.Q.getWindow();
        if (window != null) {
            y03 y03Var2 = this.R.S;
            o82 o82Var = null;
            if (y03Var2 != null) {
                g13Var = y03Var2.R();
            } else {
                g13Var = null;
            }
            if (g13Var != null) {
                synchronized (g13Var.S) {
                    z4 = g13Var.c0;
                }
                if (z4) {
                    z2 = true;
                    this.b0 = false;
                    if (z2) {
                        int i2 = this.R.Y;
                        if (i2 != 6) {
                            if (i2 == 7) {
                            }
                        }
                        this.b0 = z3;
                        sv2.b("Delay onShow to next orientation change: " + z3);
                        x4(this.R.Y);
                        window.setFlags(16777216, 16777216);
                        sv2.b("Hardware acceleration on the AdActivity window enabled.");
                        if (!this.Z) {
                            e25Var = this.a0;
                            i = -16777216;
                        } else {
                            e25Var = this.a0;
                            i = k0;
                        }
                        e25Var.setBackgroundColor(i);
                        this.Q.setContentView(this.a0);
                        this.f0 = true;
                        if (z) {
                            try {
                                k13 k13Var = jv5.A.d;
                                Activity activity = this.Q;
                                y03 y03Var3 = this.R.S;
                                if (y03Var3 != null) {
                                    k23Var = y03Var3.L();
                                } else {
                                    k23Var = null;
                                }
                                y03 y03Var4 = this.R.S;
                                if (y03Var4 != null) {
                                    str = y03Var4.a0();
                                } else {
                                    str = null;
                                }
                                AdOverlayInfoParcel adOverlayInfoParcel2 = this.R;
                                xv2 xv2Var = adOverlayInfoParcel2.b0;
                                y03 y03Var5 = adOverlayInfoParcel2.S;
                                if (y03Var5 != null) {
                                    uj1Var = y03Var5.j();
                                } else {
                                    uj1Var = null;
                                }
                                l13 a = k13.a(activity, k23Var, str, true, z2, null, null, xv2Var, null, uj1Var, new j52(), null, null);
                                this.S = a;
                                g13 R = a.R();
                                AdOverlayInfoParcel adOverlayInfoParcel3 = this.R;
                                cf2 cf2Var = adOverlayInfoParcel3.e0;
                                ef2 ef2Var = adOverlayInfoParcel3.T;
                                b16 b16Var = adOverlayInfoParcel3.X;
                                y03 y03Var6 = adOverlayInfoParcel3.S;
                                if (y03Var6 != null) {
                                    o82Var = y03Var6.R().h0;
                                }
                                R.a(null, cf2Var, null, ef2Var, b16Var, true, null, o82Var, null, null, null, null, null, null, null, null, null, null);
                                this.S.R().V = new eg3(0, this);
                                AdOverlayInfoParcel adOverlayInfoParcel4 = this.R;
                                String str2 = adOverlayInfoParcel4.a0;
                                if (str2 != null) {
                                    this.S.loadUrl(str2);
                                } else {
                                    String str3 = adOverlayInfoParcel4.W;
                                    if (str3 != null) {
                                        this.S.loadDataWithBaseURL(adOverlayInfoParcel4.U, str3, "text/html", "UTF-8", null);
                                    } else {
                                        throw new vi4("No URL or HTML to display in ad overlay.");
                                    }
                                }
                                y03 y03Var7 = this.R.S;
                                if (y03Var7 != null) {
                                    y03Var7.N0(this);
                                }
                            } catch (Exception e) {
                                sv2.e("Error obtaining webview.", e);
                                throw new vi4(e);
                            }
                        } else {
                            y03 y03Var8 = this.R.S;
                            this.S = y03Var8;
                            y03Var8.G(this.Q);
                        }
                        this.S.I0(this);
                        y03Var = this.R.S;
                        if (y03Var != null) {
                            hw o0 = y03Var.o0();
                            e25 e25Var2 = this.a0;
                            if (o0 != null && e25Var2 != null) {
                                jv5.A.v.b(e25Var2, o0);
                            }
                        }
                        if (this.R.Z != 5) {
                            ViewParent parent = this.S.getParent();
                            if (parent != null && (parent instanceof ViewGroup)) {
                                ((ViewGroup) parent).removeView(this.S.x());
                            }
                            if (this.Z) {
                                this.S.p0();
                            }
                            this.a0.addView(this.S.x(), -1, -1);
                        }
                        if (!z && !this.b0) {
                            this.S.f0();
                        }
                        adOverlayInfoParcel = this.R;
                        if (adOverlayInfoParcel.Z != 5) {
                            v4(z2);
                            if (this.S.D()) {
                                w4(z2, true);
                                return;
                            }
                            return;
                        }
                        a14.v4(this.Q, this, adOverlayInfoParcel.j0, adOverlayInfoParcel.h0, adOverlayInfoParcel.g0, adOverlayInfoParcel.i0, adOverlayInfoParcel.f0, adOverlayInfoParcel.k0, false);
                        return;
                    }
                    z3 = false;
                    sv2.b("Delay onShow to next orientation change: " + z3);
                    x4(this.R.Y);
                    window.setFlags(16777216, 16777216);
                    sv2.b("Hardware acceleration on the AdActivity window enabled.");
                    if (!this.Z) {
                    }
                    e25Var.setBackgroundColor(i);
                    this.Q.setContentView(this.a0);
                    this.f0 = true;
                    if (z) {
                    }
                    this.S.I0(this);
                    y03Var = this.R.S;
                    if (y03Var != null) {
                    }
                    if (this.R.Z != 5) {
                    }
                    if (!z) {
                        this.S.f0();
                    }
                    adOverlayInfoParcel = this.R;
                    if (adOverlayInfoParcel.Z != 5) {
                    }
                }
            }
            z2 = false;
            this.b0 = false;
            if (z2) {
            }
            z3 = false;
            sv2.b("Delay onShow to next orientation change: " + z3);
            x4(this.R.Y);
            window.setFlags(16777216, 16777216);
            sv2.b("Hardware acceleration on the AdActivity window enabled.");
            if (!this.Z) {
            }
            e25Var.setBackgroundColor(i);
            this.Q.setContentView(this.a0);
            this.f0 = true;
            if (z) {
            }
            this.S.I0(this);
            y03Var = this.R.S;
            if (y03Var != null) {
            }
            if (this.R.Z != 5) {
            }
            if (!z) {
            }
            adOverlayInfoParcel = this.R;
            if (adOverlayInfoParcel.Z != 5) {
            }
        } else {
            throw new vi4("Invalid activity, no window available.");
        }
    }

    @Override // defpackage.po2
    public final void u() {
        zp5 zp5Var;
        AdOverlayInfoParcel adOverlayInfoParcel = this.R;
        if (adOverlayInfoParcel == null || (zp5Var = adOverlayInfoParcel.R) == null) {
            return;
        }
        zp5Var.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u4(Configuration configuration) {
        boolean z;
        tl5 tl5Var;
        int i;
        tl5 tl5Var2;
        AdOverlayInfoParcel adOverlayInfoParcel = this.R;
        boolean z2 = false;
        boolean z3 = true;
        if (adOverlayInfoParcel != null && (tl5Var2 = adOverlayInfoParcel.d0) != null && tl5Var2.Q) {
            z = true;
        } else {
            z = false;
        }
        boolean e = jv5.A.e.e(this.Q, configuration);
        if ((!this.Z || z) && !e) {
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.R;
            if (adOverlayInfoParcel2 != null && (tl5Var = adOverlayInfoParcel2.d0) != null && tl5Var.V) {
                z2 = true;
                Window window = this.Q.getWindow();
                if (!((Boolean) w82.d.c.a(x92.Q0)).booleanValue()) {
                    View decorView = window.getDecorView();
                    if (z2) {
                        if (z3) {
                            i = 5894;
                        } else {
                            i = 5380;
                        }
                    } else {
                        i = 256;
                    }
                    decorView.setSystemUiVisibility(i);
                    return;
                } else if (z2) {
                    window.addFlags(1024);
                    window.clearFlags(2048);
                    if (z3) {
                        window.getDecorView().setSystemUiVisibility(4098);
                        return;
                    }
                    return;
                } else {
                    window.addFlags(2048);
                    window.clearFlags(1024);
                    return;
                }
            }
            z2 = true;
        }
        z3 = false;
        Window window2 = this.Q.getWindow();
        if (!((Boolean) w82.d.c.a(x92.Q0)).booleanValue()) {
        }
    }

    public final void v4(boolean z) {
        boolean z2;
        int i;
        int i2;
        m92 m92Var = x92.b4;
        w82 w82Var = w82.d;
        int intValue = ((Integer) w82Var.c.a(m92Var)).intValue();
        int i3 = 0;
        if (!((Boolean) w82Var.c.a(x92.M0)).booleanValue() && !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        as5 as5Var = new as5();
        as5Var.d = 50;
        if (true != z2) {
            i = 0;
        } else {
            i = intValue;
        }
        as5Var.a = i;
        if (true != z2) {
            i3 = intValue;
        }
        as5Var.b = i3;
        as5Var.c = intValue;
        this.U = new zs5(this.Q, as5Var, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        if (true != z2) {
            i2 = 9;
        } else {
            i2 = 11;
        }
        layoutParams.addRule(i2);
        w4(z, this.R.V);
        this.a0.addView(this.U, layoutParams);
    }

    public final void w4(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        AdOverlayInfoParcel adOverlayInfoParcel;
        tl5 tl5Var;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        tl5 tl5Var2;
        l92 l92Var = x92.K0;
        w82 w82Var = w82.d;
        boolean z5 = true;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue() && (adOverlayInfoParcel2 = this.R) != null && (tl5Var2 = adOverlayInfoParcel2.d0) != null && tl5Var2.W) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (((Boolean) w82Var.c.a(x92.L0)).booleanValue() && (adOverlayInfoParcel = this.R) != null && (tl5Var = adOverlayInfoParcel.d0) != null && tl5Var.X) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z && z2 && z3 && !z4) {
            y03 y03Var = this.S;
            try {
                JSONObject put = new JSONObject().put("message", "Custom close has been disabled for interstitial ads in this ad slot.").put("action", "useCustomClose");
                if (y03Var != null) {
                    y03Var.p("onError", put);
                }
            } catch (JSONException e) {
                sv2.e("Error occurred while dispatching error event.", e);
            }
        }
        zs5 zs5Var = this.U;
        if (zs5Var != null) {
            if (!z4 && (!z2 || z3)) {
                z5 = false;
            }
            if (z5) {
                zs5Var.P.setVisibility(8);
                if (((Long) w82Var.c.a(x92.O0)).longValue() > 0) {
                    zs5Var.P.animate().cancel();
                    zs5Var.P.clearAnimation();
                    return;
                }
                return;
            }
            zs5Var.P.setVisibility(0);
        }
    }

    @Override // defpackage.po2
    public final boolean x() {
        this.j0 = 1;
        if (this.S == null) {
            return true;
        }
        if (((Boolean) w82.d.c.a(x92.x7)).booleanValue() && this.S.canGoBack()) {
            this.S.goBack();
            return false;
        }
        boolean y0 = this.S.y0();
        if (!y0) {
            this.S.a("onbackblocked", Collections.emptyMap());
        }
        return y0;
    }

    public final void x4(int i) {
        int i2 = this.Q.getApplicationInfo().targetSdkVersion;
        m92 m92Var = x92.U4;
        w82 w82Var = w82.d;
        if (i2 >= ((Integer) w82Var.c.a(m92Var)).intValue()) {
            if (this.Q.getApplicationInfo().targetSdkVersion <= ((Integer) w82Var.c.a(x92.V4)).intValue()) {
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= ((Integer) w82Var.c.a(x92.W4)).intValue()) {
                    if (i3 <= ((Integer) w82Var.c.a(x92.X4)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.Q.setRequestedOrientation(i);
        } catch (Throwable th) {
            jv5.A.g.e("AdOverlay.setRequestedOrientation", th);
        }
    }

    @Override // defpackage.po2
    public final void z0(int i, String[] strArr, int[] iArr) {
        if (i == 12345) {
            Activity activity = this.Q;
            if (activity != null) {
                AdOverlayInfoParcel adOverlayInfoParcel = this.R;
                co2 co2Var = adOverlayInfoParcel.j0;
                if (co2Var != null) {
                    r04 r04Var = adOverlayInfoParcel.g0;
                    if (r04Var != null) {
                        zr3 zr3Var = adOverlayInfoParcel.h0;
                        if (zr3Var != null) {
                            wl4 wl4Var = adOverlayInfoParcel.i0;
                            if (wl4Var != null) {
                                String str = adOverlayInfoParcel.f0;
                                if (str != null) {
                                    String str2 = adOverlayInfoParcel.k0;
                                    if (str2 != null) {
                                        m04 m04Var = new m04(activity, this, co2Var, r04Var, zr3Var, wl4Var, str, str2);
                                        for (int i2 = 0; i2 < strArr.length; i2++) {
                                            if (strArr[i2].equals("android.permission.POST_NOTIFICATIONS")) {
                                                Activity activity2 = m04Var.a;
                                                zr3 zr3Var2 = m04Var.e;
                                                r04 r04Var2 = m04Var.d;
                                                wl4 wl4Var2 = m04Var.f;
                                                co2 co2Var2 = m04Var.c;
                                                String str3 = m04Var.g;
                                                String str4 = m04Var.h;
                                                qn5 qn5Var = m04Var.b;
                                                HashMap hashMap = new HashMap();
                                                if (iArr[i2] == 0) {
                                                    hashMap.put("dialog_action", "confirm");
                                                    a14.x4(activity2, co2Var2, r04Var2, zr3Var2, wl4Var2, str3, str4);
                                                    a14.y4(activity2, qn5Var);
                                                } else {
                                                    hashMap.put("dialog_action", "dismiss");
                                                    if (qn5Var != null) {
                                                        qn5Var.c();
                                                    }
                                                }
                                                a14.u4(activity2, zr3Var2, wl4Var2, r04Var2, str3, "asnpdc", hashMap);
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                    throw new NullPointerException("Null uri");
                                }
                                throw new NullPointerException("Null gwsQueryId");
                            }
                            throw new NullPointerException("Null logger");
                        }
                        throw new NullPointerException("Null csiReporter");
                    }
                    throw new NullPointerException("Null databaseManager");
                }
                throw new NullPointerException("Null workManagerUtil");
            }
            throw new NullPointerException("Null activity");
        }
    }
}