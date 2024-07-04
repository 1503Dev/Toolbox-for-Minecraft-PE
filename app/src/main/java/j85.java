package defpackage;

/* renamed from: j85 */
public final class j85 extends ie5 implements of5 {
    private static final j85 zzb;
    private int zzd;

    static {
        j85 j85Var = new j85();
        zzb = j85Var;
        ie5.n(j85.class, j85Var);
    }

    public static i85 x() {
        return (i85) zzb.s();
    }

    public static j85 z() {
        return zzb;
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
                    return new i85(0);
                }
                return new j85();
            }
            return new xf5(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        return (byte) 1;
    }

    public final int w() {
        return this.zzd;
    }
}