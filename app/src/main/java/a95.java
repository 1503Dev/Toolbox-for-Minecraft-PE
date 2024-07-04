package defpackage;

/* renamed from: a95  reason: default package */
public final class a95 extends ie5 implements of5 {
    private static final a95 zzb;
    private int zzd;

    static {
        a95 a95Var = new a95();
        zzb = a95Var;
        ie5.n(a95.class, a95Var);
    }

    public static z85 x() {
        return (z85) zzb.s();
    }

    public static a95 z() {
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
                    return new z85(0);
                }
                return new a95();
            }
            return new xf5(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        return (byte) 1;
    }

    public final int w() {
        return this.zzd;
    }
}