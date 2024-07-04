package defpackage;

/* renamed from: s85 */
public final class s85 extends ie5 implements of5 {
    private static final s85 zzb;
    private u85 zzd;
    private int zze;

    static {
        s85 s85Var = new s85();
        zzb = s85Var;
        ie5.n(s85.class, s85Var);
    }

    public static s85 A(gd5 gd5Var, ud5 ud5Var) {
        return (s85) ie5.j(zzb, gd5Var, ud5Var);
    }

    public static /* synthetic */ void C(s85 s85Var, u85 u85Var) {
        s85Var.zzd = u85Var;
    }

    public static /* synthetic */ void E(s85 s85Var, int i) {
        s85Var.zze = i;
    }

    public static r85 x() {
        return (r85) zzb.s();
    }

    public static s85 z() {
        return zzb;
    }

    public final u85 B() {
        u85 u85Var = this.zzd;
        return u85Var == null ? u85.z() : u85Var;
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
                    return new r85(0);
                }
                return new s85();
            }
            return new xf5(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final int w() {
        return this.zze;
    }
}