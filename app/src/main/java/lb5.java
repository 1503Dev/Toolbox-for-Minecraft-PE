package defpackage;

/* renamed from: lb5 */
public final class lb5 extends ie5 implements of5 {
    private static final lb5 zzb;
    private String zzd = "";
    private va5 zze;

    static {
        lb5 lb5Var = new lb5();
        zzb = lb5Var;
        ie5.n(lb5.class, lb5Var);
    }

    public static /* synthetic */ lb5 x() {
        return zzb;
    }

    public static lb5 y() {
        return zzb;
    }

    public static lb5 z(gd5 gd5Var, ud5 ud5Var) {
        return (lb5) ie5.j(zzb, gd5Var, ud5Var);
    }

    public final String A() {
        return this.zzd;
    }

    public final boolean B() {
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
                    return new q72(0);
                }
                return new lb5();
            }
            return new xf5(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final va5 w() {
        va5 va5Var = this.zze;
        return va5Var == null ? va5.y() : va5Var;
    }
}