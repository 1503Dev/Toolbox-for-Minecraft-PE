package defpackage;

import java.util.concurrent.Executor;

/* renamed from: gd4  reason: default package */
public final class gd4 implements nc4 {
    public final Executor a;
    public final String b;

    public gd4(yw2 yw2Var, String str) {
        this.a = yw2Var;
        this.b = str;
    }

    @Override // defpackage.nc4
    public final int a() {
        return 41;
    }

    @Override // defpackage.nc4
    public final dz4 c() {
        return zw4.B(zw4.E(zw4.C(this.b), new at4() { // from class: ed4
            @Override // defpackage.at4
            public final Object apply(Object obj) {
                return new hd4((String) obj);
            }
        }, this.a), Throwable.class, new ky4() { // from class: fd4
            @Override // defpackage.ky4
            public final dz4 e(Object obj) {
                Throwable th = (Throwable) obj;
                return zw4.C(new hd4(gd4.this.b));
            }
        }, this.a);
    }
}