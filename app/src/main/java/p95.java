package defpackage;

/* renamed from: p95  reason: default package */
public final class p95 extends ie5 implements of5 {
    private static final p95 zzb;
    private int zzd;
    private gd5 zze = gd5.Q;

    static {
        p95 p95Var = new p95();
        zzb = p95Var;
        ie5.n(p95.class, p95Var);
    }

    public static o95 x() {
        return (o95) zzb.s();
    }

    public static p95 z(gd5 gd5Var, ud5 ud5Var) {
        return (p95) ie5.j(zzb, gd5Var, ud5Var);
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
                    return new o95(0);
                }
                return new p95();
            }
            return new xf5(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final int w() {
        return this.zzd;
    }
}