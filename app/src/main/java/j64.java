package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Collections;

/* renamed from: j64  reason: default package */
public final class j64 extends mp2 {
    public final Context P;
    public final gf2 Q;
    public final li4 R;
    public final h83 S;
    public final FrameLayout T;

    public j64(Context context, gf2 gf2Var, li4 li4Var, m83 m83Var) {
        this.P = context;
        this.Q = gf2Var;
        this.R = li4Var;
        this.S = m83Var;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View view = m83Var.j;
        cu5 cu5Var = jv5.A.c;
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(h().R);
        frameLayout.setMinimumWidth(h().U);
        this.T = frameLayout;
    }

    @Override // defpackage.pq2
    public final void A3(i42 i42Var) {
    }

    @Override // defpackage.pq2
    public final void B2(boolean z) {
    }

    @Override // defpackage.pq2
    public final void F() {
        uf0.b("destroy must be called on the main UI thread.");
        ee3 ee3Var = this.S.c;
        ee3Var.getClass();
        ee3Var.R0(new cz1(1, null));
    }

    @Override // defpackage.pq2
    public final void F2(yk3 yk3Var) {
        if (((Boolean) w82.d.c.a(x92.X8)).booleanValue()) {
            t64 t64Var = this.R.c;
            if (t64Var != null) {
                t64Var.R.set(yk3Var);
                return;
            }
            return;
        }
        sv2.f("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // defpackage.pq2
    public final String G() {
        gd3 gd3Var = this.S.f;
        if (gd3Var != null) {
            return gd3Var.P;
        }
        return null;
    }

    @Override // defpackage.pq2
    public final void G0(pn5 pn5Var, xh2 xh2Var) {
    }

    @Override // defpackage.pq2
    public final void G1(q33 q33Var) {
    }

    @Override // defpackage.pq2
    public final void J() {
        uf0.b("destroy must be called on the main UI thread.");
        ee3 ee3Var = this.S.c;
        ee3Var.getClass();
        ee3Var.R0(new dk5(3, null));
    }

    @Override // defpackage.pq2
    public final void J2(by5 by5Var) {
    }

    @Override // defpackage.pq2
    public final void K1(zr5 zr5Var) {
        uf0.b("setAdSize must be called on the main UI thread.");
        h83 h83Var = this.S;
        if (h83Var != null) {
            h83Var.h(this.T, zr5Var);
        }
    }

    @Override // defpackage.pq2
    public final void M1() {
        uf0.b("destroy must be called on the main UI thread.");
        ee3 ee3Var = this.S.c;
        ee3Var.getClass();
        ee3Var.R0(new y54(null));
    }

    @Override // defpackage.pq2
    public final void O() {
    }

    @Override // defpackage.pq2
    public final boolean O3() {
        return false;
    }

    @Override // defpackage.pq2
    public final void Q() {
        this.S.g();
    }

    @Override // defpackage.pq2
    public final void R2(qc2 qc2Var) {
        sv2.f("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // defpackage.pq2
    public final void S0(gr2 gr2Var) {
    }

    @Override // defpackage.pq2
    public final void S3(gf2 gf2Var) {
        sv2.f("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // defpackage.pq2
    public final void U2(sa2 sa2Var) {
        sv2.f("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // defpackage.pq2
    public final void a1(px2 px2Var) {
        t64 t64Var = this.R.c;
        if (t64Var != null) {
            t64Var.a(px2Var);
        }
    }

    @Override // defpackage.pq2
    public final void c3(zq4 zq4Var) {
        sv2.f("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // defpackage.pq2
    public final void d0() {
    }

    @Override // defpackage.pq2
    public final void f0() {
    }

    @Override // defpackage.pq2
    public final gf2 g() {
        return this.Q;
    }

    @Override // defpackage.pq2
    public final zr5 h() {
        uf0.b("getAdSize must be called on the main UI thread.");
        return ea2.y(this.P, Collections.singletonList(this.S.e()));
    }

    @Override // defpackage.pq2
    public final void h4(c13 c13Var) {
        sv2.f("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // defpackage.pq2
    public final Bundle i() {
        sv2.f("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // defpackage.pq2
    public final px2 j() {
        return this.R.n;
    }

    @Override // defpackage.pq2
    public final void j4(boolean z) {
        sv2.f("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // defpackage.pq2
    public final hw k() {
        return new va0(this.T);
    }

    @Override // defpackage.pq2
    public final mq3 l() {
        return this.S.f;
    }

    @Override // defpackage.pq2
    public final boolean l0() {
        return false;
    }

    @Override // defpackage.pq2
    public final cs3 n() {
        return this.S.d();
    }

    @Override // defpackage.pq2
    public final void o0() {
    }

    @Override // defpackage.pq2
    public final void r2() {
    }

    @Override // defpackage.pq2
    public final String s() {
        gd3 gd3Var = this.S.f;
        if (gd3Var != null) {
            return gd3Var.P;
        }
        return null;
    }

    @Override // defpackage.pq2
    public final void s0() {
        sv2.f("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // defpackage.pq2
    public final void t0() {
    }

    @Override // defpackage.pq2
    public final void t1(hw hwVar) {
    }

    @Override // defpackage.pq2
    public final String w() {
        return this.R.f;
    }

    @Override // defpackage.pq2
    public final boolean z1(pn5 pn5Var) {
        sv2.f("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }
}