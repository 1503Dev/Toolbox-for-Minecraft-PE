package defpackage;

/* renamed from: w95  reason: default package */
public final class w95 extends ie5 implements of5 {
    private static final w95 zzb;
    private ca5 zzd;
    private s95 zze;
    private int zzf;

    static {
        w95 w95Var = new w95();
        zzb = w95Var;
        ie5.n(w95.class, w95Var);
    }

    public static void F(w95 w95Var, int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        w95Var.zzf = i - 2;
    }

    public static v95 x() {
        return (v95) zzb.s();
    }

    public static w95 z() {
        return zzb;
    }

    public final ca5 A() {
        ca5 ca5Var = this.zzd;
        return ca5Var == null ? ca5.y() : ca5Var;
    }

    public final int E() {
        int i = this.zzf;
        int i2 = 3;
        if (i == 0) {
            i2 = 2;
        } else if (i != 1) {
            i2 = i != 2 ? i != 3 ? 0 : 5 : 4;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
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
                    return new v95(0);
                }
                return new w95();
            }
            return new xf5(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final s95 w() {
        s95 s95Var = this.zze;
        return s95Var == null ? s95.y() : s95Var;
    }
}