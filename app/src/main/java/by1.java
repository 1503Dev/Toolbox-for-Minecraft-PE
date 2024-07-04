package defpackage;

/* renamed from: by1 */
public final class by1 extends ie5 implements of5 {
    private static final by1 zzb;
    private int zzd;
    private long zzt;
    private long zzu;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private int zzk = 1000;
    private long zzl = -1;
    private long zzm = -1;
    private long zzn = -1;
    private int zzo = 1000;
    private long zzp = -1;
    private long zzq = -1;
    private long zzr = -1;
    private long zzs = -1;
    private long zzv = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;

    static {
        by1 by1Var = new by1();
        zzb = by1Var;
        ie5.n(by1.class, by1Var);
    }

    public static /* synthetic */ void A(by1 by1Var, long j) {
        by1Var.zzd |= 4;
        by1Var.zzg = j;
    }

    public static /* synthetic */ void B(by1 by1Var, long j) {
        by1Var.zzd |= 8;
        by1Var.zzh = j;
    }

    public static /* synthetic */ void C(by1 by1Var) {
        by1Var.zzd &= -9;
        by1Var.zzh = -1L;
    }

    public static /* synthetic */ void E(by1 by1Var, long j) {
        by1Var.zzd |= 16;
        by1Var.zzi = j;
    }

    public static /* synthetic */ void F(by1 by1Var, long j) {
        by1Var.zzd |= 32;
        by1Var.zzj = j;
    }

    public static /* synthetic */ void G(by1 by1Var, long j) {
        by1Var.zzd |= 128;
        by1Var.zzl = j;
    }

    public static /* synthetic */ void H(by1 by1Var, long j) {
        by1Var.zzd |= 256;
        by1Var.zzm = j;
    }

    public static /* synthetic */ void I(by1 by1Var, long j) {
        by1Var.zzd |= 512;
        by1Var.zzn = j;
    }

    public static /* synthetic */ void J(by1 by1Var, long j) {
        by1Var.zzd |= 2048;
        by1Var.zzp = j;
    }

    public static /* synthetic */ void K(by1 by1Var, long j) {
        by1Var.zzd |= 4096;
        by1Var.zzq = j;
    }

    public static /* synthetic */ void L(by1 by1Var, long j) {
        by1Var.zzd |= 8192;
        by1Var.zzr = j;
    }

    public static /* synthetic */ void M(by1 by1Var, long j) {
        by1Var.zzd |= 16384;
        by1Var.zzs = j;
    }

    public static /* synthetic */ void N(by1 by1Var, long j) {
        by1Var.zzd |= 32768;
        by1Var.zzt = j;
    }

    public static /* synthetic */ void O(by1 by1Var, long j) {
        by1Var.zzd |= 65536;
        by1Var.zzu = j;
    }

    public static /* synthetic */ void P(by1 by1Var, long j) {
        by1Var.zzd |= 131072;
        by1Var.zzv = j;
    }

    public static /* synthetic */ void Q(by1 by1Var, long j) {
        by1Var.zzd |= 262144;
        by1Var.zzw = j;
    }

    public static /* synthetic */ void R(by1 by1Var, int i) {
        by1Var.zzk = i - 1;
        by1Var.zzd |= 64;
    }

    public static /* synthetic */ void S(by1 by1Var, int i) {
        by1Var.zzo = i - 1;
        by1Var.zzd |= 1024;
    }

    public static ay1 w() {
        return (ay1) zzb.s();
    }

    public static /* synthetic */ void y(by1 by1Var, long j) {
        by1Var.zzd |= 1;
        by1Var.zze = j;
    }

    public static /* synthetic */ void z(by1 by1Var, long j) {
        by1Var.zzd |= 2;
        by1Var.zzf = j;
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
                    return new ay1(0);
                }
                return new by1();
            }
            ky1 ky1Var = ky1.a;
            return new xf5(zzb, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဌ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", ky1Var, "zzl", "zzm", "zzn", "zzo", ky1Var, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy"});
        }
        return (byte) 1;
    }
}