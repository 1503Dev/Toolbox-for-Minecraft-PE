package defpackage;

import java.util.Arrays;
import java.util.logging.Logger;

/* renamed from: n64  reason: default package */
public final class n64 extends z44 {
    @Override // defpackage.z44
    public final /* synthetic */ int a(Object obj) {
        return ((u54) obj).a();
    }

    @Override // defpackage.z44
    public final int b(Object obj) {
        u54 u54Var = (u54) obj;
        int i = u54Var.d;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < u54Var.a; i3++) {
                Logger logger = hg2.R;
                int m = ((y82) u54Var.c[i3]).m();
                int c0 = hg2.c0(m) + m;
                int c02 = hg2.c0(16);
                int c03 = hg2.c0(u54Var.b[i3] >>> 3);
                int c04 = hg2.c0(8);
                int i4 = c02 + c03;
                i2 += hg2.c0(24) + c0 + i4 + c04 + c04;
            }
            u54Var.d = i2;
            return i2;
        }
        return i;
    }

    @Override // defpackage.z44
    public final /* bridge */ /* synthetic */ u54 c(Object obj) {
        ox2 ox2Var = (ox2) obj;
        u54 u54Var = ox2Var.zzc;
        if (u54Var == u54.f) {
            u54 b = u54.b();
            ox2Var.zzc = b;
            return b;
        }
        return u54Var;
    }

    @Override // defpackage.z44
    public final /* synthetic */ u54 d(Object obj) {
        return ((ox2) obj).zzc;
    }

    @Override // defpackage.z44
    public final Object e(Object obj, Object obj2) {
        u54 u54Var = u54.f;
        if (!u54Var.equals(obj2)) {
            u54 u54Var2 = (u54) obj2;
            if (u54Var.equals(obj)) {
                u54 u54Var3 = (u54) obj;
                int i = u54Var3.a + u54Var2.a;
                int[] copyOf = Arrays.copyOf(u54Var3.b, i);
                System.arraycopy(u54Var2.b, 0, copyOf, u54Var3.a, u54Var2.a);
                Object[] copyOf2 = Arrays.copyOf(u54Var3.c, i);
                System.arraycopy(u54Var2.c, 0, copyOf2, u54Var3.a, u54Var2.a);
                return new u54(i, copyOf, copyOf2, true);
            }
            u54 u54Var4 = (u54) obj;
            u54Var4.getClass();
            if (!u54Var2.equals(u54Var)) {
                if (u54Var4.e) {
                    int i2 = u54Var4.a + u54Var2.a;
                    u54Var4.e(i2);
                    System.arraycopy(u54Var2.b, 0, u54Var4.b, u54Var4.a, u54Var2.a);
                    System.arraycopy(u54Var2.c, 0, u54Var4.c, u54Var4.a, u54Var2.a);
                    u54Var4.a = i2;
                    return obj;
                }
                throw new UnsupportedOperationException();
            }
            return obj;
        }
        return obj;
    }

    @Override // defpackage.z44
    public final /* bridge */ /* synthetic */ void f(int i, long j, Object obj) {
        ((u54) obj).c(i << 3, Long.valueOf(j));
    }

    @Override // defpackage.z44
    public final void g(Object obj) {
        ((ox2) obj).zzc.e = false;
    }

    @Override // defpackage.z44
    public final /* synthetic */ void h(Object obj, Object obj2) {
        ((ox2) obj).zzc = (u54) obj2;
    }

    @Override // defpackage.z44
    public final /* synthetic */ void i(Object obj, eh2 eh2Var) {
        ((u54) obj).d(eh2Var);
    }
}