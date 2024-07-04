package defpackage;

/* renamed from: p62 */
public final class p62 extends ie5 implements of5 {
    private static final p62 zzb;
    private int zzd;
    private x72 zzf;
    private int zzg;
    private z72 zzh;
    private int zzi;
    private String zze = "";
    private int zzj = 1000;
    private int zzk = 1000;
    private int zzl = 1000;

    static {
        p62 p62Var = new p62();
        zzb = p62Var;
        ie5.n(p62.class, p62Var);
    }

    public static p62 x() {
        return zzb;
    }

    public static /* synthetic */ void y(p62 p62Var, String str) {
        p62Var.zzd |= 1;
        p62Var.zze = str;
    }

    public static /* synthetic */ void z(p62 p62Var, z72 z72Var) {
        z72Var.getClass();
        p62Var.zzh = z72Var;
        p62Var.zzd |= 8;
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
                    return new m62(0);
                }
                return new p62();
            }
            s62 s62Var = s62.a;
            return new xf5(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", s62Var, "zzk", s62Var, "zzl", s62Var});
        }
        return (byte) 1;
    }
}