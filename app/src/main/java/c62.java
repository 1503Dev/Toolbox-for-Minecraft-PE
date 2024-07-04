package defpackage;

/* renamed from: c62 */
public final class c62 extends ie5 implements of5 {
    private static final c62 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        c62 c62Var = new c62();
        zzb = c62Var;
        ie5.n(c62.class, c62Var);
    }

    public static /* synthetic */ void A(c62 c62Var, int i) {
        c62Var.zzd |= 4;
        c62Var.zzg = i;
    }

    public static b62 w() {
        return (b62) zzb.s();
    }

    public static /* synthetic */ void y(c62 c62Var, boolean z) {
        c62Var.zzd |= 1;
        c62Var.zze = z;
    }

    public static /* synthetic */ void z(c62 c62Var, boolean z) {
        c62Var.zzd |= 2;
        c62Var.zzf = z;
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
                    return new b62(0);
                }
                return new c62();
            }
            return new xf5(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}