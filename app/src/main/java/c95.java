package defpackage;

/* renamed from: c95 */
public final class c95 extends ie5 implements of5 {
    private static final c95 zzb;
    private int zzd;
    private gd5 zze = gd5.Q;

    static {
        c95 c95Var = new c95();
        zzb = c95Var;
        ie5.n(c95.class, c95Var);
    }

    public static b95 x() {
        return (b95) zzb.s();
    }

    public static c95 z(gd5 gd5Var, ud5 ud5Var) {
        return (c95) ie5.j(zzb, gd5Var, ud5Var);
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
                    return new b95(0);
                }
                return new c95();
            }
            return new xf5(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final int w() {
        return this.zzd;
    }
}