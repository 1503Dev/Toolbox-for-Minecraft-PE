package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

/* renamed from: za  reason: default package */
public final class za implements bb, ab, Cloneable, ByteChannel {
    public static final byte[] R = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    @Nullable
    public sq0 P;
    public long Q;

    /* renamed from: za$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public final int available() {
            return (int) Math.min(za.this.Q, 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.InputStream
        public final int read() {
            za zaVar = za.this;
            if (zaVar.Q > 0) {
                return zaVar.readByte() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            return za.this.read(bArr, i, i2);
        }

        public final String toString() {
            return za.this + ".inputStream()";
        }
    }

    /* renamed from: za$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class b implements Closeable {
        public za P;
        public boolean Q;
        public sq0 R;
        public byte[] T;
        public long S = -1;
        public int U = -1;
        public int V = -1;

        public final int a(long j) {
            if (j >= -1) {
                za zaVar = this.P;
                long j2 = zaVar.Q;
                if (j <= j2) {
                    if (j != -1 && j != j2) {
                        long j3 = 0;
                        sq0 sq0Var = zaVar.P;
                        sq0 sq0Var2 = this.R;
                        if (sq0Var2 != null) {
                            long j4 = this.S - (this.U - sq0Var2.b);
                            if (j4 > j) {
                                j2 = j4;
                            } else {
                                j3 = j4;
                                sq0Var2 = sq0Var;
                                sq0Var = sq0Var2;
                            }
                        } else {
                            sq0Var2 = sq0Var;
                        }
                        if (j2 - j > j - j3) {
                            while (true) {
                                long j5 = (sq0Var.c - sq0Var.b) + j3;
                                if (j < j5) {
                                    break;
                                }
                                sq0Var = sq0Var.f;
                                j3 = j5;
                            }
                        } else {
                            while (j2 > j) {
                                sq0Var2 = sq0Var2.g;
                                j2 -= sq0Var2.c - sq0Var2.b;
                            }
                            j3 = j2;
                            sq0Var = sq0Var2;
                        }
                        if (this.Q && sq0Var.d) {
                            sq0 sq0Var3 = new sq0((byte[]) sq0Var.a.clone(), sq0Var.b, sq0Var.c, false, true);
                            za zaVar2 = this.P;
                            if (zaVar2.P == sq0Var) {
                                zaVar2.P = sq0Var3;
                            }
                            sq0Var.b(sq0Var3);
                            sq0Var3.g.a();
                            sq0Var = sq0Var3;
                        }
                        this.R = sq0Var;
                        this.S = j;
                        this.T = sq0Var.a;
                        int i = sq0Var.b + ((int) (j - j3));
                        this.U = i;
                        int i2 = sq0Var.c;
                        this.V = i2;
                        return i2 - i;
                    }
                    this.R = null;
                    this.S = j;
                    this.T = null;
                    this.U = -1;
                    this.V = -1;
                    return -1;
                }
            }
            throw new ArrayIndexOutOfBoundsException(String.format("offset=%s > size=%s", Long.valueOf(j), Long.valueOf(this.P.Q)));
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.P == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.P = null;
            this.R = null;
            this.S = -1L;
            this.T = null;
            this.U = -1;
            this.V = -1;
        }
    }

    @Override // defpackage.ab
    public final /* bridge */ /* synthetic */ ab A(fb fbVar) {
        R(fbVar);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a A[EDGE_INSN: B:43:0x009a->B:38:0x009a ?: BREAK  , SYNTHETIC] */
    @Override // defpackage.bb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long B() {
        int i;
        int i2;
        if (this.Q != 0) {
            int i3 = 0;
            boolean z = false;
            long j = 0;
            do {
                sq0 sq0Var = this.P;
                byte[] bArr = sq0Var.a;
                int i4 = sq0Var.b;
                int i5 = sq0Var.c;
                while (i4 < i5) {
                    byte b2 = bArr[i4];
                    if (b2 >= 48 && b2 <= 57) {
                        i2 = b2 - 48;
                    } else {
                        if (b2 >= 97 && b2 <= 102) {
                            i = b2 - 97;
                        } else if (b2 >= 65 && b2 <= 70) {
                            i = b2 - 65;
                        } else if (i3 != 0) {
                            z = true;
                            if (i4 != i5) {
                                this.P = sq0Var.a();
                                tq0.a(sq0Var);
                            } else {
                                sq0Var.b = i4;
                            }
                            if (!z) {
                                break;
                            }
                        } else {
                            StringBuilder b3 = e5.b("Expected leading [0-9a-fA-F] character but was 0x");
                            b3.append(Integer.toHexString(b2));
                            throw new NumberFormatException(b3.toString());
                        }
                        i2 = i + 10;
                    }
                    if (((-1152921504606846976L) & j) == 0) {
                        j = (j << 4) | i2;
                        i4++;
                        i3++;
                    } else {
                        za zaVar = new za();
                        zaVar.U(j);
                        zaVar.S(b2);
                        StringBuilder b4 = e5.b("Number too large: ");
                        b4.append(zaVar.M());
                        throw new NumberFormatException(b4.toString());
                    }
                }
                if (i4 != i5) {
                }
                if (!z) {
                }
            } while (this.P != null);
            this.Q -= i3;
            return j;
        }
        throw new IllegalStateException("size == 0");
    }

