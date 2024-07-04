package defpackage;

/* renamed from: qb5 */
public final class qb5 extends ie5 implements of5 {
    private static final qb5 zzb;
    private int zzd;

    static {
        qb5 qb5Var = new qb5();
        zzb = qb5Var;
        ie5.n(qb5.class, qb5Var);
    }

    public static qb5 x() {
        return zzb;
    }

    public static qb5 y(gd5 gd5Var, ud5 ud5Var) {
        return (qb5) ie5.j(zzb, gd5Var, ud5Var);
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
                    return new dx1((Object) null);
                }
                return new qb5();
            }
            return new xf5(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        return (byte) 1;
    }
}