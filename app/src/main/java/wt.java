package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

/* renamed from: wt  reason: default package */
public final class wt extends l11<AtomicLongArray> {
    public final /* synthetic */ l11 a;

    public wt(l11 l11Var) {
        this.a = l11Var;
    }

    @Override // defpackage.l11
    public final AtomicLongArray a(c00 c00Var) {
        ArrayList arrayList = new ArrayList();
        c00Var.a();
        while (c00Var.H()) {
            arrayList.add(Long.valueOf(((Number) this.a.a(c00Var)).longValue()));
        }
        c00Var.y();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i = 0; i < size; i++) {
            atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
        }
        return atomicLongArray;
    }

    @Override // defpackage.l11
    public final void b(i00 i00Var, AtomicLongArray atomicLongArray) {
        AtomicLongArray atomicLongArray2 = atomicLongArray;
        i00Var.d();
        int length = atomicLongArray2.length();
        for (int i = 0; i < length; i++) {
            this.a.b(i00Var, Long.valueOf(atomicLongArray2.get(i)));
        }
        i00Var.y();
    }
}