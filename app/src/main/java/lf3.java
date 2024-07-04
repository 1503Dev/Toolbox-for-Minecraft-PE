package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: lf3  reason: default package */
public final class lf3 extends LinkedHashMap {
    public static final lf3 Q;
    public boolean P;

    static {
        lf3 lf3Var = new lf3();
        Q = lf3Var;
        lf3Var.P = false;
    }

    public lf3() {
        this.P = true;
    }

    public lf3(Map map) {
        super(map);
        this.P = true;
    }

    public static lf3 a() {
        return Q;
    }

    public final lf3 b() {
        return isEmpty() ? new lf3() : new lf3(this);
    }

    public final void c() {
        this.P = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        e();
        super.clear();
    }

    public final boolean d() {
        return this.P;
    }

    public final void e() {
        if (!this.P) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this == map) {
                return true;
            }
            if (size() != map.size()) {
                return false;
            }
            for (Map.Entry entry : entrySet()) {
                if (!map.containsKey(entry.getKey())) {
                    return false;
                }
                Object value = entry.getValue();
                Object obj2 = map.get(entry.getKey());
                if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                    equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                    continue;
                } else {
                    equals = value.equals(obj2);
                    continue;
                }
                if (!equals) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int hashCode;
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            Object key = entry.getKey();
            int i2 = 1;
            if (key instanceof byte[]) {
                byte[] bArr = (byte[]) key;
                Charset charset = z13.a;
                hashCode = bArr.length;
                for (byte b : bArr) {
                    hashCode = (hashCode * 31) + b;
                }
                if (hashCode == 0) {
                    hashCode = 1;
                }
            } else {
                hashCode = key.hashCode();
            }
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                Charset charset2 = z13.a;
                int length = bArr2.length;
                for (byte b2 : bArr2) {
                    length = (length * 31) + b2;
                }
                if (length != 0) {
                    i2 = length;
                }
            } else {
                i2 = value.hashCode();
            }
            i += i2 ^ hashCode;
        }
        return i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        e();
        Charset charset = z13.a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        e();
        for (Object obj : map.keySet()) {
            Charset charset = z13.a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        e();
        return super.remove(obj);
    }
}