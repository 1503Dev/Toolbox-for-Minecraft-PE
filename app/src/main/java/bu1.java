package defpackage;

import android.os.Binder;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: bu1  reason: default package */
public final class bu1 implements ky4 {
    public final Executor a;
    public final jv3 b;

    public bu1(yw2 yw2Var, jv3 jv3Var) {
        this.a = yw2Var;
        this.b = jv3Var;
    }

    @Override // defpackage.ky4
    public final dz4 e(Object obj) {
        dz4 b;
        final rq2 rq2Var = (rq2) obj;
        final jv3 jv3Var = this.b;
        jv3Var.getClass();
        String str = rq2Var.S;
        cu5 cu5Var = jv5.A.c;
        if (cu5.G(str)) {
            b = new yy4(new gw3(1));
        } else {
            if (((Boolean) w82.d.c.a(x92.v6)).booleanValue()) {
                b = jv3Var.c.b(new hz1(1, jv3Var, rq2Var));
            } else {
                b = jv3Var.d.b(rq2Var);
            }
        }
        final int callingUid = Binder.getCallingUid();
        return zw4.F(zw4.B((sy4) zw4.G(sy4.r(b), ((Integer) w82.d.c.a(x92.y4)).intValue(), TimeUnit.SECONDS, jv3Var.a), Throwable.class, new ky4() { // from class: iv3
            @Override // defpackage.ky4
            public final dz4 e(Object obj2) {
                jv3 jv3Var2 = jv3.this;
                Throwable th = (Throwable) obj2;
                return ((cy3) jv3Var2.e.c()).v4(rq2Var, callingUid);
            }
        }, jv3Var.b), new bt1(0, rq2Var), this.a);
    }
}