package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: m45  reason: default package */
public final class m45 extends o65 {
    public static final byte[] d = new byte[0];

    public m45() {
        super(y95.class, new k45());
    }

    public static s55 h(int i, h05 h05Var, byte[] bArr, int i2) {
        int i3;
        t95 w = u95.w();
        ba5 w2 = ca5.w();
        w2.j();
        ca5.E((ca5) w2.Q);
        w2.j();
        ((ca5) w2.Q).zze = j82.j(5);
        ed5 G = gd5.G(bArr, 0, 0);
        w2.j();
        ((ca5) w2.Q).zzf = G;
        ca5 ca5Var = (ca5) w2.h();
        ua5 w3 = va5.w();
        String B = h05Var.a.B();
        w3.j();
        va5.C((va5) w3.Q, B);
        byte[] g = h05Var.a.A().g();
        ed5 G2 = gd5.G(g, 0, g.length);
        w3.j();
        ((va5) w3.Q).zze = G2;
        int b = cm0.b(h05Var.a.z());
        int i4 = 4;
        if (b != 1) {
            if (b != 2) {
                if (b != 3) {
                    if (b == 4) {
                        i3 = 4;
                    } else {
                        throw new IllegalArgumentException("Unknown output prefix type");
                    }
                } else {
                    i3 = 3;
                }
            } else {
                i3 = 2;
            }
        } else {
            i3 = 1;
        }
        int i5 = i3 - 1;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    i4 = 5;
                }
            } else {
                i4 = 3;
            }
        } else {
            i4 = 2;
        }
        w3.j();
        ((va5) w3.Q).zzf = e1.a(i4);
        r95 w4 = s95.w();
        w4.j();
        ((s95) w4.Q).zzd = (va5) w3.h();
        v95 x = w95.x();
        x.j();
        ((w95) x.Q).zzd = ca5Var;
        x.j();
        ((w95) x.Q).zze = (s95) w4.h();
        x.j();
        w95.F((w95) x.Q, i);
        w.j();
        u95.A((u95) w.Q, (w95) x.h());
        return new s55(i2, (u95) w.h());
    }

    @Override // defpackage.u55
    public final t55 a() {
        return new l45();
    }

    @Override // defpackage.u55
    public final int b() {
        return 3;
    }

    @Override // defpackage.u55
    public final nf5 c(gd5 gd5Var) {
        return y95.z(gd5Var, ud5.c);
    }

    @Override // defpackage.u55
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // defpackage.u55
    public final void e(nf5 nf5Var) {
        boolean z;
        y95 y95Var = (y95) nf5Var;
        if (y95Var.B().o() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            pc5.b(y95Var.w());
            v45.a(y95Var.A().x());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }
}