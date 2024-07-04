package defpackage;

/* renamed from: y95  reason: default package */
public final class y95 extends ie5 implements of5 {
    private static final y95 zzb;
    private int zzd;
    private aa5 zze;
    private gd5 zzf = gd5.Q;

    static {
        y95 y95Var = new y95();
        zzb = y95Var;
        ie5.n(y95.class, y95Var);
    }

    public static x95 x() {
        return (x95) zzb.s();
    }

    public static y95 z(gd5 gd5Var, ud5 ud5Var) {
        return (y95) ie5.j(zzb, gd5Var, ud5Var);
    }

    public final aa5 A() {
        aa5 aa5Var = this.zze;
        return aa5Var == null ? aa5.A() : aa5Var;
    }

    public final gd5 B() {
        return this.zzf;
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
                    return new x95(0);
                }
                return new y95();
            }
            return new xf5(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int w() {
        return this.zzd;
    }
}