    @Override // defpackage.bb
    public final String C(Charset charset) {
        try {
            return L(this.Q, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.bb
    public final InputStream D() {
        return new a();
    }

    public final long E() {
        long j = this.Q;
        if (j == 0) {
            return 0L;
        }
        sq0 sq0Var = this.P.g;
        int i = sq0Var.c;
        return (i >= 8192 || !sq0Var.e) ? j : j - (i - sq0Var.b);
    }

    public final void F(za zaVar, long j, long j2) {
        if (zaVar == null) {
            throw new IllegalArgumentException("out == null");
        }
        b31.a(this.Q, j, j2);
        if (j2 == 0) {
            return;
        }
        zaVar.Q += j2;
        sq0 sq0Var = this.P;
        while (true) {
            long j3 = sq0Var.c - sq0Var.b;
            if (j < j3) {
                break;
            }
            j -= j3;
            sq0Var = sq0Var.f;
        }
        while (j2 > 0) {
            sq0 c = sq0Var.c();
            int i = (int) (c.b + j);
            c.b = i;
            c.c = Math.min(i + ((int) j2), c.c);
            sq0 sq0Var2 = zaVar.P;
            if (sq0Var2 == null) {
                c.g = c;
                c.f = c;
                zaVar.P = c;
            } else {
                sq0Var2.g.b(c);
            }
            j2 -= c.c - c.b;
            sq0Var = sq0Var.f;
            j = 0;
        }
    }

    public final byte G(long j) {
        int i;
        b31.a(this.Q, j, 1L);
        long j2 = this.Q;
        if (j2 - j <= j) {
            long j3 = j - j2;
            sq0 sq0Var = this.P;
            do {
                sq0Var = sq0Var.g;
                int i2 = sq0Var.c;
                i = sq0Var.b;
                j3 += i2 - i;
            } while (j3 < 0);
            return sq0Var.a[i + ((int) j3)];
        }
        sq0 sq0Var2 = this.P;
        while (true) {
            int i3 = sq0Var2.c;
            int i4 = sq0Var2.b;
            long j4 = i3 - i4;
            if (j < j4) {
                return sq0Var2.a[i4 + ((int) j)];
            }
            j -= j4;
            sq0Var2 = sq0Var2.f;
        }
    }

    public final long H(byte b2, long j, long j2) {
        sq0 sq0Var;
        long j3 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.Q), Long.valueOf(j), Long.valueOf(j2)));
        }
        long j4 = this.Q;
        long j5 = j2 > j4 ? j4 : j2;
        if (j == j5 || (sq0Var = this.P) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                sq0Var = sq0Var.g;
                j4 -= sq0Var.c - sq0Var.b;
            }
        } else {
            while (true) {
                long j6 = (sq0Var.c - sq0Var.b) + j3;
                if (j6 >= j) {
                    break;
                }
                sq0Var = sq0Var.f;
                j3 = j6;
            }
            j4 = j3;
        }
        long j7 = j;
        while (j4 < j5) {
            byte[] bArr = sq0Var.a;
            int min = (int) Math.min(sq0Var.c, (sq0Var.b + j5) - j4);
            for (int i = (int) ((sq0Var.b + j7) - j4); i < min; i++) {
                if (bArr[i] == b2) {
                    return (i - sq0Var.b) + j4;
                }
            }
            j4 += sq0Var.c - sq0Var.b;
            sq0Var = sq0Var.f;
            j7 = j4;
        }
        return -1L;
    }

    public final void I(b bVar) {
        if (bVar.P != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        bVar.P = this;
        bVar.Q = true;
    }

    public final byte[] J(long j) {
        b31.a(this.Q, 0L, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[(int) j];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
    }

    public final fb K() {
        return new fb(m());
    }

    public final String L(long j, Charset charset) {
        b31.a(this.Q, 0L, j);
        if (charset != null) {
            if (j > 2147483647L) {
                throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
            } else if (j == 0) {
                return "";
            } else {
                sq0 sq0Var = this.P;
                int i = sq0Var.b;
                if (i + j > sq0Var.c) {
                    return new String(J(j), charset);
                }
                String str = new String(sq0Var.a, i, (int) j, charset);
                int i2 = (int) (sq0Var.b + j);
                sq0Var.b = i2;
                this.Q -= j;
                if (i2 == sq0Var.c) {
                    this.P = sq0Var.a();
                    tq0.a(sq0Var);
                }
                return str;
            }
        }
        throw new IllegalArgumentException("charset == null");
    }

    public final String M() {
        try {
            return L(this.Q, b31.a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final int N() {
        int i;
        int i2;
        int i3;
        if (this.Q != 0) {
            byte G = G(0L);
            if ((G & 128) == 0) {
                i = G & Byte.MAX_VALUE;
                i2 = 1;
                i3 = 0;
            } else if ((G & 224) == 192) {
                i = G & 31;
                i2 = 2;
                i3 = 128;
            } else if ((G & 240) == 224) {
                i = G & 15;
                i2 = 3;
                i3 = 2048;
            } else if ((G & 248) != 240) {
                skip(1L);
                return 65533;
            } else {
                i = G & 7;
                i2 = 4;
                i3 = 65536;
            }
            long j = i2;
            if (this.Q < j) {
                throw new EOFException("size < " + i2 + ": " + this.Q + " (to read code point prefixed 0x" + Integer.toHexString(G) + ")");
            }
            for (int i4 = 1; i4 < i2; i4++) {
                long j2 = i4;
                byte G2 = G(j2);
                if ((G2 & 192) != 128) {
                    skip(j2);
                    return 65533;
                }
                i = (i << 6) | (G2 & 63);
            }
            skip(j);
            if (i > 1114111) {
                return 65533;
            }
            if ((i < 55296 || i > 57343) && i >= i3) {
                return i;
            }
            return 65533;
        }
        throw new EOFException();
    }

    public final String O(long j) {
        String L;
        long j2 = 1;
        if (j > 0) {
            long j3 = j - 1;
            if (G(j3) == 13) {
                L = L(j3, b31.a);
                j2 = 2;
                skip(j2);
                return L;
            }
        }
        L = L(j, b31.a);
        skip(j2);
        return L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
        if (r19 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
        return r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int P(cd0 cd0Var, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        sq0 sq0Var;
        sq0 sq0Var2 = this.P;
        int i5 = -2;
        if (sq0Var2 != null) {
            byte[] bArr = sq0Var2.a;
            int i6 = sq0Var2.b;
            int i7 = sq0Var2.c;
            int[] iArr = cd0Var.Q;
            sq0 sq0Var3 = sq0Var2;
            int i8 = 0;
            int i9 = -1;
            loop0: while (true) {
                int i10 = i8 + 1;
                int i11 = iArr[i8];
                int i12 = i10 + 1;
                int i13 = iArr[i10];
                if (i13 != -1) {
                    i9 = i13;
                }
                if (sq0Var3 == null) {
                    break;
                }
                if (i11 >= 0) {
                    int i14 = i6 + 1;
                    int i15 = bArr[i6] & 255;
                    int i16 = i12 + i11;
                    while (i12 != i16) {
                        if (i15 == iArr[i12]) {
                            i = iArr[i12 + i11];
                            if (i14 == i7) {
                                sq0Var3 = sq0Var3.f;
                                i2 = sq0Var3.b;
                                bArr = sq0Var3.a;
                                i7 = sq0Var3.c;
                                if (sq0Var3 == sq0Var2) {
                                    sq0Var3 = null;
                                }
                            } else {
                                i2 = i14;
                            }
                        } else {
                            i12++;
                        }
                    }
                    return i9;
                }
                int i17 = (i11 * (-1)) + i12;
                while (true) {
                    int i18 = i6 + 1;
                    int i19 = i12 + 1;
                    if ((bArr[i6] & 255) != iArr[i12]) {
                        return i9;
                    }
                    boolean z2 = i19 == i17;
                    if (i18 == i7) {
                        sq0 sq0Var4 = sq0Var3.f;
                        i4 = sq0Var4.b;
                        byte[] bArr2 = sq0Var4.a;
                        i3 = sq0Var4.c;
                        if (sq0Var4 != sq0Var2) {
                            sq0Var = sq0Var4;
                            bArr = bArr2;
                        } else if (!z2) {
                            break loop0;
                        } else {
                            bArr = bArr2;
                            sq0Var = null;
                        }
                    } else {
                        sq0 sq0Var5 = sq0Var3;
                        i3 = i7;
                        i4 = i18;
                        sq0Var = sq0Var5;
                    }
                    if (z2) {
                        i = iArr[i19];
                        i2 = i4;
                        i7 = i3;
                        sq0Var3 = sq0Var;
                        break;
                    }
                    i6 = i4;
                    i7 = i3;
                    i12 = i19;
                    sq0Var3 = sq0Var;
                }
                if (i >= 0) {
                    return i;
                }
                i8 = -i;
                i6 = i2;
                i5 = -2;
            }
        } else if (z) {
            return -2;
        } else {
            return cd0Var.indexOf(fb.T);
        }
    }

    public final sq0 Q(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        sq0 sq0Var = this.P;
        if (sq0Var == null) {
            sq0 b2 = tq0.b();
            this.P = b2;
            b2.g = b2;
            b2.f = b2;
            return b2;
        }
        sq0 sq0Var2 = sq0Var.g;
        if (sq0Var2.c + i > 8192 || !sq0Var2.e) {
            sq0 b3 = tq0.b();
            sq0Var2.b(b3);
            return b3;
        }
        return sq0Var2;
    }

    public final void R(fb fbVar) {
        if (fbVar == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        fbVar.r(this);
    }

    public final void S(int i) {
        sq0 Q = Q(1);
        byte[] bArr = Q.a;
        int i2 = Q.c;
        Q.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.Q++;
    }

    public final za T(long j) {
        if (j == 0) {
            S(48);
            return this;
        }
        boolean z = false;
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                X(0, 20, "-9223372036854775808");
                return this;
            }
            z = true;
        }
        if (j < 100000000) {
            if (j < 10000) {
                if (j < 100) {
                    if (j >= 10) {
                        i = 2;
                    }
                } else if (j < 1000) {
                    i = 3;
                } else {
                    i = 4;
                }
            } else if (j < 1000000) {
                if (j < 100000) {
                    i = 5;
                } else {
                    i = 6;
                }
            } else if (j < 10000000) {
                i = 7;
            } else {
                i = 8;
            }
        } else if (j < 1000000000000L) {
            if (j < 10000000000L) {
                if (j < 1000000000) {
                    i = 9;
                } else {
                    i = 10;
                }
            } else if (j < 100000000000L) {
                i = 11;
            } else {
                i = 12;
            }
        } else if (j < 1000000000000000L) {
            if (j < 10000000000000L) {
                i = 13;
            } else if (j < 100000000000000L) {
                i = 14;
            } else {
                i = 15;
            }
        } else if (j < 100000000000000000L) {
            if (j < 10000000000000000L) {
                i = 16;
            } else {
                i = 17;
            }
        } else if (j < 1000000000000000000L) {
            i = 18;
        } else {
            i = 19;
        }
        if (z) {
            i++;
        }
        sq0 Q = Q(i);
        byte[] bArr = Q.a;
        int i2 = Q.c + i;
        while (j != 0) {
            i2--;
            bArr[i2] = R[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        Q.c += i;
        this.Q += i;
        return this;
    }

    public final za U(long j) {
        if (j == 0) {
            S(48);
            return this;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        sq0 Q = Q(numberOfTrailingZeros);
        byte[] bArr = Q.a;
        int i = Q.c;
        int i2 = i + numberOfTrailingZeros;
        while (true) {
            i2--;
            if (i2 < i) {
                Q.c += numberOfTrailingZeros;
                this.Q += numberOfTrailingZeros;
                return this;
            }
            bArr[i2] = R[(int) (15 & j)];
            j >>>= 4;
        }
    }

    public final void V(int i) {
        sq0 Q = Q(4);
        byte[] bArr = Q.a;
        int i2 = Q.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        Q.c = i5 + 1;
        this.Q += 4;
    }

    public final void W(int i) {
        sq0 Q = Q(2);
        byte[] bArr = Q.a;
        int i2 = Q.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        Q.c = i3 + 1;
        this.Q += 2;
    }

    public final void X(int i, int i2, String str) {
        char charAt;
        int i3;
        char c;
        if (str != null) {
            if (i >= 0) {
                if (i2 >= i) {
                    if (i2 <= str.length()) {
                        while (i < i2) {
                            char charAt2 = str.charAt(i);
                            if (charAt2 < 128) {
                                sq0 Q = Q(1);
                                byte[] bArr = Q.a;
                                int i4 = Q.c - i;
                                int min = Math.min(i2, 8192 - i4);
                                int i5 = i + 1;
                                bArr[i + i4] = (byte) charAt2;
                                while (true) {
                                    i = i5;
                                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                                        break;
                                    }
                                    i5 = i + 1;
                                    bArr[i + i4] = (byte) charAt;
                                }
                                int i6 = Q.c;
                                int i7 = (i4 + i) - i6;
                                Q.c = i6 + i7;
                                this.Q += i7;
                            } else {
                                if (charAt2 < 2048) {
                                    i3 = (charAt2 >> 6) | 192;
                                } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                                    int i8 = i + 1;
                                    if (i8 < i2) {
                                        c = str.charAt(i8);
                                    } else {
                                        c = 0;
                                    }
                                    if (charAt2 <= 56319 && c >= 56320 && c <= 57343) {
                                        int i9 = (((charAt2 & 10239) << 10) | (9215 & c)) + 65536;
                                        S((i9 >> 18) | 240);
                                        S(((i9 >> 12) & 63) | 128);
                                        S(((i9 >> 6) & 63) | 128);
                                        S((i9 & 63) | 128);
                                        i += 2;
                                    } else {
                                        S(63);
                                        i = i8;
                                    }
                                } else {
                                    S((charAt2 >> '\f') | 224);
                                    i3 = ((charAt2 >> 6) & 63) | 128;
                                }
                                S(i3);
                                S((charAt2 & '?') | 128);
                                i++;
                            }
                        }
                        return;
                    }
                    throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
                }
                throw new IllegalArgumentException(dp.b("endIndex < beginIndex: ", i2, " < ", i));
            }
            throw new IllegalArgumentException(k6.a("beginIndex < 0: ", i));
        }
        throw new IllegalArgumentException("string == null");
    }

    public final void Y(int i) {
        int i2;
        int i3;
        if (i >= 128) {
            if (i < 2048) {
                i3 = (i >> 6) | 192;
            } else {
                if (i < 65536) {
                    if (i >= 55296 && i <= 57343) {
                        S(63);
                        return;
                    }
                    i2 = (i >> 12) | 224;
                } else if (i <= 1114111) {
                    S((i >> 18) | 240);
                    i2 = ((i >> 12) & 63) | 128;
                } else {
                    StringBuilder b2 = e5.b("Unexpected code point: ");
                    b2.append(Integer.toHexString(i));
                    throw new IllegalArgumentException(b2.toString());
                }
                S(i2);
                i3 = ((i >> 6) & 63) | 128;
            }
            S(i3);
            i = (i & 63) | 128;
        }
        S(i);
    }

    public final void a() {
        try {
            skip(this.Q);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.bb
    public final za b() {
        return this;
    }

    @Override // defpackage.mt0
    public final cx0 c() {
        return cx0.d;
    }

    @Override // defpackage.mt0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    /* renamed from: d */
    public final za clone() {
        za zaVar = new za();
        if (this.Q == 0) {
            return zaVar;
        }
        sq0 c = this.P.c();
        zaVar.P = c;
        c.g = c;
        c.f = c;
        sq0 sq0Var = this.P;
        while (true) {
            sq0Var = sq0Var.f;
            if (sq0Var == this.P) {
                zaVar.Q = this.Q;
                return zaVar;
            }
            zaVar.P.g.b(sq0Var.c());
        }
    }

    @Override // defpackage.dt0
    public final void e(za zaVar, long j) {
        sq0 sq0Var;
        sq0 b2;
        int i;
        if (zaVar != null) {
            if (zaVar != this) {
                b31.a(zaVar.Q, 0L, j);
                while (j > 0) {
                    sq0 sq0Var2 = zaVar.P;
                    int i2 = sq0Var2.c - sq0Var2.b;
                    int i3 = 0;
                    if (j < i2) {
                        sq0 sq0Var3 = this.P;
                        if (sq0Var3 != null) {
                            sq0Var = sq0Var3.g;
                        } else {
                            sq0Var = null;
                        }
                        if (sq0Var != null && sq0Var.e) {
                            long j2 = sq0Var.c + j;
                            if (sq0Var.d) {
                                i = 0;
                            } else {
                                i = sq0Var.b;
                            }
                            if (j2 - i <= 8192) {
                                sq0Var2.d(sq0Var, (int) j);
                                zaVar.Q -= j;
                                this.Q += j;
                                return;
                            }
                        }
                        int i4 = (int) j;
                        if (i4 > 0 && i4 <= i2) {
                            if (i4 >= 1024) {
                                b2 = sq0Var2.c();
                            } else {
                                b2 = tq0.b();
                                System.arraycopy(sq0Var2.a, sq0Var2.b, b2.a, 0, i4);
                            }
                            b2.c = b2.b + i4;
                            sq0Var2.b += i4;
                            sq0Var2.g.b(b2);
                            zaVar.P = b2;
                        } else {
                            throw new IllegalArgumentException();
                        }
                    }
                    sq0 sq0Var4 = zaVar.P;
                    long j3 = sq0Var4.c - sq0Var4.b;
                    zaVar.P = sq0Var4.a();
                    sq0 sq0Var5 = this.P;
                    if (sq0Var5 == null) {
                        this.P = sq0Var4;
                        sq0Var4.g = sq0Var4;
                        sq0Var4.f = sq0Var4;
                    } else {
                        sq0Var5.g.b(sq0Var4);
                        sq0 sq0Var6 = sq0Var4.g;
                        if (sq0Var6 != sq0Var4) {
                            if (sq0Var6.e) {
                                int i5 = sq0Var4.c - sq0Var4.b;
                                int i6 = 8192 - sq0Var6.c;
                                if (!sq0Var6.d) {
                                    i3 = sq0Var6.b;
                                }
                                if (i5 <= i6 + i3) {
                                    sq0Var4.d(sq0Var6, i5);
                                    sq0Var4.a();
                                    tq0.a(sq0Var4);
                                }
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    zaVar.Q -= j3;
                    this.Q += j3;
                    j -= j3;
                }
                return;
            }
            throw new IllegalArgumentException("source == this");
        }
        throw new IllegalArgumentException("source == null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof za) {
            za zaVar = (za) obj;
            long j = this.Q;
            if (j != zaVar.Q) {
                return false;
            }
            long j2 = 0;
            if (j == 0) {
                return true;
            }
            sq0 sq0Var = this.P;
            sq0 sq0Var2 = zaVar.P;
            int i = sq0Var.b;
            int i2 = sq0Var2.b;
            while (j2 < this.Q) {
                long min = Math.min(sq0Var.c - i, sq0Var2.c - i2);
                int i3 = 0;
                while (i3 < min) {
                    int i4 = i + 1;
                    int i5 = i2 + 1;
                    if (sq0Var.a[i] != sq0Var2.a[i2]) {
                        return false;
                    }
                    i3++;
                    i = i4;
                    i2 = i5;
                }
                if (i == sq0Var.c) {
                    sq0Var = sq0Var.f;
                    i = sq0Var.b;
                }
                if (i2 == sq0Var2.c) {
                    sq0Var2 = sq0Var2.f;
                    i2 = sq0Var2.b;
                }
                j2 += min;
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.ab
    public final /* bridge */ /* synthetic */ ab f(long j) {
        U(j);
        return this;
    }

    @Override // defpackage.ab, defpackage.dt0, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.bb
    public final fb h(long j) {
        return new fb(J(j));
    }

    public final int hashCode() {
        sq0 sq0Var = this.P;
        if (sq0Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = sq0Var.c;
            for (int i3 = sq0Var.b; i3 < i2; i3++) {
                i = (i * 31) + sq0Var.a[i3];
            }
            sq0Var = sq0Var.f;
        } while (sq0Var != this.P);
        return i;
    }

    @Override // defpackage.ab
    public final ab i() {
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // defpackage.bb
    public final boolean j(long j) {
        return this.Q >= RecyclerView.FOREVER_NS;
    }

    @Override // defpackage.bb
    public final long k(za zaVar) {
        long j = this.Q;
        if (j > 0) {
            zaVar.e(this, j);
        }
        return j;
    }

    @Override // defpackage.bb
    public final String l() {
        return r(RecyclerView.FOREVER_NS);
    }

    @Override // defpackage.bb
    public final byte[] m() {
        try {
            return J(this.Q);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.bb
    public final boolean n() {
        return this.Q == 0;
    }

    @Override // defpackage.ab
    public final long o(mt0 mt0Var) {
        if (mt0Var == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long q = mt0Var.q(this, 8192L);
            if (q == -1) {
                return j;
            }
            j += q;
        }
    }

    @Override // defpackage.ab
    public final ab p() {
        return this;
    }

    @Override // defpackage.mt0
    public final long q(za zaVar, long j) {
        if (zaVar != null) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            long j2 = this.Q;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            zaVar.e(this, j);
            return j;
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override // defpackage.bb
    public final String r(long j) {
        if (j >= 0) {
            long j2 = RecyclerView.FOREVER_NS;
            if (j != RecyclerView.FOREVER_NS) {
                j2 = j + 1;
            }
            long H = H((byte) 10, 0L, j2);
            if (H != -1) {
                return O(H);
            }
            if (j2 < this.Q && G(j2 - 1) == 13 && G(j2) == 10) {
                return O(j2);
            }
            za zaVar = new za();
            F(zaVar, 0L, Math.min(32L, this.Q));
            StringBuilder b2 = e5.b("\\n not found: limit=");
            b2.append(Math.min(this.Q, j));
            b2.append(" content=");
            b2.append(zaVar.K().j());
            b2.append((char) 8230);
            throw new EOFException(b2.toString());
        }
        throw new IllegalArgumentException("limit < 0: " + j);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        sq0 sq0Var = this.P;
        if (sq0Var == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), sq0Var.c - sq0Var.b);
        byteBuffer.put(sq0Var.a, sq0Var.b, min);
        int i = sq0Var.b + min;
        sq0Var.b = i;
        this.Q -= min;
        if (i == sq0Var.c) {
            this.P = sq0Var.a();
            tq0.a(sq0Var);
        }
        return min;
    }

    @Override // defpackage.bb
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) {
        b31.a(bArr.length, i, i2);
        sq0 sq0Var = this.P;
        if (sq0Var == null) {
            return -1;
        }
        int min = Math.min(i2, sq0Var.c - sq0Var.b);
        System.arraycopy(sq0Var.a, sq0Var.b, bArr, i, min);
        int i3 = sq0Var.b + min;
        sq0Var.b = i3;
        this.Q -= min;
        if (i3 == sq0Var.c) {
            this.P = sq0Var.a();
            tq0.a(sq0Var);
        }
        return min;
    }

    @Override // defpackage.bb
    public final byte readByte() {
        long j = this.Q;
        if (j != 0) {
            sq0 sq0Var = this.P;
            int i = sq0Var.b;
            int i2 = sq0Var.c;
            int i3 = i + 1;
            byte b2 = sq0Var.a[i];
            this.Q = j - 1;
            if (i3 == i2) {
                this.P = sq0Var.a();
                tq0.a(sq0Var);
            } else {
                sq0Var.b = i3;
            }
            return b2;
        }
        throw new IllegalStateException("size == 0");
    }

    @Override // defpackage.bb
    public final void readFully(byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read == -1) {
                throw new EOFException();
            }
            i += read;
        }
    }

    @Override // defpackage.bb
    public final int readInt() {
        long j = this.Q;
        if (j >= 4) {
            sq0 sq0Var = this.P;
            int i = sq0Var.b;
            int i2 = sq0Var.c;
            if (i2 - i < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = sq0Var.a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i6 = i4 + 1;
            int i7 = i5 | ((bArr[i4] & 255) << 8);
            int i8 = i6 + 1;
            int i9 = i7 | (bArr[i6] & 255);
            this.Q = j - 4;
            if (i8 == i2) {
                this.P = sq0Var.a();
                tq0.a(sq0Var);
            } else {
                sq0Var.b = i8;
            }
            return i9;
        }
        StringBuilder b2 = e5.b("size < 4: ");
        b2.append(this.Q);
        throw new IllegalStateException(b2.toString());
    }

    @Override // defpackage.bb
    public final long readLong() {
        long j = this.Q;
        if (j >= 8) {
            sq0 sq0Var = this.P;
            int i = sq0Var.b;
            int i2 = sq0Var.c;
            if (i2 - i < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            }
            byte[] bArr = sq0Var.a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            long j2 = ((bArr[i] & 255) << 56) | ((bArr[i3] & 255) << 48) | ((bArr[i4] & 255) << 40) | ((bArr[i5] & 255) << 32) | ((bArr[i6] & 255) << 24) | ((bArr[i7] & 255) << 16);
            int i9 = i8 + 1;
            int i10 = i9 + 1;
            long j3 = (bArr[i9] & 255) | ((bArr[i8] & 255) << 8) | j2;
            this.Q = j - 8;
            if (i10 == i2) {
                this.P = sq0Var.a();
                tq0.a(sq0Var);
            } else {
                sq0Var.b = i10;
            }
            return j3;
        }
        StringBuilder b2 = e5.b("size < 8: ");
        b2.append(this.Q);
        throw new IllegalStateException(b2.toString());
    }

    @Override // defpackage.bb
    public final short readShort() {
        long j = this.Q;
        if (j >= 2) {
            sq0 sq0Var = this.P;
            int i = sq0Var.b;
            int i2 = sq0Var.c;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = sq0Var.a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.Q = j - 2;
            if (i4 == i2) {
                this.P = sq0Var.a();
                tq0.a(sq0Var);
            } else {
                sq0Var.b = i4;
            }
            return (short) i5;
        }
        StringBuilder b2 = e5.b("size < 2: ");
        b2.append(this.Q);
        throw new IllegalStateException(b2.toString());
    }

    @Override // defpackage.bb
    public final int s(cd0 cd0Var) {
        int P = P(cd0Var, false);
        if (P == -1) {
            return -1;
        }
        try {
            skip(cd0Var.P[P].n());
            return P;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    @Override // defpackage.bb
    public final void skip(long j) {
        sq0 sq0Var;
        while (j > 0) {
            if (this.P == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, sq0Var.c - sq0Var.b);
            long j2 = min;
            this.Q -= j2;
            j -= j2;
            sq0 sq0Var2 = this.P;
            int i = sq0Var2.b + min;
            sq0Var2.b = i;
            if (i == sq0Var2.c) {
                this.P = sq0Var2.a();
                tq0.a(sq0Var2);
            }
        }
    }

    public final String toString() {
        fb uq0Var;
        long j = this.Q;
        if (j <= 2147483647L) {
            int i = (int) j;
            if (i == 0) {
                uq0Var = fb.T;
            } else {
                uq0Var = new uq0(this, i);
            }
            return uq0Var.toString();
        }
        StringBuilder b2 = e5.b("size > Integer.MAX_VALUE: ");
        b2.append(this.Q);
        throw new IllegalArgumentException(b2.toString());
    }

    @Override // defpackage.bb
    public final void u(long j) {
        if (this.Q < j) {
            throw new EOFException();
        }
    }

    @Override // defpackage.ab
    public final ab v(String str) {
        X(0, str.length(), str);
        return this;
    }

    @Override // defpackage.ab
    public final /* bridge */ /* synthetic */ ab w(long j) {
        T(j);
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                sq0 Q = Q(1);
                int min = Math.min(i, 8192 - Q.c);
                byteBuffer.get(Q.a, Q.c, min);
                i -= min;
                Q.c += min;
            }
            this.Q += remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // defpackage.ab
    public final /* bridge */ /* synthetic */ ab write(byte[] bArr) {
        m7write(bArr);
        return this;
    }

    @Override // defpackage.ab
    public final /* bridge */ /* synthetic */ ab write(byte[] bArr, int i, int i2) {
        m8write(bArr, i, i2);
        return this;
    }

    /* renamed from: write  reason: collision with other method in class */
    public final void m7write(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        m8write(bArr, 0, bArr.length);
    }

    /* renamed from: write  reason: collision with other method in class */
    public final void m8write(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = i2;
        b31.a(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            sq0 Q = Q(1);
            int min = Math.min(i3 - i, 8192 - Q.c);
            System.arraycopy(bArr, i, Q.a, Q.c, min);
            i += min;
            Q.c += min;
        }
        this.Q += j;
    }

    @Override // defpackage.ab
    public final /* bridge */ /* synthetic */ ab writeByte(int i) {
        S(i);
        return this;
    }

    @Override // defpackage.ab
    public final /* bridge */ /* synthetic */ ab writeInt(int i) {
        V(i);
        return this;
    }

    @Override // defpackage.ab
    public final /* bridge */ /* synthetic */ ab writeShort(int i) {
        W(i);
        return this;
    }

    @Override // defpackage.bb
    public final void z(za zaVar, long j) {
        long j2 = this.Q;
        if (j2 >= j) {
            zaVar.e(this, j);
        } else {
            zaVar.e(this, j2);
            throw new EOFException();
        }
    }
}