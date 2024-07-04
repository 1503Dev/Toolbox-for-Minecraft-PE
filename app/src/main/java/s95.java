package defpackage;

/* renamed from: s95  reason: default package */
public final class s95 extends ie5 implements of5 {
    private static final s95 zzb;
    private va5 zzd;

    static {
        s95 s95Var = new s95();
        zzb = s95Var;
        ie5.n(s95.class, s95Var);
    }

    public static r95 w() {
        return (r95) zzb.s();
    }

    public static s95 y() {
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
                    return new r95(0);
                }
                return new s95();
            }
            return new xf5(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zzd"});
        }
        return (byte) 1;
    }

    public final va5 z() {
        va5 va5Var = this.zzd;
        return va5Var == null ? va5.y() : va5Var;
    }
}