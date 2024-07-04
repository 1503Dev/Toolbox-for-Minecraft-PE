package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: wl  reason: default package */
public final class wl {
    public final Object a;
    public final Object b;
    public final Cloneable c;
    public final Object d;

    public wl(int i) {
        if (i != 1) {
            this.a = new hf0(10);
            this.b = new os0();
            this.c = new ArrayList();
            this.d = new HashSet();
            return;
        }
        this.a = new e7();
        this.b = new SparseArray();
        this.c = new d30();
        this.d = new e7();
    }

    public final void a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (!hashSet.contains(obj)) {
            hashSet.add(obj);
            ArrayList arrayList2 = (ArrayList) ((os0) this.b).getOrDefault(obj, null);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    a(arrayList2.get(i), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }
}