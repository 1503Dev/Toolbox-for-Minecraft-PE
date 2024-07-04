package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: pq3  reason: default package */
public final class pq3 {
    public final ld3 a;
    public final ni3 b;
    public final he3 c;
    public final pe3 d;
    public final xe3 e;
    public final vf3 f;
    public final Executor g;
    public final ji3 h;
    public final j73 i;
    public final o82 j;
    public final ys2 k;
    public final rz1 l;
    public final pf3 m;
    public final r04 n;
    public final gn4 o;
    public final zr3 p;
    public final wl4 q;

    public pq3(ld3 ld3Var, he3 he3Var, pe3 pe3Var, xe3 xe3Var, vf3 vf3Var, Executor executor, ji3 ji3Var, j73 j73Var, o82 o82Var, ys2 ys2Var, rz1 rz1Var, pf3 pf3Var, r04 r04Var, gn4 gn4Var, zr3 zr3Var, wl4 wl4Var, ni3 ni3Var) {
        this.a = ld3Var;
        this.c = he3Var;
        this.d = pe3Var;
        this.e = xe3Var;
        this.f = vf3Var;
        this.g = executor;
        this.h = ji3Var;
        this.i = j73Var;
        this.j = o82Var;
        this.k = ys2Var;
        this.l = rz1Var;
        this.m = pf3Var;
        this.n = r04Var;
        this.o = gn4Var;
        this.p = zr3Var;
        this.q = wl4Var;
        this.b = ni3Var;
    }

    public static final bx2 b(l13 l13Var, String str, String str2) {
        bx2 bx2Var = new bx2();
        l13Var.R().V = new db3(1, bx2Var);
        l13Var.X(str, str2);
        return bx2Var;
    }

    public final void a(final l13 l13Var, boolean z, og2 og2Var) {
        nz1 nz1Var;
        l13Var.R().a(new vj1() { // from class: fq3
            @Override // defpackage.vj1
            public final void J() {
                pq3.this.a.J();
            }
        }, this.d, this.e, new ef2() { // from class: gq3
            @Override // defpackage.ef2
            public final void t(String str, String str2) {
                pq3.this.f.t(str, str2);
            }
        }, new b16() { // from class: hq3
            @Override // defpackage.b16
            public final void h() {
                pq3.this.c.c();
            }
        }, z, og2Var, this.j, new nj2(4, this), this.k, this.n, this.o, this.p, this.q, null, this.b, null, null);
        l13Var.setOnTouchListener(new View.OnTouchListener() { // from class: iq3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                pq3.this.j.b = true;
                if (view != null) {
                    view.performClick();
                    return false;
                }
                return false;
            }
        });
        l13Var.setOnClickListener(new View.OnClickListener() { // from class: jq3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pq3.this.j.b = true;
            }
        });
        if (((Boolean) w82.d.c.a(x92.Z1)).booleanValue() && (nz1Var = this.l.b) != null) {
            nz1Var.c(l13Var);
        }
        this.h.Q0(l13Var, this.g);
        this.h.Q0(new s22() { // from class: nq3
            @Override // defpackage.s22
            public final void h0(r22 r22Var) {
                g13 R = l13Var.R();
                Rect rect = r22Var.d;
                int i = rect.left;
                int i2 = rect.top;
                xn2 xn2Var = R.g0;
                if (xn2Var != null) {
                    xn2Var.g(i, i2);
                }
                tn2 tn2Var = R.i0;
                if (tn2Var != null) {
                    synchronized (tn2Var.Z) {
                        tn2Var.T = i;
                        tn2Var.U = i2;
                    }
                }
            }
        }, this.g);
        this.h.S0(l13Var);
        l13Var.D0("/trackActiveViewUnit", new mg2() { // from class: oq3
            @Override // defpackage.mg2
            public final void b(Object obj, Map map) {
                pq3 pq3Var = pq3.this;
                y03 y03Var = l13Var;
                y03 y03Var2 = (y03) obj;
                j73 j73Var = pq3Var.i;
                synchronized (j73Var) {
                    j73Var.R.add(y03Var);
                    e73 e73Var = j73Var.P;
                    y03Var.D0("/updateActiveView", e73Var.e);
                    y03Var.D0("/untrackActiveViewUnit", e73Var.f);
                }
            }
        });
        j73 j73Var = this.i;
        j73Var.getClass();
        j73Var.Y = new WeakReference(l13Var);
    }
}