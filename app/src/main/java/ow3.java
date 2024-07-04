package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutionException;

/* renamed from: ow3  reason: default package */
public final class ow3 {
    public final ez4 a;
    public final zv3 b;
    public final hj5 c;
    public final rm4 d;
    public final Context e;
    public final xv2 f;

    public ow3(yw2 yw2Var, zv3 zv3Var, hj5 hj5Var, rm4 rm4Var, Context context, xv2 xv2Var) {
        this.a = yw2Var;
        this.b = zv3Var;
        this.c = hj5Var;
        this.d = rm4Var;
        this.e = context;
        this.f = xv2Var;
    }

    public final hx4 a(rq2 rq2Var, nw3 nw3Var, nw3 nw3Var2, ky4 ky4Var) {
        dz4 B;
        String str = rq2Var.S;
        cu5 cu5Var = jv5.A.c;
        if (cu5.G(str)) {
            B = new yy4(new gw3(1));
        } else {
            B = zw4.B(nw3Var.d(rq2Var), ExecutionException.class, new ky4() { // from class: hw3
                @Override // defpackage.ky4
                public final dz4 e(Object obj) {
                    Throwable th = (ExecutionException) obj;
                    if (th.getCause() != null) {
                        th = th.getCause();
                    }
                    th.getClass();
                    return new yy4(th);
                }
            }, this.a);
        }
        return zw4.B(zw4.F(sy4.r(B), ky4Var, this.a), gw3.class, new ck2(this, nw3Var2, rq2Var, ky4Var), this.a);
    }
}