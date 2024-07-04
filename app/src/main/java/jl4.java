package defpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: jl4  reason: default package */
public final class jl4 {
    public final Object a;
    public final String b;
    public final dz4 c;
    public final List d;
    public final dz4 e;
    public final /* synthetic */ kl4 f;

    public /* synthetic */ jl4(kl4 kl4Var, Object obj, dz4 dz4Var, List list, dz4 dz4Var2) {
        this(kl4Var, obj, null, dz4Var, list, dz4Var2);
    }

    public jl4(kl4 kl4Var, Object obj, String str, dz4 dz4Var, List list, dz4 dz4Var2) {
        this.f = kl4Var;
        this.a = obj;
        this.b = str;
        this.c = dz4Var;
        this.d = list;
        this.e = dz4Var2;
    }

    public final el4 a() {
        Object obj = this.a;
        String str = this.b;
        if (str == null) {
            ((ol4) this.f).getClass();
            str = ((ml4) obj).P;
        }
        final el4 el4Var = new el4(obj, str, this.e);
        this.f.c.x0(el4Var);
        dz4 dz4Var = this.c;
        Runnable runnable = new Runnable() { // from class: il4
            @Override // java.lang.Runnable
            public final void run() {
                jl4 jl4Var = jl4.this;
                jl4Var.f.c.g0(el4Var);
            }
        };
        yw2 yw2Var = zw2.f;
        dz4Var.b(runnable, yw2Var);
        zw4.J(el4Var, new f2(this, el4Var), yw2Var);
        return el4Var;
    }

    public final jl4 b(ml4 ml4Var) {
        return this.f.b(a(), ml4Var);
    }

    public final jl4 c(bl4 bl4Var) {
        return d(new ts2(4, bl4Var));
    }

    public final jl4 d(ky4 ky4Var) {
        kl4 kl4Var = this.f;
        return new jl4(kl4Var, this.a, this.b, this.c, this.d, zw4.F(this.e, ky4Var, kl4Var.a));
    }

    public final jl4 e(long j, TimeUnit timeUnit) {
        kl4 kl4Var = this.f;
        return new jl4(kl4Var, this.a, this.b, this.c, this.d, zw4.G(this.e, j, timeUnit, kl4Var.b));
    }
}