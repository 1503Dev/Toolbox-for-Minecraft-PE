package defpackage;

/* renamed from: f85 */
public final class f85 extends ie5 implements of5 {
    private static final f85 zzb;
    private int zzd;
    private gd5 zze = gd5.Q;
    private j85 zzf;

    static {
        f85 f85Var = new f85();
        zzb = f85Var;
        ie5.n(f85.class, f85Var);
    }

    public static /* synthetic */ void F(f85 f85Var, j85 j85Var) {
        j85Var.getClass();
        f85Var.zzf = j85Var;
    }

    public static e85 x() {
        return (e85) zzb.s();
    }

    public static f85 z(gd5 gd5Var, ud5 ud5Var) {
        return (f85) ie5.j(zzb, gd5Var, ud5Var);
    }

    public final j85 A() {
        j85 j85Var = this.zzf;
        return j85Var == null ? j85.z() : j85Var;
    }

    public final gd5 B() {
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
                    return new e85(0);
                }
                return new f85();
            }
            return new xf5(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int w() {
        return this.zzd;
    }
}