package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: i45  reason: default package */
public final class i45 implements wz4 {
    public final u05 a;

    public i45(u05 u05Var) {
        this.a = u05Var;
        if (u05Var.b()) {
            a85 a = z55.b.a();
            q05.g(u05Var);
            a.a();
            a.a();
        }
    }

    @Override // defpackage.wz4
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            byte[] C = mh.C(this.a.b.a(), ((wz4) this.a.b.b).b(bArr, bArr2));
            this.a.b.getClass();
            return C;
        } catch (GeneralSecurityException e) {
            throw e;
        }
    }
}