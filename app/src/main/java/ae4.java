package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ae4  reason: default package */
public final class ae4 implements nc4 {
    public final ez4 a;

    public ae4(yw2 yw2Var) {
        this.a = yw2Var;
    }

    @Override // defpackage.nc4
    public final int a() {
        return 47;
    }

    @Override // defpackage.nc4
    public final dz4 c() {
        final zy4 C = zw4.C(null);
        if (((Boolean) w82.d.c.a(x92.N4)).booleanValue()) {
            C = zw4.C(null);
        }
        final zy4 C2 = zw4.C(null);
        return new oy4(nv4.u(new dz4[]{C, C2}), true, zw2.a, new Callable() { // from class: zd4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new be4((String) C.get(), (String) C2.get());
            }
        });
    }
}