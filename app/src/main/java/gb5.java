package defpackage;

/* renamed from: gb5  reason: default package */
public final class gb5 extends ie5 implements of5 {
    private static final gb5 zzb;
    private int zzd;
    private ib5 zze;

    static {
        gb5 gb5Var = new gb5();
        zzb = gb5Var;
        ie5.n(gb5.class, gb5Var);
    }

    public static /* synthetic */ void C(gb5 gb5Var, ib5 ib5Var) {
        ib5Var.getClass();
        gb5Var.zze = ib5Var;
    }

    public static fb5 x() {
        return (fb5) zzb.s();
    }

    public static gb5 z(gd5 gd5Var, ud5 ud5Var) {
        return (gb5) ie5.j(zzb, gd5Var, ud5Var);
    }

    public final ib5 A() {
        ib5 ib5Var = this.zze;
        return ib5Var == null ? ib5.x() : ib5Var;
    }

    @Override // defpackage.ie5
    public final Object t(int i, ie5 ie5Var) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new fb5(0);
                }
                return new gb5();
            }
            return new xf5(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final int w() {
        return this.zzd;
    }
}