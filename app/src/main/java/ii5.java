package defpackage;

/* renamed from: ii5 */
public final class ii5 extends ie5 implements of5 {
    private static final ii5 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private gd5 zzg;
    private gd5 zzh;

    static {
        ii5 ii5Var = new ii5();
        zzb = ii5Var;
        ie5.n(ii5.class, ii5Var);
    }

    public ii5() {
        ed5 ed5Var = gd5.Q;
        this.zzg = ed5Var;
        this.zzh = ed5Var;
    }

    public static /* synthetic */ void A(ii5 ii5Var) {
        ii5Var.zze = 1;
        ii5Var.zzd = 1 | ii5Var.zzd;
    }

    public static gi5 w() {
        return (gi5) zzb.s();
    }

    public static /* synthetic */ void y(ii5 ii5Var) {
        ii5Var.zzd |= 2;
        ii5Var.zzf = "image/png";
    }

    public static /* synthetic */ void z(ii5 ii5Var, gd5 gd5Var) {
        gd5Var.getClass();
        ii5Var.zzd |= 4;
        ii5Var.zzg = gd5Var;
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
                    return new gi5(0);
                }
                return new ii5();
            }
            return new xf5(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", hi5.a, "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}