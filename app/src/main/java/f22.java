package defpackage;

/* renamed from: f22 */
public final class f22 extends ie5 implements of5 {
    private static final f22 zzb;
    private int zzd;
    private h22 zze;
    private gd5 zzf;
    private gd5 zzg;

    static {
        f22 f22Var = new f22();
        zzb = f22Var;
        ie5.n(f22.class, f22Var);
    }

    public f22() {
        ed5 ed5Var = gd5.Q;
        this.zzf = ed5Var;
        this.zzg = ed5Var;
    }

    public static f22 x(ed5 ed5Var, ud5 ud5Var) {
        return (f22) ie5.j(zzb, ed5Var, ud5Var);
    }

    public final gd5 A() {
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
                    return new ex1(0);
                }
                return new f22();
            }
            return new xf5(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final h22 y() {
        h22 h22Var = this.zze;
        return h22Var == null ? h22.B() : h22Var;
    }

    public final gd5 z() {
        return this.zzg;
    }
}