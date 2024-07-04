package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: sv5  reason: default package */
public final class sv5 {
    public final ov5 a;
    public final CopyOnWriteArrayList b;

    public sv5(CopyOnWriteArrayList copyOnWriteArrayList, ov5 ov5Var) {
        this.b = copyOnWriteArrayList;
        this.a = ov5Var;
    }

    public static final long f(long j) {
        long s = zn4.s(j);
        if (s == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return s;
    }

    public final void a(lv5 lv5Var) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            rv5 rv5Var = (rv5) it.next();
            zn4.e(rv5Var.a, new wm5(1, this, rv5Var.b, lv5Var));
        }
    }

    public final void b(xu5 xu5Var, lv5 lv5Var) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            rv5 rv5Var = (rv5) it.next();
            zn4.e(rv5Var.a, new hj1(this, rv5Var.b, xu5Var, lv5Var, 1));
        }
    }

    public final void c(xu5 xu5Var, lv5 lv5Var) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            rv5 rv5Var = (rv5) it.next();
            zn4.e(rv5Var.a, new cn5(this, rv5Var.b, xu5Var, lv5Var, 1));
        }
    }

    public final void d(xu5 xu5Var, lv5 lv5Var, IOException iOException, boolean z) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            rv5 rv5Var = (rv5) it.next();
            zn4.e(rv5Var.a, new an5(this, rv5Var.b, xu5Var, lv5Var, iOException, z, 1));
        }
    }

    public final void e(xu5 xu5Var, lv5 lv5Var) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            rv5 rv5Var = (rv5) it.next();
            zn4.e(rv5Var.a, new bn5(this, rv5Var.b, xu5Var, lv5Var, 1));
        }
    }
}