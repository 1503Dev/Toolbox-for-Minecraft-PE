package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: os0  reason: default package */
public class os0<K, V> {
    public static Object[] S;
    public static int T;
    public static Object[] U;
    public static int V;
    public int[] P;
    public Object[] Q;
    public int R;

    public os0() {
        this.P = gw.P;
        this.Q = gw.Q;
        this.R = 0;
    }

    public os0(int i) {
        if (i == 0) {
            this.P = gw.P;
            this.Q = gw.Q;
        } else {
            a(i);
        }
        this.R = 0;
    }

    public os0(os0<K, V> os0Var) {
        this();
        if (os0Var != null) {
            int i = os0Var.R;
            b(this.R + i);
            if (this.R != 0) {
                for (int i2 = 0; i2 < i; i2++) {
                    put(os0Var.h(i2), os0Var.j(i2));
                }
            } else if (i > 0) {
                System.arraycopy(os0Var.P, 0, this.P, 0, i);
                System.arraycopy(os0Var.Q, 0, this.Q, 0, i << 1);
                this.R = i;
            }
        }
    }

    private void a(int i) {
        if (i == 8) {
            synchronized (os0.class) {
                Object[] objArr = U;
                if (objArr != null) {
                    this.Q = objArr;
                    U = (Object[]) objArr[0];
                    this.P = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    V--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (os0.class) {
                Object[] objArr2 = S;
                if (objArr2 != null) {
                    this.Q = objArr2;
                    S = (Object[]) objArr2[0];
                    this.P = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    T--;
                    return;
                }
            }
        }
        this.P = new int[i];
        this.Q = new Object[i << 1];
    }

    public static void c(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (os0.class) {
                if (V < 10) {
                    objArr[0] = U;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    U = objArr;
                    V++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (os0.class) {
                if (T < 10) {
                    objArr[0] = S;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    S = objArr;
                    T++;
                }
            }
        }
    }

    public final void b(int i) {
        int i2 = this.R;
        int[] iArr = this.P;
        if (iArr.length < i) {
            Object[] objArr = this.Q;
            a(i);
            if (this.R > 0) {
                System.arraycopy(iArr, 0, this.P, 0, i2);
                System.arraycopy(objArr, 0, this.Q, 0, i2 << 1);
            }
            c(iArr, objArr, i2);
        }
        if (this.R != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i = this.R;
        if (i > 0) {
            int[] iArr = this.P;
            Object[] objArr = this.Q;
            this.P = gw.P;
            this.Q = gw.Q;
            this.R = 0;
            c(iArr, objArr, i);
        }
        if (this.R > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public final int d(int i, Object obj) {
        int i2 = this.R;
        if (i2 == 0) {
            return -1;
        }
        try {
            int h = gw.h(i2, i, this.P);
            if (h < 0) {
                return h;
            }
            if (obj.equals(this.Q[h << 1])) {
                return h;
            }
            int i3 = h + 1;
            while (i3 < i2 && this.P[i3] == i) {
                if (obj.equals(this.Q[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = h - 1; i4 >= 0 && this.P[i4] == i; i4--) {
                if (obj.equals(this.Q[i4 << 1])) {
                    return i4;
                }
            }
            return i3 ^ (-1);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int e(Object obj) {
        return obj == null ? f() : d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof os0) {
            os0 os0Var = (os0) obj;
            if (this.R != os0Var.R) {
                return false;
            }
            for (int i = 0; i < this.R; i++) {
                try {
                    K h = h(i);
                    V j = j(i);
                    Object orDefault = os0Var.getOrDefault(h, null);
                    if (j == null) {
                        if (orDefault != null || !os0Var.containsKey(h)) {
                            return false;
                        }
                    } else if (!j.equals(orDefault)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.R != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.R; i2++) {
                try {
                    K h2 = h(i2);
                    V j2 = j(i2);
                    Object obj2 = map.get(h2);
                    if (j2 == null) {
                        if (obj2 != null || !map.containsKey(h2)) {
                            return false;
                        }
                    } else if (!j2.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        int i = this.R;
        if (i == 0) {
            return -1;
        }
        try {
            int h = gw.h(i, 0, this.P);
            if (h < 0) {
                return h;
            }
            if (this.Q[h << 1] == null) {
                return h;
            }
            int i2 = h + 1;
            while (i2 < i && this.P[i2] == 0) {
                if (this.Q[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = h - 1; i3 >= 0 && this.P[i3] == 0; i3--) {
                if (this.Q[i3 << 1] == null) {
                    return i3;
                }
            }
            return i2 ^ (-1);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int g(Object obj) {
        int i = this.R * 2;
        Object[] objArr = this.Q;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final V getOrDefault(Object obj, V v) {
        int e = e(obj);
        return e >= 0 ? (V) this.Q[(e << 1) + 1] : v;
    }

    public final K h(int i) {
        return (K) this.Q[i << 1];
    }

    public final int hashCode() {
        int[] iArr = this.P;
        Object[] objArr = this.Q;
        int i = this.R;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public final V i(int i) {
        Object[] objArr = this.Q;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.R;
        int i4 = 0;
        if (i3 <= 1) {
            c(this.P, objArr, i3);
            this.P = gw.P;
            this.Q = gw.Q;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.P;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr, i6, iArr, i, i7);
                    Object[] objArr2 = this.Q;
                    System.arraycopy(objArr2, i6 << 1, objArr2, i2, i7 << 1);
                }
                Object[] objArr3 = this.Q;
                int i8 = i5 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                a(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.R) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.P, 0, i);
                    System.arraycopy(objArr, 0, this.Q, 0, i2);
                }
                if (i < i5) {
                    int i9 = i + 1;
                    int i10 = i5 - i;
                    System.arraycopy(iArr, i9, this.P, i, i10);
                    System.arraycopy(objArr, i9 << 1, this.Q, i2, i10 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 == this.R) {
            this.R = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public final boolean isEmpty() {
        return this.R <= 0;
    }

    public final V j(int i) {
        return (V) this.Q[(i << 1) + 1];
    }

    public final V put(K k, V v) {
        int i;
        int d;
        int i2 = this.R;
        if (k == null) {
            d = f();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            d = d(hashCode, k);
        }
        if (d >= 0) {
            int i3 = (d << 1) + 1;
            Object[] objArr = this.Q;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = d ^ (-1);
        int[] iArr = this.P;
        if (i2 >= iArr.length) {
            int i5 = 4;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i5 = 8;
            }
            Object[] objArr2 = this.Q;
            a(i5);
            if (i2 != this.R) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.P;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.Q, 0, objArr2.length);
            }
            c(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.P;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.Q;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.R - i4) << 1);
        }
        int i7 = this.R;
        if (i2 == i7) {
            int[] iArr4 = this.P;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.Q;
                int i8 = i4 << 1;
                objArr4[i8] = k;
                objArr4[i8 + 1] = v;
                this.R = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final V putIfAbsent(K k, V v) {
        V orDefault = getOrDefault(k, null);
        if (orDefault == null) {
            return put(k, v);
        }
        return orDefault;
    }

    public final V remove(Object obj) {
        int e = e(obj);
        if (e >= 0) {
            return i(e);
        }
        return null;
    }

    public final boolean remove(Object obj, Object obj2) {
        int e = e(obj);
        if (e >= 0) {
            V j = j(e);
            if (obj2 == j || (obj2 != null && obj2.equals(j))) {
                i(e);
                return true;
            }
            return false;
        }
        return false;
    }

    public final V replace(K k, V v) {
        int e = e(k);
        if (e >= 0) {
            int i = (e << 1) + 1;
            Object[] objArr = this.Q;
            V v2 = (V) objArr[i];
            objArr[i] = v;
            return v2;
        }
        return null;
    }

    public final int size() {
        return this.R;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.R * 28);
        sb.append('{');
        for (int i = 0; i < this.R; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K h = h(i);
            if (h != this) {
                sb.append(h);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V j = j(i);
            if (j != this) {
                sb.append(j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean replace(K k, V v, V v2) {
        int e = e(k);
        if (e >= 0) {
            V j = j(e);
            if (j == v || (v != null && v.equals(j))) {
                int i = (e << 1) + 1;
                Object[] objArr = this.Q;
                Object obj = objArr[i];
                objArr[i] = v2;
                return true;
            }
            return false;
        }
        return false;
    }
}