package defpackage;

/* renamed from: kb5  reason: default package */
public final class kb5 extends ie5 implements of5 {
    private static final kb5 zzb;
    private int zzd;
    private lb5 zze;

    static {
        kb5 kb5Var = new kb5();
        zzb = kb5Var;
        ie5.n(kb5.class, kb5Var);
    }

    public static /* synthetic */ void C(kb5 kb5Var, lb5 lb5Var) {
        lb5Var.getClass();
        kb5Var.zze = lb5Var;
    }

    public static jb5 x() {
        return (jb5) zzb.s();
    }

    public static kb5 z(gd5 gd5Var, ud5 ud5Var) {
        return (kb5) ie5.j(zzb, gd5Var, ud5Var);
    }

    public final lb5 A() {
        lb5 lb5Var = this.zze;
        return lb5Var == null ? lb5.y() : lb5Var;
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
                    return new jb5(0);
                }
                return new kb5();
            }
            return new xf5(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final int w() {
        return this.zzd;
    }
}