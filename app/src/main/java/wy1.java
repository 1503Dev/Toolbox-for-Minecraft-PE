package defpackage;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: wy1  reason: default package */
public final class wy1 {
    public static boolean a = false;
    public static MessageDigest b;
    public static final Object c = new Object();
    public static final Object d = new Object();
    public static final CountDownLatch e = new CountDownLatch(1);

    public static String a(String str, byte[] bArr) {
        byte[] d2;
        ie5 h;
        byte[] bArr2;
        if (!((Boolean) w82.d.c.a(x92.D2)).booleanValue()) {
            if (ea2.R != null) {
                if (str != null) {
                    bArr2 = str.getBytes();
                } else {
                    bArr2 = new byte[0];
                }
                byte[] b2 = ea2.R.b(bArr, bArr2);
                qy1 w = ry1.w();
                ed5 ed5Var = gd5.Q;
                ed5 G = gd5.G(b2, 0, b2.length);
                w.j();
                ry1.y((ry1) w.Q, G);
                w.j();
                ry1.A((ry1) w.Q, 3);
                h = w.h();
            } else {
                throw new GeneralSecurityException();
            }
        } else {
            Vector vector = null;
            int length = bArr.length;
            if (length > 0) {
                int i = length + 254;
                Vector vector2 = new Vector();
                for (int i2 = 0; i2 < i / 255; i2++) {
                    int i3 = i2 * 255;
                    try {
                        int length2 = bArr.length;
                        if (length2 - i3 > 255) {
                            length2 = i3 + 255;
                        }
                        vector2.add(Arrays.copyOfRange(bArr, i3, length2));
                    } catch (IndexOutOfBoundsException unused) {
                    }
                }
                vector = vector2;
            }
            if (vector != null && vector.size() != 0) {
                qy1 w2 = ry1.w();
                int size = vector.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ed5 G2 = gd5.G(d((byte[]) vector.get(i4), str, false), 0, 256);
                    w2.j();
                    ry1.y((ry1) w2.Q, G2);
                }
                byte[] c2 = c(bArr);
                ed5 ed5Var2 = gd5.Q;
                ed5 G3 = gd5.G(c2, 0, c2.length);
                w2.j();
                ry1.z((ry1) w2.Q, G3);
                h = w2.h();
            } else {
                gx1 X = ey1.X();
                X.j();
                ey1.I0((ey1) X.Q, 4096L);
                d2 = d(((ey1) X.h()).D(), str, true);
                return Base64.encodeToString(d2, 11);
            }
        }
        d2 = ((ry1) h).D();
        return Base64.encodeToString(d2, 11);
    }

    public static void b() {
        synchronized (d) {
            if (!a) {
                a = true;
                new Thread(new vy1()).start();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
        r1.reset();
        r1.update(r6);
        r6 = defpackage.wy1.b.digest();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] c(byte[] bArr) {
        byte[] digest;
        MessageDigest messageDigest;
        synchronized (c) {
            b();
            MessageDigest messageDigest2 = null;
            try {
                if (e.await(2L, TimeUnit.SECONDS) && (messageDigest = b) != null) {
                    messageDigest2 = messageDigest;
                }
            } catch (InterruptedException unused) {
            }
            throw new NoSuchAlgorithmException("Cannot compute hash");
        }
        return digest;
        throw new NoSuchAlgorithmException("Cannot compute hash");
    }

    public static byte[] d(byte[] bArr, String str, boolean z) {
        int i;
        ByteBuffer put;
        int length = bArr.length;
        if (true != z) {
            i = 255;
        } else {
            i = 239;
        }
        if (length > i) {
            gx1 X = ey1.X();
            X.j();
            ey1.I0((ey1) X.Q, 4096L);
            bArr = ((ey1) X.h()).D();
        }
        int length2 = bArr.length;
        if (length2 < i) {
            byte[] bArr2 = new byte[i - length2];
            new SecureRandom().nextBytes(bArr2);
            put = ByteBuffer.allocate(i + 1).put((byte) length2).put(bArr).put(bArr2);
        } else {
            put = ByteBuffer.allocate(i + 1).put((byte) length2).put(bArr);
        }
        byte[] array = put.array();
        if (z) {
            array = ByteBuffer.allocate(256).put(c(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        bz1[] bz1VarArr = new fz1().G2;
        int length3 = bz1VarArr.length;
        for (int i2 = 0; i2 < 12; i2++) {
            bz1VarArr[i2].b(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            tc5 tc5Var = new tc5(str.getBytes("UTF-8"));
            int i3 = tc5Var.b;
            int i4 = tc5Var.c;
            for (int i5 = 0; i5 < 256; i5++) {
                byte[] bArr4 = tc5Var.a;
                i3 = (i3 + 1) & 255;
                byte b2 = bArr4[i3];
                i4 = (i4 + b2) & 255;
                bArr4[i3] = bArr4[i4];
                bArr4[i4] = b2;
                bArr3[i5] = (byte) (bArr4[(bArr4[i3] + b2) & 255] ^ bArr3[i5]);
            }
            tc5Var.b = i3;
            tc5Var.c = i4;
        }
        return bArr3;
    }
}