package defpackage;

import java.util.Arrays;
import java.util.logging.Logger;

/* renamed from: qg5  reason: default package */
public final class qg5 extends og5 {
    @Override // defpackage.og5
    public final /* synthetic */ int a(Object obj) {
        return ((pg5) obj).a();
    }

    @Override // defpackage.og5
    public final int b(Object obj) {
        pg5 pg5Var = (pg5) obj;
        int i = pg5Var.d;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < pg5Var.a; i3++) {
                Logger logger = qd5.R;
                int o = ((gd5) pg5Var.c[i3]).o();
                int p = qd5.p(o) + o;
                int p2 = qd5.p(16);
                int p3 = qd5.p(pg5Var.b[i3] >>> 3);
                int p4 = qd5.p(8);
                int i4 = p2 + p3;
                i2 += qd5.p(24) + p + i4 + p4 + p4;
            }
            pg5Var.d = i2;
            return i2;
        }
        return i;
    }

    @Override // defpackage.og5
    public final /* bridge */ /* synthetic */ pg5 c(Object obj) {
        ie5 ie5Var = (ie5) obj;
        pg5 pg5Var = ie5Var.zzc;
        if (pg5Var == pg5.f) {
            pg5 b = pg5.b();
            ie5Var.zzc = b;
            return b;
        }
        return pg5Var;
    }

    @Override // defpackage.og5
    public final /* synthetic */ pg5 d(Object obj) {
        return ((ie5) obj).zzc;
    }

    @Override // defpackage.og5
    public final Object e(Object obj, Object obj2) {
        pg5 pg5Var = pg5.f;
        if (!pg5Var.equals(obj2)) {
            pg5 pg5Var2 = (pg5) obj2;
            if (pg5Var.equals(obj)) {
                pg5 pg5Var3 = (pg5) obj;
                int i = pg5Var3.a + pg5Var2.a;
                int[] copyOf = Arrays.copyOf(pg5Var3.b, i);
                System.arraycopy(pg5Var2.b, 0, copyOf, pg5Var3.a, pg5Var2.a);
                Object[] copyOf2 = Arrays.copyOf(pg5Var3.c, i);
                System.arraycopy(pg5Var2.c, 0, copyOf2, pg5Var3.a, pg5Var2.a);
                return new pg5(i, copyOf, copyOf2, true);
            }
            pg5 pg5Var4 = (pg5) obj;
            pg5Var4.getClass();
            if (!pg5Var2.equals(pg5Var)) {
                if (pg5Var4.e) {
                    int i2 = pg5Var4.a + pg5Var2.a;
                    pg5Var4.e(i2);
                    System.arraycopy(pg5Var2.b, 0, pg5Var4.b, pg5Var4.a, pg5Var2.a);
                    System.arraycopy(pg5Var2.c, 0, pg5Var4.c, pg5Var4.a, pg5Var2.a);
                    pg5Var4.a = i2;
                    return obj;
                }
                throw new UnsupportedOperationException();
            }
            return obj;
        }
        return obj;
    }

    @Override // defpackage.og5
    public final /* synthetic */ pg5 f() {
        return pg5.b();
    }

    @Override // defpackage.og5
    public final Object g(Object obj) {
        ((pg5) obj).e = false;
        return obj;
    }

    @Override // defpackage.og5
    public final /* bridge */ /* synthetic */ void h(int i, int i2, Object obj) {
        ((pg5) obj).c((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // defpackage.og5
    public final /* bridge */ /* synthetic */ void i(int i, long j, Object obj) {
        ((pg5) obj).c((i << 3) | 1, Long.valueOf(j));
    }

    @Override // defpackage.og5
    public final /* bridge */ /* synthetic */ void j(int i, Object obj, Object obj2) {
        ((pg5) obj).c((i << 3) | 3, obj2);
    }

    @Override // defpackage.og5
    public final /* bridge */ /* synthetic */ void k(Object obj, int i, gd5 gd5Var) {
        ((pg5) obj).c((i << 3) | 2, gd5Var);
    }

    @Override // defpackage.og5
    public final /* bridge */ /* synthetic */ void l(int i, long j, Object obj) {
        ((pg5) obj).c(i << 3, Long.valueOf(j));
    }

    @Override // defpackage.og5
    public final void m(Object obj) {
        ((ie5) obj).zzc.e = false;
    }

    @Override // defpackage.og5
    public final /* synthetic */ void n(Object obj, Object obj2) {
        ((ie5) obj).zzc = (pg5) obj2;
    }

    @Override // defpackage.og5
    public final /* synthetic */ void o(Object obj, Object obj2) {
        ((ie5) obj).zzc = (pg5) obj2;
    }

    @Override // defpackage.og5
    public final void q() {
    }

    @Override // defpackage.og5
    public final /* synthetic */ void r(Object obj, rd5 rd5Var) {
        ((pg5) obj).d(rd5Var);
    }
}