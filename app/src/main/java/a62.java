package defpackage;

/* renamed from: a62  reason: default package */
public final class a62 extends ie5 implements of5 {
    private static final a62 zzb;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        a62 a62Var = new a62();
        zzb = a62Var;
        ie5.n(a62.class, a62Var);
    }

    public static /* synthetic */ void A(a62 a62Var, int i) {
        a62Var.zzd |= 2;
        a62Var.zzf = i;
    }

    public static z52 w() {
        return (z52) zzb.s();
    }

    public static a62 y() {
        return zzb;
    }

    public static /* synthetic */ void z(a62 a62Var, boolean z) {
        a62Var.zzd |= 1;
        a62Var.zze = z;
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
                    return new z52(0);
                }
                return new a62();
            }
            return new xf5(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}