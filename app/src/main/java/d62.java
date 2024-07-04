package defpackage;

/* renamed from: d62  reason: default package */
public final class d62 extends ie5 implements of5 {
    private static final d62 zzb;
    private qe5 zzd = wf5.S;

    static {
        d62 d62Var = new d62();
        zzb = d62Var;
        ie5.n(d62.class, d62Var);
    }

    public static x52 w() {
        return (x52) zzb.s();
    }

    public static /* synthetic */ void y(d62 d62Var, w52 w52Var) {
        qe5 qe5Var = d62Var.zzd;
        if (!qe5Var.d()) {
            d62Var.zzd = ie5.k(qe5Var);
        }
        d62Var.zzd.add(w52Var);
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
                    return new x52(0);
                }
                return new d62();
            }
            return new xf5(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", w52.class});
        }
        return (byte) 1;
    }
}