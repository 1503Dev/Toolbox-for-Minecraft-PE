package defpackage;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* renamed from: ij4  reason: default package */
public final class ij4 {
    public ij4() {
        try {
            z05.a();
        } catch (GeneralSecurityException e) {
            vz3.k("Failed to Configure Aead. ".concat(e.toString()));
            jv5.A.g.f("CryptoUtils.registerAead", e);
        }
    }

    @Nullable
    public static final String a(byte[] bArr, byte[] bArr2, String str, xr3 xr3Var) {
        m05 m05Var;
        try {
            m05Var = nu2.g(new wk1(new ByteArrayInputStream(Base64.decode(str, 11))));
        } catch (IOException | GeneralSecurityException e) {
            vz3.k("Failed to get keysethandle".concat(e.toString()));
            jv5.A.g.f("CryptoUtils.getHandle", e);
            m05Var = null;
        }
        if (m05Var == null) {
            return null;
        }
        try {
            byte[] b = ((uz4) m05Var.c(uz4.class)).b(bArr, bArr2);
            xr3Var.a.put("ds", "1");
            return new String(b, "UTF-8");
        } catch (UnsupportedEncodingException | GeneralSecurityException e2) {
            vz3.k("Failed to decrypt ".concat(e2.toString()));
            jv5.A.g.f("CryptoUtils.decrypt", e2);
            xr3Var.a.put("dsf", e2.toString());
            return null;
        }
    }
}