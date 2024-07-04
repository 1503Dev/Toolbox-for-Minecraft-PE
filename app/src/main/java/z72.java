package defpackage;

/* renamed from: z72 */
public final class z72 extends ie5 implements of5 {
    private static final z72 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        z72 z72Var = new z72();
        zzb = z72Var;
        ie5.n(z72.class, z72Var);
    }

    public static /* synthetic */ void A(z72 z72Var, int i) {
        z72Var.zzd |= 4;
        z72Var.zzg = i;
    }

    public static y72 w() {
        return (y72) zzb.s();
    }

    public static /* synthetic */ void y(z72 z72Var, int i) {
        z72Var.zzd |= 1;
        z72Var.zze = i;
    }

    public static /* synthetic */ void z(z72 z72Var, int i) {
        z72Var.zzd |= 2;
        z72Var.zzf = i;
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
                    return new y72(0);
                }
                return new z72();
            }
            return new xf5(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}