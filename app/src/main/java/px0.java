package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import defpackage.iw;
import defpackage.xc0;
import io.mrarm.mctoolbox.bridge.b;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* renamed from: px0  reason: default package */
public class px0 extends xc0 implements jw {
    public static final lj t;
    public static final lj u;
    public final ya0 k;
    public ya0 l;
    public List<iw> m;
    public final ValueAnimator n;
    public boolean o;
    public Object p;
    public final a q;
    public final ox0 r;
    public final xs0 s;

    /* renamed from: px0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends xc0.a {
        public px0 b;

        public a(px0 px0Var) {
            super(px0Var);
            this.b = px0Var;
        }

        @Override // defpackage.lw
        public final ya0 a() {
            return this.b.k;
        }

        @Override // defpackage.lw
        public final void d() {
            px0 px0Var = this.b;
            px0Var.m(!px0Var.k.Q);
        }
    }

    static {
        int i = l41.b;
        lj ljVar = new lj();
        ljVar.d = 2131492940;
        ljVar.e = 35;
        t = ljVar;
        lj ljVar2 = new lj();
        ljVar2.d = 2131492941;
        ljVar2.e = 35;
        u = ljVar2;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [ox0] */
    public px0(io.mrarm.mctoolbox.bridge.a aVar) {
        super(aVar);
        ya0 ya0Var = new ya0();
        this.k = ya0Var;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.n = valueAnimator;
        this.o = true;
        this.p = Boolean.TRUE;
        this.q = new a(this);
        this.r = new iw.a() { // from class: ox0
            @Override // defpackage.iw.a
            public final void a(iw iwVar) {
                Iterator it = px0.this.j.iterator();
                while (it.hasNext()) {
                    ((iw.a) it.next()).a(iwVar);
                }
            }
        };
        this.s = new xs0(new xd(this));
        valueAnimator.setFloatValues(0.0f, 0.0f);
        ya0Var.a(new xs0(new yd(this)));
    }

    @Override // defpackage.xc0, defpackage.iw
    public final void c(rz0 rz0Var) {
        if (this.o) {
            ((List) rz0Var.a).add(this.q);
        }
    }

    @Override // defpackage.jw
    public final void d(List<iw> list) {
        List<iw> list2 = this.m;
        if (list2 != null) {
            for (iw iwVar : list2) {
                iwVar.a(this.r);
            }
        }
        this.m = list;
        if (list != null) {
            for (iw iwVar2 : list) {
                iwVar2.b(this.r);
            }
        }
    }

    @Override // defpackage.iw
    public final void e(oj ojVar, boolean z) {
        j9 k = k();
        if (z) {
            k.b = this;
        }
        ojVar.o(k);
        List<iw> list = this.m;
        if (list != null && list.size() > 0) {
            oj ojVar2 = new oj();
            for (iw iwVar : this.m) {
                iwVar.e(ojVar2, false);
            }
            if (z) {
                ojVar2.b = this;
            }
            ojVar.o(new af(ojVar2, this.l));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (((io.mrarm.mctoolbox.bridge.b) r4.a).p(r4.f) == ((java.lang.Integer) r4.p).intValue()) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (((io.mrarm.mctoolbox.bridge.b) r4.a).j(r4.f) == ((java.lang.Boolean) r4.p).booleanValue()) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        m(r2);
     */
    @Override // defpackage.xc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        Object obj = this.p;
        boolean z = true;
        if (obj instanceof Boolean) {
        } else if (obj instanceof Integer) {
        }
    }

    @Override // defpackage.xc0
    public final void i(Context context, zz zzVar) {
        Object valueOf;
        super.i(context, zzVar);
        if (zzVar.s("value")) {
            wz r = zzVar.r("value");
            r.getClass();
            if (r instanceof b00) {
                b00 p = zzVar.r("value").p();
                Serializable serializable = p.P;
                if (serializable instanceof Number) {
                    try {
                        if (!p.q().contains(".")) {
                            this.p = Integer.valueOf(p.m());
                        } else {
                            throw new NumberFormatException();
                        }
                    } catch (NumberFormatException unused) {
                        valueOf = Float.valueOf(p.h());
                    }
                } else if (serializable instanceof Boolean) {
                    valueOf = Boolean.valueOf(p.g());
                    this.p = valueOf;
                }
            }
        }
        if (zzVar.s("has_shortcut")) {
            this.o = zzVar.r("has_shortcut").g();
        }
    }

    @Override // defpackage.xc0
    public final void j(String str) {
        ya0 ya0Var;
        super.j(str);
        ya0 ya0Var2 = this.l;
        if (ya0Var2 != null) {
            ya0Var2.z(this.s);
        }
        if (((b) this.a).f.contains(this.f)) {
            ya0Var = jb0.a(new vd(2, this), this.k, ((b) this.a).c);
        } else {
            ya0Var = this.k;
        }
        this.l = ya0Var;
        ya0Var.a(this.s);
        this.s.g(0, null);
    }

    public j9 k() {
        io.mrarm.mctoolbox.bridge.a aVar = this.a;
        if (((b) aVar).f.contains(this.f)) {
            oj ojVar = new oj();
            ojVar.o(new af(new ct0(this, t), ((b) this.a).c));
            ojVar.o(new af(new ct0(this, u), ((b) this.a).d));
            return ojVar;
        }
        return new ct0(this, t);
    }

    public final boolean l() {
        Object obj = this.p;
        if (obj instanceof Boolean) {
            if (((b) this.a).l(this.f) == ((Boolean) this.p).booleanValue()) {
                return true;
            }
            return false;
        } else if (!(obj instanceof Integer)) {
            return false;
        } else {
            if (((b) this.a).p(this.f) == ((Integer) this.p).intValue()) {
                return true;
            }
            return false;
        }
    }

    public final void m(boolean z) {
        ya0 ya0Var = this.k;
        if (z != ya0Var.Q) {
            ya0Var.H(z);
        }
    }
}