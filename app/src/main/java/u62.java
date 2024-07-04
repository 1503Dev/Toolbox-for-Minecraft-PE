package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: u62 */
public final class u62 extends ie5 implements of5 {
    private static final u62 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private z72 zzi;
    private p62 zzk;
    private r62 zzl;
    private e72 zzm;
    private u52 zzn;
    private n72 zzo;
    private i92 zzp;
    private d62 zzq;
    private String zzf = "";
    private int zzh = 1000;
    private pe5 zzj = df5.S;

    static {
        u62 u62Var = new u62();
        zzb = u62Var;
        ie5.n(u62.class, u62Var);
    }

    public static /* synthetic */ void B(u62 u62Var, String str) {
        str.getClass();
        u62Var.zzd |= 2;
        u62Var.zzf = str;
    }

    public static void C(u62 u62Var, ArrayList arrayList) {
        int i;
        pe5 pe5Var = u62Var.zzj;
        if (!((wc5) pe5Var).P) {
            df5 df5Var = (df5) pe5Var;
            int i2 = df5Var.R;
            if (i2 == 0) {
                i = 10;
            } else {
                i = i2 + i2;
            }
            if (i >= i2) {
                u62Var.zzj = new df5(Arrays.copyOf(df5Var.Q, i), df5Var.R, true);
            } else {
                throw new IllegalArgumentException();
            }
        }
        pe5 pe5Var2 = u62Var.zzj;
        Charset charset = re5.a;
        if (pe5Var2 instanceof ArrayList) {
            ((ArrayList) pe5Var2).ensureCapacity(arrayList.size() + ((df5) pe5Var2).R);
        }
        df5 df5Var2 = (df5) pe5Var2;
        int i3 = df5Var2.R;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next == null) {
                String b = bp.b("Element at index ", df5Var2.R - i3, " is null.");
                int i4 = df5Var2.R;
                while (true) {
                    i4--;
                    if (i4 < i3) {
                        break;
                    }
                    df5Var2.remove(i4);
                }
                throw new NullPointerException(b);
            }
            df5Var2.add(next);
        }
    }

    public static void E(u62 u62Var) {
        u62Var.zzj = df5.S;
    }

    public static /* synthetic */ void F(u62 u62Var, p62 p62Var) {
        u62Var.zzk = p62Var;
        u62Var.zzd |= 32;
    }

    public static /* synthetic */ void G(u62 u62Var, u52 u52Var) {
        u62Var.zzn = u52Var;
        u62Var.zzd |= 256;
    }

    public static /* synthetic */ void H(u62 u62Var, n72 n72Var) {
        n72Var.getClass();
        u62Var.zzo = n72Var;
        u62Var.zzd |= 512;
    }

    public static /* synthetic */ void I(u62 u62Var, i92 i92Var) {
        u62Var.zzp = i92Var;
        u62Var.zzd |= 1024;
    }

    public static /* synthetic */ void J(u62 u62Var, d62 d62Var) {
        d62Var.getClass();
        u62Var.zzq = d62Var;
        u62Var.zzd |= 2048;
    }

    public static t62 y() {
        return (t62) zzb.s();
    }

    public final String A() {
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
                    return new t62(0);
                }
                return new u62();
            }
            return new xf5(zzb, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\fဌ\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", s62.a, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq"});
        }
        return (byte) 1;
    }

    public final u52 w() {
        u52 u52Var = this.zzn;
        return u52Var == null ? u52.x() : u52Var;
    }

    public final p62 x() {
        p62 p62Var = this.zzk;
        return p62Var == null ? p62.x() : p62Var;
    }
}