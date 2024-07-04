package defpackage;

/* renamed from: u52 */
public final class u52 extends ie5 implements of5 {
    private static final u52 zzb;
    private int zzd;
    private int zze;
    private int zzf = 1000;
    private i62 zzg;
    private k62 zzh;
    private qe5 zzi;
    private l62 zzj;
    private p72 zzk;
    private g72 zzl;
    private y62 zzm;
    private a72 zzn;
    private qe5 zzo;

    static {
        u52 u52Var = new u52();
        zzb = u52Var;
        ie5.n(u52.class, u52Var);
    }

    public u52() {
        wf5 wf5Var = wf5.S;
        this.zzi = wf5Var;
        this.zzo = wf5Var;
    }

    public static /* synthetic */ void A(u52 u52Var, k62 k62Var) {
        u52Var.zzh = k62Var;
        u52Var.zzd |= 8;
    }

    public static u52 x() {
        return zzb;
    }

    public static void z(u52 u52Var, s52 s52Var) {
        u52Var.zze = s52Var.P;
        u52Var.zzd |= 1;
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
                    return new t52(0);
                }
                return new u52();
            }
            return new xf5(zzb, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007ဌ\u0000\bဌ\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzd", "zze", r52.a, "zzf", s62.a, "zzg", "zzh", "zzi", g62.class, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", a82.class});
        }
        return (byte) 1;
    }

    public final k62 y() {
        k62 k62Var = this.zzh;
        return k62Var == null ? k62.x() : k62Var;
    }
}