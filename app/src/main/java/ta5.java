package defpackage;

/* renamed from: ta5 */
public final class ta5 extends ie5 implements of5 {
    private static final ta5 zzb;
    private String zzd = "";
    private gd5 zze = gd5.Q;
    private int zzf;

    static {
        ta5 ta5Var = new ta5();
        zzb = ta5Var;
        ie5.n(ta5.class, ta5Var);
    }

    public static void F(ta5 ta5Var, int i) {
        if (i != 6) {
            ta5Var.zzf = sd1.a(i);
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static sa5 w() {
        return (sa5) zzb.s();
    }

    public static ta5 z() {
        return zzb;
    }

    public final gd5 A() {
        return this.zze;
    }

    public final String B() {
        return this.zzd;
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
                    return new sa5(0);
                }
                return new ta5();
            }
            return new xf5(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int x() {
        int i = this.zzf;
        int i2 = 4;
        if (i == 0) {
            i2 = 1;
        } else if (i == 1) {
            i2 = 2;
        } else if (i == 2) {
            i2 = 3;
        } else if (i != 3) {
            i2 = i != 4 ? 0 : 5;
        }
        if (i2 == 0) {
            return 6;
        }
        return i2;
    }
}