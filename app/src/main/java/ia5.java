package defpackage;

/* renamed from: ia5  reason: default package */
public final class ia5 extends ie5 implements of5 {
    private static final ia5 zzb;
    private int zzd;
    private int zze;

    static {
        ia5 ia5Var = new ia5();
        zzb = ia5Var;
        ie5.n(ia5.class, ia5Var);
    }

    public static ha5 x() {
        return (ha5) zzb.s();
    }

    public static ia5 z() {
        return zzb;
    }

    public final int B() {
        int i = this.zzd;
        int i2 = 2;
        if (i != 0) {
            if (i == 1) {
                i2 = 3;
            } else if (i != 2) {
                i2 = 5;
                if (i != 3) {
                    i2 = i != 4 ? i != 5 ? 0 : 7 : 6;
                }
            } else {
                i2 = 4;
            }
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
                    return new ha5(0);
                }
                return new ia5();
            }
            return new xf5(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final int w() {
        return this.zze;
    }
}