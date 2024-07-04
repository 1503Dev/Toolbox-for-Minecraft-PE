package androidx.databinding;

import java.util.ArrayList;

public class c<C, T, A> implements Cloneable {
    public ArrayList P = new ArrayList();
    public long Q = 0;
    public long[] R;
    public int S;
    public final a<C, T, A> T;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class a<C, T, A> {
        public abstract void a(int i, Object obj, Object obj2, Object obj3);
    }

    public c(a<C, T, A> aVar) {
        this.T = aVar;
    }

    public final synchronized void a(C c) {
        if (c == null) {
            throw new IllegalArgumentException("callback cannot be null");
        }
        int lastIndexOf = this.P.lastIndexOf(c);
        if (lastIndexOf < 0 || b(lastIndexOf)) {
            this.P.add(c);
        }
    }

    public final boolean b(int i) {
        int i2;
        if (i < 64) {
            return ((1 << i) & this.Q) != 0;
        }
        long[] jArr = this.R;
        if (jArr != null && (i2 = (i / 64) - 1) < jArr.length) {
            return ((1 << (i % 64)) & jArr[i2]) != 0;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void c(int i, Object obj, Object obj2) {
        this.S++;
        int size = this.P.size();
        long[] jArr = this.R;
        int length = jArr == null ? -1 : jArr.length - 1;
        e(i, length, obj, obj2);
        d(obj, i, obj2, (length + 2) * 64, size, 0L);
        int i2 = this.S - 1;
        this.S = i2;
        if (i2 == 0) {
            long[] jArr2 = this.R;
            long j = Long.MIN_VALUE;
            if (jArr2 != null) {
                for (int length2 = jArr2.length - 1; length2 >= 0; length2--) {
                    long j2 = this.R[length2];
                    if (j2 != 0) {
                        int i3 = (length2 + 1) * 64;
                        long j3 = Long.MIN_VALUE;
                        for (int i4 = (i3 + 64) - 1; i4 >= i3; i4--) {
                            if ((j2 & j3) != 0) {
                                this.P.remove(i4);
                            }
                            j3 >>>= 1;
                        }
                        this.R[length2] = 0;
                    }
                }
            }
            long j4 = this.Q;
            if (j4 != 0) {
                for (int i5 = 63; i5 >= 0; i5--) {
                    if ((j4 & j) != 0) {
                        this.P.remove(i5);
                    }
                    j >>>= 1;
                }
                this.Q = 0L;
            }
        }
    }

    public final Object clone() {
        c cVar;
        CloneNotSupportedException e;
        synchronized (this) {
            try {
                cVar = (c) super.clone();
                try {
                    cVar.Q = 0L;
                    cVar.R = null;
                    cVar.S = 0;
                    cVar.P = new ArrayList();
                    int size = this.P.size();
                    for (int i = 0; i < size; i++) {
                        if (!b(i)) {
                            cVar.P.add(this.P.get(i));
                        }
                    }
                } catch (CloneNotSupportedException e2) {
                    e = e2;
                    e.printStackTrace();
                    return cVar;
                }
            } catch (CloneNotSupportedException e3) {
                cVar = null;
                e = e3;
            }
        }
        return cVar;
    }

    public final void d(T t, int i, A a2, int i2, int i3, long j) {
        long j2 = 1;
        while (i2 < i3) {
            if ((j & j2) == 0) {
                this.T.a(i, this.P.get(i2), t, a2);
            }
            j2 <<= 1;
            i2++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(int i, int i2, Object obj, Object obj2) {
        if (i2 < 0) {
            d(obj, i, obj2, 0, Math.min(64, this.P.size()), this.Q);
            return;
        }
        long j = this.R[i2];
        int i3 = (i2 + 1) * 64;
        int min = Math.min(this.P.size(), i3 + 64);
        e(i, i2 - 1, obj, obj2);
        d(obj, i, obj2, i3, min, j);
    }

    public final synchronized void f(C c) {
        if (this.S == 0) {
            this.P.remove(c);
        } else {
            int lastIndexOf = this.P.lastIndexOf(c);
            if (lastIndexOf >= 0) {
                h(lastIndexOf);
            }
        }
    }

    public final void h(int i) {
        if (i < 64) {
            this.Q = (1 << i) | this.Q;
            return;
        }
        int i2 = (i / 64) - 1;
        long[] jArr = this.R;
        if (jArr == null) {
            this.R = new long[this.P.size() / 64];
        } else if (jArr.length <= i2) {
            long[] jArr2 = new long[this.P.size() / 64];
            long[] jArr3 = this.R;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.R = jArr2;
        }
        long j = 1 << (i % 64);
        long[] jArr4 = this.R;
        jArr4[i2] = j | jArr4[i2];
    }
}