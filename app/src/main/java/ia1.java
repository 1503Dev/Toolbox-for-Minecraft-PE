package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.adcolony.sdk.AdColonyAdViewActivity;
import com.adcolony.sdk.AdColonyInterstitialActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: ia1  reason: default package */
public class ia1 extends Activity {
    public ob1 P;
    public int Q = -1;
    public int R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;

    /* renamed from: ia1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements zc1 {
        public a() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            ia1.this.b(rc1Var);
        }
    }

    public final void a() {
        Rect g;
        ad1 h = ga1.h();
        if (this.P == null) {
            this.P = h.l;
        }
        ob1 ob1Var = this.P;
        if (ob1Var == null) {
            return;
        }
        ob1Var.o0 = false;
        if (eg1.y()) {
            this.P.o0 = true;
        }
        if (this.V) {
            h.l().getClass();
            g = he1.h();
        } else {
            h.l().getClass();
            g = he1.g();
        }
        if (g.width() > 0 && g.height() > 0) {
            ic1 ic1Var = new ic1();
            ic1 ic1Var2 = new ic1();
            h.l().getClass();
            float f = he1.f();
            eb1.l((int) (g.width() / f), ic1Var2, "width");
            eb1.l((int) (g.height() / f), ic1Var2, "height");
            eb1.l(eg1.s(eg1.w()), ic1Var2, "app_orientation");
            eb1.l(0, ic1Var2, "x");
            eb1.l(0, ic1Var2, "y");
            eb1.j(ic1Var2, "ad_session_id", this.P.d0);
            eb1.l(g.width(), ic1Var, "screen_width");
            eb1.l(g.height(), ic1Var, "screen_height");
            eb1.j(ic1Var, "ad_session_id", this.P.d0);
            eb1.l(this.P.b0, ic1Var, "id");
            this.P.setLayoutParams(new FrameLayout.LayoutParams(g.width(), g.height()));
            this.P.W = g.width();
            this.P.a0 = g.height();
            new rc1(this.P.c0, ic1Var2, "MRAID.on_size_change").b();
            new rc1(this.P.c0, ic1Var, "AdContainer.on_orientation_change").b();
        }
    }

    public void b(rc1 rc1Var) {
        int l = rc1Var.b.l("status");
        if ((l != 5 && l != 0 && l != 6 && l != 1) || this.S) {
            return;
        }
        ad1 h = ga1.h();
        if (h.e == null) {
            h.e = new ie1();
        }
        ie1 ie1Var = h.e;
        h.s = rc1Var;
        AlertDialog alertDialog = ie1Var.b;
        if (alertDialog != null) {
            alertDialog.dismiss();
            ie1Var.b = null;
        }
        if (!this.U) {
            finish();
        }
        this.S = true;
        ((ViewGroup) getWindow().getDecorView()).removeAllViews();
        h.A = false;
        ic1 ic1Var = new ic1();
        eb1.j(ic1Var, "id", this.P.d0);
        new rc1(this.P.c0, ic1Var, "AdSession.on_close").b();
        h.l = null;
        h.o = null;
        h.n = null;
        ga1.h().k().c.remove(this.P.d0);
    }

    public final void c(boolean z) {
        boolean z2;
        Iterator<Map.Entry<Integer, v91>> it = this.P.P.entrySet().iterator();
        while (it.hasNext() && !isFinishing()) {
            v91 value = it.next().getValue();
            if (!value.k0 && value.C0.isPlaying()) {
                value.c();
            }
        }
        i2 i2Var = ga1.h().o;
        if (i2Var != null) {
            zd1 zd1Var = i2Var.d;
            if (zd1Var != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && zd1Var.a != null && z && this.W) {
                zd1Var.c("pause", 0.0f);
            }
        }
    }

    public final void d(boolean z) {
        boolean z2;
        for (Map.Entry<Integer, v91> entry : this.P.P.entrySet()) {
            v91 value = entry.getValue();
            if (!value.k0 && !value.C0.isPlaying()) {
                ad1 h = ga1.h();
                if (h.e == null) {
                    h.e = new ie1();
                }
                if (!h.e.c) {
                    value.d();
                }
            }
        }
        i2 i2Var = ga1.h().o;
        if (i2Var != null) {
            zd1 zd1Var = i2Var.d;
            if (zd1Var != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && zd1Var.a != null) {
                if ((!z || !this.W) && this.X) {
                    zd1Var.c("resume", 0.0f);
                }
            }
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        ic1 ic1Var = new ic1();
        eb1.j(ic1Var, "id", this.P.d0);
        new rc1(this.P.c0, ic1Var, "AdSession.on_back_button").b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this instanceof AdColonyInterstitialActivity) {
            a();
        } else {
            ((AdColonyAdViewActivity) this).Y.a();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (ga1.j() && ga1.h().l != null) {
            ad1 h = ga1.h();
            this.U = false;
            ob1 ob1Var = h.l;
            this.P = ob1Var;
            ob1Var.o0 = false;
            if (eg1.y()) {
                this.P.o0 = true;
            }
            this.P.getClass();
            this.R = this.P.c0;
            boolean j = h.p().b.j("multi_window_enabled");
            this.V = j;
            if (j) {
                getWindow().addFlags(2048);
                getWindow().clearFlags(1024);
            } else {
                getWindow().addFlags(1024);
                getWindow().clearFlags(2048);
            }
            requestWindowFeature(1);
            getWindow().getDecorView().setBackgroundColor(-16777216);
            if (h.p().b.j("keep_screen_on")) {
                getWindow().addFlags(128);
            }
            ViewParent parent = this.P.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(this.P);
            }
            setContentView(this.P);
            ArrayList<zc1> arrayList = this.P.k0;
            a aVar = new a();
            ga1.g("AdSession.finish_fullscreen_ad", aVar);
            arrayList.add(aVar);
            this.P.l0.add("AdSession.finish_fullscreen_ad");
            int i2 = this.Q;
            if (i2 != 0) {
                if (i2 != 1) {
                    i = 4;
                } else {
                    i = 6;
                }
            } else {
                i = 7;
            }
            setRequestedOrientation(i);
            this.Q = i2;
            if (!this.P.n0) {
                ic1 ic1Var = new ic1();
                eb1.j(ic1Var, "id", this.P.d0);
                eb1.l(this.P.W, ic1Var, "screen_width");
                eb1.l(this.P.a0, ic1Var, "screen_height");
                new rc1(this.P.c0, ic1Var, "AdSession.on_fullscreen_ad_started").b();
                this.P.n0 = true;
                return;
            }
            a();
            return;
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (ga1.j() && this.P != null && !this.S) {
            if ((Build.VERSION.SDK_INT < 24 || !eg1.y()) && !this.P.o0) {
                ic1 ic1Var = new ic1();
                eb1.j(ic1Var, "id", this.P.d0);
                new rc1(this.P.c0, ic1Var, "AdSession.on_error").b();
                this.U = true;
            }
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        c(this.T);
        this.T = false;
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        a();
        d(this.T);
        this.T = true;
        this.X = true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        if (z && this.T) {
            ga1.h().q().b(true);
            d(this.T);
            this.W = true;
        } else if (z || !this.T) {
        } else {
            ga1.h().q().a(true);
            c(this.T);
            this.W = false;
        }
    }
}