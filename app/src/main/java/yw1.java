package defpackage;

/* renamed from: yw1 */
public final class yw1 extends ie5 implements of5 {
    private static final yw1 zzb;
    private int zzd;
    private long zzf;
    private long zzj;
    private long zzk;
    private long zzm;
    private int zzq;
    private String zze = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzl = "";
    private String zzn = "";
    private String zzo = "";
    private qe5 zzp = wf5.S;

    static {
        yw1 yw1Var = new yw1();
        zzb = yw1Var;
        ie5.n(yw1.class, yw1Var);
    }

    public static /* synthetic */ void A(yw1 yw1Var, String str) {
        yw1Var.zzd |= 8;
        yw1Var.zzh = str;
    }

    public static /* synthetic */ void B(yw1 yw1Var, String str) {
        yw1Var.zzd |= 16;
        yw1Var.zzi = str;
    }

    public static /* synthetic */ void C(yw1 yw1Var, String str) {
        yw1Var.zzd |= 1024;
        yw1Var.zzo = str;
    }

    public static /* synthetic */ void E(yw1 yw1Var, String str) {
        str.getClass();
        yw1Var.zzd |= 1;
        yw1Var.zze = str;
    }

    public static /* synthetic */ void F(yw1 yw1Var, int i) {
        yw1Var.zzq = i - 1;
        yw1Var.zzd |= 2048;
    }

    public static uw1 w() {
        return (uw1) zzb.s();
    }

    public static /* synthetic */ void y(yw1 yw1Var, long j) {
        yw1Var.zzd |= 2;
        yw1Var.zzf = j;
    }

    public static /* synthetic */ void z(yw1 yw1Var, String str) {
        str.getClass();
        yw1Var.zzd |= 4;
        yw1Var.zzg = str;
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
                    return new uw1(0);
                }
                return new yw1();
            }
            return new xf5(zzb, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\rဌ\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", ww1.class, "zzq", xw1.a});
        }
        return (byte) 1;
    }
}