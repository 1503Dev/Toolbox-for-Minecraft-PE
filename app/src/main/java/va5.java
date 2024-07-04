package defpackage;

/* renamed from: va5 */
public final class va5 extends ie5 implements of5 {
    private static final va5 zzb;
    private String zzd = "";
    private gd5 zze = gd5.Q;
    private int zzf;

    static {
        va5 va5Var = new va5();
        zzb = va5Var;
        ie5.n(va5.class, va5Var);
    }

    public static /* synthetic */ void C(va5 va5Var, String str) {
        str.getClass();
        va5Var.zzd = str;
    }

    public static /* synthetic */ void E(va5 va5Var, ed5 ed5Var) {
        va5Var.zze = ed5Var;
    }

    public static /* synthetic */ void F(va5 va5Var, int i) {
        va5Var.zzf = e1.a(i);
    }

    public static ua5 w() {
        return (ua5) zzb.s();
    }

    public static va5 y() {
        return zzb;
    }

    public final gd5 A() {
        return this.zze;
    }

    public final String B() {
        return this.zzd;
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
                    return new ua5(0);
                }
                return new va5();
            }
            return new xf5(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int z() {
        int b = e1.b(this.zzf);
        if (b == 0) {
            return 6;
        }
        return b;
    }
}