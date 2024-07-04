package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ri5 */
public final class ri5 extends ie5 implements of5 {
    private static final ri5 zzb;
    private qe5 zzA;
    private uh5 zzB;
    private String zzC;
    private nh5 zzD;
    private qe5 zzE;
    private int zzd;
    private int zze;
    private int zzf;
    private rh5 zzj;
    private qe5 zzk;
    private qe5 zzl;
    private String zzm;
    private ii5 zzn;
    private boolean zzo;
    private qe5 zzp;
    private String zzq;
    private boolean zzr;
    private boolean zzs;
    private gd5 zzt;
    private oi5 zzu;
    private boolean zzv;
    private String zzw;
    private qe5 zzx;
    private qe5 zzy;
    private qi5 zzz;
    private byte zzF = 2;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        ri5 ri5Var = new ri5();
        zzb = ri5Var;
        ie5.n(ri5.class, ri5Var);
    }

    public ri5() {
        wf5 wf5Var = wf5.S;
        this.zzk = wf5Var;
        this.zzl = wf5Var;
        this.zzm = "";
        this.zzp = wf5Var;
        this.zzq = "";
        this.zzt = gd5.Q;
        this.zzw = "";
        this.zzx = wf5Var;
        this.zzy = wf5Var;
        this.zzA = wf5Var;
        this.zzC = "";
        this.zzE = wf5Var;
    }

    public static /* synthetic */ void B(ri5 ri5Var, String str) {
        str.getClass();
        ri5Var.zzd |= 4;
        ri5Var.zzg = str;
    }

    public static /* synthetic */ void C(ri5 ri5Var, String str) {
        str.getClass();
        ri5Var.zzd |= 8;
        ri5Var.zzh = str;
    }

    public static /* synthetic */ void E(ri5 ri5Var, rh5 rh5Var) {
        ri5Var.zzj = rh5Var;
        ri5Var.zzd |= 32;
    }

    public static /* synthetic */ void F(ri5 ri5Var, mi5 mi5Var) {
        qe5 qe5Var = ri5Var.zzk;
        if (!qe5Var.d()) {
            ri5Var.zzk = ie5.k(qe5Var);
        }
        ri5Var.zzk.add(mi5Var);
    }

    public static /* synthetic */ void G(ri5 ri5Var, String str) {
        ri5Var.zzd |= 64;
        ri5Var.zzm = str;
    }

    public static /* synthetic */ void H(ri5 ri5Var) {
        ri5Var.zzd &= -65;
        ri5Var.zzm = zzb.zzm;
    }

    public static /* synthetic */ void I(ri5 ri5Var, ii5 ii5Var) {
        ri5Var.zzn = ii5Var;
        ri5Var.zzd |= 128;
    }

    public static /* synthetic */ void J(ri5 ri5Var, oi5 oi5Var) {
        ri5Var.zzu = oi5Var;
        ri5Var.zzd |= 8192;
    }

    public static /* synthetic */ void K(ri5 ri5Var, ArrayList arrayList) {
        qe5 qe5Var = ri5Var.zzx;
        if (!qe5Var.d()) {
            ri5Var.zzx = ie5.k(qe5Var);
        }
        qe5 qe5Var2 = ri5Var.zzx;
        Charset charset = re5.a;
        if (qe5Var2 instanceof ArrayList) {
            ((ArrayList) qe5Var2).ensureCapacity(arrayList.size() + qe5Var2.size());
        }
        int size = qe5Var2.size();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next == null) {
                String b = bp.b("Element at index ", qe5Var2.size() - size, " is null.");
                int size2 = qe5Var2.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        break;
                    }
                    qe5Var2.remove(size2);
                }
                throw new NullPointerException(b);
            }
            qe5Var2.add(next);
        }
    }

    public static /* synthetic */ void L(ri5 ri5Var, ArrayList arrayList) {
        qe5 qe5Var = ri5Var.zzy;
        if (!qe5Var.d()) {
            ri5Var.zzy = ie5.k(qe5Var);
        }
        qe5 qe5Var2 = ri5Var.zzy;
        Charset charset = re5.a;
        if (qe5Var2 instanceof ArrayList) {
            ((ArrayList) qe5Var2).ensureCapacity(arrayList.size() + qe5Var2.size());
        }
        int size = qe5Var2.size();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next == null) {
                String b = bp.b("Element at index ", qe5Var2.size() - size, " is null.");
                int size2 = qe5Var2.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        break;
                    }
                    qe5Var2.remove(size2);
                }
                throw new NullPointerException(b);
            }
            qe5Var2.add(next);
        }
    }

    public static /* synthetic */ void M(ri5 ri5Var, int i) {
        ri5Var.zze = i - 1;
        ri5Var.zzd |= 1;
    }

    public static ph5 w() {
        return (ph5) zzb.s();
    }

    public final qe5 A() {
        return this.zzk;
    }

    @Override // defpackage.ie5
    public final Object t(int i, ie5 ie5Var) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (ie5Var == null) {
                                b = 0;
                            }
                            this.zzF = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new ph5(0);
                }
                return new ri5();
            }
            return new xf5(zzb, "\u0001\u001b\u0000\u0001\u0001\u001b\u001b\u0000\u0007\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\nဌ\u0000\u000bဌ\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b", new Object[]{"zzd", "zzg", "zzh", "zzi", "zzk", mi5.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zze", ji5.a, "zzf", oh5.a, "zzj", "zzm", "zzn", "zzt", "zzl", ti5.class, "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", xi5.class, "zzB", "zzC", "zzD", "zzE", xh5.class});
        }
        return Byte.valueOf(this.zzF);
    }

    public final String y() {
        return this.zzm;
    }

    public final String z() {
        return this.zzg;
    }
}