package defpackage;

/* renamed from: dy1 */
public final class dy1 extends ie5 implements of5 {
    private static final dy1 zzb;
    private int zzd;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private long zzl = -1;

    static {
        dy1 dy1Var = new dy1();
        zzb = dy1Var;
        ie5.n(dy1.class, dy1Var);
    }

    public static /* synthetic */ void A(dy1 dy1Var, long j) {
        dy1Var.zzd |= 8;
        dy1Var.zzh = j;
    }

    public static /* synthetic */ void B(dy1 dy1Var, long j) {
        dy1Var.zzd |= 16;
        dy1Var.zzi = j;
    }

    public static /* synthetic */ void C(dy1 dy1Var, long j) {
        dy1Var.zzd |= 32;
        dy1Var.zzj = j;
    }

    public static cy1 w() {
        return (cy1) zzb.s();
    }

    public static /* synthetic */ void y(dy1 dy1Var, long j) {
        dy1Var.zzd |= 1;
        dy1Var.zze = j;
    }

    public static /* synthetic */ void z(dy1 dy1Var, long j) {
        dy1Var.zzd |= 4;
        dy1Var.zzg = j;
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
                    return new cy1(0);
                }
                return new dy1();
            }
            return new xf5(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        return (byte) 1;
    }
}