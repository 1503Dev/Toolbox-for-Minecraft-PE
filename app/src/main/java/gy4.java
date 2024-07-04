package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: gy4  reason: default package */
public final class gy4 extends fy4 {
    public final AtomicReferenceFieldUpdater Q;
    public final AtomicIntegerFieldUpdater R;

    public gy4(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super((Object) null);
        this.Q = atomicReferenceFieldUpdater;
        this.R = atomicIntegerFieldUpdater;
    }

    @Override // defpackage.fy4
    public final int e(iy4 iy4Var) {
        return this.R.decrementAndGet(iy4Var);
    }

    @Override // defpackage.fy4
    public final void m(iy4 iy4Var, Set set) {
        boolean z;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.Q;
        do {
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(iy4Var, null, set)) {
                    if (atomicReferenceFieldUpdater.get(iy4Var) != null) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(iy4Var) == null);
    }
}