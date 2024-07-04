package defpackage;

/* renamed from: h95 */
public final class h95 extends ie5 implements of5 {
    private static final h95 zzb;
    private int zzd;
    private gd5 zze = gd5.Q;

    static {
        h95 h95Var = new h95();
        zzb = h95Var;
        ie5.n(h95.class, h95Var);
    }

    public static f95 x() {
        return (f95) zzb.s();
    }

    public static h95 z(gd5 gd5Var, ud5 ud5Var) {
        return (h95) ie5.j(zzb, gd5Var, ud5Var);
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
                    return new f95(0);
                }
                return new h95();
            }
            return new xf5(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final int w() {
        return this.zzd;
    }
}