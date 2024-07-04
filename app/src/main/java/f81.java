package defpackage;

import defpackage.hn;
import java.math.BigInteger;

/* renamed from: f81  reason: default package */
public final class f81 extends n implements l81 {
    public hn P;
    public byte[] Q;
    public o R;

    public f81(hn hnVar, byte[] bArr) {
        o oVar;
        this.R = null;
        this.P = hnVar;
        this.Q = bArr;
        boolean z = false;
        if (hnVar.a.b() == 1) {
            oVar = l81.b;
        } else {
            cq cqVar = this.P.a;
            if (cqVar.b() > 1 && cqVar.c().equals(gn.c) && (cqVar instanceof ff0)) {
                z = true;
            }
            if (!z) {
                throw new IllegalArgumentException("This type of ECCurve is not implemented");
            }
            oVar = l81.c;
        }
        this.R = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005a  */
    @Override // defpackage.n, defpackage.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final t h() {
        j81 j81Var;
        byte[] bArr;
        s82 s82Var = new s82(12);
        if (this.R.equals(l81.b)) {
            s82Var.g(new j81(this.P.b).h());
            j81Var = new j81(this.P.c);
        } else {
            if (this.R.equals(l81.c)) {
                s82Var.g(new j81(this.P.b).h());
                j81Var = new j81(this.P.c);
            }
            bArr = this.Q;
            if (bArr != null) {
                s82Var.g(new zh(bArr));
            }
            return new mi(s82Var);
        }
        s82Var.g(j81Var.h());
        bArr = this.Q;
        if (bArr != null) {
        }
        return new mi(s82Var);
    }

    public f81(k81 k81Var, u uVar) {
        int intValue;
        int i;
        int i2;
        hn cVar;
        this.R = null;
        o oVar = k81Var.P;
        this.R = oVar;
        if (oVar.equals(l81.b)) {
            BigInteger x = ((l) k81Var.Q).x();
            cVar = new hn.d(x, new j81(x, (p) uVar.x(0)).P.t(), new j81(x, (p) uVar.x(1)).P.t());
        } else if (!this.R.equals(l81.c)) {
            throw new IllegalArgumentException("This type of ECCurve is not implemented");
        } else {
            u w = u.w(k81Var.Q);
            int intValue2 = ((l) w.x(0)).x().intValue();
            o oVar2 = (o) w.x(1);
            if (oVar2.equals(l81.d)) {
                i = l.w(w.x(2)).x().intValue();
                i2 = 0;
                intValue = 0;
            } else if (!oVar2.equals(l81.e)) {
                throw new IllegalArgumentException("This type of EC basis is not implemented");
            } else {
                u w2 = u.w(w.x(2));
                int intValue3 = l.w(w2.x(0)).x().intValue();
                int intValue4 = l.w(w2.x(1)).x().intValue();
                intValue = l.w(w2.x(2)).x().intValue();
                i = intValue3;
                i2 = intValue4;
            }
            int i3 = i;
            int i4 = i2;
            int i5 = intValue;
            cVar = new hn.c(intValue2, i3, i4, i5, new j81(intValue2, i3, i4, i5, (p) uVar.x(0)).P.t(), new j81(intValue2, i3, i4, i5, (p) uVar.x(1)).P.t());
        }
        this.P = cVar;
        if (uVar.size() == 3) {
            this.Q = ((zh) uVar.x(2)).w();
        }
    }
}