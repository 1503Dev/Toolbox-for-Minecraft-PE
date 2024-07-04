package defpackage;

/* renamed from: nt0  reason: default package */
public final class nt0<E> implements Cloneable {
    public static final Object T = new Object();
    public boolean P;
    public int[] Q;
    public Object[] R;
    public int S;

    public nt0() {
        this(10);
    }

    public nt0(int i) {
        this.P = false;
        if (i == 0) {
            this.Q = gw.P;
            this.R = gw.Q;
            return;
        }
        int i2 = i * 4;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.Q = new int[i5];
        this.R = new Object[i5];
    }

    public final void a(int i, E e) {
        int i2 = this.S;
        if (i2 != 0 && i <= this.Q[i2 - 1]) {
            e(i, e);
            return;
        }
        if (this.P && i2 >= this.Q.length) {
            c();
        }
        int i3 = this.S;
        if (i3 >= this.Q.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            int[] iArr = new int[i7];
            Object[] objArr = new Object[i7];
            int[] iArr2 = this.Q;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.R;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.Q = iArr;
            this.R = objArr;
        }
        this.Q[i3] = i;
        this.R[i3] = e;
        this.S = i3 + 1;
    }

    /* renamed from: b */
    public final nt0<E> clone() {
        try {
            nt0<E> nt0Var = (nt0) super.clone();
            nt0Var.Q = (int[]) this.Q.clone();
            nt0Var.R = (Object[]) this.R.clone();
            return nt0Var;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final void c() {
        int i = this.S;
        int[] iArr = this.Q;
        Object[] objArr = this.R;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != T) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.P = false;
        this.S = i2;
    }

    public final Object d(int i, Integer num) {
        Object obj;
        int h = gw.h(this.S, i, this.Q);
        return (h < 0 || (obj = this.R[h]) == T) ? num : obj;
    }

    public final void e(int i, E e) {
        int h = gw.h(this.S, i, this.Q);
        if (h >= 0) {
            this.R[h] = e;
            return;
        }
        int i2 = h ^ (-1);
        int i3 = this.S;
        if (i2 < i3) {
            Object[] objArr = this.R;
            if (objArr[i2] == T) {
                this.Q[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.P && i3 >= this.Q.length) {
            c();
            i2 = gw.h(this.S, i, this.Q) ^ (-1);
        }
        int i4 = this.S;
        if (i4 >= this.Q.length) {
            int i5 = (i4 + 1) * 4;
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
            int i8 = i5 / 4;
            int[] iArr = new int[i8];
            Object[] objArr2 = new Object[i8];
            int[] iArr2 = this.Q;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.R;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.Q = iArr;
            this.R = objArr2;
        }
        int i9 = this.S - i2;
        if (i9 != 0) {
            int[] iArr3 = this.Q;
            int i10 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i10, i9);
            Object[] objArr4 = this.R;
            System.arraycopy(objArr4, i2, objArr4, i10, this.S - i2);
        }
        this.Q[i2] = i;
        this.R[i2] = e;
        this.S++;
    }

    public final int f() {
        if (this.P) {
            c();
        }
        return this.S;
    }

    public final E h(int i) {
        if (this.P) {
            c();
        }
        return (E) this.R[i];
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.S * 28);
        sb.append('{');
        for (int i = 0; i < this.S; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.P) {
                c();
            }
            sb.append(this.Q[i]);
            sb.append('=');
            E h = h(i);
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