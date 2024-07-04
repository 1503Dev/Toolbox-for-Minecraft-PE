package defpackage;

/* renamed from: ra5  reason: default package */
public final class ra5 extends ie5 implements of5 {
    private static final ra5 zzb;
    private int zzd;
    private na5 zze;
    private gd5 zzf = gd5.Q;

    static {
        ra5 ra5Var = new ra5();
        zzb = ra5Var;
        ie5.n(ra5.class, ra5Var);
    }

    public static ra5 A() {
        return zzb;
    }

    public static ra5 B(gd5 gd5Var, ud5 ud5Var) {
        return (ra5) ie5.j(zzb, gd5Var, ud5Var);
    }

    public static /* synthetic */ void F(ra5 ra5Var, na5 na5Var) {
        na5Var.getClass();
        ra5Var.zze = na5Var;
    }

    public static qa5 y() {
        return (qa5) zzb.s();
    }

    public final gd5 C() {
        return this.zzf;
    }

    public final boolean H() {
        return this.zze != null;
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
                    return new qa5(0);
                }
                return new ra5();
            }
            return new xf5(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int w() {
        return this.zzd;
    }

    public final na5 x() {
        na5 na5Var = this.zze;
        return na5Var == null ? na5.y() : na5Var;
    }
}