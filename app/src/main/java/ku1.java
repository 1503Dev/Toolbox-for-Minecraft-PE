package defpackage;

import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: ku1  reason: default package */
public final class ku1 {
    public static X509Certificate[][] a(String str) {
        Pair a;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            if (randomAccessFile.length() < 22) {
                a = null;
            } else {
                a = lu1.a(randomAccessFile, 0);
                if (a == null) {
                    a = lu1.a(randomAccessFile, 65535);
                }
            }
            if (a != null) {
                ByteBuffer byteBuffer = (ByteBuffer) a.first;
                long longValue = ((Long) a.second).longValue();
                long j = (-20) + longValue;
                if (j >= 0) {
                    randomAccessFile.seek(j);
                    if (randomAccessFile.readInt() == 1347094023) {
                        throw new iu1("ZIP64 APK not supported");
                    }
                }
                lu1.b(byteBuffer);
                long j2 = byteBuffer.getInt(byteBuffer.position() + 16) & 4294967295L;
                if (j2 < longValue) {
                    lu1.b(byteBuffer);
                    if ((byteBuffer.getInt(byteBuffer.position() + 12) & 4294967295L) + j2 == longValue) {
                        if (j2 >= 32) {
                            ByteBuffer allocate = ByteBuffer.allocate(24);
                            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                            allocate.order(byteOrder);
                            randomAccessFile.seek(j2 - allocate.capacity());
                            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                            if (allocate.getLong(8) == 2334950737559900225L && allocate.getLong(16) == 3617552046287187010L) {
                                long j3 = allocate.getLong(0);
                                if (j3 >= allocate.capacity() && j3 <= 2147483639) {
                                    int i = (int) (8 + j3);
                                    long j4 = j2 - i;
                                    if (j4 >= 0) {
                                        ByteBuffer allocate2 = ByteBuffer.allocate(i);
                                        allocate2.order(byteOrder);
                                        randomAccessFile.seek(j4);
                                        randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                                        long j5 = allocate2.getLong(0);
                                        if (j5 == j3) {
                                            Pair create = Pair.create(allocate2, Long.valueOf(j4));
                                            ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
                                            long longValue2 = ((Long) create.second).longValue();
                                            if (byteBuffer2.order() == byteOrder) {
                                                int capacity = byteBuffer2.capacity() - 24;
                                                if (capacity >= 8) {
                                                    int capacity2 = byteBuffer2.capacity();
                                                    if (capacity <= byteBuffer2.capacity()) {
                                                        int limit = byteBuffer2.limit();
                                                        int position = byteBuffer2.position();
                                                        byteBuffer2.position(0);
                                                        byteBuffer2.limit(capacity);
                                                        byteBuffer2.position(8);
                                                        ByteBuffer slice = byteBuffer2.slice();
                                                        slice.order(byteBuffer2.order());
                                                        byteBuffer2.position(0);
                                                        byteBuffer2.limit(limit);
                                                        byteBuffer2.position(position);
                                                        int i2 = 0;
                                                        while (slice.hasRemaining()) {
                                                            i2++;
                                                            if (slice.remaining() >= 8) {
                                                                long j6 = slice.getLong();
                                                                if (j6 >= 4 && j6 <= 2147483647L) {
                                                                    int i3 = (int) j6;
                                                                    int position2 = slice.position() + i3;
                                                                    if (i3 <= slice.remaining()) {
                                                                        if (slice.getInt() == 1896449818) {
                                                                            X509Certificate[][] k = k(randomAccessFile.getChannel(), new hu1(e(i3 - 4, slice), longValue2, j2, longValue, byteBuffer));
                                                                            randomAccessFile.close();
                                                                            try {
                                                                                randomAccessFile.close();
                                                                            } catch (IOException unused) {
                                                                            }
                                                                            return k;
                                                                        }
                                                                        slice.position(position2);
                                                                    } else {
                                                                        throw new iu1("APK Signing Block entry #" + i2 + " size out of range: " + i3 + ", available: " + slice.remaining());
                                                                    }
                                                                } else {
                                                                    throw new iu1("APK Signing Block entry #" + i2 + " size out of range: " + j6);
                                                                }
                                                            } else {
                                                                throw new iu1("Insufficient data to read size of APK Signing Block entry #" + i2);
                                                            }
                                                        }
                                                        throw new iu1("No APK Signature Scheme v2 block in APK Signing Block");
                                                    }
                                                    throw new IllegalArgumentException("end > capacity: " + capacity + " > " + capacity2);
                                                }
                                                throw new IllegalArgumentException("end < start: " + capacity + " < 8");
                                            }
                                            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                                        }
                                        throw new iu1("APK Signing Block sizes in header and footer do not match: " + j5 + " vs " + j3);
                                    }
                                    throw new iu1("APK Signing Block offset out of range: " + j4);
                                }
                                throw new iu1("APK Signing Block size out of range: " + j3);
                            }
                            throw new iu1("No APK Signing Block before ZIP Central Directory");
                        }
                        throw new iu1("APK too small for APK Signing Block. ZIP Central Directory offset: " + j2);
                    }
                    throw new iu1("ZIP Central Directory is not immediately followed by End of Central Directory");
                }
                throw new iu1("ZIP Central Directory offset out of range: " + j2 + ". ZIP End of Central Directory offset: " + longValue);
            }
            throw new iu1("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    public static int b(int i) {
        if (i != 1) {
            if (i == 2) {
                return 64;
            }
            throw new IllegalArgumentException(k6.a("Unknown content digest algorthm: ", i));
        }
        return 32;
    }

    public static int c(int i) {
        if (i != 513) {
            if (i != 514) {
                if (i != 769) {
                    switch (i) {
                        case 257:
                        case 259:
                            return 1;
                        case 258:
                        case 260:
                            return 2;
                        default:
                            throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
                    }
                }
                return 1;
            }
            return 2;
        }
        return 1;
    }

    public static String d(int i) {
        if (i != 1) {
            if (i == 2) {
                return "SHA-512";
            }
            throw new IllegalArgumentException(k6.a("Unknown content digest algorthm: ", i));
        }
        return "SHA-256";
    }

    public static ByteBuffer e(int i, ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (i2 < position || i2 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    public static ByteBuffer f(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= 4) {
            int i = byteBuffer.getInt();
            if (i >= 0) {
                if (i <= byteBuffer.remaining()) {
                    return e(i, byteBuffer);
                }
                throw new IOException(dp.b("Length-prefixed field longer than remaining buffer. Field length: ", i, ", remaining: ", byteBuffer.remaining()));
            }
            throw new IllegalArgumentException("Negative length");
        }
        throw new IOException(k6.a("Remaining buffer too short to contain length of length-prefixed field. Remaining: ", byteBuffer.remaining()));
    }

    public static void g(byte[] bArr, int i) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    public static byte[] h(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        if (i >= 0) {
            if (i <= byteBuffer.remaining()) {
                byte[] bArr = new byte[i];
                byteBuffer.get(bArr);
                return bArr;
            }
            throw new IOException(dp.b("Underflow while reading length-prefixed value. Length: ", i, ", available: ", byteBuffer.remaining()));
        }
        throw new IOException("Negative length");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
        r11 = c(r10);
        r12 = c(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r11 == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r12 == 1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0120 A[Catch: SignatureException -> 0x022a, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x022c, InvalidKeyException -> 0x022e, InvalidKeySpecException -> 0x0230, NoSuchAlgorithmException -> 0x0232, TryCatch #5 {InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x022c, blocks: (B:60:0x010a, B:62:0x0120, B:63:0x0123), top: B:131:0x010a }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static X509Certificate[] i(ByteBuffer byteBuffer, HashMap hashMap, CertificateFactory certificateFactory) {
        String str;
        String str2;
        Pair pair;
        String str3;
        AlgorithmParameterSpec algorithmParameterSpec;
        Signature signature;
        PSSParameterSpec pSSParameterSpec;
        String str4;
        ByteBuffer f = f(byteBuffer);
        ByteBuffer f2 = f(byteBuffer);
        byte[] h = h(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArr = null;
        int i = -1;
        int i2 = 0;
        byte[] bArr2 = null;
        while (f2.hasRemaining()) {
            i2++;
            try {
                ByteBuffer f3 = f(f2);
                if (f3.remaining() >= 8) {
                    int i3 = f3.getInt();
                    arrayList.add(Integer.valueOf(i3));
                    if (i3 != 513 && i3 != 514 && i3 != 769) {
                        switch (i3) {
                            case 257:
                            case 258:
                            case 259:
                            case 260:
                                break;
                            default:
                                continue;
                        }
                    }
                    bArr2 = h(f3);
                    i = i3;
                } else {
                    throw new SecurityException("Signature record too short");
                }
            } catch (IOException | BufferUnderflowException e) {
                throw new SecurityException(k6.a("Failed to parse signature record #", i2), e);
            }
        }
        if (i == -1) {
            if (i2 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i != 513 && i != 514) {
            if (i != 769) {
                switch (i) {
                    case 257:
                    case 258:
                    case 259:
                    case 260:
                        str = "RSA";
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
                }
            } else {
                str = "DSA";
            }
        } else {
            str = "EC";
        }
        try {
            if (i != 513) {
                if (i != 514) {
                    if (i != 769) {
                        switch (i) {
                            case 257:
                                pSSParameterSpec = new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1);
                                str4 = "SHA256withRSA/PSS";
                                pair = Pair.create(str4, pSSParameterSpec);
                                break;
                            case 258:
                                pSSParameterSpec = new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1);
                                str4 = "SHA512withRSA/PSS";
                                pair = Pair.create(str4, pSSParameterSpec);
                                break;
                            case 259:
                                str2 = "SHA256withRSA";
                                break;
                            case 260:
                                str2 = "SHA512withRSA";
                                break;
                            default:
                                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
                        }
                        str3 = (String) pair.first;
                        algorithmParameterSpec = (AlgorithmParameterSpec) pair.second;
                        PublicKey generatePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(h));
                        signature = Signature.getInstance(str3);
                        signature.initVerify(generatePublic);
                        if (algorithmParameterSpec != null) {
                            signature.setParameter(algorithmParameterSpec);
                        }
                        signature.update(f);
                        if (!signature.verify(bArr2)) {
                            f.clear();
                            ByteBuffer f4 = f(f);
                            ArrayList arrayList2 = new ArrayList();
                            int i4 = 0;
                            while (f4.hasRemaining()) {
                                i4++;
                                try {
                                    ByteBuffer f5 = f(f4);
                                    if (f5.remaining() >= 8) {
                                        int i5 = f5.getInt();
                                        arrayList2.add(Integer.valueOf(i5));
                                        if (i5 == i) {
                                            bArr = h(f5);
                                        }
                                    } else {
                                        throw new IOException("Record too short");
                                    }
                                } catch (IOException | BufferUnderflowException e2) {
                                    throw new IOException(k6.a("Failed to parse digest record #", i4), e2);
                                }
                            }
                            if (arrayList.equals(arrayList2)) {
                                int c = c(i);
                                byte[] bArr3 = (byte[]) hashMap.put(Integer.valueOf(c), bArr);
                                if (bArr3 != null && !MessageDigest.isEqual(bArr3, bArr)) {
                                    throw new SecurityException(d(c).concat(" contents digest does not match the digest specified by a preceding signer"));
                                }
                                ByteBuffer f6 = f(f);
                                ArrayList arrayList3 = new ArrayList();
                                int i6 = 0;
                                while (f6.hasRemaining()) {
                                    i6++;
                                    byte[] h2 = h(f6);
                                    try {
                                        arrayList3.add(new ju1((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(h2)), h2));
                                    } catch (CertificateException e3) {
                                        throw new SecurityException(k6.a("Failed to decode certificate #", i6), e3);
                                    }
                                }
                                if (!arrayList3.isEmpty()) {
                                    if (Arrays.equals(h, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                                        return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
                                    }
                                    throw new SecurityException("Public key mismatch between certificate and signature record");
                                }
                                throw new SecurityException("No certificates listed");
                            }
                            throw new SecurityException("Signature algorithms don't match between digests and signatures records");
                        }
                        throw new SecurityException(String.valueOf(str3).concat(" signature did not verify"));
                    }
                    str2 = "SHA256withDSA";
                } else {
                    str2 = "SHA512withECDSA";
                }
            } else {
                str2 = "SHA256withECDSA";
            }
            PublicKey generatePublic2 = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(h));
            signature = Signature.getInstance(str3);
            signature.initVerify(generatePublic2);
            if (algorithmParameterSpec != null) {
            }
            signature.update(f);
            if (!signature.verify(bArr2)) {
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e4) {
            throw new SecurityException(ij.c("Failed to verify ", str3, " signature"), e4);
        }
        pair = Pair.create(str2, null);
        str3 = (String) pair.first;
        algorithmParameterSpec = (AlgorithmParameterSpec) pair.second;
    }

    public static byte[][] j(int[] iArr, fu1[] fu1VarArr) {
        int i;
        long j;
        int length;
        long j2 = 0;
        int i2 = 0;
        long j3 = 0;
        while (true) {
            i = 3;
            j = 1048576;
            if (i2 >= 3) {
                break;
            }
            j3 += (fu1VarArr[i2].a() + 1048575) / 1048576;
            i2++;
        }
        if (j3 < 2097151) {
            byte[][] bArr = new byte[iArr.length];
            int i3 = 0;
            while (true) {
                length = iArr.length;
                if (i3 >= length) {
                    break;
                }
                int i4 = (int) j3;
                byte[] bArr2 = new byte[(b(iArr[i3]) * i4) + 5];
                bArr2[0] = 90;
                g(bArr2, i4);
                bArr[i3] = bArr2;
                i3++;
            }
            byte[] bArr3 = new byte[5];
            bArr3[0] = -91;
            MessageDigest[] messageDigestArr = new MessageDigest[length];
            for (int i5 = 0; i5 < iArr.length; i5++) {
                String d = d(iArr[i5]);
                try {
                    messageDigestArr[i5] = MessageDigest.getInstance(d);
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(d.concat(" digest not supported"), e);
                }
            }
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i6 < i) {
                fu1 fu1Var = fu1VarArr[i6];
                int i9 = i6;
                fu1 fu1Var2 = fu1Var;
                long a = fu1Var.a();
                int i10 = i8;
                long j4 = j;
                long j5 = j2;
                while (a > j2) {
                    int min = (int) Math.min(a, j4);
                    g(bArr3, min);
                    for (int i11 = 0; i11 < length; i11++) {
                        messageDigestArr[i11].update(bArr3);
                    }
                    fu1 fu1Var3 = fu1Var2;
                    try {
                        fu1Var3.f(messageDigestArr, j5, min);
                        int i12 = 0;
                        while (i12 < iArr.length) {
                            int i13 = iArr[i12];
                            fu1 fu1Var4 = fu1Var3;
                            byte[] bArr4 = bArr[i12];
                            int b = b(i13);
                            byte[] bArr5 = bArr3;
                            MessageDigest messageDigest = messageDigestArr[i12];
                            MessageDigest[] messageDigestArr2 = messageDigestArr;
                            int digest = messageDigest.digest(bArr4, (i10 * b) + 5, b);
                            if (digest == b) {
                                i12++;
                                fu1Var3 = fu1Var4;
                                bArr3 = bArr5;
                                messageDigestArr = messageDigestArr2;
                            } else {
                                throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + digest);
                            }
                        }
                        fu1Var2 = fu1Var3;
                        long j6 = min;
                        j5 += j6;
                        a -= j6;
                        i10++;
                        j2 = 0;
                        j4 = 1048576;
                    } catch (IOException e2) {
                        throw new DigestException(dp.b("Failed to digest chunk #", i10, " of section #", i7), e2);
                    }
                }
                i7++;
                i6 = i9 + 1;
                j2 = 0;
                i = 3;
                j = 1048576;
                i8 = i10;
            }
            byte[][] bArr6 = new byte[iArr.length];
            for (int i14 = 0; i14 < iArr.length; i14++) {
                int i15 = iArr[i14];
                byte[] bArr7 = bArr[i14];
                String d2 = d(i15);
                try {
                    bArr6[i14] = MessageDigest.getInstance(d2).digest(bArr7);
                } catch (NoSuchAlgorithmException e3) {
                    throw new RuntimeException(d2.concat(" digest not supported"), e3);
                }
            }
            return bArr6;
        }
        throw new DigestException("Too many chunks: " + j3);
    }

    public static X509Certificate[][] k(FileChannel fileChannel, hu1 hu1Var) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer f = f(hu1Var.a);
                int i = 0;
                while (f.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(i(f(f), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        throw new SecurityException(bp.b("Failed to parse/verify signer #", i, " block"), e);
                    }
                }
                if (i > 0) {
                    if (!hashMap.isEmpty()) {
                        long j = hu1Var.b;
                        long j2 = hu1Var.c;
                        long j3 = hu1Var.d;
                        ByteBuffer byteBuffer = hu1Var.e;
                        if (!hashMap.isEmpty()) {
                            gu1 gu1Var = new gu1(fileChannel, 0L, j);
                            gu1 gu1Var2 = new gu1(fileChannel, j2, j3 - j2);
                            ByteBuffer duplicate = byteBuffer.duplicate();
                            duplicate.order(ByteOrder.LITTLE_ENDIAN);
                            lu1.b(duplicate);
                            int position = duplicate.position() + 16;
                            if (j >= 0 && j <= 4294967295L) {
                                duplicate.putInt(duplicate.position() + position, (int) j);
                                wk1 wk1Var = new wk1(duplicate);
                                int size = hashMap.size();
                                int[] iArr = new int[size];
                                int i2 = 0;
                                for (Integer num : hashMap.keySet()) {
                                    iArr[i2] = num.intValue();
                                    i2++;
                                }
                                try {
                                    byte[][] j4 = j(iArr, new fu1[]{gu1Var, gu1Var2, wk1Var});
                                    for (int i3 = 0; i3 < size; i3++) {
                                        int i4 = iArr[i3];
                                        if (!MessageDigest.isEqual((byte[]) hashMap.get(Integer.valueOf(i4)), j4[i3])) {
                                            throw new SecurityException(d(i4).concat(" digest of contents did not verify"));
                                        }
                                    }
                                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                                } catch (DigestException e2) {
                                    throw new SecurityException("Failed to compute digest(s) of contents", e2);
                                }
                            }
                            throw new IllegalArgumentException("uint32 value of out range: " + j);
                        }
                        throw new SecurityException("No digests provided");
                    }
                    throw new SecurityException("No content digests found");
                }
                throw new SecurityException("No signers found");
            } catch (IOException e3) {
                throw new SecurityException("Failed to read list of signers", e3);
            }
        } catch (CertificateException e4) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e4);
        }
    }
}