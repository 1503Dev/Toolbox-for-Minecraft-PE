package defpackage;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: lg5  reason: default package */
public class lg5 extends AbstractMap {
    public static final /* synthetic */ int V = 0;
    public final int P;
    public boolean S;
    public volatile kg5 T;
    public List Q = Collections.emptyList();
    public Map R = Collections.emptyMap();
    public Map U = Collections.emptyMap();

    public /* synthetic */ lg5(int i) {
        this.P = i;
    }

    public void a() {
        if (this.S) {
            return;
        }
        this.R = this.R.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.R);
        this.U = this.U.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.U);
        this.S = true;
    }

    public final int b() {
        return this.Q.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: c */
    public final Object put(Comparable comparable, Object obj) {
        g();
        int d = d(comparable);
        if (d >= 0) {
            return ((ig5) this.Q.get(d)).setValue(obj);
        }
        g();
        if (this.Q.isEmpty() && !(this.Q instanceof ArrayList)) {
            this.Q = new ArrayList(this.P);
        }
        int i = -(d + 1);
        if (i >= this.P) {
            return f().put(comparable, obj);
        }
        int size = this.Q.size();
        int i2 = this.P;
        if (size == i2) {
            ig5 ig5Var = (ig5) this.Q.remove(i2 - 1);
            f().put(ig5Var.P, ig5Var.Q);
        }
        this.Q.add(i, new ig5(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        g();
        if (!this.Q.isEmpty()) {
            this.Q.clear();
        }
        if (this.R.isEmpty()) {
            return;
        }
        this.R.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return d(comparable) >= 0 || this.R.containsKey(comparable);
    }

    public final int d(Comparable comparable) {
        int size = this.Q.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((ig5) this.Q.get(size)).P);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = comparable.compareTo(((ig5) this.Q.get(i2)).P);
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 > 0) {
                i = i2 + 1;
            } else {
                return i2;
            }
        }
        return -(i + 1);
    }

    public final Object e(int i) {
        g();
        Object obj = ((ig5) this.Q.remove(i)).Q;
        if (!this.R.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            List list = this.Q;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new ig5(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.T == null) {
            this.T = new kg5(this);
        }
        return this.T;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        Object entrySet;
        Object entrySet2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lg5)) {
            return super.equals(obj);
        }
        lg5 lg5Var = (lg5) obj;
        int size = size();
        if (size != lg5Var.size()) {
            return false;
        }
        int b = b();
        if (b == lg5Var.b()) {
            for (int i = 0; i < b; i++) {
                if (!((Map.Entry) this.Q.get(i)).equals((Map.Entry) lg5Var.Q.get(i))) {
                    return false;
                }
            }
            if (b == size) {
                return true;
            }
            entrySet = this.R;
            entrySet2 = lg5Var.R;
        } else {
            entrySet = entrySet();
            entrySet2 = lg5Var.entrySet();
        }
        return entrySet.equals(entrySet2);
    }

    public final SortedMap f() {
        g();
        if (this.R.isEmpty() && !(this.R instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.R = treeMap;
            this.U = treeMap.descendingMap();
        }
        return (SortedMap) this.R;
    }

    public final void g() {
        if (this.S) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int d = d(comparable);
        if (d >= 0) {
            return ((ig5) this.Q.get(d)).Q;
        }
        return this.R.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int b = b();
        int i = 0;
        for (int i2 = 0; i2 < b; i2++) {
            i += ((ig5) this.Q.get(i2)).hashCode();
        }
        return this.R.size() > 0 ? this.R.hashCode() + i : i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int d = d(comparable);
        if (d >= 0) {
            return e(d);
        }
        if (this.R.isEmpty()) {
            return null;
        }
        return this.R.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.R.size() + this.Q.size();
    }
}