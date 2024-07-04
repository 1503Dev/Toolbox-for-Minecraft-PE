package defpackage;

/* renamed from: ea5 */
public final class ea5 extends ie5 implements of5 {
    private static final ea5 zzb;
    private int zzd;
    private ia5 zze;
    private gd5 zzf = gd5.Q;

    static {
        ea5 ea5Var = new ea5();
        zzb = ea5Var;
        ie5.n(ea5.class, ea5Var);
    }

    public static ea5 A(gd5 gd5Var, ud5 ud5Var) {
        return (ea5) ie5.j(zzb, gd5Var, ud5Var);
    }

    public static /* synthetic */ void F(ea5 ea5Var, ia5 ia5Var) {
        ia5Var.getClass();
        ea5Var.zze = ia5Var;
    }

    public static da5 x() {
        return (da5) zzb.s();
    }

    public static ea5 z() {
        return zzb;
    }

    public final ia5 B() {
        ia5 ia5Var = this.zze;
        return ia5Var == null ? ia5.z() : ia5Var;
    }

    public final gd5 C() {
        return this.zzf;
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
                    return new da5(0);
                }
                return new ea5();
            }
            return new xf5(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int w() {
        return this.zzd;
    }
}