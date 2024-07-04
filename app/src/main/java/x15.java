package defpackage;

/* renamed from: x15  reason: default package */
public final class x15 extends u55 {
    public x15() {
        super(c95.class, new v15());
    }

    public static s55 h(int i, int i2) {
        d95 x = e95.x();
        x.j();
        ((e95) x.Q).zzd = i;
        return new s55(i2, (e95) x.h());
    }

    @Override // defpackage.u55
    public final t55 a() {
        return new w15();
    }

    @Override // defpackage.u55
    public final int b() {
        return 2;
    }

    @Override // defpackage.u55
    public final nf5 c(gd5 gd5Var) {
        return c95.z(gd5Var, ud5.c);
    }

    @Override // defpackage.u55
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // defpackage.u55
    public final /* bridge */ /* synthetic */ void e(nf5 nf5Var) {
        c95 c95Var = (c95) nf5Var;
        pc5.b(c95Var.w());
        pc5.a(c95Var.A().o());
    }

    @Override // defpackage.u55
    public final int f() {
        return 2;
    }
}