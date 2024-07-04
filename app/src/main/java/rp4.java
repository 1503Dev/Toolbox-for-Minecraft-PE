package defpackage;

import java.util.Arrays;

/* renamed from: rp4 */
public final class rp4 extends ie5 implements of5 {
    private static final ne5 zzb = new p5();
    private static final rp4 zzd;
    private int zze;
    private me5 zzf = je5.S;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        rp4 rp4Var = new rp4();
        zzd = rp4Var;
        ie5.n(rp4.class, rp4Var);
    }

    public static qp4 w() {
        return (qp4) zzd.s();
    }

    public static /* synthetic */ void y(rp4 rp4Var, String str) {
        str.getClass();
        rp4Var.zze |= 1;
        rp4Var.zzg = str;
    }

    public static void z(rp4 rp4Var) {
        int i;
        me5 me5Var = rp4Var.zzf;
        if (!((wc5) me5Var).P) {
            je5 je5Var = (je5) me5Var;
            int i2 = je5Var.R;
            if (i2 == 0) {
                i = 10;
            } else {
                i = i2 + i2;
            }
            if (i >= i2) {
                rp4Var.zzf = new je5(Arrays.copyOf(je5Var.Q, i), je5Var.R, true);
            } else {
                throw new IllegalArgumentException();
            }
        }
        ((je5) rp4Var.zzf).h(2);
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
                        return zzd;
                    }
                    return new qp4(0);
                }
                return new rp4();
            }
            return new xf5(zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zze", "zzf", pp4.a, "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}