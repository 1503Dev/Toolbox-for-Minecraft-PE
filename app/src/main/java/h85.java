package defpackage;

/* renamed from: h85 */
public final class h85 extends ie5 implements of5 {
    private static final h85 zzb;
    private int zzd;
    private j85 zze;

    static {
        h85 h85Var = new h85();
        zzb = h85Var;
        ie5.n(h85.class, h85Var);
    }

    public static g85 x() {
        return (g85) zzb.s();
    }

    public static h85 z(gd5 gd5Var, ud5 ud5Var) {
        return (h85) ie5.j(zzb, gd5Var, ud5Var);
    }

    public final j85 A() {
        j85 j85Var = this.zze;
        return j85Var == null ? j85.z() : j85Var;
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
                    return new g85(0);
                }
                return new h85();
            }
            return new xf5(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final int w() {
        return this.zzd;
    }
}