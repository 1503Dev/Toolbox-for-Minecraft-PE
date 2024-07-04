package defpackage;

/* renamed from: rh5 */
public final class rh5 extends ie5 implements of5 {
    private static final rh5 zzb;
    private int zzd;
    private String zze = "";

    static {
        rh5 rh5Var = new rh5();
        zzb = rh5Var;
        ie5.n(rh5.class, rh5Var);
    }

    public static qh5 w() {
        return (qh5) zzb.s();
    }

    public static /* synthetic */ void y(rh5 rh5Var, String str) {
        rh5Var.zzd |= 1;
        rh5Var.zze = str;
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
                    return new qh5(0);
                }
                return new rh5();
            }
            return new xf5(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}