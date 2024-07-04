package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* renamed from: xu4  reason: default package */
public final class xu4 extends AbstractMap implements Serializable {
    public static final Object Y = new Object();
    @CheckForNull
    public transient Object P;
    @CheckForNull
    public transient int[] Q;
    @CheckForNull
    public transient Object[] R;
    @CheckForNull
    public transient Object[] S;
    public transient int T = Math.min(Math.max(8, 1), 1073741823);
    public transient int U;
    @CheckForNull
    public transient uu4 V;
    @CheckForNull
    public transient su4 W;
    @CheckForNull
    public transient wu4 X;

    @CheckForNull
    public final Map a() {
        Object obj = this.P;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void b(int i, int i2) {
        Object obj = this.P;
        obj.getClass();
        int[] iArr = this.Q;
        iArr.getClass();
        Object[] objArr = this.R;
        objArr.getClass();
        Object[] objArr2 = this.S;
        objArr2.getClass();
        int size = size() - 1;
        if (i >= size) {
            objArr[i] = null;
            objArr2[i] = null;
            iArr[i] = 0;
            return;
        }
        Object obj2 = objArr[size];
        objArr[i] = obj2;
        objArr2[i] = objArr2[size];
        objArr[size] = null;
        objArr2[size] = null;
        iArr[i] = iArr[size];
        iArr[size] = 0;
        int h = gv4.h(obj2) & i2;
        int c = yu4.c(h, obj);
        int i3 = size + 1;
        if (c == i3) {
            yu4.e(h, i + 1, obj);
            return;
        }
        while (true) {
            int i4 = c - 1;
            int i5 = iArr[i4];
            int i6 = i5 & i2;
            if (i6 == i3) {
                iArr[i4] = ((i + 1) & i2) | (i5 & (i2 ^ (-1)));
                return;
            }
            c = i6;
        }
    }

    public final boolean c() {
        return this.P == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (c()) {
            return;
        }
        this.T += 32;
        Map a = a();
        if (a == null) {
            Object[] objArr = this.R;
            objArr.getClass();
            Arrays.fill(objArr, 0, this.U, (Object) null);
            Object[] objArr2 = this.S;
            objArr2.getClass();
            Arrays.fill(objArr2, 0, this.U, (Object) null);
            Object obj = this.P;
            obj.getClass();
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, (short) 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            int[] iArr = this.Q;
            iArr.getClass();
            Arrays.fill(iArr, 0, this.U, 0);
        } else {
            this.T = Math.min(Math.max(size(), 3), 1073741823);
            a.clear();
            this.P = null;
        }
        this.U = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        Map a = a();
        return a != null ? a.containsKey(obj) : d(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        Map a = a();
        if (a == null) {
            for (int i = 0; i < this.U; i++) {
                Object[] objArr = this.S;
                objArr.getClass();
                if (dt4.l(obj, objArr[i])) {
                    return true;
                }
            }
            return false;
        }
        return a.containsValue(obj);
    }

    public final int d(@CheckForNull Object obj) {
        if (c()) {
            return -1;
        }
        int h = gv4.h(obj);
        int i = (1 << (this.T & 31)) - 1;
        Object obj2 = this.P;
        obj2.getClass();
        int c = yu4.c(h & i, obj2);
        if (c == 0) {
            return -1;
        }
        int i2 = i ^ (-1);
        int i3 = h & i2;
        do {
            int i4 = c - 1;
            int[] iArr = this.Q;
            iArr.getClass();
            int i5 = iArr[i4];
            if ((i5 & i2) == i3) {
                Object[] objArr = this.R;
                objArr.getClass();
                if (dt4.l(obj, objArr[i4])) {
                    return i4;
                }
            }
            c = i5 & i;
        } while (c != 0);
        return -1;
    }

    public final int e(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object d = yu4.d(i2);
        if (i4 != 0) {
            yu4.e(i3 & i5, i4 + 1, d);
        }
        Object obj = this.P;
        obj.getClass();
        int[] iArr = this.Q;
        iArr.getClass();
        for (int i6 = 0; i6 <= i; i6++) {
            int c = yu4.c(i6, obj);
            while (c != 0) {
                int i7 = c - 1;
                int i8 = iArr[i7];
                int i9 = ((i ^ (-1)) & i8) | i6;
                int i10 = i9 & i5;
                int c2 = yu4.c(i10, d);
                yu4.e(i10, c, d);
                iArr[i7] = ((i5 ^ (-1)) & i9) | (c2 & i5);
                c = i8 & i;
            }
        }
        this.P = d;
        this.T = ((32 - Integer.numberOfLeadingZeros(i5)) & 31) | (this.T & (-32));
        return i5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        su4 su4Var = this.W;
        if (su4Var == null) {
            su4 su4Var2 = new su4(this);
            this.W = su4Var2;
            return su4Var2;
        }
        return su4Var;
    }

    public final Object f(@CheckForNull Object obj) {
        if (c()) {
            return Y;
        }
        int i = (1 << (this.T & 31)) - 1;
        Object obj2 = this.P;
        obj2.getClass();
        int[] iArr = this.Q;
        iArr.getClass();
        Object[] objArr = this.R;
        objArr.getClass();
        int b = yu4.b(obj, null, i, obj2, iArr, objArr, null);
        if (b == -1) {
            return Y;
        }
        Object[] objArr2 = this.S;
        objArr2.getClass();
        Object obj3 = objArr2[b];
        b(b, i);
        this.U--;
        this.T += 32;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object get(@CheckForNull Object obj) {
        Map a = a();
        if (a != null) {
            return a.get(obj);
        }
        int d = d(obj);
        if (d == -1) {
            return null;
        }
        Object[] objArr = this.S;
        objArr.getClass();
        return objArr[d];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        uu4 uu4Var = this.V;
        if (uu4Var == null) {
            uu4 uu4Var2 = new uu4(this);
            this.V = uu4Var2;
            return uu4Var2;
        }
        return uu4Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object put(Object obj, Object obj2) {
        int min;
        int i = -1;
        if (c()) {
            gt4.g("Arrays already allocated", c());
            int i2 = this.T;
            int max = Math.max(i2 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.P = yu4.d(max2);
            this.T = ((32 - Integer.numberOfLeadingZeros(max2 - 1)) & 31) | (this.T & (-32));
            this.Q = new int[i2];
            this.R = new Object[i2];
            this.S = new Object[i2];
        }
        Map a = a();
        if (a == null) {
            int[] iArr = this.Q;
            iArr.getClass();
            Object[] objArr = this.R;
            objArr.getClass();
            Object[] objArr2 = this.S;
            objArr2.getClass();
            int i3 = this.U;
            int i4 = i3 + 1;
            int h = gv4.h(obj);
            int i5 = (1 << (this.T & 31)) - 1;
            int i6 = h & i5;
            Object obj3 = this.P;
            obj3.getClass();
            int c = yu4.c(i6, obj3);
            if (c == 0) {
                if (i4 <= i5) {
                    Object obj4 = this.P;
                    obj4.getClass();
                    yu4.e(i6, i4, obj4);
                }
                i5 = e(i5, yu4.a(i5), h, i3);
            } else {
                int i7 = i5 ^ (-1);
                int i8 = h & i7;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    int i11 = c + i;
                    int i12 = iArr[i11];
                    int i13 = i12 & i7;
                    if (i13 == i8 && dt4.l(obj, objArr[i11])) {
                        Object obj5 = objArr2[i11];
                        objArr2[i11] = obj2;
                        return obj5;
                    }
                    int i14 = i12 & i5;
                    int i15 = i8;
                    int i16 = i10 + 1;
                    if (i14 == 0) {
                        if (i16 >= 9) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap(((1 << (this.T & 31)) - 1) + 1, 1.0f);
                            if (isEmpty()) {
                                i9 = -1;
                            }
                            while (i9 >= 0) {
                                Object[] objArr3 = this.R;
                                objArr3.getClass();
                                Object obj6 = objArr3[i9];
                                Object[] objArr4 = this.S;
                                objArr4.getClass();
                                linkedHashMap.put(obj6, objArr4[i9]);
                                int i17 = i9 + 1;
                                if (i17 >= this.U) {
                                    i9 = -1;
                                } else {
                                    i9 = i17;
                                }
                            }
                            this.P = linkedHashMap;
                            this.Q = null;
                            this.R = null;
                            this.S = null;
                            this.T += 32;
                            return linkedHashMap.put(obj, obj2);
                        } else if (i4 <= i5) {
                            iArr[i11] = (i4 & i5) | i13;
                        }
                    } else {
                        i10 = i16;
                        c = i14;
                        i8 = i15;
                        i = -1;
                    }
                }
            }
            int[] iArr2 = this.Q;
            iArr2.getClass();
            int length = iArr2.length;
            if (i4 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
                int[] iArr3 = this.Q;
                iArr3.getClass();
                this.Q = Arrays.copyOf(iArr3, min);
                Object[] objArr5 = this.R;
                objArr5.getClass();
                this.R = Arrays.copyOf(objArr5, min);
                Object[] objArr6 = this.S;
                objArr6.getClass();
                this.S = Arrays.copyOf(objArr6, min);
            }
            int[] iArr4 = this.Q;
            iArr4.getClass();
            iArr4[i3] = (i5 ^ (-1)) & h;
            Object[] objArr7 = this.R;
            objArr7.getClass();
            objArr7[i3] = obj;
            Object[] objArr8 = this.S;
            objArr8.getClass();
            objArr8[i3] = obj2;
            this.U = i4;
            this.T += 32;
            return null;
        }
        return a.put(obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object remove(@CheckForNull Object obj) {
        Map a = a();
        if (a != null) {
            return a.remove(obj);
        }
        Object f = f(obj);
        if (f == Y) {
            return null;
        }
        return f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map a = a();
        return a != null ? a.size() : this.U;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        wu4 wu4Var = this.X;
        if (wu4Var == null) {
            wu4 wu4Var2 = new wu4(this);
            this.X = wu4Var2;
            return wu4Var2;
        }
        return wu4Var;
    }
}