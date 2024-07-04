package defpackage;

import java.math.BigInteger;

/* renamed from: k81  reason: default package */
public final class k81 extends n implements l81 {
    public o P;
    public t Q;

    public k81(int i, int i2, int i3, int i4) {
        this.P = l81.c;
        s82 s82Var = new s82(12);
        s82Var.g(new l(i));
        if (i3 == 0) {
            if (i4 != 0) {
                throw new IllegalArgumentException("inconsistent k values");
            }
            s82Var.g(l81.d);
            s82Var.g(new l(i2));
        } else if (i3 <= i2 || i4 <= i3) {
            throw new IllegalArgumentException("inconsistent k values");
        } else {
            s82Var.g(l81.e);
            s82 s82Var2 = new s82(12);
            s82Var2.g(new l(i2));
            s82Var2.g(new l(i3));
            s82Var2.g(new l(i4));
            s82Var.g(new mi(s82Var2));
        }
        this.Q = new mi(s82Var);
    }

    public k81(BigInteger bigInteger) {
        this.P = l81.b;
        this.Q = new l(bigInteger);
    }

    public k81(u uVar) {
        this.P = o.z(uVar.x(0));
        this.Q = uVar.x(1).h();
    }

    @Override // defpackage.n, defpackage.g
    public final t h() {
        s82 s82Var = new s82(12);
        s82Var.g(this.P);
        s82Var.g(this.Q);
        return new mi(s82Var);
    }
}