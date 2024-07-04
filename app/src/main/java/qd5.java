package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: qd5  reason: default package */
public abstract class qd5 extends fy4 {
    public static final Logger R = Logger.getLogger(qd5.class.getName());
    public static final boolean S = zg5.e;
    public rd5 Q;

    public qd5() {
        super(11);
    }

    public /* synthetic */ qd5(int i) {
        super(11);
    }

    @Deprecated
    public static int I(int i, nf5 nf5Var, dg5 dg5Var) {
        int e = ((vc5) nf5Var).e(dg5Var);
        int p = p(i << 3);
        return p + p + e;
    }

    public static int J(int i) {
        if (i >= 0) {
            return p(i);
        }
        return 10;
    }

    public static int K(String str) {
        int length;
        try {
            length = dh5.c(str);
        } catch (ch5 unused) {
            length = str.getBytes(re5.a).length;
        }
        return p(length) + length;
    }

    public static int p(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int q(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            j >>>= 14;
            i += 2;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public abstract void A(int i);

    public abstract void B(int i, nf5 nf5Var, dg5 dg5Var);

    public abstract void C(int i, String str);

    public abstract void D(int i, int i2);

    public abstract void E(int i, int i2);

    public abstract void F(int i);

    public abstract void G(long j, int i);

    public abstract void H(long j);

    public final void r(String str, ch5 ch5Var) {
        R.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) ch5Var);
        byte[] bytes = str.getBytes(re5.a);
        try {
            int length = bytes.length;
            F(length);
            i(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new od5(e);
        }
    }

    public abstract void s(byte b);

    public abstract void t(int i, boolean z);

    public abstract void u(int i, gd5 gd5Var);

    public abstract void v(int i, int i2);

    public abstract void w(int i);

    public abstract void x(long j, int i);

    public abstract void y(long j);

    public abstract void z(int i, int i2);
}