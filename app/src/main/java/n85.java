package defpackage;

/* renamed from: n85 */
public final class n85 extends ie5 implements of5 {
    private static final n85 zzb;
    private s85 zzd;
    private ga5 zze;

    static {
        n85 n85Var = new n85();
        zzb = n85Var;
        ie5.n(n85.class, n85Var);
    }

    public static /* synthetic */ void B(n85 n85Var, s85 s85Var) {
        n85Var.zzd = s85Var;
    }

    public static /* synthetic */ void C(n85 n85Var, ga5 ga5Var) {
        n85Var.zze = ga5Var;
    }

    public static m85 w() {
        return (m85) zzb.s();
    }

    public static n85 y(gd5 gd5Var, ud5 ud5Var) {
        return (n85) ie5.j(zzb, gd5Var, ud5Var);
    }

    public final ga5 A() {
        ga5 ga5Var = this.zze;
        return ga5Var == null ? ga5.z() : ga5Var;
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
                    return new m85(0);
                }
                return new n85();
            }
            return new xf5(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final s85 z() {
        s85 s85Var = this.zzd;
        return s85Var == null ? s85.z() : s85Var;
    }
}