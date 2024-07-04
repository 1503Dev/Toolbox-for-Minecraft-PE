package defpackage;

import java.util.concurrent.Callable;

/* renamed from: gz2  reason: default package */
public final class gz2 extends r82 {
    public final gy2 b;
    public final oz2 c;
    public final String d;
    public final String[] e;

    public gz2(gy2 gy2Var, oz2 oz2Var, String str, String[] strArr) {
        this.b = gy2Var;
        this.c = oz2Var;
        this.d = str;
        this.e = strArr;
        jv5.A.y.P.add(this);
    }

    @Override // defpackage.r82
    public final void a() {
        try {
            this.c.u(this.d, this.e);
        } finally {
            cu5.i.post(new am1(2, this));
        }
    }

    @Override // defpackage.r82
    public final dz4 b() {
        if (((Boolean) w82.d.c.a(x92.D1)).booleanValue() && (this.c instanceof wz2)) {
            return zw2.e.b(new Callable() { // from class: dz2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    gz2 gz2Var = gz2.this;
                    return Boolean.valueOf(gz2Var.c.v(gz2Var.d, gz2Var.e, gz2Var));
                }
            });
        }
        return super.b();
    }
}