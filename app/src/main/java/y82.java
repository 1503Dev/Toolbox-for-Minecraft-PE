package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: y82  reason: default package */
public abstract class y82 implements Iterable, Serializable {
    public static final p52 Q = new p52(z13.b);
    public int P = 0;

    static {
        int i = fw1.a;
    }

    public static int s(int i, int i2, int i3) {
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

    public static p52 t(byte[] bArr, int i, int i2) {
        s(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new p52(bArr2);
    }

    public abstract boolean equals(Object obj);

    public abstract byte g(int i);

    public abstract byte h(int i);

    public final int hashCode() {
        int i = this.P;
        if (i == 0) {
            int m = m();
            i = n(m, m);
            if (i == 0) {
                i = 1;
            }
            this.P = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new a02(this);
    }

    public abstract int m();

    public abstract int n(int i, int i2);

    public abstract p52 o();

    public abstract String p(Charset charset);

    public abstract void q(hg2 hg2Var);

    public abstract boolean r();

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(m());
        objArr[2] = m() <= 50 ? vx.w(this) : vx.w(o()).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}