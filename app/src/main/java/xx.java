package defpackage;

/* renamed from: xx  reason: default package */
public final class xx {
    public final int a;
    public final int b;

    public xx(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xx) {
            xx xxVar = (xx) obj;
            return this.a == xxVar.a && this.b == xxVar.b;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }
}