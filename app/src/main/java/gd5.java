package defpackage;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: gd5  reason: default package */
public abstract class gd5 implements Iterable, Serializable {
    public static final ed5 Q = new ed5(re5.b);
    public int P = 0;

    static {
        int i = xc5.a;
    }

    public static int D(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i >= 0) {
                if (i2 < i) {
                    throw new IndexOutOfBoundsException(dp.b("Beginning index larger than ending index: ", i, ", ", i2));
                }
                throw new IndexOutOfBoundsException(dp.b("End index: ", i2, " >= ", i3));
            }
            throw new IndexOutOfBoundsException(bp.b("Beginning index: ", i, " < 0"));
        }
        return i4;
    }

    public static gd5 F(ArrayList arrayList) {
        int size;
        if (arrayList instanceof Collection) {
            size = arrayList.size();
        } else {
            Iterator it = arrayList.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? Q : n(arrayList.iterator(), size);
    }

    public static ed5 G(byte[] bArr, int i, int i2) {
        D(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new ed5(bArr2);
    }

    public static void H(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(k6.a("Index < 0: ", i));
            }
            throw new ArrayIndexOutOfBoundsException(dp.b("Index > length: ", i, ", ", i2));
        }
    }

    public static gd5 n(Iterator it, int i) {
        cg5 cg5Var;
        if (i > 0) {
            if (i == 1) {
                return (gd5) it.next();
            }
            int i2 = i >>> 1;
            gd5 n = n(it, i2);
            gd5 n2 = n(it, i - i2);
            if (Integer.MAX_VALUE - n.o() >= n2.o()) {
                if (n2.o() == 0) {
                    return n;
                }
                if (n.o() != 0) {
                    int o = n2.o() + n.o();
                    if (o < 128) {
                        int o2 = n.o();
                        int o3 = n2.o();
                        int i3 = o2 + o3;
                        byte[] bArr = new byte[i3];
                        D(0, o2, n.o());
                        D(0, o2 + 0, i3);
                        if (o2 > 0) {
                            n.p(0, 0, o2, bArr);
                        }
                        D(0, o3, n2.o());
                        D(o2, i3, i3);
                        if (o3 > 0) {
                            n2.p(0, o2, o3, bArr);
                        }
                        return new ed5(bArr);
                    }
                    if (n instanceof cg5) {
                        cg5 cg5Var2 = (cg5) n;
                        if (n2.o() + cg5Var2.T.o() < 128) {
                            gd5 gd5Var = cg5Var2.T;
                            int o4 = gd5Var.o();
                            int o5 = n2.o();
                            int i4 = o4 + o5;
                            byte[] bArr2 = new byte[i4];
                            D(0, o4, gd5Var.o());
                            D(0, o4 + 0, i4);
                            if (o4 > 0) {
                                gd5Var.p(0, 0, o4, bArr2);
                            }
                            D(0, o5, n2.o());
                            D(o4, i4, i4);
                            if (o5 > 0) {
                                n2.p(0, o4, o5, bArr2);
                            }
                            cg5Var = new cg5(cg5Var2.S, new ed5(bArr2));
                            return cg5Var;
                        } else if (cg5Var2.S.q() > cg5Var2.T.q() && cg5Var2.V > n2.q()) {
                            return new cg5(cg5Var2.S, new cg5(cg5Var2.T, n2));
                        }
                    }
                    if (o >= cg5.I(Math.max(n.q(), n2.q()) + 1)) {
                        cg5Var = new cg5(n, n2);
                        return cg5Var;
                    }
                    ag5 ag5Var = new ag5();
                    ag5Var.a(n);
                    ag5Var.a(n2);
                    gd5 gd5Var2 = (gd5) ag5Var.a.pop();
                    while (!ag5Var.a.isEmpty()) {
                        gd5Var2 = new cg5((gd5) ag5Var.a.pop(), gd5Var2);
                    }
                    return gd5Var2;
                }
                return n2;
            }
            throw new IllegalArgumentException(dp.b("ByteString would be too long: ", n.o(), "+", n2.o()));
        }
        throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
    }

    public abstract boolean C();

    @Override // java.lang.Iterable
    /* renamed from: E */
    public cx4 iterator() {
        return new bd5(this);
    }

    public abstract boolean equals(Object obj);

    public final byte[] g() {
        int o = o();
        if (o == 0) {
            return re5.b;
        }
        byte[] bArr = new byte[o];
        p(0, 0, o, bArr);
        return bArr;
    }

    public abstract byte h(int i);

    public final int hashCode() {
        int i = this.P;
        if (i == 0) {
            int o = o();
            i = s(o, 0, o);
            if (i == 0) {
                i = 1;
            }
            this.P = i;
        }
        return i;
    }

    public abstract byte m(int i);

    public abstract int o();

    public abstract void p(int i, int i2, int i3, byte[] bArr);

    public abstract int q();

    public abstract boolean r();

    public abstract int s(int i, int i2, int i3);

    public abstract int t(int i, int i2, int i3);

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(o());
        objArr[2] = o() <= 50 ? mh.y(this) : mh.y(u(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract gd5 u(int i, int i2);

    public abstract ld5 v();

    public abstract String w(Charset charset);

    public abstract ByteBuffer y();

    public abstract void z(qd5 qd5Var);
}