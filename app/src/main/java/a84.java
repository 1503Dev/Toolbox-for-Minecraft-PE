package defpackage;

import java.util.concurrent.Executor;

/* renamed from: a84  reason: default package */
public final class a84 implements nc4 {
    public final dz4 a;
    public final Executor b;

    public a84(dz4 dz4Var, yw2 yw2Var) {
        this.a = dz4Var;
        this.b = yw2Var;
    }

    @Override // defpackage.nc4
    public final int a() {
        return 6;
    }

    @Override // defpackage.nc4
    public final dz4 c() {
        return zw4.F(this.a, new ky4() { // from class: z74
            @Override // defpackage.ky4
            public final dz4 e(Object obj) {
                return zw4.C(new y74((String) obj, 0));
            }
        }, this.b);
    }
}