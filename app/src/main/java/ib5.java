package defpackage;

/* renamed from: ib5  reason: default package */
public final class ib5 extends ie5 implements of5 {
    private static final ib5 zzb;
    private String zzd = "";

    static {
        ib5 ib5Var = new ib5();
        zzb = ib5Var;
        ie5.n(ib5.class, ib5Var);
    }

    public static ib5 x() {
        return zzb;
    }

    public static ib5 y(gd5 gd5Var, ud5 ud5Var) {
        return (ib5) ie5.j(zzb, gd5Var, ud5Var);
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
                    return new hb5();
                }
                return new ib5();
            }
            return new xf5(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzd"});
        }
        return (byte) 1;
    }

    public final String z() {
        return this.zzd;
    }
}