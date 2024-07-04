package defpackage;

/* renamed from: l84  reason: default package */
public final class l84 {
    public final Object a;
    public dn1 b = new dn1();
    public boolean c;
    public boolean d;

    public l84(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l84.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((l84) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}