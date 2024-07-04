package defpackage;

/* renamed from: za5  reason: default package */
public final class za5 extends ie5 implements of5 {
    private static final za5 zzb;
    private ta5 zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        za5 za5Var = new za5();
        zzb = za5Var;
        ie5.n(za5.class, za5Var);
    }

    public static void H(za5 za5Var, int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        za5Var.zze = i - 2;
    }

    public static ya5 y() {
        return (ya5) zzb.s();
    }

    public final int A() {
        int b = e1.b(this.zzg);
        if (b == 0) {
            return 6;
        }
        return b;
    }

    public final boolean F() {
        return this.zzd != null;
    }

    public final int G() {
        int i = this.zze;
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
                    return new ya5(0);
                }
                return new za5();
            }
            return new xf5(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final int w() {
        return this.zzf;
    }

    public final ta5 x() {
        ta5 ta5Var = this.zzd;
        return ta5Var == null ? ta5.z() : ta5Var;
    }
}