package defpackage;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* renamed from: z05  reason: default package */
public final class z05 {
    public static final String a;
    public static final String b;

    static {
        new g15();
        a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        new x15();
        b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        new r25();
        new p15();
        new f35();
        new j35();
        new y25();
        new n35();
        int i = mb5.P;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        boolean z;
        x05.g(d15.b);
        u75.a();
        x05.f(new g15());
        x05.f(new x15());
        f65 f65Var = m25.a;
        b65 b65Var = b65.b;
        b65Var.e(m25.a);
        b65Var.d(m25.b);
        b65Var.c(m25.c);
        b65Var.b(m25.d);
        if (d45.a()) {
            return;
        }
        x05.f(new p15());
        b65Var.e(s15.a);
        b65Var.d(s15.b);
        b65Var.c(s15.c);
        b65Var.b(s15.d);
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            z = true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            z = false;
        }
        if (z) {
            x05.f(new r25());
            f65 f65Var2 = u25.a;
            b65 b65Var2 = b65.b;
            b65Var2.e(u25.a);
            b65Var2.d(u25.b);
            b65Var2.c(u25.c);
            b65Var2.b(u25.d);
        }
        x05.f(new y25());
        f65 f65Var3 = c35.a;
        b65 b65Var3 = b65.b;
        b65Var3.e(c35.a);
        b65Var3.d(c35.b);
        b65Var3.c(c35.c);
        b65Var3.b(c35.d);
        x05.f(new f35());
        x05.f(new j35());
        x05.f(new n35());
        b65Var3.e(q35.a);
        b65Var3.d(q35.b);
        b65Var3.c(q35.c);
        b65Var3.b(q35.d);
    }
}