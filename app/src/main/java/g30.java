package defpackage;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: g30  reason: default package */
public class g30<K, V> {
    public final LinkedHashMap<K, V> a;
    public int b;
    public int c;
    public int d;
    public int e;

    public g30(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.c = i;
        this.a = new LinkedHashMap<>(0, 0.75f, true);
    }

    public final V a(K k) {
        if (k != null) {
            synchronized (this) {
                V v = this.a.get(k);
                if (v != null) {
                    this.d++;
                    return v;
                }
                this.e++;
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V b(K k, V v) {
        if (k != null) {
            synchronized (this) {
                this.b++;
                V put = this.a.put(k, v);
                if (put != null) {
                    this.b--;
                }
            }
            int i = this.c;
            while (true) {
                synchronized (this) {
                    if (this.b >= 0 && (!this.a.isEmpty() || this.b == 0)) {
                        if (this.b <= i || this.a.isEmpty()) {
                            break;
                        }
                        Map.Entry<K, V> next = this.a.entrySet().iterator().next();
                        K key = next.getKey();
                        next.getValue();
                        this.a.remove(key);
                        this.b--;
                    } else {
                        break;
                    }
                }
            }
            throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
        }
        throw new NullPointerException("key == null || value == null");
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.d;
        i2 = this.e + i;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }
}