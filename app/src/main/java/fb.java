package defpackage;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: fb  reason: default package */
public class fb implements Serializable, Comparable<fb> {
    public static final char[] S = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final fb T = k(new byte[0]);
    public final byte[] P;
    public transient int Q;
    public transient String R;

    public fb(byte[] bArr) {
        this.P = bArr;
    }

    public static fb f(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (g(str.charAt(i2 + 1)) + (g(str.charAt(i2)) << 4));
            }
            return k(bArr);
        }
        throw new IllegalArgumentException(k6.b("Unexpected hex string: ", str));
    }

    public static int g(char c) {
        if (c < '0' || c > '9') {
            char c2 = 'a';
            if (c < 'a' || c > 'f') {
                c2 = 'A';
                if (c < 'A' || c > 'F') {
                    throw new IllegalArgumentException("Unexpected hex digit: " + c);
                }
            }
            return (c - c2) + 10;
        }
        return c - '0';
    }

    public static fb h(String str) {
        if (str != null) {
            fb fbVar = new fb(str.getBytes(b31.a));
            fbVar.R = str;
            return fbVar;
        }
        throw new IllegalArgumentException("s == null");
    }

    public static fb k(byte... bArr) {
        if (bArr != null) {
            return new fb((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public ByteBuffer b() {
        return ByteBuffer.wrap(this.P).asReadOnlyBuffer();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compareTo(fb fbVar) {
        fb fbVar2 = fbVar;
        int n = n();
        int n2 = fbVar2.n();
        int min = Math.min(n, n2);
        for (int i = 0; i < min; i++) {
            int i2 = i(i) & 255;
            int i3 = fbVar2.i(i) & 255;
            if (i2 != i3) {
                return i2 < i3 ? -1 : 1;
            }
        }
        if (n == n2) {
            return 0;
        }
        if (n < n2) {
        }
    }

    public String e() {
        byte[] bArr = this.P;
        byte[] bArr2 = g9.P;
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int i3 = i + 1;
            bArr3[i] = bArr2[(bArr[i2] & 255) >> 2];
            int i4 = i3 + 1;
            int i5 = i2 + 1;
            bArr3[i3] = bArr2[((bArr[i2] & 3) << 4) | ((bArr[i5] & 255) >> 4)];
            int i6 = i4 + 1;
            int i7 = i2 + 2;
            bArr3[i4] = bArr2[((bArr[i5] & 15) << 2) | ((bArr[i7] & 255) >> 6)];
            i = i6 + 1;
            bArr3[i6] = bArr2[bArr[i7] & 63];
        }
        int length2 = bArr.length % 3;
        if (length2 != 1) {
            if (length2 == 2) {
                int i8 = i + 1;
                bArr3[i] = bArr2[(bArr[length] & 255) >> 2];
                int i9 = i8 + 1;
                int i10 = length + 1;
                bArr3[i8] = bArr2[((bArr[i10] & 255) >> 4) | ((bArr[length] & 3) << 4)];
                bArr3[i9] = bArr2[(bArr[i10] & 15) << 2];
                bArr3[i9 + 1] = 61;
            }
        } else {
            int i11 = i + 1;
            bArr3[i] = bArr2[(bArr[length] & 255) >> 2];
            int i12 = i11 + 1;
            bArr3[i11] = bArr2[(bArr[length] & 3) << 4];
            bArr3[i12] = 61;
            bArr3[i12 + 1] = 61;
        }
        try {
            return new String(bArr3, "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fb) {
            fb fbVar = (fb) obj;
            int n = fbVar.n();
            byte[] bArr = this.P;
            if (n == bArr.length && fbVar.l(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.Q;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.P);
        this.Q = hashCode;
        return hashCode;
    }

    public byte i(int i) {
        return this.P[i];
    }

    public String j() {
        byte[] bArr = this.P;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = S;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public boolean l(int i, int i2, int i3, byte[] bArr) {
        boolean z;
        if (i >= 0) {
            byte[] bArr2 = this.P;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
                Charset charset = b31.a;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z = true;
                        break;
                    } else if (bArr2[i4 + i] != bArr[i4 + i2]) {
                        z = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean m(fb fbVar, int i) {
        return fbVar.l(0, 0, i, this.P);
    }

    public int n() {
        return this.P.length;
    }

    public fb o() {
        byte[] bArr = this.P;
        if (64 <= bArr.length) {
            if (64 == bArr.length) {
                return this;
            }
            byte[] bArr2 = new byte[64];
            System.arraycopy(bArr, 0, bArr2, 0, 64);
            return new fb(bArr2);
        }
        StringBuilder b = e5.b("endIndex > length(");
        b.append(this.P.length);
        b.append(")");
        throw new IllegalArgumentException(b.toString());
    }

    public fb p() {
        int i = 0;
        while (true) {
            byte[] bArr = this.P;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b2 = bArr2[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArr2[i2] = (byte) (b2 + 32);
                    }
                }
                return new fb(bArr2);
            }
            i++;
        }
    }

    public String q() {
        String str = this.R;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.P, b31.a);
        this.R = str2;
        return str2;
    }

    public void r(za zaVar) {
        byte[] bArr = this.P;
        zaVar.m8write(bArr, 0, bArr.length);
    }

    public String toString() {
        StringBuilder sb;
        StringBuilder b;
        if (this.P.length == 0) {
            return "[size=0]";
        }
        String q = q();
        int length = q.length();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i < length) {
                if (i2 == 64) {
                    break;
                }
                int codePointAt = q.codePointAt(i);
                if ((!Character.isISOControl(codePointAt) || codePointAt == 10 || codePointAt == 13) && codePointAt != 65533) {
                    i2++;
                    i += Character.charCount(codePointAt);
                }
            } else {
                i = q.length();
                break;
            }
        }
        i = -1;
        if (i == -1) {
            if (this.P.length <= 64) {
                b = e5.b("[hex=");
                b.append(j());
                b.append("]");
            } else {
                b = e5.b("[size=");
                b.append(this.P.length);
                b.append(" hex=");
                b.append(o().j());
                b.append("…]");
            }
            return b.toString();
        }
        String replace = q.substring(0, i).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (i < q.length()) {
            sb = e5.b("[size=");
            sb.append(this.P.length);
            sb.append(" text=");
            sb.append(replace);
            sb.append("…]");
        } else {
            sb = new StringBuilder();
            sb.append("[text=");
            sb.append(replace);
            sb.append("]");
        }
        return sb.toString();
    }
}