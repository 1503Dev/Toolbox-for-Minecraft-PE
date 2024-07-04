package defpackage;

/* renamed from: l85 */
public final class l85 extends ie5 implements of5 {
    private static final l85 zzb;
    private int zzd;
    private q85 zze;
    private ea5 zzf;

    static {
        l85 l85Var = new l85();
        zzb = l85Var;
        ie5.n(l85.class, l85Var);
    }

    public static /* synthetic */ void F(l85 l85Var, ea5 ea5Var) {
        ea5Var.getClass();
        l85Var.zzf = ea5Var;
    }

    public static k85 x() {
        return (k85) zzb.s();
    }

    public static l85 z(gd5 gd5Var, ud5 ud5Var) {
        return (l85) ie5.j(zzb, gd5Var, ud5Var);
    }

    public final q85 A() {
        q85 q85Var = this.zze;
        return q85Var == null ? q85.z() : q85Var;
    }

    public final ea5 B() {
        ea5 ea5Var = this.zzf;
        return ea5Var == null ? ea5.z() : ea5Var;
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
                    return new k85(0);
                }
                return new l85();
            }
            return new xf5(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int w() {
        return this.zzd;
    }
}