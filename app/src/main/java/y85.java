package defpackage;

/* renamed from: y85 */
public final class y85 extends ie5 implements of5 {
    private static final y85 zzb;
    private a95 zzd;
    private int zze;

    static {
        y85 y85Var = new y85();
        zzb = y85Var;
        ie5.n(y85.class, y85Var);
    }

    public static /* synthetic */ void B(y85 y85Var, a95 a95Var) {
        y85Var.zzd = a95Var;
    }

    public static /* synthetic */ void C(y85 y85Var, int i) {
        y85Var.zze = i;
    }

    public static x85 x() {
        return (x85) zzb.s();
    }

    public static y85 z(gd5 gd5Var, ud5 ud5Var) {
        return (y85) ie5.j(zzb, gd5Var, ud5Var);
    }

    public final a95 A() {
        a95 a95Var = this.zzd;
        return a95Var == null ? a95.z() : a95Var;
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
                    return new x85(0);
                }
                return new y85();
            }
            return new xf5(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final int w() {
        return this.zze;
    }
}