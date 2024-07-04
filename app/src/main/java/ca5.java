package defpackage;

/* renamed from: ca5 */
public final class ca5 extends ie5 implements of5 {
    private static final ca5 zzb;
    private int zzd;
    private int zze;
    private gd5 zzf = gd5.Q;

    static {
        ca5 ca5Var = new ca5();
        zzb = ca5Var;
        ie5.n(ca5.class, ca5Var);
    }

    public static void E(ca5 ca5Var) {
        ca5Var.zzd = 2;
    }

    public static ba5 w() {
        return (ba5) zzb.s();
    }

    public static ca5 y() {
        return zzb;
    }

    public final int B() {
        int i = this.zzd;
        int i2 = 5;
        if (i == 0) {
            i2 = 2;
        } else if (i == 2) {
            i2 = 4;
        } else if (i != 3) {
            i2 = i != 4 ? i != 5 ? 0 : 7 : 6;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int C() {
        int i = this.zze;
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
                    return new ba5(0);
                }
                return new ca5();
            }
            return new xf5(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final gd5 z() {
        return this.zzf;
    }
}