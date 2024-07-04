package defpackage;

import java.util.concurrent.Callable;

/* renamed from: fa4  reason: default package */
public final class fa4 implements nc4 {
    public final ez4 a;

    public fa4(yw2 yw2Var) {
        this.a = yw2Var;
    }

    @Override // defpackage.nc4
    public final int a() {
        return 20;
    }

    @Override // defpackage.nc4
    public final dz4 c() {
        return this.a.b(new Callable() { // from class: ea4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                boolean z;
                jv5 jv5Var = jv5.A;
                r42 r42Var = jv5Var.m;
                synchronized (r42Var.a) {
                    str = r42Var.c;
                }
                r42 r42Var2 = jv5Var.m;
                synchronized (r42Var2.a) {
                    z = r42Var2.d;
                }
                return new ga4(str, z);
            }
        });
    }
}