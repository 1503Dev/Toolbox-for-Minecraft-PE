package defpackage;

/* renamed from: hx5  reason: default package */
public final class hx5 {
    public static final hx5 d = new hx5(new qe3[0]);
    public final int a;
    public final nw4 b;
    public int c;

    static {
        Integer.toString(0, 36);
    }

    public hx5(qe3... qe3VarArr) {
        this.b = nv4.u(qe3VarArr);
        this.a = qe3VarArr.length;
        int i = 0;
        while (i < this.b.S) {
            int i2 = i + 1;
            int i3 = i2;
            while (true) {
                nw4 nw4Var = this.b;
                if (i3 < nw4Var.S) {
                    if (((qe3) nw4Var.get(i)).equals(this.b.get(i3))) {
                        lb4.b("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                    i3++;
                }
            }
            i = i2;
        }
    }

    public final qe3 a(int i) {
        return (qe3) this.b.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hx5.class == obj.getClass()) {
            hx5 hx5Var = (hx5) obj;
            if (this.a == hx5Var.a && this.b.equals(hx5Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            int hashCode = this.b.hashCode();
            this.c = hashCode;
            return hashCode;
        }
        return i;
    }
}