package defpackage;

/* renamed from: oi5 */
public final class oi5 extends ie5 implements of5 {
    private static final oi5 zzb;
    private int zzd;
    private long zzf;
    private boolean zzg;
    private int zzh;
    private String zze = "";
    private String zzi = "";
    private String zzj = "";

    static {
        oi5 oi5Var = new oi5();
        zzb = oi5Var;
        ie5.n(oi5.class, oi5Var);
    }

    public static /* synthetic */ void A(oi5 oi5Var, boolean z) {
        oi5Var.zzd |= 4;
        oi5Var.zzg = z;
    }

    public static ni5 w() {
        return (ni5) zzb.s();
    }

    public static /* synthetic */ void y(oi5 oi5Var, String str) {
        oi5Var.zzd |= 1;
        oi5Var.zze = str;
    }

    public static /* synthetic */ void z(oi5 oi5Var, long j) {
        oi5Var.zzd |= 2;
        oi5Var.zzf = j;
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
                    return new ni5(0);
                }
                return new oi5();
            }
            return new xf5(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004ဌ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", pi5.a, "zzi", "zzj"});
        }
        return (byte) 1;
    }
}