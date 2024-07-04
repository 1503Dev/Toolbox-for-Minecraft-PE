package defpackage;

/* renamed from: k62 */
public final class k62 extends ie5 implements of5 {
    private static final k62 zzb;
    private int zzd;
    private String zze = "";
    private qe5 zzf = wf5.S;
    private int zzg = 1000;
    private int zzh = 1000;
    private int zzi = 1000;

    static {
        k62 k62Var = new k62();
        zzb = k62Var;
        ie5.n(k62.class, k62Var);
    }

    public static k62 x() {
        return zzb;
    }

    public static /* synthetic */ void y(k62 k62Var, String str) {
        str.getClass();
        k62Var.zzd |= 1;
        k62Var.zze = str;
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
                    return new j62(0);
                }
                return new k62();
            }
            s62 s62Var = s62.a;
            return new xf5(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဌ\u0002\u0005ဌ\u0003", new Object[]{"zzd", "zze", "zzf", g62.class, "zzg", s62Var, "zzh", s62Var, "zzi", s62Var});
        }
        return (byte) 1;
    }
}