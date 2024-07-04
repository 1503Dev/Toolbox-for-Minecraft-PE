package defpackage;

/* renamed from: u95 */
public final class u95 extends ie5 implements of5 {
    private static final u95 zzb;
    private w95 zzd;

    static {
        u95 u95Var = new u95();
        zzb = u95Var;
        ie5.n(u95.class, u95Var);
    }

    public static t95 w() {
        return (t95) zzb.s();
    }

    public static u95 y(gd5 gd5Var, ud5 ud5Var) {
        return (u95) ie5.j(zzb, gd5Var, ud5Var);
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
                    return new t95(0);
                }
                return new u95();
            }
            return new xf5(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzd"});
        }
        return (byte) 1;
    }

    public final w95 z() {
        w95 w95Var = this.zzd;
        return w95Var == null ? w95.z() : w95Var;
    }
}