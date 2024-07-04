package defpackage;

/* renamed from: pa5  reason: default package */
public final class pa5 extends ie5 implements of5 {
    private static final pa5 zzb;
    private int zzd;
    private ra5 zze;
    private gd5 zzf = gd5.Q;

    static {
        pa5 pa5Var = new pa5();
        zzb = pa5Var;
        ie5.n(pa5.class, pa5Var);
    }

    public static oa5 x() {
        return (oa5) zzb.s();
    }

    public static pa5 z(gd5 gd5Var, ud5 ud5Var) {
        return (pa5) ie5.j(zzb, gd5Var, ud5Var);
    }

    public final ra5 A() {
        ra5 ra5Var = this.zze;
        return ra5Var == null ? ra5.A() : ra5Var;
    }

    public final gd5 B() {
        return this.zzf;
    }

    public final boolean G() {
        return this.zze != null;
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
                    return new oa5(0);
                }
                return new pa5();
            }
            return new xf5(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int w() {
        return this.zzd;
    }
}