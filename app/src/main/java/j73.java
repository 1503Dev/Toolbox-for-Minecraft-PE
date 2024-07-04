package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: j73  reason: default package */
public final class j73 implements s22, be3, zp5, ae3 {
    public final e73 P;
    public final g73 Q;
    public final mk2 S;
    public final Executor T;
    public final kd U;
    public final HashSet R = new HashSet();
    public final AtomicBoolean V = new AtomicBoolean(false);
    public final i73 W = new i73();
    public boolean X = false;
    public WeakReference Y = new WeakReference(this);

    public j73(jk2 jk2Var, g73 g73Var, Executor executor, e73 e73Var, kd kdVar) {
        this.P = e73Var;
        Charset charset = yj2.a;
        jk2Var.a();
        this.S = new mk2(jk2Var.b);
        this.Q = g73Var;
        this.T = executor;
        this.U = kdVar;
    }

    @Override // defpackage.zp5
    public final void A(int i) {
    }

    @Override // defpackage.zp5
    public final synchronized void Z() {
        this.W.b = true;
        f();
    }

    @Override // defpackage.be3
    public final synchronized void a(Context context) {
        this.W.d = "u";
        f();
        h();
        this.X = true;
    }

    @Override // defpackage.zp5
    public final void b() {
    }

    @Override // defpackage.zp5
    public final void c() {
    }

    @Override // defpackage.be3
    public final synchronized void d(Context context) {
        this.W.b = false;
        f();
    }

    @Override // defpackage.zp5
    public final synchronized void d3() {
        this.W.b = false;
        f();
    }

    @Override // defpackage.be3
    public final synchronized void e(Context context) {
        this.W.b = true;
        f();
    }

    public final synchronized void f() {
        if (this.Y.get() != null) {
            if (!this.X && this.V.get()) {
                try {
                    this.W.c = this.U.b();
                    JSONObject f = this.Q.f(this.W);
                    Iterator it = this.R.iterator();
                    while (it.hasNext()) {
                        this.T.execute(new us2(1, (y03) it.next(), f));
                    }
                    mk2 mk2Var = this.S;
                    dz4 dz4Var = mk2Var.a;
                    kk2 kk2Var = new kk2(mk2Var, f);
                    yw2 yw2Var = zw2.f;
                    zw4.J(zw4.F(dz4Var, kk2Var, yw2Var), new jt2("ActiveViewListener.callActiveViewJs", 1), yw2Var);
                    return;
                } catch (Exception e) {
                    vz3.l("Failed to call ActiveViewJS", e);
                    return;
                }
            }
            return;
        }
        synchronized (this) {
            h();
            this.X = true;
        }
    }

    public final void h() {
        Iterator it = this.R.iterator();
        while (it.hasNext()) {
            y03 y03Var = (y03) it.next();
            e73 e73Var = this.P;
            y03Var.C0("/updateActiveView", e73Var.e);
            y03Var.C0("/untrackActiveViewUnit", e73Var.f);
        }
        e73 e73Var2 = this.P;
        jk2 jk2Var = e73Var2.b;
        final c73 c73Var = e73Var2.e;
        dz4 dz4Var = jk2Var.b;
        at4 at4Var = new at4() { // from class: ek2
            @Override // defpackage.at4
            public final Object apply(Object obj) {
                sj2 sj2Var = (sj2) obj;
                sj2Var.n(r1, c73Var);
                return sj2Var;
            }
        };
        yw2 yw2Var = zw2.f;
        jk2Var.b = zw4.E(dz4Var, at4Var, yw2Var);
        jk2 jk2Var2 = e73Var2.b;
        final d73 d73Var = e73Var2.f;
        jk2Var2.b = zw4.E(jk2Var2.b, new at4() { // from class: ek2
            @Override // defpackage.at4
            public final Object apply(Object obj) {
                sj2 sj2Var = (sj2) obj;
                sj2Var.n(r1, d73Var);
                return sj2Var;
            }
        }, yw2Var);
    }

    @Override // defpackage.s22
    public final synchronized void h0(r22 r22Var) {
        i73 i73Var = this.W;
        i73Var.a = r22Var.j;
        i73Var.e = r22Var;
        f();
    }

    @Override // defpackage.ae3
    public final synchronized void n() {
        if (this.V.compareAndSet(false, true)) {
            e73 e73Var = this.P;
            jk2 jk2Var = e73Var.b;
            c73 c73Var = e73Var.e;
            jk2Var.a();
            dz4 dz4Var = jk2Var.b;
            dk2 dk2Var = new dk2(0, "/updateActiveView", c73Var);
            yw2 yw2Var = zw2.f;
            jk2Var.b = zw4.F(dz4Var, dk2Var, yw2Var);
            jk2 jk2Var2 = e73Var.b;
            d73 d73Var = e73Var.f;
            jk2Var2.a();
            jk2Var2.b = zw4.F(jk2Var2.b, new dk2(0, "/untrackActiveViewUnit", d73Var), yw2Var);
            e73Var.d = this;
            f();
        }
    }

    @Override // defpackage.zp5
    public final void n3() {
    }
}