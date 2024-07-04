package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: ao5  reason: default package */
public final class ao5 {
    public static final ao5 c;
    public final long a;
    public final long b;

    static {
        ao5 ao5Var = new ao5(0L, 0L);
        new ao5(RecyclerView.FOREVER_NS, RecyclerView.FOREVER_NS);
        new ao5(RecyclerView.FOREVER_NS, 0L);
        new ao5(0L, RecyclerView.FOREVER_NS);
        c = ao5Var;
    }

    public ao5(long j, long j2) {
        tv2.G(j >= 0);
        tv2.G(j2 >= 0);
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ao5.class == obj.getClass()) {
            ao5 ao5Var = (ao5) obj;
            if (this.a == ao5Var.a && this.b == ao5Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}