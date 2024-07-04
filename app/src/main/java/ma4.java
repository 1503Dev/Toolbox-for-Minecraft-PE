package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.Callable;

/* renamed from: ma4  reason: default package */
public final class ma4 implements nc4 {
    public final ez4 a;
    public final cu3 b;

    public ma4(yw2 yw2Var, cu3 cu3Var) {
        this.a = yw2Var;
        this.b = cu3Var;
    }

    @Override // defpackage.nc4
    public final int a() {
        return 23;
    }

    @Override // defpackage.nc4
    public final dz4 c() {
        return this.a.b(new Callable() { // from class: la4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                boolean z;
                boolean z2;
                boolean z3;
                ma4 ma4Var = ma4.this;
                cu3 cu3Var = ma4Var.b;
                synchronized (cu3Var) {
                    if (((Boolean) w82.d.c.a(x92.x7)).booleanValue() && cu3Var.f()) {
                        long j = cu3Var.n;
                        jv5.A.j.getClass();
                        if (j < System.currentTimeMillis() / 1000) {
                            cu3Var.l = "{}";
                            cu3Var.n = RecyclerView.FOREVER_NS;
                        } else if (!cu3Var.l.equals("{}")) {
                            str = cu3Var.l;
                        }
                    }
                    str = "";
                }
                cu3 cu3Var2 = ma4Var.b;
                synchronized (cu3Var2) {
                    z = cu3Var2.p;
                }
                r42 r42Var = jv5.A.m;
                synchronized (r42Var.a) {
                    z2 = r42Var.e;
                }
                if (ma4Var.b.m != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                return new na4(str, z, z2, z3);
            }
        });
    }
}