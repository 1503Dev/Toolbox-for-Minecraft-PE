package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: p15  reason: default package */
public final class p15 extends u55 {
    public p15() {
        super(w85.class, new m15());
    }

    public static s55 h(int i, int i2) {
        x85 x = y85.x();
        x.j();
        y85.C((y85) x.Q, i);
        z85 x2 = a95.x();
        x2.j();
        ((a95) x2.Q).zzd = 16;
        x.j();
        y85.B((y85) x.Q, (a95) x2.h());
        return new s55(i2, (y85) x.h());
    }

    @Override // defpackage.u55
    public final t55 a() {
        return new n15();
    }

    @Override // defpackage.u55
    public final int b() {
        return 2;
    }

    @Override // defpackage.u55
    public final nf5 c(gd5 gd5Var) {
        return w85.z(gd5Var, ud5.c);
    }

    @Override // defpackage.u55
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // defpackage.u55
    public final /* bridge */ /* synthetic */ void e(nf5 nf5Var) {
        w85 w85Var = (w85) nf5Var;
        pc5.b(w85Var.w());
        pc5.a(w85Var.B().o());
        if (w85Var.A().w() != 12 && w85Var.A().w() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}