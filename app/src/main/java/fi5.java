package defpackage;

/* renamed from: fi5  reason: default package */
public final class fi5 extends ie5 implements of5 {
    private static final fi5 zzb;
    private int zzd;
    private ei5 zze;
    private gd5 zzg;
    private gd5 zzh;
    private int zzi;
    private gd5 zzj;
    private byte zzk = 2;
    private qe5 zzf = wf5.S;

    static {
        fi5 fi5Var = new fi5();
        zzb = fi5Var;
        ie5.n(fi5.class, fi5Var);
    }

    public fi5() {
        ed5 ed5Var = gd5.Q;
        this.zzg = ed5Var;
        this.zzh = ed5Var;
        this.zzj = ed5Var;
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
                            this.zzk = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new o72((Object) null);
                }
                return new fi5();
            }
            return new xf5(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzd", "zze", "zzf", zh5.class, "zzg", "zzh", "zzi", "zzj"});
        }
        return Byte.valueOf(this.zzk);
    }
}