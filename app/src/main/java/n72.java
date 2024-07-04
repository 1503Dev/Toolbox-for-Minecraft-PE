package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: n72  reason: default package */
public final class n72 extends ie5 implements of5 {
    private static final n72 zzb;
    private int zzd;
    private int zzf;
    private int zzg;
    private long zzh;
    private long zzk;
    private int zzl;
    private qe5 zze = wf5.S;
    private String zzi = "";
    private String zzj = "";

    static {
        n72 n72Var = new n72();
        zzb = n72Var;
        ie5.n(n72.class, n72Var);
    }

    public static /* synthetic */ void A(n72 n72Var, int i) {
        n72Var.zzd |= 2;
        n72Var.zzg = i;
    }

    public static /* synthetic */ void B(n72 n72Var, long j) {
        n72Var.zzd |= 4;
        n72Var.zzh = j;
    }

    public static /* synthetic */ void C(n72 n72Var, String str) {
        str.getClass();
        n72Var.zzd |= 8;
        n72Var.zzi = str;
    }

    public static /* synthetic */ void E(n72 n72Var, String str) {
        str.getClass();
        n72Var.zzd |= 16;
        n72Var.zzj = str;
    }

    public static /* synthetic */ void F(n72 n72Var, long j) {
        n72Var.zzd |= 32;
        n72Var.zzk = j;
    }

    public static /* synthetic */ void G(n72 n72Var, int i) {
        n72Var.zzd |= 64;
        n72Var.zzl = i;
    }

    public static k72 w() {
        return (k72) zzb.s();
    }

    public static /* synthetic */ void y(n72 n72Var, ArrayList arrayList) {
        qe5 qe5Var = n72Var.zze;
        if (!qe5Var.d()) {
            n72Var.zze = ie5.k(qe5Var);
        }
        qe5 qe5Var2 = n72Var.zze;
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

    public static /* synthetic */ void z(n72 n72Var, int i) {
        n72Var.zzd |= 1;
        n72Var.zzf = i;
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
                    return new k72(0);
                }
                return new n72();
            }
            return new xf5(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzd", "zze", j72.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        return (byte) 1;
    }
}