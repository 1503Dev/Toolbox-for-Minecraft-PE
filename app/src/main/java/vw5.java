package defpackage;

import android.util.SparseArray;
import java.io.EOFException;

/* renamed from: vw5  reason: default package */
public final class vw5 implements pl1 {
    public fb3 A;
    public final rw5 a;
    public final ns5 d;
    public uw5 e;
    public cu1 f;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean u;
    public cu1 x;
    public boolean y;
    public boolean z;
    public final sw5 b = new sw5();
    public int g = 1000;
    public long[] h = new long[1000];
    public long[] i = new long[1000];
    public long[] l = new long[1000];
    public int[] k = new int[1000];
    public int[] j = new int[1000];
    public ol1[] m = new ol1[1000];
    public final gx5 c = new gx5();
    public long r = Long.MIN_VALUE;
    public long s = Long.MIN_VALUE;
    public long t = Long.MIN_VALUE;
    public boolean w = true;
    public boolean v = true;

    public vw5(jz5 jz5Var, ns5 ns5Var) {
        this.d = ns5Var;
        this.a = new rw5(jz5Var);
    }

    @Override // defpackage.pl1
    public final void a(int i, kh4 kh4Var) {
        c(kh4Var, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b5, code lost:
        if (((defpackage.tw5) r10.valueAt(r10.size() - 1)).a.equals(r9.x) == false) goto L44;
     */
    @Override // defpackage.pl1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(long j, int i, int i2, int i3, ol1 ol1Var) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.v) {
            if ((i & 1) == 0) {
                return;
            }
            this.v = false;
        }
        if (this.y) {
            if (j < this.r) {
                return;
            }
            if ((i & 1) == 0) {
                if (!this.z) {
                    lb4.c("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.x)));
                    this.z = true;
                }
                i |= 1;
            }
        }
        long j2 = (this.a.e - i2) - i3;
        synchronized (this) {
            int i4 = this.n;
            if (i4 > 0) {
                int g = g(i4 - 1);
                if (this.i[g] + this.j[g] <= j2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                tv2.G(z3);
            }
            if ((536870912 & i) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.u = z;
            this.t = Math.max(this.t, j);
            int g2 = g(this.n);
            this.l[g2] = j;
            this.i[g2] = j2;
            this.j[g2] = i2;
            this.k[g2] = i;
            this.m[g2] = ol1Var;
            this.h[g2] = 0;
            if (this.c.b.size() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                SparseArray sparseArray = this.c.b;
            }
            gx5 gx5Var = this.c;
            int i5 = this.o + this.n;
            cu1 cu1Var = this.x;
            cu1Var.getClass();
            gx5Var.b(i5, new tw5(cu1Var));
            int i6 = this.n + 1;
            this.n = i6;
            int i7 = this.g;
            if (i6 == i7) {
                int i8 = i7 + 1000;
                long[] jArr = new long[i8];
                long[] jArr2 = new long[i8];
                long[] jArr3 = new long[i8];
                int[] iArr = new int[i8];
                int[] iArr2 = new int[i8];
                ol1[] ol1VarArr = new ol1[i8];
                int i9 = this.p;
                int i10 = i7 - i9;
                System.arraycopy(this.i, i9, jArr2, 0, i10);
                System.arraycopy(this.l, this.p, jArr3, 0, i10);
                System.arraycopy(this.k, this.p, iArr, 0, i10);
                System.arraycopy(this.j, this.p, iArr2, 0, i10);
                System.arraycopy(this.m, this.p, ol1VarArr, 0, i10);
                System.arraycopy(this.h, this.p, jArr, 0, i10);
                int i11 = this.p;
                System.arraycopy(this.i, 0, jArr2, i10, i11);
                System.arraycopy(this.l, 0, jArr3, i10, i11);
                System.arraycopy(this.k, 0, iArr, i10, i11);
                System.arraycopy(this.j, 0, iArr2, i10, i11);
                System.arraycopy(this.m, 0, ol1VarArr, i10, i11);
                System.arraycopy(this.h, 0, jArr, i10, i11);
                this.i = jArr2;
                this.l = jArr3;
                this.k = iArr;
                this.j = iArr2;
                this.m = ol1VarArr;
                this.h = jArr;
                this.p = 0;
                this.g = i8;
            }
        }
    }

    @Override // defpackage.pl1
    public final void c(kh4 kh4Var, int i) {
        rw5 rw5Var = this.a;
        while (i > 0) {
            int b = rw5Var.b(i);
            qw5 qw5Var = rw5Var.d;
            yy5 yy5Var = qw5Var.c;
            byte[] bArr = yy5Var.a;
            yy5Var.getClass();
            kh4Var.a(bArr, (int) (rw5Var.e - qw5Var.a), b);
            i -= b;
            long j = rw5Var.e + b;
            rw5Var.e = j;
            qw5 qw5Var2 = rw5Var.d;
            if (j == qw5Var2.b) {
                rw5Var.d = qw5Var2.d;
            }
        }
        rw5Var.getClass();
    }

    @Override // defpackage.pl1
    public final int d(gv5 gv5Var, int i, boolean z) {
        return f(gv5Var, i, z);
    }

    @Override // defpackage.pl1
    public final void e(cu1 cu1Var) {
        boolean z;
        boolean z2;
        synchronized (this) {
            z = false;
            this.w = false;
            if (!zn4.b(cu1Var, this.x)) {
                if (this.c.b.size() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    SparseArray sparseArray = this.c.b;
                    if (((tw5) sparseArray.valueAt(sparseArray.size() - 1)).a.equals(cu1Var)) {
                        SparseArray sparseArray2 = this.c.b;
                        cu1Var = ((tw5) sparseArray2.valueAt(sparseArray2.size() - 1)).a;
                    }
                }
                this.x = cu1Var;
                this.y = mx2.d(cu1Var.k, cu1Var.h);
                this.z = false;
                z = true;
            }
        }
        uw5 uw5Var = this.e;
        if (uw5Var != null && z) {
            mw5 mw5Var = (mw5) uw5Var;
            mw5Var.a0.post(mw5Var.Y);
        }
    }

    @Override // defpackage.pl1
    public final int f(gv5 gv5Var, int i, boolean z) {
        rw5 rw5Var = this.a;
        int b = rw5Var.b(i);
        qw5 qw5Var = rw5Var.d;
        yy5 yy5Var = qw5Var.c;
        byte[] bArr = yy5Var.a;
        yy5Var.getClass();
        int x = gv5Var.x(bArr, (int) (rw5Var.e - qw5Var.a), b);
        if (x == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = rw5Var.e + x;
        rw5Var.e = j;
        qw5 qw5Var2 = rw5Var.d;
        if (j == qw5Var2.b) {
            rw5Var.d = qw5Var2.d;
            return x;
        }
        return x;
    }

    public final int g(int i) {
        int i2 = this.p + i;
        int i3 = this.g;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final long h(int i) {
        int i2;
        long j = this.s;
        long j2 = Long.MIN_VALUE;
        int i3 = 0;
        if (i != 0) {
            int g = g(i - 1);
            for (int i4 = 0; i4 < i; i4++) {
                j2 = Math.max(j2, this.l[g]);
                if ((this.k[g] & 1) != 0) {
                    break;
                }
                g--;
                if (g == -1) {
                    g = this.g - 1;
                }
            }
        }
        this.s = Math.max(j, j2);
        this.n -= i;
        int i5 = this.o + i;
        this.o = i5;
        int i6 = this.p + i;
        this.p = i6;
        int i7 = this.g;
        if (i6 >= i7) {
            this.p = i6 - i7;
        }
        int i8 = this.q - i;
        this.q = i8;
        if (i8 < 0) {
            this.q = 0;
        }
        gx5 gx5Var = this.c;
        while (i3 < gx5Var.b.size() - 1) {
            int i9 = i3 + 1;
            if (i5 < gx5Var.b.keyAt(i9)) {
                break;
            }
            ms5 ms5Var = ((tw5) gx5Var.b.valueAt(i3)).b;
            int i10 = ls5.a;
            gx5Var.b.removeAt(i3);
            int i11 = gx5Var.a;
            if (i11 > 0) {
                gx5Var.a = i11 - 1;
            }
            i3 = i9;
        }
        if (this.n == 0) {
            int i12 = this.p;
            if (i12 == 0) {
                i12 = this.g;
            }
            return this.i[i12 - 1] + this.j[i2];
        }
        return this.i[this.p];
    }

    public final void i() {
        long h;
        rw5 rw5Var = this.a;
        synchronized (this) {
            int i = this.n;
            if (i == 0) {
                h = -1;
            } else {
                h = h(i);
            }
        }
        rw5Var.a(h);
    }

    public final void j(boolean z) {
        boolean z2;
        rw5 rw5Var = this.a;
        qw5 qw5Var = rw5Var.b;
        if (qw5Var.c != null) {
            jz5 jz5Var = rw5Var.f;
            synchronized (jz5Var) {
                qw5 qw5Var2 = qw5Var;
                while (qw5Var2 != null) {
                    yy5[] yy5VarArr = jz5Var.d;
                    int i = jz5Var.c;
                    jz5Var.c = i + 1;
                    yy5 yy5Var = qw5Var2.c;
                    yy5Var.getClass();
                    yy5VarArr[i] = yy5Var;
                    jz5Var.b--;
                    qw5Var2 = qw5Var2.d;
                    if (qw5Var2 == null || qw5Var2.c == null) {
                        qw5Var2 = null;
                    }
                }
                jz5Var.notifyAll();
            }
            qw5Var.c = null;
            qw5Var.d = null;
        }
        qw5 qw5Var3 = rw5Var.b;
        if (qw5Var3.c == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        tv2.I(z2);
        qw5Var3.a = 0L;
        qw5Var3.b = 65536L;
        qw5 qw5Var4 = rw5Var.b;
        rw5Var.c = qw5Var4;
        rw5Var.d = qw5Var4;
        rw5Var.e = 0L;
        rw5Var.f.b();
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.v = true;
        this.r = Long.MIN_VALUE;
        this.s = Long.MIN_VALUE;
        this.t = Long.MIN_VALUE;
        this.u = false;
        gx5 gx5Var = this.c;
        for (int i2 = 0; i2 < gx5Var.b.size(); i2++) {
            ms5 ms5Var = ((tw5) gx5Var.b.valueAt(i2)).b;
            int i3 = ls5.a;
        }
        gx5Var.a = -1;
        gx5Var.b.clear();
        if (z) {
            this.x = null;
            this.w = true;
        }
    }

    public final synchronized boolean k(boolean z) {
        boolean z2;
        int i = this.q;
        boolean z3 = true;
        boolean z4 = false;
        if (i != this.n) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            if (!z && !this.u) {
                cu1 cu1Var = this.x;
                if (cu1Var != null) {
                    if (cu1Var == this.f) {
                        return false;
                    }
                } else {
                    z3 = false;
                }
            }
            return z3;
        } else if (((tw5) this.c.a(this.o + i)).a != this.f) {
            return true;
        } else {
            int g = g(this.q);
            if (this.A != null) {
                if ((this.k[g] & 1073741824) != 0) {
                    z3 = false;
                }
                return z4;
            }
            z4 = z3;
            return z4;
        }
    }

    public final synchronized boolean l(long j, boolean z) {
        boolean z2;
        synchronized (this) {
            this.q = 0;
            rw5 rw5Var = this.a;
            rw5Var.c = rw5Var.b;
        }
        int g = g(0);
        int i = this.q;
        int i2 = this.n;
        if (i != i2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || j < this.l[g] || (j > this.t && !z)) {
            return false;
        }
        int m = m(g, i2 + 0, j, true);
        if (m == -1) {
            return false;
        }
        this.r = j;
        this.q += m;
        return true;
    }

    public final int m(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.l[i];
            if (j2 > j) {
                return i3;
            }
            if (!z || (this.k[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.g) {
                i = 0;
            }
        }
        return i3;
    }
}