package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ez3  reason: default package */
public final class ez3 {
    public final az3 a;
    public final ez4 b;

    public ez3(az3 az3Var, ez4 ez4Var) {
        this.a = az3Var;
        this.b = ez4Var;
    }

    public final void a(bl4 bl4Var) {
        ez4 ez4Var = this.b;
        final az3 az3Var = this.a;
        zw4.J(ez4Var.b(new Callable() { // from class: cz3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return az3.this.getWritableDatabase();
            }
        }), new dz3(bl4Var), this.b);
    }
}