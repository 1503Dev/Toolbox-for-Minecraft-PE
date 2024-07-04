package defpackage;

/* renamed from: up4 */
public final class up4 extends ie5 implements of5 {
    private static final up4 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private rp4 zzh;

    static {
        up4 up4Var = new up4();
        zzb = up4Var;
        ie5.n(up4.class, up4Var);
    }

    public static /* synthetic */ void A(up4 up4Var) {
        up4Var.zze = 1;
        up4Var.zzd = 1 | up4Var.zzd;
    }

    public static sp4 w() {
        return (sp4) zzb.s();
    }

    public static /* synthetic */ void y(up4 up4Var, String str) {
        str.getClass();
        up4Var.zzd |= 2;
        up4Var.zzf = str;
    }

    public static /* synthetic */ void z(up4 up4Var, rp4 rp4Var) {
        up4Var.zzh = rp4Var;
        up4Var.zzd |= 8;
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
                    return new sp4(0);
                }
                return new up4();
            }
            return new xf5(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", tp4.a, "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}