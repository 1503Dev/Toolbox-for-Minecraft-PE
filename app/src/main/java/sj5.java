package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: sj5  reason: default package */
public final class sj5 implements lj5 {
    public static final /* synthetic */ int c = 0;
    public final List a;
    public final List b;

    static {
        mj5.a(Collections.emptySet());
    }

    public /* synthetic */ sj5(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public static m32 a(int i, int i2) {
        return new m32(i, i2);
    }

    @Override // defpackage.uj5
    /* renamed from: b */
    public final Set c() {
        int i;
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(this.b.size());
        int size2 = this.b.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Collection collection = (Collection) ((uj5) this.b.get(i2)).c();
            size += collection.size();
            arrayList.add(collection);
        }
        if (size < 3) {
            i = size + 1;
        } else if (size < 1073741824) {
            i = (int) ((size / 0.75f) + 1.0f);
        } else {
            i = Integer.MAX_VALUE;
        }
        HashSet hashSet = new HashSet(i);
        int size3 = this.a.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Object c2 = ((uj5) this.a.get(i3)).c();
            c2.getClass();
            hashSet.add(c2);
        }
        int size4 = arrayList.size();
        for (int i4 = 0; i4 < size4; i4++) {
            for (Object obj : (Collection) arrayList.get(i4)) {
                obj.getClass();
                hashSet.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}