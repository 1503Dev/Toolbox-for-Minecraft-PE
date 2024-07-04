package defpackage;

/* renamed from: di5 */
public final class di5 extends ie5 implements of5 {
    private static final di5 zzb;
    private int zzd;
    private ci5 zze;
    private gd5 zzg;
    private gd5 zzh;
    private int zzi;
    private byte zzj = 2;
    private qe5 zzf = wf5.S;

    static {
        di5 di5Var = new di5();
        zzb = di5Var;
        ie5.n(di5.class, di5Var);
    }

    public di5() {
        ed5 ed5Var = gd5.Q;
        this.zzg = ed5Var;
        this.zzh = ed5Var;
    }

    public static ai5 w() {
        return (ai5) zzb.s();
    }

    public static /* synthetic */ void y(di5 di5Var, zh5 zh5Var) {
        qe5 qe5Var = di5Var.zzf;
        if (!qe5Var.d()) {
            di5Var.zzf = ie5.k(qe5Var);
        }
        di5Var.zzf.add(zh5Var);
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
                            this.zzj = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new ai5(0);
                }
                return new di5();
            }
            return new xf5(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzd", "zze", "zzf", zh5.class, "zzg", "zzh", "zzi"});
        }
        return Byte.valueOf(this.zzj);
    }
}