package defpackage;

/* renamed from: ny1  reason: default package */
public final class ny1 extends ie5 implements of5 {
    private static final ny1 zzb;
    private int zzd;
    private long zze;
    private String zzf = "";
    private gd5 zzg = gd5.Q;

    static {
        ny1 ny1Var = new ny1();
        zzb = ny1Var;
        ie5.n(ny1.class, ny1Var);
    }

    public static ny1 y() {
        return zzb;
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
                    return new my1();
                }
                return new ny1();
            }
            return new xf5(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final long w() {
        return this.zze;
    }

    public final boolean z() {
        return (this.zzd & 1) != 0;
    }
}