package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: j72 */
public final class j72 extends ie5 implements of5 {
    private static final ne5 zzb = new vj();
    private static final j72 zzd;
    private int zze;
    private long zzf;
    private int zzg;
    private long zzh;
    private long zzi;
    private me5 zzj = je5.S;
    private e72 zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private long zzr;

    static {
        j72 j72Var = new j72();
        zzd = j72Var;
        ie5.n(j72.class, j72Var);
    }

    public static i72 F() {
        return (i72) zzd.s();
    }

    public static j72 H(byte[] bArr) {
        ie5 v = ie5.v(zzd, bArr, bArr.length, ud5.c);
        ie5.u(v);
        return (j72) v;
    }

    public static /* synthetic */ void K(j72 j72Var, long j) {
        j72Var.zze |= 1;
        j72Var.zzf = j;
    }

    public static /* synthetic */ void L(j72 j72Var, long j) {
        j72Var.zze |= 4;
        j72Var.zzh = j;
    }

    public static /* synthetic */ void M(j72 j72Var, long j) {
        j72Var.zze |= 8;
        j72Var.zzi = j;
    }

    public static void N(j72 j72Var, ArrayList arrayList) {
        int i;
        me5 me5Var = j72Var.zzj;
        if (!((wc5) me5Var).P) {
            je5 je5Var = (je5) me5Var;
            int i2 = je5Var.R;
            if (i2 == 0) {
                i = 10;
            } else {
                i = i2 + i2;
            }
            if (i >= i2) {
                j72Var.zzj = new je5(Arrays.copyOf(je5Var.Q, i), je5Var.R, true);
            } else {
                throw new IllegalArgumentException();
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((je5) j72Var.zzj).h(((f62) it.next()).P);
        }
    }

    public static /* synthetic */ void O(j72 j72Var, e72 e72Var) {
        e72Var.getClass();
        j72Var.zzk = e72Var;
        j72Var.zze |= 16;
    }

    public static /* synthetic */ void P(j72 j72Var, int i) {
        j72Var.zze |= 256;
        j72Var.zzo = i;
    }

    public static void Q(j72 j72Var, m72 m72Var) {
        j72Var.zzq = m72Var.P;
        j72Var.zze |= 1024;
    }

    public static /* synthetic */ void R(j72 j72Var, long j) {
        j72Var.zze |= 2048;
        j72Var.zzr = j;
    }

    public static /* synthetic */ void X(j72 j72Var, int i) {
        j72Var.zzg = i - 1;
        j72Var.zze |= 2;
    }

    public static /* synthetic */ void Y(j72 j72Var, int i) {
        j72Var.zzl = i - 1;
        j72Var.zze |= 32;
    }

    public static /* synthetic */ void w(j72 j72Var, int i) {
        j72Var.zzm = i - 1;
        j72Var.zze |= 64;
    }

    public static /* synthetic */ void x(j72 j72Var, int i) {
        j72Var.zzn = i - 1;
        j72Var.zze |= 128;
    }

    public static /* synthetic */ void y(j72 j72Var, int i) {
        j72Var.zzp = i - 1;
        j72Var.zze |= 512;
    }

    public final long A() {
        return this.zzi;
    }

    public final long B() {
        return this.zzh;
    }

    public final long C() {
        return this.zzf;
    }

    public final e72 E() {
        e72 e72Var = this.zzk;
        return e72Var == null ? e72.y() : e72Var;
    }

    public final m72 I() {
        m72 b = m72.b(this.zzq);
        return b == null ? m72.Q : b;
    }

    public final oe5 J() {
        return new oe5(this.zzj);
    }

    public final int S() {
        int p = ja.p(this.zzm);
        if (p == 0) {
            return 1;
        }
        return p;
    }

    public final int T() {
        int p = ja.p(this.zzn);
        if (p == 0) {
            return 1;
        }
        return p;
    }

    public final int U() {
        int p = ja.p(this.zzp);
        if (p == 0) {
            return 1;
        }
        return p;
    }

    public final int V() {
        int p = ja.p(this.zzg);
        if (p == 0) {
            return 1;
        }
        return p;
    }

    public final int W() {
        int p = ja.p(this.zzl);
        if (p == 0) {
            return 1;
        }
        return p;
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
                    return new i72(0);
                }
                return new j72();
            }
            s62 s62Var = s62.a;
            return new xf5(zzd, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001e\u0006ဉ\u0004\u0007ဌ\u0005\bဌ\u0006\tဌ\u0007\nင\b\u000bဌ\t\fဌ\n\rဂ\u000b", new Object[]{"zze", "zzf", "zzg", s62Var, "zzh", "zzi", "zzj", e62.a, "zzk", "zzl", s62Var, "zzm", s62Var, "zzn", s62Var, "zzo", "zzp", s62Var, "zzq", l72.a, "zzr"});
        }
        return (byte) 1;
    }

    public final int z() {
        return this.zzo;
    }
}