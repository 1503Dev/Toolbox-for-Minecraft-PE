package defpackage;

/* renamed from: w52 */
public final class w52 extends ie5 implements of5 {
    private static final w52 zzb;
    private int zzd;
    private int zze;
    private a62 zzf;
    private c62 zzg;

    static {
        w52 w52Var = new w52();
        zzb = w52Var;
        ie5.n(w52.class, w52Var);
    }

    public static /* synthetic */ void A(w52 w52Var) {
        w52Var.zze = 1;
        w52Var.zzd = 1 | w52Var.zzd;
    }

    public static v52 w() {
        return (v52) zzb.s();
    }

    public static /* synthetic */ void y(w52 w52Var, a62 a62Var) {
        a62Var.getClass();
        w52Var.zzf = a62Var;
        w52Var.zzd |= 2;
    }

    public static /* synthetic */ void z(w52 w52Var, c62 c62Var) {
        w52Var.zzg = c62Var;
        w52Var.zzd |= 4;
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
                    return new v52(0);
                }
                return new w52();
            }
            return new xf5(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", y52.a, "zzf", "zzg"});
        }
        return (byte) 1;
    }
}