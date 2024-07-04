package defpackage;

/* renamed from: pb5  reason: default package */
public final class pb5 extends ie5 implements of5 {
    private static final pb5 zzb;
    private int zzd;
    private gd5 zze = gd5.Q;

    static {
        pb5 pb5Var = new pb5();
        zzb = pb5Var;
        ie5.n(pb5.class, pb5Var);
    }

    public static ob5 x() {
        return (ob5) zzb.s();
    }

    public static pb5 z(gd5 gd5Var, ud5 ud5Var) {
        return (pb5) ie5.j(zzb, gd5Var, ud5Var);
    }

    public final gd5 A() {
        return this.zze;
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
                    return new ob5(0);
                }
                return new pb5();
            }
            return new xf5(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final int w() {
        return this.zzd;
    }
}