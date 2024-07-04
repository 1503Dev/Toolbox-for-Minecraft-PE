package defpackage;

import defpackage.jb0;
import defpackage.s01;
import defpackage.xs0;
import io.mrarm.mctoolbox.bridge.b;

/* renamed from: ey0  reason: default package */
public final /* synthetic */ class ey0 implements xs0.a, jb0.b, s01.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ey0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.xs0.a
    public void a() {
        switch (this.a) {
            case 0:
                hy0 hy0Var = (hy0) this.b;
                hy0Var.q.a(hy0Var.k.Q);
                return;
            case 1:
                mz0 mz0Var = (mz0) this.b;
                int i = mz0.i;
                mz0Var.e().setAlpha(mz0Var.f.Q);
                return;
            default:
                pd pdVar = (pd) this.b;
                lj ljVar = pd.l;
                String str = pdVar.f;
                if (str != null) {
                    ((b) pdVar.a).T(pdVar.k.Q, str);
                }
                pdVar.h();
                return;
        }
    }

    @Override // defpackage.jb0.b
    public boolean c() {
        switch (this.a) {
            case 0:
                xz0 xz0Var = (xz0) this.b;
                if (!xz0Var.n.Q && xz0Var.o.Q && !xz0Var.p.Q) {
                    return true;
                }
                return false;
            default:
                return ((jb0.b) this.b).c();
        }
    }
}