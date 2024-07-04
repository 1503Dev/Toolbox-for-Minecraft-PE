package defpackage;

/* renamed from: wm4 */
public final class wm4 extends ie5 implements of5 {
    private static final wm4 zzb;
    private tm4 zzd;

    static {
        wm4 wm4Var = new wm4();
        zzb = wm4Var;
        ie5.n(wm4.class, wm4Var);
    }

    public static vm4 w() {
        return (vm4) zzb.s();
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
                    return new vm4(0);
                }
                return new wm4();
            }
            return new xf5(zzb, "\u0000\u0001\u0000\u0000\u0006\u0006\u0001\u0000\u0000\u0000\u0006\t", new Object[]{"zzd"});
        }
        return (byte) 1;
    }
}