package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: ab5  reason: default package */
public final class ab5 extends ie5 implements of5 {
    private static final ab5 zzb;
    private int zzd;
    private qe5 zze = wf5.S;

    static {
        ab5 ab5Var = new ab5();
        zzb = ab5Var;
        ie5.n(ab5.class, ab5Var);
    }

    public static ab5 B(InputStream inputStream, ud5 ud5Var) {
        ab5 ab5Var = zzb;
        kd5 kd5Var = new kd5(inputStream);
        ie5 i = ab5Var.i();
        try {
            dg5 a = vf5.c.a(i.getClass());
            md5 md5Var = kd5Var.b;
            if (md5Var == null) {
                md5Var = new md5(kd5Var);
            }
            a.i(i, md5Var, ud5Var);
            a.a(i);
            ie5.u(i);
            return (ab5) i;
        } catch (ng5 e) {
            throw new te5(e.getMessage());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof te5) {
                throw ((te5) e2.getCause());
            }
            throw e2;
        } catch (te5 e3) {
            if (e3.P) {
                throw new te5(e3);
            }
            throw e3;
        } catch (IOException e4) {
            if (e4.getCause() instanceof te5) {
                throw ((te5) e4.getCause());
            }
            throw new te5(e4);
        }
    }

    public static ab5 C(byte[] bArr, ud5 ud5Var) {
        ie5 v = ie5.v(zzb, bArr, bArr.length, ud5Var);
        ie5.u(v);
        return (ab5) v;
    }

    public static /* synthetic */ void G(ab5 ab5Var, za5 za5Var) {
        qe5 qe5Var = ab5Var.zze;
        if (!qe5Var.d()) {
            ab5Var.zze = ie5.k(qe5Var);
        }
        ab5Var.zze.add(za5Var);
    }

    public static xa5 y() {
        return (xa5) zzb.s();
    }

    public final qe5 E() {
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
                    return new xa5(0);
                }
                return new ab5();
            }
            return new xf5(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", za5.class});
        }
        return (byte) 1;
    }

    public final int w() {
        return this.zze.size();
    }

    public final int x() {
        return this.zzd;
    }

    public final za5 z(int i) {
        return (za5) this.zze.get(i);
    }
}