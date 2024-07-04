package defpackage;

import java.util.logging.Logger;

/* renamed from: hg2  reason: default package */
public abstract class hg2 extends tv2 {
    public static final Logger R = Logger.getLogger(hg2.class.getName());
    public static final boolean S = hc4.e;
    public eh2 Q;

    public hg2() {
    }

    public /* synthetic */ hg2(int i) {
    }

    @Deprecated
    public static int Z(int i, fk3 fk3Var, lr3 lr3Var) {
        int a = ((du1) fk3Var).a(lr3Var);
        int c0 = c0(i << 3);
        return c0 + c0 + a;
    }

    public static int a0(int i) {
        if (i >= 0) {
            return c0(i);
        }
        return 10;
    }

    public static int b0(String str) {
        int length;
        try {
            length = nf4.b(str);
        } catch (ze4 unused) {
            length = str.getBytes(z13.a).length;
        }
        return c0(length) + length;
    }

    public static int c0(int i) {
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

    public static int d0(long j) {
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

    public abstract void K(byte b);

    public abstract void L(int i, boolean z);

    public abstract void M(int i, y82 y82Var);

    public abstract void N(int i, int i2);

    public abstract void O(int i);

    public abstract void P(long j, int i);

    public abstract void Q(long j);

    public abstract void R(int i, int i2);

    public abstract void S(int i);

    public abstract void T(int i, String str);

    public abstract void U(int i, int i2);

    public abstract void V(int i, int i2);

    public abstract void W(int i);

    public abstract void X(long j, int i);

    public abstract void Y(long j);
}