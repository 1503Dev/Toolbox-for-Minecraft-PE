package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: g55  reason: default package */
public final class g55 extends o65 {
    public g55() {
        super(pa5.class, new e55());
    }

    public static s55 h(int i, int i2, int i3, int i4) {
        ma5 w = na5.w();
        w.j();
        ((na5) w.Q).zzd = i - 2;
        w.j();
        ((na5) w.Q).zze = i2 - 2;
        w.j();
        ((na5) w.Q).zzf = i3 - 2;
        ka5 w2 = la5.w();
        w2.j();
        la5.A((la5) w2.Q, (na5) w.h());
        return new s55(i4, (la5) w2.h());
    }

    @Override // defpackage.u55
    public final t55 a() {
        return new f55();
    }

    @Override // defpackage.u55
    public final int b() {
        return 3;
    }

    @Override // defpackage.u55
    public final nf5 c(gd5 gd5Var) {
        return pa5.z(gd5Var, ud5.c);
    }

    @Override // defpackage.u55
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    @Override // defpackage.u55
    public final void e(nf5 nf5Var) {
        boolean z;
        pa5 pa5Var = (pa5) nf5Var;
        if (pa5Var.B().o() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (pa5Var.G()) {
                pc5.b(pa5Var.w());
                j55.a(pa5Var.A().x());
                return;
            }
            throw new GeneralSecurityException("Missing public key.");
        }
        throw new GeneralSecurityException("Private key is empty.");
    }
}