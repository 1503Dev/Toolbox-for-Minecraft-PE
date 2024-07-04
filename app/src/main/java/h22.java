package defpackage;

import java.io.IOException;

/* renamed from: h22  reason: default package */
public final class h22 extends ie5 implements of5 {
    private static final h22 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private long zzh;
    private long zzi;

    static {
        h22 h22Var = new h22();
        zzb = h22Var;
        ie5.n(h22.class, h22Var);
    }

    public static h22 B() {
        return zzb;
    }

    public static h22 C(ed5 ed5Var) {
        h22 h22Var = zzb;
        ud5 ud5Var = ud5.c;
        ld5 v = ed5Var.v();
        ie5 i = h22Var.i();
        try {
            dg5 a = vf5.c.a(i.getClass());
            md5 md5Var = v.b;
            if (md5Var == null) {
                md5Var = new md5(v);
            }
            a.i(i, md5Var, ud5Var);
            a.a(i);
            try {
                v.z(0);
                ie5.u(i);
                ie5.u(i);
                return (h22) i;
            } catch (te5 e) {
                throw e;
            }
        } catch (te5 e2) {
            if (e2.P) {
                throw new te5(e2);
            }
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof te5) {
                throw ((te5) e3.getCause());
            }
            throw new te5(e3);
        } catch (ng5 e4) {
            throw new te5(e4.getMessage());
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof te5) {
                throw ((te5) e5.getCause());
            }
            throw e5;
        }
    }

    public static h22 E(ed5 ed5Var, ud5 ud5Var) {
        return (h22) ie5.j(zzb, ed5Var, ud5Var);
    }

    public static /* synthetic */ void H(h22 h22Var, String str) {
        str.getClass();
        h22Var.zzd |= 1;
        h22Var.zze = str;
    }

    public static /* synthetic */ void I(h22 h22Var, long j) {
        h22Var.zzd |= 16;
        h22Var.zzi = j;
    }

    public static /* synthetic */ void J(h22 h22Var, String str) {
        str.getClass();
        h22Var.zzd |= 2;
        h22Var.zzf = str;
    }

    public static /* synthetic */ void K(h22 h22Var, long j) {
        h22Var.zzd |= 4;
        h22Var.zzg = j;
    }

    public static /* synthetic */ void L(h22 h22Var, long j) {
        h22Var.zzd |= 8;
        h22Var.zzh = j;
    }

    public static g22 z() {
        return (g22) zzb.s();
    }

    public final String F() {
        return this.zzf;
    }

    public final String G() {
        return this.zze;
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
                    return new g22(0);
                }
                return new h22();
            }
            return new xf5(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final long w() {
        return this.zzh;
    }

    public final long x() {
        return this.zzg;
    }

    public final long y() {
        return this.zzi;
    }
}