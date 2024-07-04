package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: t45  reason: default package */
public final class t45 implements yz4 {
    public final u05 a;

    public t45(u05 u05Var) {
        this.a = u05Var;
        if (u05Var.b()) {
            a85 a = z55.b.a();
            q05.g(u05Var);
            a.a();
        }
    }

    @Override // defpackage.yz4
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        r05 r05Var = this.a.b;
        if (r05Var != null) {
            try {
                byte[] C = mh.C(r05Var.a(), ((yz4) this.a.b.b).b(bArr, bArr2));
                this.a.b.getClass();
                return C;
            } catch (GeneralSecurityException e) {
                throw e;
            }
        }
        throw new GeneralSecurityException("keyset without primary key");
    }
}