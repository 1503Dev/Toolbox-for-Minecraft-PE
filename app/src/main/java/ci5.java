package defpackage;

/* renamed from: ci5 */
public final class ci5 extends ie5 implements of5 {
    private static final ci5 zzb;
    private int zzd;
    private gd5 zze;
    private gd5 zzf;
    private gd5 zzg;

    static {
        ci5 ci5Var = new ci5();
        zzb = ci5Var;
        ie5.n(ci5.class, ci5Var);
    }

    public ci5() {
        ed5 ed5Var = gd5.Q;
        this.zze = ed5Var;
        this.zzf = ed5Var;
        this.zzg = ed5Var;
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
                    return new bi5();
                }
                return new ci5();
            }
            return new xf5(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}