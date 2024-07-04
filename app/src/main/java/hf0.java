package defpackage;

/* renamed from: hf0  reason: default package */
public class hf0<T> {
    public final Object[] a;
    public int b;

    public hf0(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.a = new Object[i];
    }

    public T a() {
        int i = this.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = this.a;
            T t = (T) objArr[i2];
            objArr[i2] = null;
            this.b = i - 1;
            return t;
        }
        return null;
    }

    public boolean b(T t) {
        int i;
        boolean z;
        int i2 = 0;
        while (true) {
            i = this.b;
            if (i2 < i) {
                if (this.a[i2] == t) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            Object[] objArr = this.a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }
}