package defpackage;

/* renamed from: la5 */
public final class la5 extends ie5 implements of5 {
    private static final la5 zzb;
    private na5 zzd;

    static {
        la5 la5Var = new la5();
        zzb = la5Var;
        ie5.n(la5.class, la5Var);
    }

    public static /* synthetic */ void A(la5 la5Var, na5 na5Var) {
        la5Var.zzd = na5Var;
    }

    public static ka5 w() {
        return (ka5) zzb.s();
    }

    public static la5 y(gd5 gd5Var, ud5 ud5Var) {
        return (la5) ie5.j(zzb, gd5Var, ud5Var);
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
                    return new ka5(0);
                }
                return new la5();
            }
            return new xf5(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzd"});
        }
        return (byte) 1;
    }

    public final na5 z() {
        na5 na5Var = this.zzd;
        return na5Var == null ? na5.y() : na5Var;
    }
}