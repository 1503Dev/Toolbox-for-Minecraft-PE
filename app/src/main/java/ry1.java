package defpackage;

/* renamed from: ry1 */
public final class ry1 extends ie5 implements of5 {
    private static final ry1 zzb;
    private int zzd;
    private qe5 zze = wf5.S;
    private gd5 zzf = gd5.Q;
    private int zzg = 1;
    private int zzh = 1;

    static {
        ry1 ry1Var = new ry1();
        zzb = ry1Var;
        ie5.n(ry1.class, ry1Var);
    }

    public static /* synthetic */ void A(ry1 ry1Var, int i) {
        ry1Var.zzh = i - 1;
        ry1Var.zzd |= 4;
    }

    public static qy1 w() {
        return (qy1) zzb.s();
    }

    public static /* synthetic */ void y(ry1 ry1Var, ed5 ed5Var) {
        qe5 qe5Var = ry1Var.zze;
        if (!qe5Var.d()) {
            ry1Var.zze = ie5.k(qe5Var);
        }
        ry1Var.zze.add(ed5Var);
    }

    public static /* synthetic */ void z(ry1 ry1Var, ed5 ed5Var) {
        ry1Var.zzd |= 1;
        ry1Var.zzf = ed5Var;
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
                    return new qy1(0);
                }
                return new ry1();
            }
            return new xf5(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", ly1.a, "zzh", jy1.a});
        }
        return (byte) 1;
    }
}