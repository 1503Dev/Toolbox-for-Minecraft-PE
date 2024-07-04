package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: r92  reason: default package */
public final class r92 {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            String str = (String) w82.d.c.a((q92) it.next());
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ga1.u(arrayList2, ya2.b("gad:dynamite_module:experiment_id", ""));
        ga1.u(arrayList2, jb2.a);
        ga1.u(arrayList2, jb2.b);
        ga1.u(arrayList2, jb2.c);
        ga1.u(arrayList2, jb2.d);
        ga1.u(arrayList2, jb2.e);
        ga1.u(arrayList2, jb2.u);
        ga1.u(arrayList2, jb2.f);
        ga1.u(arrayList2, jb2.m);
        ga1.u(arrayList2, jb2.n);
        ga1.u(arrayList2, jb2.o);
        ga1.u(arrayList2, jb2.p);
        ga1.u(arrayList2, jb2.q);
        ga1.u(arrayList2, jb2.r);
        ga1.u(arrayList2, jb2.s);
        ga1.u(arrayList2, jb2.t);
        ga1.u(arrayList2, jb2.g);
        ga1.u(arrayList2, jb2.h);
        ga1.u(arrayList2, jb2.i);
        ga1.u(arrayList2, jb2.j);
        ga1.u(arrayList2, jb2.k);
        ga1.u(arrayList2, jb2.l);
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public final ArrayList b() {
        ArrayList a = a();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            String str = (String) w82.d.c.a((q92) it.next());
            if (!TextUtils.isEmpty(str)) {
                a.add(str);
            }
        }
        ArrayList arrayList = new ArrayList();
        ga1.u(arrayList, yb2.a);
        a.addAll(arrayList);
        return a;
    }
}