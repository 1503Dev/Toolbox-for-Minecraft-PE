package defpackage;

/* renamed from: nr4  reason: default package */
public final class nr4 extends ox2 implements xk3 {
    private static final nr4 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        nr4 nr4Var = new nr4();
        zzb = nr4Var;
        ox2.g(nr4.class, nr4Var);
    }

    public static yq4 o() {
        return (yq4) ((ft2) zzb.m(5));
    }

    public static /* synthetic */ void q(nr4 nr4Var, String str) {
        str.getClass();
        nr4Var.zzd |= 1;
        nr4Var.zze = str;
    }

    public static /* synthetic */ void r(nr4 nr4Var, String str) {
        str.getClass();
        nr4Var.zzd |= 2;
        nr4Var.zzf = str;
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
                    return new yq4(0);
                }
                return new nr4();
            }
            return new cr3(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}