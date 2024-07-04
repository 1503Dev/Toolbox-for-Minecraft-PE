package defpackage;

import java.io.IOException;

/* renamed from: rj4 */
public final class rj4 extends ox2 implements xk3 {
    private static final rj4 zzb;
    private int zzd;
    private int zze;
    private kp4 zzf;
    private aw4 zzg;

    static {
        rj4 rj4Var = new rj4();
        zzb = rj4Var;
        ox2.g(rj4.class, rj4Var);
    }

    public static cj4 o() {
        return (cj4) ((ft2) zzb.m(5));
    }

    public static void q(byte[] bArr, hk2 hk2Var) {
        rj4 rj4Var = zzb;
        int length = bArr.length;
        ox2 ox2Var = (ox2) rj4Var.m(4);
        try {
            lr3 a = lq3.c.a(ox2Var.getClass());
            a.i(ox2Var, bArr, 0, length, new bx1(hk2Var));
            a.a(ox2Var);
            if (ox2Var.k()) {
                rj4 rj4Var2 = (rj4) ox2Var;
                return;
            }
            throw new p33(new f44().getMessage());
        } catch (f44 e) {
            throw new p33(e.getMessage());
        } catch (IOException e2) {
            if (e2.getCause() instanceof p33) {
                throw ((p33) e2.getCause());
            }
            throw new p33(e2);
        } catch (IndexOutOfBoundsException unused) {
            throw p33.d();
        } catch (p33 e3) {
            throw e3;
        }
    }

    public static /* synthetic */ void r(rj4 rj4Var, kp4 kp4Var) {
        rj4Var.zzf = kp4Var;
        rj4Var.zzd |= 2;
    }

    public static /* synthetic */ void s(rj4 rj4Var, int i) {
        rj4Var.zze = i - 1;
        rj4Var.zzd |= 1;
    }

    @Override // defpackage.ox2
    public final Object m(int i) {
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
                    return new cj4(0);
                }
                return new rj4();
            }
            return new cr3(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", nk4.a, "zzf", "zzg"});
        }
        return (byte) 1;
    }
}