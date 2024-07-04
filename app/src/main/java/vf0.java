package defpackage;

/* renamed from: vf0  reason: default package */
public final class vf0 {
    public String a;
    public Long b;

    public vf0(String str, long j) {
        this.a = str;
        this.b = Long.valueOf(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vf0) {
            vf0 vf0Var = (vf0) obj;
            if (this.a.equals(vf0Var.a)) {
                Long l = this.b;
                Long l2 = vf0Var.b;
                return l != null ? l.equals(l2) : l2 == null;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return hashCode + (l != null ? l.hashCode() : 0);
    }
}