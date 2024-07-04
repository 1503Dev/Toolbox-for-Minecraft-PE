package defpackage;

/* renamed from: zz  reason: default package */
public final class zz extends wz {
    public final h10<String, wz> P = new h10<>();

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof zz) && ((zz) obj).P.equals(this.P));
    }

    public final int hashCode() {
        return this.P.hashCode();
    }

    public final wz r(String str) {
        return this.P.get(str);
    }

    public final boolean s(String str) {
        return this.P.containsKey(str);
    }
}