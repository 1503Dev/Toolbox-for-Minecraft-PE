package defpackage;

/* renamed from: lm4 */
public final class lm4 extends ox2 implements xk3 {
    private static final lm4 zzb;
    private int zzd;
    private int zze;

    static {
        lm4 lm4Var = new lm4();
        zzb = lm4Var;
        ox2.g(lm4.class, lm4Var);
    }

    public static sl4 o() {
        return (sl4) ((ft2) zzb.m(5));
    }

    public static /* synthetic */ void q(lm4 lm4Var, int i) {
        lm4Var.zze = i - 1;
        lm4Var.zzd |= 1;
    }

    @Override // defpackage.ox2
    public final Object m(int i) {
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
                    return new sl4(0);
                }
                return new lm4();
            }
            return new cr3(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zzd", "zze", nk4.a});
        }
        return (byte) 1;
    }
}