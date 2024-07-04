package defpackage;

import defpackage.jb0;
import defpackage.xs0;
import io.mrarm.mctoolbox.bridge.b;

/* renamed from: r10  reason: default package */
public final /* synthetic */ class r10 implements h20, jb0.b, xs0.a {
    public final /* synthetic */ Object a;

    public /* synthetic */ r10(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.xs0.a
    public final void a() {
        it0 it0Var = (it0) this.a;
        lj ljVar = it0.r;
        String str = it0Var.f;
        if (str != null) {
            ((b) it0Var.a).S(str, it0Var.q.Q);
        }
        it0Var.h();
    }

    @Override // defpackage.h20
    public final l41 b() {
        return (l41) this.a;
    }

    @Override // defpackage.jb0.b
    public final boolean c() {
        xz0 xz0Var = (xz0) this.a;
        if (xz0Var.r.Q && xz0Var.u.Q && !xz0Var.v.Q) {
            return true;
        }
        return false;
    }
}