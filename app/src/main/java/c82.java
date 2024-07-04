package defpackage;

/* renamed from: c82  reason: default package */
public final class c82 extends ie5 implements of5 {
    private static final c82 zzb;
    private int zzd;
    private int zze = 1000;
    private e82 zzf;
    private x72 zzg;

    static {
        c82 c82Var = new c82();
        zzb = c82Var;
        ie5.n(c82.class, c82Var);
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
                    return new b82();
                }
                return new c82();
            }
            return new xf5(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", s62.a, "zzf", "zzg"});
        }
        return (byte) 1;
    }
}