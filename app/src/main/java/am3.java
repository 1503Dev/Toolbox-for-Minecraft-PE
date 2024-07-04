package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: am3  reason: default package */
public final class am3 extends dd2 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ym3 {
    public static final nw4 e0;
    public final String Q;
    public FrameLayout S;
    public FrameLayout T;
    public final yw2 U;
    public View V;
    public jl3 X;
    public t22 Y;
    public yc2 a0;
    public boolean b0;
    public GestureDetector d0;
    public HashMap R = new HashMap();
    public hw Z = null;
    public boolean c0 = false;
    public final int W = 231004000;

    static {
        lv4 lv4Var = nv4.Q;
        Object[] objArr = {"2011", "1009", "3010"};
        lw4.a(3, objArr);
        e0 = nv4.s(3, objArr);
    }

    public am3(FrameLayout frameLayout, FrameLayout frameLayout2) {
        String str;
        this.S = frameLayout;
        this.T = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.Q = str;
        gx2 gx2Var = jv5.A.z;
        hx2 hx2Var = new hx2(frameLayout, this);
        ViewTreeObserver f = hx2Var.f();
        if (f != null) {
            hx2Var.n(f);
        }
        ix2 ix2Var = new ix2(frameLayout, this);
        ViewTreeObserver f2 = ix2Var.f();
        if (f2 != null) {
            ix2Var.n(f2);
        }
        this.U = zw2.e;
        this.Y = new t22(this.S.getContext(), this.S);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    @Override // defpackage.ed2
    public final synchronized void B0(va0 va0Var, int i) {
    }

    @Override // defpackage.ed2
    public final synchronized void K0(hw hwVar, String str) {
        c0(str, (View) va0.c0(hwVar));
    }

    @Override // defpackage.ed2
    public final synchronized void N3(hw hwVar) {
        if (this.c0) {
            return;
        }
        this.Z = hwVar;
    }

    public final synchronized void O0(String str) {
        DisplayMetrics displayMetrics;
        View frameLayout = new FrameLayout(this.T.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = this.T.getContext();
        frameLayout.setClickable(false);
        frameLayout.setFocusable(false);
        if (!TextUtils.isEmpty(str)) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            Resources resources = context.getResources();
            if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                try {
                    byte[] decode = Base64.decode(str, 0);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(decode, 0, decode.length));
                    bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                    Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                    bitmapDrawable.setTileModeXY(tileMode, tileMode);
                    frameLayout.setBackground(bitmapDrawable);
                } catch (IllegalArgumentException e) {
                    sv2.h("Encountered invalid base64 watermark.", e);
                }
            }
        }
        this.T.addView(frameLayout);
    }

    @Override // defpackage.ed2
    public final synchronized void X1(hw hwVar) {
        jl3 jl3Var = this.X;
        View view = (View) va0.c0(hwVar);
        synchronized (jl3Var) {
            jl3Var.k.n(view);
        }
    }

    @Override // defpackage.ed2
    public final void b1(hw hwVar) {
        onTouch(this.S, (MotionEvent) va0.c0(hwVar));
    }

    @Override // defpackage.ym3
    public final synchronized View b2(String str) {
        if (this.c0) {
            return null;
        }
        WeakReference weakReference = (WeakReference) this.R.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // defpackage.ym3
    public final synchronized void c0(String str, View view) {
        if (this.c0) {
            return;
        }
        if (view == null) {
            this.R.remove(str);
            return;
        }
        this.R.put(str, new WeakReference(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            if (gt2.h(this.W)) {
                view.setOnTouchListener(this);
            }
            view.setClickable(true);
            view.setOnClickListener(this);
        }
    }

    @Override // defpackage.ed2
    public final synchronized void d() {
        if (this.c0) {
            return;
        }
        jl3 jl3Var = this.X;
        if (jl3Var != null) {
            jl3Var.g(this);
            this.X = null;
        }
        this.R.clear();
        this.S.removeAllViews();
        this.T.removeAllViews();
        this.R = null;
        this.S = null;
        this.T = null;
        this.V = null;
        this.Y = null;
        this.c0 = true;
    }

    @Override // defpackage.ym3
    public final /* synthetic */ View e() {
        return this.S;
    }

    @Override // defpackage.ym3
    public final FrameLayout f() {
        return this.T;
    }

    @Override // defpackage.ym3
    public final t22 g() {
        return this.Y;
    }

    @Override // defpackage.ym3
    public final hw j() {
        return this.Z;
    }

    @Override // defpackage.ym3
    public final synchronized Map k() {
        return null;
    }

    @Override // defpackage.ym3
    public final synchronized String l() {
        return this.Q;
    }

    @Override // defpackage.ym3
    public final synchronized JSONObject m() {
        JSONObject s;
        jl3 jl3Var = this.X;
        if (jl3Var != null) {
            FrameLayout frameLayout = this.S;
            Map n = n();
            Map o = o();
            synchronized (jl3Var) {
                s = jl3Var.k.s(frameLayout, n, o, jl3Var.k());
            }
            return s;
        }
        return null;
    }

    @Override // defpackage.ym3
    public final synchronized Map n() {
        return this.R;
    }

    @Override // defpackage.ym3
    public final synchronized Map o() {
        return this.R;
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        boolean Q;
        jl3 jl3Var = this.X;
        if (jl3Var != null) {
            synchronized (jl3Var) {
                Q = jl3Var.k.Q();
            }
            if (Q) {
                jl3 jl3Var2 = this.X;
                synchronized (jl3Var2) {
                    jl3Var2.k.f();
                }
                this.X.c(view, this.S, n(), o(), false);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        jl3 jl3Var = this.X;
        if (jl3Var != null) {
            FrameLayout frameLayout = this.S;
            jl3Var.b(frameLayout, n(), o(), jl3.h(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        jl3 jl3Var = this.X;
        if (jl3Var != null) {
            FrameLayout frameLayout = this.S;
            jl3Var.b(frameLayout, n(), o(), jl3.h(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        int a;
        jl3 jl3Var = this.X;
        if (jl3Var == null) {
            return false;
        }
        FrameLayout frameLayout = this.S;
        synchronized (jl3Var) {
            jl3Var.k.o(motionEvent, frameLayout);
        }
        if (((Boolean) w82.d.c.a(x92.T8)).booleanValue() && this.d0 != null) {
            jl3 jl3Var2 = this.X;
            synchronized (jl3Var2) {
                a = jl3Var2.k.a();
            }
            if (a != 0) {
                this.d0.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // defpackage.ed2
    public final synchronized void p2(yc2 yc2Var) {
        if (this.c0) {
            return;
        }
        this.b0 = true;
        this.a0 = yc2Var;
        jl3 jl3Var = this.X;
        if (jl3Var != null) {
            ll3 ll3Var = jl3Var.B;
            synchronized (ll3Var) {
                ll3Var.a = yc2Var;
            }
        }
    }

    public final synchronized void r() {
        int a;
        if (((Boolean) w82.d.c.a(x92.T8)).booleanValue()) {
            jl3 jl3Var = this.X;
            synchronized (jl3Var) {
                a = jl3Var.k.a();
            }
            if (a != 0) {
                this.d0 = new GestureDetector(this.S.getContext(), new em3(this.X, this));
            }
        }
    }

    @Override // defpackage.ym3
    public final synchronized JSONObject t() {
        JSONObject c;
        jl3 jl3Var = this.X;
        if (jl3Var != null) {
            FrameLayout frameLayout = this.S;
            Map n = n();
            Map o = o();
            synchronized (jl3Var) {
                c = jl3Var.k.c(frameLayout, n, o, jl3Var.k());
            }
            return c;
        }
        return null;
    }

    @Override // defpackage.ed2
    public final synchronized hw z(String str) {
        return new va0(b2(str));
    }

    @Override // defpackage.ed2
    public final synchronized void z2(hw hwVar) {
        if (this.c0) {
            return;
        }
        Object c0 = va0.c0(hwVar);
        if (!(c0 instanceof jl3)) {
            sv2.g("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        jl3 jl3Var = this.X;
        if (jl3Var != null) {
            jl3Var.g(this);
        }
        synchronized (this) {
            this.U.execute(new am1(3, this));
            jl3 jl3Var2 = (jl3) c0;
            this.X = jl3Var2;
            jl3Var2.f(this);
            this.X.e(this.S);
            this.X.r(this.T);
            if (this.b0) {
                ll3 ll3Var = this.X.B;
                yc2 yc2Var = this.a0;
                synchronized (ll3Var) {
                    ll3Var.a = yc2Var;
                }
            }
            if (((Boolean) w82.d.c.a(x92.k3)).booleanValue() && !TextUtils.isEmpty(this.X.m.b())) {
                O0(this.X.m.b());
            }
            r();
        }
    }
}