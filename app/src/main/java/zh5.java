package defpackage;

/* renamed from: zh5 */
public final class zh5 extends ie5 implements of5 {
    private static final zh5 zzb;
    private int zzd;
    private gd5 zze;
    private gd5 zzf;
    private byte zzg = 2;

    static {
        zh5 zh5Var = new zh5();
        zzb = zh5Var;
        ie5.n(zh5.class, zh5Var);
    }

    public zh5() {
        ed5 ed5Var = gd5.Q;
        this.zze = ed5Var;
        this.zzf = ed5Var;
    }

    public static yh5 w() {
        return (yh5) zzb.s();
    }

    public static /* synthetic */ void y(zh5 zh5Var, ed5 ed5Var) {
        zh5Var.zzd |= 1;
        zh5Var.zze = ed5Var;
    }

    public static /* synthetic */ void z(zh5 zh5Var, ed5 ed5Var) {
        zh5Var.zzd |= 2;
        zh5Var.zzf = ed5Var;
    }

    @Override // defpackage.ie5
    public final Object t(int i, ie5 ie5Var) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (ie5Var == null) {
                                b = 0;
                            }
                            this.zzg = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new yh5(0);
                }
                return new zh5();
            }
            return new xf5(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return Byte.valueOf(this.zzg);
    }
}