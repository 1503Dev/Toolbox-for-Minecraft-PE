package defpackage;

/* renamed from: r25  reason: default package */
public final class r25 extends u55 {
    public r25() {
        super(h95.class, new p25());
    }

    public static s55 h(int i, int i2) {
        i95 x = j95.x();
        x.j();
        ((j95) x.Q).zzd = i;
        return new s55(i2, (j95) x.h());
    }

    @Override // defpackage.u55
    public final t55 a() {
        return new q25();
    }

    @Override // defpackage.u55
    public final int b() {
        return 2;
    }

    @Override // defpackage.u55
    public final nf5 c(gd5 gd5Var) {
        return h95.z(gd5Var, ud5.c);
    }

    @Override // defpackage.u55
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // defpackage.u55
    public final /* bridge */ /* synthetic */ void e(nf5 nf5Var) {
        h95 h95Var = (h95) nf5Var;
        pc5.b(h95Var.w());
        pc5.a(h95Var.A().o());
    }
}