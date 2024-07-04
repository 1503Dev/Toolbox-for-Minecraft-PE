package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: r61  reason: default package */
public final class r61 extends z61 {
    public static final String o = y20.e("WorkContinuationImpl");
    public final a71 f;
    public final String g;
    public final int h;
    public final List<? extends k71> i;
    public final ArrayList j;
    public final ArrayList k;
    public final List<r61> l;
    public boolean m;
    public vc0 n;

    public r61() {
        throw null;
    }

    public r61(a71 a71Var, List<? extends k71> list) {
        this.f = a71Var;
        this.g = null;
        this.h = 2;
        this.i = list;
        this.l = null;
        this.j = new ArrayList(list.size());
        this.k = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String uuid = list.get(i).a.toString();
            this.j.add(uuid);
            this.k.add(uuid);
        }
    }

    public static boolean D1(r61 r61Var, HashSet hashSet) {
        hashSet.addAll(r61Var.j);
        HashSet E1 = E1(r61Var);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (E1.contains((String) it.next())) {
                return true;
            }
        }
        List<r61> list = r61Var.l;
        if (list != null && !list.isEmpty()) {
            for (r61 r61Var2 : list) {
                if (D1(r61Var2, hashSet)) {
                    return true;
                }
            }
        }
        hashSet.removeAll(r61Var.j);
        return false;
    }

    public static HashSet E1(r61 r61Var) {
        HashSet hashSet = new HashSet();
        List<r61> list = r61Var.l;
        if (list != null && !list.isEmpty()) {
            for (r61 r61Var2 : list) {
                hashSet.addAll(r61Var2.j);
            }
        }
        return hashSet;
    }
}