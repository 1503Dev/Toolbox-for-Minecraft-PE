package defpackage;

/* renamed from: i92 */
public final class i92 extends ie5 implements of5 {
    private static final i92 zzb;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        i92 i92Var = new i92();
        zzb = i92Var;
        ie5.n(i92.class, i92Var);
    }

    public static h92 w() {
        return (h92) zzb.s();
    }

    public static /* synthetic */ void y(i92 i92Var, boolean z) {
        i92Var.zzd |= 1;
        i92Var.zze = z;
    }

    public static /* synthetic */ void z(i92 i92Var, int i) {
        i92Var.zzd |= 2;
        i92Var.zzf = i;
    }

    public final boolean A() {
        return this.zze;
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
                    return new h92(0);
                }
                return new i92();
            }
            return new xf5(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}