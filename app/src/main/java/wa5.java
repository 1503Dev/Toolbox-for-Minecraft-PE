package defpackage;

@Deprecated
/* renamed from: wa5  reason: default package */
public final class wa5 extends ie5 implements of5 {
    private static final wa5 zzb;
    private int zzf;
    private boolean zzg;
    private String zzd = "";
    private String zze = "";
    private String zzh = "";

    static {
        wa5 wa5Var = new wa5();
        zzb = wa5Var;
        ie5.n(wa5.class, wa5Var);
    }

    public final boolean A() {
        return this.zzg;
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
                    return new x62(0);
                }
                return new wa5();
            }
            return new xf5(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final String x() {
        return this.zzh;
    }

    public final String y() {
        return this.zzd;
    }

    public final String z() {
        return this.zze;
    }
}