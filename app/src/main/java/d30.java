package defpackage;

/* renamed from: d30  reason: default package */
public final class d30<E> implements Cloneable {
    public static final Object T = new Object();
    public boolean P = false;
    public long[] Q;
    public Object[] R;
    public int S;

    public d30() {
        int i = 80;
        int i2 = 4;
        while (true) {
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (80 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 8;
        this.Q = new long[i4];
        this.R = new Object[i4];
    }

    public final void a(long j, Long l) {
        int i = this.S;
        if (i != 0 && j <= this.Q[i - 1]) {
            f(j, l);
            return;
        }
        if (this.P && i >= this.Q.length) {
            d();
        }
        int i2 = this.S;
        if (i2 >= this.Q.length) {
            int i3 = (i2 + 1) * 8;
            int i4 = 4;
            while (true) {
                if (i4 >= 32) {
                    break;
                }
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
                i4++;
            }
            int i6 = i3 / 8;
            long[] jArr = new long[i6];
            Object[] objArr = new Object[i6];
            long[] jArr2 = this.Q;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.R;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.Q = jArr;
            this.R = objArr;
        }
        this.Q[i2] = j;
        this.R[i2] = l;
        this.S = i2 + 1;
    }

    public final void b() {
        int i = this.S;
        Object[] objArr = this.R;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.S = 0;
        this.P = false;
    }

    /* renamed from: c */
    public final d30<E> clone() {
        try {
            d30<E> d30Var = (d30) super.clone();
            d30Var.Q = (long[]) this.Q.clone();
            d30Var.R = (Object[]) this.R.clone();
            return d30Var;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final void d() {
        int i = this.S;
        long[] jArr = this.Q;
        Object[] objArr = this.R;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != T) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.P = false;
        this.S = i2;
    }

    public final Object e(long j, Long l) {
        Object obj;
        int i = gw.i(this.S, j, this.Q);
        return (i < 0 || (obj = this.R[i]) == T) ? l : obj;
    }

    public final void f(long j, E e) {
        int i = gw.i(this.S, j, this.Q);
        if (i >= 0) {
            this.R[i] = e;
            return;
        }
        int i2 = i ^ (-1);
        int i3 = this.S;
        if (i2 < i3) {
            Object[] objArr = this.R;
            if (objArr[i2] == T) {
                this.Q[i2] = j;
                objArr[i2] = e;
                return;
            }
        }
        if (this.P && i3 >= this.Q.length) {
            d();
            i2 = gw.i(this.S, j, this.Q) ^ (-1);
        }
        int i4 = this.S;
        if (i4 >= this.Q.length) {
            int i5 = (i4 + 1) * 8;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 8;
            long[] jArr = new long[i8];
            Object[] objArr2 = new Object[i8];
            long[] jArr2 = this.Q;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.R;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.Q = jArr;
            this.R = objArr2;
        }
        int i9 = this.S - i2;
        if (i9 != 0) {
            long[] jArr3 = this.Q;
            int i10 = i2 + 1;
            System.arraycopy(jArr3, i2, jArr3, i10, i9);
            Object[] objArr4 = this.R;
            System.arraycopy(objArr4, i2, objArr4, i10, this.S - i2);
        }
        this.Q[i2] = j;
        this.R[i2] = e;
        this.S++;
    }

    public final E h(int i) {
        if (this.P) {
            d();
        }
        return (E) this.R[i];
    }

    public final String toString() {
        if (this.P) {
            d();
        }
        int i = this.S;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.S; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            if (this.P) {
                d();
            }
            sb.append(this.Q[i2]);
            sb.append('=');
            E h = h(i2);
            if (h != this) {
                sb.append(h);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}