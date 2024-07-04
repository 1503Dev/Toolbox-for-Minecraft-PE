package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: vy1  reason: default package */
public final class vy1 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            wy1.b = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
        } catch (Throwable th) {
            wy1.e.countDown();
            throw th;
        }
        wy1.e.countDown();
    }
}