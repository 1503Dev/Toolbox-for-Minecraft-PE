package defpackage;

/* renamed from: e95 */
public final class e95 extends ie5 implements of5 {
    private static final e95 zzb;
    private int zzd;
    private int zze;

    static {
        e95 e95Var = new e95();
        zzb = e95Var;
        ie5.n(e95.class, e95Var);
    }

    public static d95 x() {
        return (d95) zzb.s();
    }

    public static e95 z(gd5 gd5Var, ud5 ud5Var) {
        return (e95) ie5.j(zzb, gd5Var, ud5Var);
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
                    return new d95(0);
                }
                return new e95();
            }
            return new xf5(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final int w() {
        return this.zzd;
    }
}