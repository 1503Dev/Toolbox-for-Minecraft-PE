package defpackage;

/* renamed from: iy1 */
public final class iy1 extends ie5 implements of5 {
    private static final iy1 zzb;
    private int zzd;
    private gd5 zze;
    private gd5 zzf;
    private gd5 zzg;
    private gd5 zzh;

    static {
        iy1 iy1Var = new iy1();
        zzb = iy1Var;
        ie5.n(iy1.class, iy1Var);
    }

    public iy1() {
        ed5 ed5Var = gd5.Q;
        this.zze = ed5Var;
        this.zzf = ed5Var;
        this.zzg = ed5Var;
        this.zzh = ed5Var;
    }

    public static /* synthetic */ void E(iy1 iy1Var, ed5 ed5Var) {
        iy1Var.zzd |= 1;
        iy1Var.zze = ed5Var;
    }

    public static /* synthetic */ void F(iy1 iy1Var, ed5 ed5Var) {
        iy1Var.zzd |= 2;
        iy1Var.zzf = ed5Var;
    }

    public static /* synthetic */ void G(iy1 iy1Var, ed5 ed5Var) {
        iy1Var.zzd |= 4;
        iy1Var.zzg = ed5Var;
    }

    public static /* synthetic */ void H(iy1 iy1Var, ed5 ed5Var) {
        iy1Var.zzd |= 8;
        iy1Var.zzh = ed5Var;
    }

    public static hy1 w() {
        return (hy1) zzb.s();
    }

    public static iy1 y(byte[] bArr, ud5 ud5Var) {
        ie5 v = ie5.v(zzb, bArr, bArr.length, ud5Var);
        ie5.u(v);
        return (iy1) v;
    }

    public final gd5 A() {
        return this.zzf;
    }

    public final gd5 B() {
        return this.zzh;
    }

    public final gd5 C() {
        return this.zzg;
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
                    return new hy1(0);
                }
                return new iy1();
            }
            return new xf5(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final gd5 z() {
        return this.zze;
    }
}