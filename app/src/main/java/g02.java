package defpackage;

import java.util.HashMap;

/* renamed from: g02  reason: default package */
public final class g02 {
    public final ep4 a;
    public final op4 b;
    public final q02 c;
    public final f02 d;
    public final vz1 e;
    public final t02 f;
    public final m02 g;
    public final dk5 h;

    public g02(fp4 fp4Var, op4 op4Var, q02 q02Var, f02 f02Var, vz1 vz1Var, t02 t02Var, m02 m02Var, dk5 dk5Var) {
        this.a = fp4Var;
        this.b = op4Var;
        this.c = q02Var;
        this.d = f02Var;
        this.e = vz1Var;
        this.f = t02Var;
        this.g = m02Var;
        this.h = dk5Var;
    }

    public final HashMap a() {
        long j;
        HashMap b = b();
        op4 op4Var = this.b;
        ay5 ay5Var = op4Var.f;
        op4Var.d.getClass();
        ey1 ey1Var = mp4.a;
        if (ay5Var.l()) {
            ey1Var = (ey1) ay5Var.i();
        }
        b.put("gai", Boolean.valueOf(this.a.c()));
        b.put("did", ey1Var.v0());
        b.put("dst", Integer.valueOf(ey1Var.j0() - 1));
        b.put("doo", Boolean.valueOf(ey1Var.g0()));
        vz1 vz1Var = this.e;
        if (vz1Var != null) {
            b.put("nt", Long.valueOf(vz1Var.a()));
        }
        t02 t02Var = this.f;
        if (t02Var != null) {
            if (t02Var.d) {
                j = t02Var.b - t02Var.a;
            } else {
                j = -1;
            }
            b.put("vs", Long.valueOf(j));
            t02 t02Var2 = this.f;
            long j2 = t02Var2.c;
            t02Var2.c = -1L;
            b.put("vf", Long.valueOf(j2));
        }
        return b;
    }

    public final HashMap b() {
        HashMap hashMap = new HashMap();
        op4 op4Var = this.b;
        ay5 ay5Var = op4Var.g;
        op4Var.e.getClass();
        ey1 ey1Var = np4.a;
        if (ay5Var.l()) {
            ey1Var = (ey1) ay5Var.i();
        }
        hashMap.put("v", this.a.a());
        hashMap.put("gms", Boolean.valueOf(this.a.b()));
        hashMap.put("int", ey1Var.w0());
        hashMap.put("up", Boolean.valueOf(this.d.a));
        hashMap.put("t", new Throwable());
        m02 m02Var = this.g;
        if (m02Var != null) {
            hashMap.put("tcq", Long.valueOf(m02Var.a));
            hashMap.put("tpq", Long.valueOf(this.g.b));
            hashMap.put("tcv", Long.valueOf(this.g.c));
            hashMap.put("tpv", Long.valueOf(this.g.d));
            hashMap.put("tchv", Long.valueOf(this.g.e));
            hashMap.put("tphv", Long.valueOf(this.g.f));
            hashMap.put("tcc", Long.valueOf(this.g.g));
            hashMap.put("tpc", Long.valueOf(this.g.h));
        }
        return hashMap;
    }
}