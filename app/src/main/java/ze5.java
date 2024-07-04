package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ze5  reason: default package */
public final class ze5 extends cf5 {
    public static final Class c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    public static List d(int i, long j, Object obj) {
        xe5 xe5Var;
        List list = (List) zg5.m(j, obj);
        if (list.isEmpty()) {
            List xe5Var2 = list instanceof ye5 ? new xe5(i) : ((list instanceof uf5) && (list instanceof qe5)) ? ((qe5) list).e(i) : new ArrayList(i);
            zg5.v(j, obj, xe5Var2);
            return xe5Var2;
        }
        if (c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            xe5Var = arrayList;
        } else if (!(list instanceof ug5)) {
            if ((list instanceof uf5) && (list instanceof qe5)) {
                qe5 qe5Var = (qe5) list;
                if (qe5Var.d()) {
                    return list;
                }
                qe5 e = qe5Var.e(list.size() + i);
                zg5.v(j, obj, e);
                return e;
            }
            return list;
        } else {
            xe5 xe5Var3 = new xe5(list.size() + i);
            xe5Var3.addAll(xe5Var3.size(), (ug5) list);
            xe5Var = xe5Var3;
        }
        zg5.v(j, obj, xe5Var);
        return xe5Var;
    }

    @Override // defpackage.cf5
    public final List a(long j, Object obj) {
        return d(10, j, obj);
    }

    @Override // defpackage.cf5
    public final void b(long j, Object obj) {
        Object unmodifiableList;
        List list = (List) zg5.m(j, obj);
        if (list instanceof ye5) {
            unmodifiableList = ((ye5) list).b();
        } else if (c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof uf5) && (list instanceof qe5)) {
                qe5 qe5Var = (qe5) list;
                if (qe5Var.d()) {
                    qe5Var.c();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zg5.v(j, obj, unmodifiableList);
    }

    @Override // defpackage.cf5
    public final void c(long j, Object obj, Object obj2) {
        List list = (List) zg5.m(j, obj2);
        List d = d(list.size(), j, obj);
        int size = d.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d.addAll(list);
        }
        if (size > 0) {
            list = d;
        }
        zg5.v(j, obj, list);
    }
}