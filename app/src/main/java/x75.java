package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* renamed from: x75  reason: default package */
public final class x75 implements p05 {
    public final u05 a;

    public x75(u05 u05Var) {
        this.a = u05Var;
        if (u05Var.b()) {
            a85 a = z55.b.a();
            q05.g(u05Var);
            a.a();
            a.a();
        }
    }

    @Override // defpackage.p05
    public final void b(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (r05 r05Var : this.a.a(copyOf)) {
                if (cm0.a(r05Var.d, 3)) {
                    bArr3 = mh.C(bArr2, y75.b);
                } else {
                    bArr3 = bArr2;
                }
                try {
                    ((p05) r05Var.b).b(copyOfRange, bArr3);
                    return;
                } catch (GeneralSecurityException e) {
                    y75.a.logp(Level.INFO, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", "tag prefix matches a key, but cannot verify: ".concat(e.toString()));
                }
            }
            for (r05 r05Var2 : this.a.a(ar.U)) {
                try {
                    ((p05) r05Var2.b).b(bArr, bArr2);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("invalid MAC");
        }
        throw new GeneralSecurityException("tag too short");
    }

    @Override // defpackage.p05
    public final byte[] c(byte[] bArr) {
        if (cm0.a(this.a.b.d, 3)) {
            bArr = mh.C(bArr, y75.b);
        }
        try {
            byte[] C = mh.C(this.a.b.a(), ((p05) this.a.b.b).c(bArr));
            this.a.b.getClass();
            return C;
        } catch (GeneralSecurityException e) {
            throw e;
        }
    }
}