package defpackage;

import android.content.Context;
import android.util.Base64;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: x02  reason: default package */
public final class x02 extends c22 {
    public static final d22 i = new d22();
    public final Context h;

    public x02(l02 l02Var, gx1 gx1Var, int i2, Context context) {
        super(l02Var, "gRiEqMdygJbXVwKGpJJS0XfYaGpCoNDcsHcIyHSZIcdpg+a2r1SI+bnO9R0NWRI0", "EBqSzSIe3Rjv1o1jIB+xCBngdhv60cOxeintd9wp68g=", gx1Var, i2, 29);
        this.h = context;
    }

    @Override // defpackage.c22
    public final void b() {
        gx1 gx1Var = this.d;
        gx1Var.j();
        ey1.M0((ey1) gx1Var.Q, "E");
        AtomicReference n = i.n(this.h.getPackageName());
        if (n.get() == null) {
            synchronized (n) {
                if (n.get() == null) {
                    n.set((String) this.e.invoke(null, this.h));
                }
            }
        }
        String str = (String) n.get();
        synchronized (this.d) {
            gx1 gx1Var2 = this.d;
            String encodeToString = Base64.encodeToString(str.getBytes(), 11);
            gx1Var2.j();
            ey1.M0((ey1) gx1Var2.Q, encodeToString);
        }
    }
}