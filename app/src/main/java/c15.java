package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* renamed from: c15  reason: default package */
public final class c15 implements uz4 {
    public final u05 a;

    public c15(u05 u05Var) {
        this.a = u05Var;
        if (u05Var.b()) {
            a85 a = z55.b.a();
            q05.g(u05Var);
            a.a();
            a.a();
        }
    }

    @Override // defpackage.uz4
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        try {
            byte[] C = mh.C(this.a.b.a(), ((uz4) this.a.b.b).a(bArr, bArr2));
            this.a.b.getClass();
            int length = bArr.length;
            return C;
        } catch (GeneralSecurityException e) {
            throw e;
        }
    }

    @Override // defpackage.uz4
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (r05 r05Var : this.a.a(copyOf)) {
                try {
                    byte[] b = ((uz4) r05Var.b).b(copyOfRange, bArr2);
                    int length2 = copyOfRange.length;
                    return b;
                } catch (GeneralSecurityException e) {
                    d15.a.logp(Level.INFO, "com.google.crypto.tink.aead.AeadWrapper$WrappedAead", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(e.toString()));
                }
            }
        }
        for (r05 r05Var2 : this.a.a(ar.U)) {
            try {
                return ((uz4) r05Var2.b).b(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}