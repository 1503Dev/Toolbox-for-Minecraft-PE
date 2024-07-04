package defpackage;

/* renamed from: j95 */
public final class j95 extends ie5 implements of5 {
    private static final j95 zzb;
    private int zzd;
    private int zze;

    static {
        j95 j95Var = new j95();
        zzb = j95Var;
        ie5.n(j95.class, j95Var);
    }

    public static i95 x() {
        return (i95) zzb.s();
    }

    public static j95 z(gd5 gd5Var, ud5 ud5Var) {
        return (j95) ie5.j(zzb, gd5Var, ud5Var);
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
                    return new i95(0);
                }
                return new j95();
            }
            return new xf5(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzd"});
        }
        return (byte) 1;
    }

    public final int w() {
        return this.zzd;
    }
}