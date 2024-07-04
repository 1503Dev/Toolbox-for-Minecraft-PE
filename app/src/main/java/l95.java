package defpackage;

/* renamed from: l95 */
public final class l95 extends ie5 implements of5 {
    private static final l95 zzb;
    private int zzd;
    private gd5 zze = gd5.Q;

    static {
        l95 l95Var = new l95();
        zzb = l95Var;
        ie5.n(l95.class, l95Var);
    }

    public static k95 x() {
        return (k95) zzb.s();
    }

    public static l95 z(gd5 gd5Var, ud5 ud5Var) {
        return (l95) ie5.j(zzb, gd5Var, ud5Var);
    }

    public final gd5 A() {
        return this.zze;
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
                    return new k95(0);
                }
                return new l95();
            }
            return new xf5(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final int w() {
        return this.zzd;
    }
}