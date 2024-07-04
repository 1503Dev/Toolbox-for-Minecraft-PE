package defpackage;

/* renamed from: n95 */
public final class n95 extends ie5 implements of5 {
    private static final n95 zzb;
    private int zzd;
    private int zze;

    static {
        n95 n95Var = new n95();
        zzb = n95Var;
        ie5.n(n95.class, n95Var);
    }

    public static m95 x() {
        return (m95) zzb.s();
    }

    public static n95 z(gd5 gd5Var, ud5 ud5Var) {
        return (n95) ie5.j(zzb, gd5Var, ud5Var);
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
                    return new m95(0);
                }
                return new n95();
            }
            return new xf5(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final int w() {
        return this.zzd;
    }
}