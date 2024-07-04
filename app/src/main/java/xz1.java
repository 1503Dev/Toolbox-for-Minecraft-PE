package defpackage;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: xz1  reason: default package */
public final class xz1 {
    public static Cipher a;
    public static final Object b = new Object();
    public static final Object c = new Object();

    public static String a(byte[] bArr, byte[] bArr2) {
        byte[] doFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (b) {
                c().init(1, secretKeySpec, (SecureRandom) null);
                doFinal = c().doFinal(bArr2);
                iv = c().getIV();
            }
            int length2 = doFinal.length + iv.length;
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(iv).put(doFinal);
            allocate.flip();
            byte[] bArr3 = new byte[length2];
            allocate.get(bArr3);
            return Base64.encodeToString(bArr3, 2);
        } catch (InvalidKeyException e) {
            throw new wz1(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new wz1(e2);
        } catch (BadPaddingException e3) {
            throw new wz1(e3);
        } catch (IllegalBlockSizeException e4) {
            throw new wz1(e4);
        } catch (NoSuchPaddingException e5) {
            throw new wz1(e5);
        }
    }

    public static byte[] b(String str, byte[] bArr) {
        byte[] doFinal;
        int length = bArr.length;
        try {
            byte[] a2 = ty1.a(str, false);
            int length2 = a2.length;
            if (length2 > 16) {
                ByteBuffer allocate = ByteBuffer.allocate(length2);
                allocate.put(a2);
                allocate.flip();
                byte[] bArr2 = new byte[16];
                byte[] bArr3 = new byte[length2 - 16];
                allocate.get(bArr2);
                allocate.get(bArr3);
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                synchronized (b) {
                    c().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                    doFinal = c().doFinal(bArr3);
                }
                return doFinal;
            }
            throw new wz1();
        } catch (IllegalArgumentException e) {
            throw new wz1(e);
        } catch (InvalidAlgorithmParameterException e2) {
            throw new wz1(e2);
        } catch (InvalidKeyException e3) {
            throw new wz1(e3);
        } catch (NoSuchAlgorithmException e4) {
            throw new wz1(e4);
        } catch (BadPaddingException e5) {
            throw new wz1(e5);
        } catch (IllegalBlockSizeException e6) {
            throw new wz1(e6);
        } catch (NoSuchPaddingException e7) {
            throw new wz1(e7);
        }
    }

    public static final Cipher c() {
        Cipher cipher;
        synchronized (c) {
            if (a == null) {
                a = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = a;
        }
        return cipher;
    }
}