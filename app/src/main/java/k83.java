package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: k83  reason: default package */
public final class k83 extends wb3 {
    public static final Class c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    @Override // defpackage.wb3
    public final void a(long j, Object obj) {
        Object unmodifiableList;
        List list = (List) hc4.j(j, obj);
        if (list instanceof s63) {
            unmodifiableList = ((s63) list).b();
        } else if (c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof rp3) && (list instanceof b13)) {
                b13 b13Var = (b13) list;
                if (b13Var.d()) {
                    b13Var.c();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        hc4.r(j, obj, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wb3
    public final void b(long j, Object obj, Object obj2) {
        b13 e;
        q53 q53Var;
        List list = (List) hc4.j(j, obj2);
        int size = list.size();
        List list2 = (List) hc4.j(j, obj);
        if (list2.isEmpty()) {
            if (list2 instanceof s63) {
                list2 = new q53(size);
            } else if ((list2 instanceof rp3) && (list2 instanceof b13)) {
                e = ((b13) list2).e(size);
                list2 = e;
            } else {
                list2 = new ArrayList(size);
            }
            hc4.r(j, obj, list2);
        } else {
            if (c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                q53Var = arrayList;
            } else if (list2 instanceof m84) {
                q53 q53Var2 = new q53(list2.size() + size);
                q53Var2.addAll(q53Var2.size(), (m84) list2);
                q53Var = q53Var2;
            } else if ((list2 instanceof rp3) && (list2 instanceof b13)) {
                b13 b13Var = (b13) list2;
                if (!b13Var.d()) {
                    e = b13Var.e(list2.size() + size);
                    list2 = e;
                    hc4.r(j, obj, list2);
                }
            }
            list2 = q53Var;
            hc4.r(j, obj, list2);
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        hc4.r(j, obj, list);
    }
}