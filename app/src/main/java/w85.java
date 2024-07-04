package defpackage;

/* renamed from: w85  reason: default package */
public final class w85 extends ie5 implements of5 {
    private static final w85 zzb;
    private int zzd;
    private a95 zze;
    private gd5 zzf = gd5.Q;

    static {
        w85 w85Var = new w85();
        zzb = w85Var;
        ie5.n(w85.class, w85Var);
    }

    public static /* synthetic */ void E(w85 w85Var, a95 a95Var) {
        a95Var.getClass();
        w85Var.zze = a95Var;
    }

    public static v85 x() {
        return (v85) zzb.s();
    }

    public static w85 z(gd5 gd5Var, ud5 ud5Var) {
        return (w85) ie5.j(zzb, gd5Var, ud5Var);
    }

    public final a95 A() {
        a95 a95Var = this.zze;
        return a95Var == null ? a95.z() : a95Var;
    }

    public final gd5 B() {
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
                    return new v85(0);
                }
                return new w85();
            }
            return new xf5(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int w() {
        return this.zzd;
    }
}