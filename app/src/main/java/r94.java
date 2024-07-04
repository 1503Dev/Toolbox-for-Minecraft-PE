package defpackage;

import java.util.concurrent.Callable;

/* renamed from: r94  reason: default package */
public final class r94 implements nc4 {
    public final ez4 a;

    public r94(yw2 yw2Var) {
        this.a = yw2Var;
    }

    @Override // defpackage.nc4
    public final int a() {
        return 55;
    }

    @Override // defpackage.nc4
    public final dz4 c() {
        return this.a.b(new Callable() { // from class: q94
            @Override // java.util.concurrent.Callable
            public final Object call() {
                jv5 jv5Var = jv5.A;
                jv5Var.j.getClass();
                return new s94(Long.valueOf(System.currentTimeMillis() - jv5Var.g.b().f().f).longValue());
            }
        });
    }
}