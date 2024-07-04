package defpackage;

/* renamed from: yl4  reason: default package */
public final class yl4 {
    public final String a;
    public final String b;

    public yl4(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yl4) {
            yl4 yl4Var = (yl4) obj;
            return this.a.equals(yl4Var.a) && this.b.equals(yl4Var.b);
        }
        return false;
    }

    public final int hashCode() {
        return String.valueOf(this.a).concat(String.valueOf(this.b)).hashCode();
    }
}