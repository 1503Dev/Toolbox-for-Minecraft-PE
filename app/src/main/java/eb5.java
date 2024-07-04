package defpackage;

/* renamed from: eb5 */
public final class eb5 extends ie5 implements of5 {
    private static final eb5 zzb;
    private int zzd;
    private qe5 zze = wf5.S;

    static {
        eb5 eb5Var = new eb5();
        zzb = eb5Var;
        ie5.n(eb5.class, eb5Var);
    }

    public static bb5 w() {
        return (bb5) zzb.s();
    }

    public static /* synthetic */ void z(eb5 eb5Var, db5 db5Var) {
        qe5 qe5Var = eb5Var.zze;
        if (!qe5Var.d()) {
            eb5Var.zze = ie5.k(qe5Var);
        }
        eb5Var.zze.add(db5Var);
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
                    return new bb5(0);
                }
                return new eb5();
            }
            return new xf5(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", db5.class});
        }
        return (byte) 1;
    }
}