package defpackage;

/* renamed from: mi5 */
public final class mi5 extends ie5 implements of5 {
    private static final mi5 zzb;
    private int zzd;
    private int zze;
    private di5 zzg;
    private fi5 zzh;
    private int zzi;
    private int zzl;
    private byte zzn = 2;
    private String zzf = "";
    private me5 zzj = je5.S;
    private String zzk = "";
    private qe5 zzm = wf5.S;

    static {
        mi5 mi5Var = new mi5();
        zzb = mi5Var;
        ie5.n(mi5.class, mi5Var);
    }

    public static /* synthetic */ void A(mi5 mi5Var, int i) {
        mi5Var.zzd |= 1;
        mi5Var.zze = i;
    }

    public static /* synthetic */ void B(mi5 mi5Var, String str) {
        str.getClass();
        mi5Var.zzd |= 2;
        mi5Var.zzf = str;
    }

    public static /* synthetic */ void C(mi5 mi5Var, di5 di5Var) {
        mi5Var.zzg = di5Var;
        mi5Var.zzd |= 4;
    }

    public static /* synthetic */ void E(mi5 mi5Var, String str) {
        str.getClass();
        qe5 qe5Var = mi5Var.zzm;
        if (!qe5Var.d()) {
            mi5Var.zzm = ie5.k(qe5Var);
        }
        mi5Var.zzm.add(str);
    }

    public static /* synthetic */ void F(mi5 mi5Var, int i) {
        mi5Var.zzl = i - 1;
        mi5Var.zzd |= 64;
    }

    public static li5 x() {
        return (li5) zzb.s();
    }

    @Override // defpackage.ie5
    public final Object t(int i, ie5 ie5Var) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (ie5Var == null) {
                                b = 0;
                            }
                            this.zzn = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new li5(0);
                }
                return new mi5();
            }
            return new xf5(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\bဌ\u0006\t\u001a", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", ki5.a, "zzm"});
        }
        return Byte.valueOf(this.zzn);
    }

    public final int w() {
        return this.zzm.size();
    }

    public final String z() {
        return this.zzf;
    }
}