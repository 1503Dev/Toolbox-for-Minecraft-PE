package defpackage;

/* renamed from: gk4  reason: default package */
public final class gk4 implements ek4 {
    public final String a;

    public gk4(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gk4) {
            return this.a.equals(((gk4) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}