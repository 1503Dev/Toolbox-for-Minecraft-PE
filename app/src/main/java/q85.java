package defpackage;

/* renamed from: q85 */
public final class q85 extends ie5 implements of5 {
    private static final q85 zzb;
    private int zzd;
    private u85 zze;
    private gd5 zzf = gd5.Q;

    static {
        q85 q85Var = new q85();
        zzb = q85Var;
        ie5.n(q85.class, q85Var);
    }

    public static q85 A(gd5 gd5Var, ud5 ud5Var) {
        return (q85) ie5.j(zzb, gd5Var, ud5Var);
    }

    public static /* synthetic */ void F(q85 q85Var, u85 u85Var) {
        u85Var.getClass();
        q85Var.zze = u85Var;
    }

    public static p85 x() {
        return (p85) zzb.s();
    }

    public static q85 z() {
        return zzb;
    }

    public final u85 B() {
        u85 u85Var = this.zze;
        return u85Var == null ? u85.z() : u85Var;
    }

    public final gd5 C() {
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
                    return new p85(0);
                }
                return new q85();
            }
            return new xf5(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int w() {
        return this.zzd;
    }
}