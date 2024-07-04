package defpackage;

/* renamed from: ga5 */
public final class ga5 extends ie5 implements of5 {
    private static final ga5 zzb;
    private ia5 zzd;
    private int zze;
    private int zzf;

    static {
        ga5 ga5Var = new ga5();
        zzb = ga5Var;
        ie5.n(ga5.class, ga5Var);
    }

    public static ga5 A(gd5 gd5Var, ud5 ud5Var) {
        return (ga5) ie5.j(zzb, gd5Var, ud5Var);
    }

    public static /* synthetic */ void C(ga5 ga5Var, ia5 ia5Var) {
        ga5Var.zzd = ia5Var;
    }

    public static /* synthetic */ void E(ga5 ga5Var, int i) {
        ga5Var.zze = i;
    }

    public static fa5 x() {
        return (fa5) zzb.s();
    }

    public static ga5 z() {
        return zzb;
    }

    public final ia5 B() {
        ia5 ia5Var = this.zzd;
        return ia5Var == null ? ia5.z() : ia5Var;
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
                    return new fa5(0);
                }
                return new ga5();
            }
            return new xf5(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int w() {
        return this.zze;
    }
}