package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: o  reason: default package */
public final class o extends t {
    public static final ConcurrentHashMap R = new ConcurrentHashMap();
    public final String P;
    public byte[] Q;

    /* renamed from: o$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        public final int a;
        public final byte[] b;

        public a(byte[] bArr) {
            this.a = j7.h(bArr);
            this.b = bArr;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return j7.a(this.b, ((a) obj).b);
            }
            return false;
        }

        public final int hashCode() {
            return this.a;
        }
    }

    public o(String str) {
        char charAt;
        if (str == null) {
            throw new IllegalArgumentException("'identifier' cannot be null");
        }
        boolean z = false;
        if (str.length() >= 3 && str.charAt(1) == '.' && (charAt = str.charAt(0)) >= '0' && charAt <= '2') {
            z = C(2, str);
        }
        if (z) {
            this.P = str;
            return;
        }
        throw new IllegalArgumentException(ij.c("string ", str, " not an OID"));
    }

    public o(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = true;
        long j = 0;
        BigInteger bigInteger = null;
        for (int i = 0; i != bArr.length; i++) {
            int i2 = bArr[i] & 255;
            if (j <= 72057594037927808L) {
                long j2 = j + (i2 & 127);
                if ((i2 & 128) == 0) {
                    if (z) {
                        if (j2 < 40) {
                            stringBuffer.append('0');
                        } else if (j2 < 80) {
                            stringBuffer.append('1');
                            j2 -= 40;
                        } else {
                            stringBuffer.append('2');
                            j2 -= 80;
                        }
                        z = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(j2);
                    j = 0;
                } else {
                    j = j2 << 7;
                }
            } else {
                BigInteger or = (bigInteger == null ? BigInteger.valueOf(j) : bigInteger).or(BigInteger.valueOf(i2 & 127));
                if ((i2 & 128) == 0) {
                    if (z) {
                        stringBuffer.append('2');
                        or = or.subtract(BigInteger.valueOf(80L));
                        z = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(or);
                    j = 0;
                    bigInteger = null;
                } else {
                    bigInteger = or.shiftLeft(7);
                }
            }
        }
        this.P = stringBuffer.toString();
        this.Q = j7.c(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
        if (r3 != '.') goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean C(int i, String str) {
        boolean z;
        int length = str.length();
        do {
            z = false;
            while (true) {
                length--;
                if (length < i) {
                    return z;
                }
                char charAt = str.charAt(length);
                if ('0' > charAt || charAt > '9') {
                    break;
                }
                z = true;
            }
        } while (z);
        return false;
    }

    public static void D(ByteArrayOutputStream byteArrayOutputStream, long j) {
        byte[] bArr = new byte[9];
        int i = 8;
        bArr[8] = (byte) (((int) j) & 127);
        while (j >= 128) {
            j >>= 7;
            i--;
            bArr[i] = (byte) ((((int) j) & 127) | 128);
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }

    public static void E(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int bitLength = (bigInteger.bitLength() + 6) / 7;
        if (bitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[bitLength];
        int i = bitLength - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            bArr[i2] = (byte) ((bigInteger.intValue() & 127) | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i] = (byte) (bArr[i] & Byte.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, bitLength);
    }

    public static o z(g gVar) {
        if (gVar != null && !(gVar instanceof o)) {
            if (gVar.h() instanceof o) {
                return (o) gVar.h();
            }
            if (gVar instanceof byte[]) {
                try {
                    return (o) t.s((byte[]) gVar);
                } catch (IOException e) {
                    StringBuilder b = e5.b("failed to construct object identifier from byte[]: ");
                    b.append(e.getMessage());
                    throw new IllegalArgumentException(b.toString());
                }
            }
            StringBuilder b2 = e5.b("illegal object in getInstance: ");
            b2.append(gVar.getClass().getName());
            throw new IllegalArgumentException(b2.toString());
        }
        return (o) gVar;
    }

    public final o B() {
        a aVar = new a(y());
        ConcurrentHashMap concurrentHashMap = R;
        o oVar = (o) concurrentHashMap.get(aVar);
        if (oVar == null) {
            o oVar2 = (o) concurrentHashMap.putIfAbsent(aVar, this);
            return oVar2 == null ? this : oVar2;
        }
        return oVar;
    }

    @Override // defpackage.t, defpackage.n
    public final int hashCode() {
        return this.P.hashCode();
    }

    @Override // defpackage.t
    public final boolean p(t tVar) {
        if (tVar == this) {
            return true;
        }
        if (tVar instanceof o) {
            return this.P.equals(((o) tVar).P);
        }
        return false;
    }

    @Override // defpackage.t
    public final void q(r rVar) {
        byte[] y = y();
        rVar.c(6);
        rVar.f(y.length);
        rVar.a.write(y);
    }

    @Override // defpackage.t
    public final int r() {
        int length = y().length;
        return eu0.a(length) + 1 + length;
    }

    @Override // defpackage.t
    public final boolean t() {
        return false;
    }

    public final String toString() {
        return this.P;
    }

    public final void w(String str) {
        new o(str, this);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0049 -> B:14:0x004d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(java.io.ByteArrayOutputStream r8) {
        /*
            r7 = this;
            na0 r0 = new na0
            java.lang.String r1 = r7.P
            r0.<init>(r1)
            java.lang.String r1 = r0.a()
            int r1 = java.lang.Integer.parseInt(r1)
            int r1 = r1 * 40
            java.lang.String r2 = r0.a()
            int r3 = r2.length()
            r4 = 18
            if (r3 > r4) goto L24
            long r5 = (long) r1
            long r1 = java.lang.Long.parseLong(r2)
            long r1 = r1 + r5
            goto L4d
        L24:
            java.math.BigInteger r3 = new java.math.BigInteger
            r3.<init>(r2)
            long r1 = (long) r1
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r1)
            java.math.BigInteger r1 = r3.add(r1)
            E(r8, r1)
        L35:
            int r1 = r0.b
            r2 = -1
            if (r1 == r2) goto L3c
            r1 = 1
            goto L3d
        L3c:
            r1 = 0
        L3d:
            if (r1 == 0) goto L5a
            java.lang.String r1 = r0.a()
            int r2 = r1.length()
            if (r2 > r4) goto L51
            long r1 = java.lang.Long.parseLong(r1)
        L4d:
            D(r8, r1)
            goto L35
        L51:
            java.math.BigInteger r2 = new java.math.BigInteger
            r2.<init>(r1)
            E(r8, r2)
            goto L35
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o.x(java.io.ByteArrayOutputStream):void");
    }

    public final synchronized byte[] y() {
        if (this.Q == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            x(byteArrayOutputStream);
            this.Q = byteArrayOutputStream.toByteArray();
        }
        return this.Q;
    }

    public o(String str, o oVar) {
        if (C(0, str)) {
            this.P = oVar.P + "." + str;
            return;
        }
        throw new IllegalArgumentException(ij.c("string ", str, " not a valid OID branch"));
    }
}