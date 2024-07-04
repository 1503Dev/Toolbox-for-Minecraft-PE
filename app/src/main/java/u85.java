package defpackage;

/* renamed from: u85 */
public final class u85 extends ie5 implements of5 {
    private static final u85 zzb;
    private int zzd;

    static {
        u85 u85Var = new u85();
        zzb = u85Var;
        ie5.n(u85.class, u85Var);
    }

    public static /* synthetic */ void A(u85 u85Var) {
        u85Var.zzd = 16;
    }

    public static t85 x() {
        return (t85) zzb.s();
    }

    public static u85 z() {
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
                    return new t85(0);
                }
                return new u85();
            }
            return new xf5(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        return (byte) 1;
    }

    public final int w() {
        return this.zzd;
    }
}