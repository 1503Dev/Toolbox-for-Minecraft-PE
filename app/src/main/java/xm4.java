package defpackage;

/* renamed from: xm4 */
public final class xm4 extends ie5 implements of5 {
    private static final xm4 zzb;
    private qe5 zzd = wf5.S;

    static {
        xm4 xm4Var = new xm4();
        zzb = xm4Var;
        ie5.n(xm4.class, xm4Var);
    }

    public static /* synthetic */ void A(xm4 xm4Var, wm4 wm4Var) {
        qe5 qe5Var = xm4Var.zzd;
        if (!qe5Var.d()) {
            xm4Var.zzd = ie5.k(qe5Var);
        }
        xm4Var.zzd.add(wm4Var);
    }

    public static um4 x() {
        return (um4) zzb.s();
    }

    public static void z(xm4 xm4Var) {
        xm4Var.zzd = wf5.S;
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
                    return new um4(0);
                }
                return new xm4();
            }
            return new xf5(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", wm4.class});
        }
        return (byte) 1;
    }

    public final int w() {
        return this.zzd.size();
    }
}