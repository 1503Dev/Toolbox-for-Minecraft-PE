package defpackage;

import defpackage.hn;
import java.math.BigInteger;

/* renamed from: g81  reason: default package */
public final class g81 extends n implements l81 {
    public static final BigInteger V = BigInteger.valueOf(1);
    public k81 P;
    public hn Q;
    public i81 R;
    public BigInteger S;
    public BigInteger T;
    public byte[] U;

    public g81(hn.d dVar, i81 i81Var, BigInteger bigInteger, BigInteger bigInteger2) {
        this(dVar, i81Var, bigInteger, bigInteger2, null);
    }

    public g81(u uVar) {
        if (!(uVar.x(0) instanceof l) || !((l) uVar.x(0)).x().equals(V)) {
            throw new IllegalArgumentException("bad version in X9ECParameters");
        }
        g x = uVar.x(1);
        f81 f81Var = new f81(x instanceof k81 ? (k81) x : x != null ? new k81(u.w(x)) : null, u.w(uVar.x(2)));
        this.Q = f81Var.P;
        g x2 = uVar.x(3);
        if (x2 instanceof i81) {
            this.R = (i81) x2;
        } else {
            this.R = new i81(this.Q, (p) x2);
        }
        this.S = ((l) uVar.x(4)).x();
        this.U = f81Var.Q;
        if (uVar.size() == 6) {
            this.T = ((l) uVar.x(5)).x();
        }
    }

    public static g81 q(t tVar) {
        if (tVar instanceof g81) {
            return (g81) tVar;
        }
        if (tVar != null) {
            return new g81(u.w(tVar));
        }
        return null;
    }

    @Override // defpackage.n, defpackage.g
    public final t h() {
        s82 s82Var = new s82(12);
        s82Var.g(new l(V));
        s82Var.g(this.P);
        s82Var.g(new f81(this.Q, this.U));
        s82Var.g(this.R);
        s82Var.g(new l(this.S));
        BigInteger bigInteger = this.T;
        if (bigInteger != null) {
            s82Var.g(new l(bigInteger));
        }
        return new mi(s82Var);
    }

    public final wn p() {
        wn wnVar;
        i81 i81Var = this.R;
        synchronized (i81Var) {
            if (i81Var.R == null) {
                i81Var.R = i81Var.Q.f(i81Var.P.P).n();
            }
            wnVar = i81Var.R;
        }
        return wnVar;
    }

    public g81(hn hnVar, i81 i81Var, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        int[] iArr;
        k81 k81Var;
        this.Q = hnVar;
        this.R = i81Var;
        this.S = bigInteger;
        this.T = bigInteger2;
        this.U = bArr;
        if (hnVar.a.b() == 1) {
            k81Var = new k81(hnVar.a.c());
        } else {
            cq cqVar = hnVar.a;
            if (!(cqVar.b() > 1 && cqVar.c().equals(gn.c) && (cqVar instanceof ff0))) {
                throw new IllegalArgumentException("'curve' is of an unsupported type");
            }
            int[] iArr2 = ((ff0) hnVar.a).a().a;
            if (iArr2 == null) {
                iArr = null;
            } else {
                int[] iArr3 = new int[iArr2.length];
                System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
                iArr = iArr3;
            }
            if (iArr.length == 3) {
                k81Var = new k81(iArr[2], iArr[1], 0, 0);
            } else if (iArr.length != 5) {
                throw new IllegalArgumentException("Only trinomial and pentomial curves are supported");
            } else {
                k81Var = new k81(iArr[4], iArr[1], iArr[2], iArr[3]);
            }
        }
        this.P = k81Var;
    }
}