package defpackage;

/* renamed from: e72 */
public final class e72 extends ie5 implements of5 {
    private static final e72 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        e72 e72Var = new e72();
        zzb = e72Var;
        ie5.n(e72.class, e72Var);
    }

    public static /* synthetic */ void E(e72 e72Var, int i) {
        e72Var.zze = i - 1;
        e72Var.zzd |= 1;
    }

    public static /* synthetic */ void F(e72 e72Var, int i) {
        e72Var.zzf = i - 1;
        e72Var.zzd |= 2;
    }

    public static b72 w() {
        return (b72) zzb.s();
    }

    public static e72 y() {
        return zzb;
    }

    public final boolean A() {
        return (this.zzd & 1) != 0;
    }

    public final int B() {
        int i;
        int i2 = this.zzf;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? i2 != 4 ? 0 : 5 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int C() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
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
                    return new b72(0);
                }
                return new e72();
            }
            return new xf5(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzd", "zze", d72.a, "zzf", c72.a});
        }
        return (byte) 1;
    }

    public final boolean z() {
        return (this.zzd & 2) != 0;
    }
}