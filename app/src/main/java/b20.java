package defpackage;

import defpackage.tv0;
import defpackage.wv0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: b20  reason: default package */
public final class b20<T extends tv0<?>> extends tv0<List<T>> implements Iterable<T>, Comparable<b20<T>> {
    public Class<?> V;

    public b20() {
        super(new ArrayList(3));
        this.V = null;
    }

    public final Class<?> B() {
        Class<?> cls = this.V;
        return cls == null ? wo.class : cls;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(size(), ((List) ((b20) obj).P).size());
    }

    @Override // defpackage.tv0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj)) {
            b20 b20Var = (b20) obj;
            if (size() == b20Var.size() && B() == b20Var.B()) {
                for (int i = 0; i < size(); i++) {
                    if (!z(i).equals(b20Var.z(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.tv0
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(B().hashCode()), Integer.valueOf(((List) this.P).hashCode()));
    }

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        return ((List) this.P).iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tv0
    public final void o(o00 o00Var, int i) {
        byte readUnsignedByte = (byte) o00Var.readUnsignedByte();
        if (readUnsignedByte != 0) {
            wv0.a aVar = (wv0.a) wv0.a.get(Integer.valueOf(readUnsignedByte));
            if (aVar != null) {
                this.V = (Class<T>) aVar.c;
            } else {
                throw new IllegalArgumentException(k6.a("unknown Tag id ", readUnsignedByte));
            }
        }
        int readInt = o00Var.readInt();
        if (readInt < 0) {
            readInt = 0;
        }
        r(new ArrayList(readInt));
        if (readInt != 0) {
            for (int i2 = 0; i2 < readInt; i2++) {
                tv0<?> a = wv0.a(readUnsignedByte);
                a.o(o00Var, tv0.n(i));
                w(a);
            }
        }
    }

    @Override // defpackage.tv0
    public final void q(p00 p00Var, int i) {
        p00Var.writeByte(wv0.b(B()));
        p00Var.writeInt(size());
        if (size() != 0) {
            for (tv0 tv0Var : (List) this.P) {
                tv0Var.q(p00Var, tv0.n(i));
            }
        }
    }

    public final int size() {
        return ((List) this.P).size();
    }

    @Override // defpackage.tv0
    public final String u(int i) {
        StringBuilder sb = new StringBuilder("{\"type\":\"");
        sb.append(B().getSimpleName());
        sb.append("\",\"list\":[");
        int i2 = 0;
        while (i2 < size()) {
            sb.append(i2 > 0 ? "," : "");
            sb.append(z(i2).u(tv0.n(i)));
            i2++;
        }
        sb.append("]}");
        return sb.toString();
    }

    @Override // defpackage.tv0
    public final String v(int i) {
        StringBuilder sb = new StringBuilder("[");
        int i2 = 0;
        while (i2 < size()) {
            sb.append(i2 > 0 ? "," : "");
            sb.append(z(i2).v(tv0.n(i)));
            i2++;
        }
        sb.append("]");
        return sb.toString();
    }

    public final void w(T t) {
        int size = size();
        Objects.requireNonNull(t);
        Class<?> cls = this.V;
        if (cls != null && cls != wo.class) {
            if (cls != t.getClass()) {
                throw new ClassCastException(String.format("cannot add %s to ListTag<%s>", t.getClass().getSimpleName(), this.V.getSimpleName()));
            }
        } else {
            this.V = t.getClass();
        }
        ((List) this.P).add(size, t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tv0
    /* renamed from: x */
    public final b20<T> m() {
        b20<T> b20Var = (b20<T>) new b20();
        b20Var.V = this.V;
        for (tv0 tv0Var : (List) this.P) {
            b20Var.w(tv0Var.clone());
        }
        return b20Var;
    }

    public final T z(int i) {
        return (T) ((List) this.P).get(i);
    }

    public b20(Class<? super T> cls) {
        super(new ArrayList(3));
        this.V = null;
        if (cls == wo.class) {
            throw new IllegalArgumentException("cannot create ListTag with EndTag elements");
        }
        Objects.requireNonNull(cls);
        this.V = cls;
    }
}