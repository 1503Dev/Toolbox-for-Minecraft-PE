package defpackage;

import java.util.Set;

/* renamed from: hy4  reason: default package */
public final class hy4 extends fy4 {
    public /* synthetic */ hy4() {
        super((Object) null);
    }

    @Override // defpackage.fy4
    public final int e(iy4 iy4Var) {
        int i;
        synchronized (iy4Var) {
            i = iy4Var.X - 1;
            iy4Var.X = i;
        }
        return i;
    }

    @Override // defpackage.fy4
    public final void m(iy4 iy4Var, Set set) {
        synchronized (iy4Var) {
            if (iy4Var.W == null) {
                iy4Var.W = set;
            }
        }
    }
}