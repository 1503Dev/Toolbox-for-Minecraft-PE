package defpackage;

/* renamed from: kp4 */
public final class kp4 extends ox2 implements xk3 {
    private static final kp4 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private String zzf = "";
    private String zzh = "";

    static {
        kp4 kp4Var = new kp4();
        zzb = kp4Var;
        ox2.g(kp4.class, kp4Var);
    }

    public static ao4 o() {
        return (ao4) ((ft2) zzb.m(5));
    }

    public static /* synthetic */ void q(kp4 kp4Var, int i) {
        kp4Var.zzd |= 1;
        kp4Var.zze = i;
    }

    public static /* synthetic */ void r(kp4 kp4Var, String str) {
        str.getClass();
        kp4Var.zzd |= 2;
        kp4Var.zzf = str;
    }

    public static /* synthetic */ void s(kp4 kp4Var, int i) {
        kp4Var.zzg = i - 1;
        kp4Var.zzd |= 4;
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
                    return new ao4(0);
                }
                return new kp4();
            }
            return new cr3(zzb, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004ဌ\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", vo4.a, "zzh"});
        }
        return (byte) 1;
    }
}