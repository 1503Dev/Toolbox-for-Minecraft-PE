package defpackage;

import android.view.MotionEvent;
import defpackage.ql0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: wq1  reason: default package */
public final class wq1 implements wy4, mc2, jy4, v64, pg {
    public final Object P;
    public final Object Q;

    public /* synthetic */ wq1(a73 a73Var, String str) {
        this.Q = a73Var;
        this.P = str;
    }

    public /* synthetic */ wq1(ap3 ap3Var) {
        this.Q = ap3Var;
        this.P = "_videoMediaView";
    }

    public /* synthetic */ wq1(Object obj, Object obj2) {
        this.P = obj;
        this.Q = obj2;
    }

    public /* synthetic */ wq1(UUID uuid, byte[] bArr) {
        this.P = uuid;
        this.Q = bArr;
    }

    @Override // defpackage.jy4
    public final dz4 a() {
        dz4 G;
        sp2 sp2Var = (sp2) this.Q;
        lx3 lx3Var = ((xw3) this.P).c;
        long longValue = ((Long) w82.d.c.a(x92.V8)).longValue();
        synchronized (lx3Var) {
            if (lx3Var.b) {
                G = zw4.G(lx3Var.a, longValue, TimeUnit.MILLISECONDS, lx3Var.g);
            } else {
                lx3Var.b = true;
                lx3Var.h = sp2Var;
                synchronized (lx3Var) {
                    if (lx3Var.d == null) {
                        lx3Var.d = new rp2(lx3Var.e, lx3Var.f, lx3Var, lx3Var);
                    }
                    lx3Var.d.n();
                    G = zw4.G(lx3Var.a, longValue, TimeUnit.MILLISECONDS, lx3Var.g);
                    G.b(new rh2(2, lx3Var), zw2.f);
                }
            }
        }
        return G;
    }

    @Override // defpackage.mc2
    /* renamed from: a  reason: collision with other method in class */
    public final JSONObject mo6a() {
        return null;
    }

    @Override // defpackage.pg
    public final Object b(Object obj) {
        ql0 ql0Var = (ql0) obj;
        xt xtVar = (xt) this.P;
        ql0.a aVar = ql0Var.P;
        if (aVar == null) {
            bb y = ql0Var.y();
            e50 t = ql0Var.t();
            Charset charset = StandardCharsets.UTF_8;
            if (t != null) {
                try {
                    String str = t.c;
                    if (str != null) {
                        charset = Charset.forName(str);
                    }
                } catch (IllegalArgumentException unused) {
                }
            }
            aVar = new ql0.a(y, charset);
            ql0Var.P = aVar;
        }
        xtVar.getClass();
        c00 c00Var = new c00(aVar);
        c00Var.Q = xtVar.j;
        try {
            Object a = ((l11) this.Q).a(c00Var);
            if (c00Var.U() == 10) {
                return a;
            }
            throw new xz("JSON document was not fully consumed.");
        } finally {
            ql0Var.close();
        }
    }

    @Override // defpackage.mc2
    public final JSONObject c() {
        return null;
    }

    @Override // defpackage.mc2
    public final void d() {
        jl3 jl3Var = ((ap3) this.Q).S;
        if (jl3Var != null) {
            String str = (String) this.P;
            synchronized (jl3Var) {
                jl3Var.k.I(str);
            }
        }
    }

    @Override // defpackage.v64
    /* renamed from: e */
    public final void mo5e(Object obj) {
        jo5 jo5Var = (jo5) obj;
    }

    @Override // defpackage.wy4
    public final /* bridge */ /* synthetic */ void f(Object obj) {
        String str = (String) obj;
        a73 a73Var = (a73) this.Q;
        fj4 fj4Var = a73Var.W;
        bn4 bn4Var = a73Var.V;
        hi4 hi4Var = a73Var.T;
        yh4 yh4Var = a73Var.U;
        fj4Var.a(bn4Var.b(hi4Var, yh4Var, false, (String) this.P, str, yh4Var.d));
    }

    @Override // defpackage.mc2
    public final void g(MotionEvent motionEvent) {
    }

    @Override // defpackage.wy4
    public final void h(Throwable th) {
        a73 a73Var = (a73) this.Q;
        fj4 fj4Var = a73Var.W;
        bn4 bn4Var = a73Var.V;
        hi4 hi4Var = a73Var.T;
        yh4 yh4Var = a73Var.U;
        fj4Var.a(bn4Var.b(hi4Var, yh4Var, false, (String) this.P, null, yh4Var.d));
    }
}