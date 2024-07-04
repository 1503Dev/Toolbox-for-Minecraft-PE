package defpackage;

/* renamed from: aa5  reason: default package */
public final class aa5 extends ie5 implements of5 {
    private static final aa5 zzb;
    private int zzd;
    private w95 zze;
    private gd5 zzf;
    private gd5 zzg;

    static {
        aa5 aa5Var = new aa5();
        zzb = aa5Var;
        ie5.n(aa5.class, aa5Var);
    }

    public aa5() {
        ed5 ed5Var = gd5.Q;
        this.zzf = ed5Var;
        this.zzg = ed5Var;
    }

    public static aa5 A() {
        return zzb;
    }

    public static aa5 B(gd5 gd5Var, ud5 ud5Var) {
        return (aa5) ie5.j(zzb, gd5Var, ud5Var);
    }

    public static /* synthetic */ void G(aa5 aa5Var, w95 w95Var) {
        w95Var.getClass();
        aa5Var.zze = w95Var;
    }

    public static z95 y() {
        return (z95) zzb.s();
    }

    public final gd5 C() {
        return this.zzf;
    }

    public final gd5 E() {
        return this.zzg;
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
                    return new z95(0);
                }
                return new aa5();
            }
            return new xf5(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final int w() {
        return this.zzd;
    }

    public final w95 x() {
        w95 w95Var = this.zze;
        return w95Var == null ? w95.z() : w95Var;
    }
}