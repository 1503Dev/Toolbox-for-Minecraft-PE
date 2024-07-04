package defpackage;

import defpackage.c30;
import defpackage.e11;
import defpackage.zp;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;

/* renamed from: yt  reason: default package */
public final class yt {
    public kp a = kp.U;
    public c30.a b = c30.P;
    public zp.a c = zp.P;
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public int g = 2;
    public int h = 2;
    public boolean i = true;

    public final xt a() {
        ArrayList arrayList = new ArrayList(this.f.size() + this.e.size() + 3);
        arrayList.addAll(this.e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        int i = this.g;
        int i2 = this.h;
        if (i != 2 && i2 != 2) {
            ek ekVar = new ek(i, i2, Date.class);
            ek ekVar2 = new ek(i, i2, Timestamp.class);
            ek ekVar3 = new ek(i, i2, java.sql.Date.class);
            q11 q11Var = o11.a;
            arrayList.add(new q11(Date.class, ekVar));
            arrayList.add(new q11(Timestamp.class, ekVar2));
            arrayList.add(new q11(java.sql.Date.class, ekVar3));
        }
        return new xt(this.a, this.c, this.d, this.i, this.b, this.e, this.f, arrayList);
    }

    public final void b(vz vzVar, Class cls) {
        boolean z;
        boolean z2 = vzVar instanceof d00;
        if (vzVar instanceof ux) {
            this.d.put(cls, (ux) vzVar);
        }
        u11 u11Var = new u11(cls);
        ArrayList arrayList = this.e;
        if (u11Var.b == u11Var.a) {
            z = true;
        } else {
            z = false;
        }
        arrayList.add(new e11.b(vzVar, u11Var, z, null));
        if (vzVar instanceof l11) {
            ArrayList arrayList2 = this.e;
            q11 q11Var = o11.a;
            arrayList2.add(new p11(new u11(cls), (l11) vzVar));
        }
    }

    public final void c(Class cls, l11 l11Var) {
        boolean z = l11Var instanceof d00;
        if (!z) {
            boolean z2 = l11Var instanceof vz;
        }
        if ((l11Var instanceof vz) || z) {
            this.f.add(new e11.b(l11Var, null, false, cls));
        }
        ArrayList arrayList = this.e;
        q11 q11Var = o11.a;
        arrayList.add(new t11(cls, l11Var));
    }
}