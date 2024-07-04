package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: g15  reason: default package */
public final class g15 extends u55 {
    public g15() {
        super(l85.class, new e15());
    }

    public static s55 h(int i, int i2, int i3) {
        r85 x = s85.x();
        t85 x2 = u85.x();
        x2.j();
        u85.A((u85) x2.Q);
        x.j();
        s85.C((s85) x.Q, (u85) x2.h());
        x.j();
        s85.E((s85) x.Q, i);
        fa5 x3 = ga5.x();
        ha5 x4 = ia5.x();
        x4.j();
        ((ia5) x4.Q).zzd = j82.j(5);
        x4.j();
        ((ia5) x4.Q).zze = i2;
        x3.j();
        ga5.C((ga5) x3.Q, (ia5) x4.h());
        x3.j();
        ga5.E((ga5) x3.Q, 32);
        m85 w = n85.w();
        w.j();
        n85.B((n85) w.Q, (s85) x.h());
        w.j();
        n85.C((n85) w.Q, (ga5) x3.h());
        return new s55(i3, (n85) w.h());
    }

    @Override // defpackage.u55
    public final t55 a() {
        return new f15();
    }

    @Override // defpackage.u55
    public final int b() {
        return 2;
    }

    @Override // defpackage.u55
    public final nf5 c(gd5 gd5Var) {
        return l85.z(gd5Var, ud5.c);
    }

    @Override // defpackage.u55
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // defpackage.u55
    public final void e(nf5 nf5Var) {
        l85 l85Var = (l85) nf5Var;
        pc5.b(l85Var.w());
        new j15();
        q85 A = l85Var.A();
        pc5.b(A.w());
        pc5.a(A.C().o());
        u85 B = A.B();
        if (B.w() >= 12 && B.w() <= 16) {
            new o75();
            o75.h(l85Var.B());
            return;
        }
        throw new GeneralSecurityException("invalid IV size");
    }

    @Override // defpackage.u55
    public final int f() {
        return 2;
    }
}