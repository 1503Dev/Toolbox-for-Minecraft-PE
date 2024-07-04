package defpackage;

import android.text.Editable;
import defpackage.jb0;
import defpackage.zs0;
import io.mrarm.mctoolbox.bridge.b;

/* renamed from: vd  reason: default package */
public final /* synthetic */ class vd implements zs0.a, jb0.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.zs0.a
    public final void afterTextChanged(Editable editable) {
        zd zdVar = (zd) this.b;
        zdVar.e(zdVar.V.n0, editable, 16);
    }

    @Override // defpackage.jb0.b
    public final boolean c() {
        switch (this.a) {
            case 1:
                xz0 xz0Var = (xz0) this.b;
                if (xz0Var.x.Q && xz0Var.q.Q) {
                    return true;
                }
                return false;
            default:
                px0 px0Var = (px0) this.b;
                lj ljVar = px0.t;
                if (((b) px0Var.a).c.Q) {
                    return px0Var.k.Q;
                }
                return px0Var.l();
        }
    }
}