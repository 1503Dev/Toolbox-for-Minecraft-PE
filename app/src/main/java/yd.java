package defpackage;

import android.text.Editable;
import defpackage.dz;
import defpackage.jb0;
import defpackage.xs0;
import defpackage.zs0;
import io.mrarm.mctoolbox.bridge.a;
import io.mrarm.mctoolbox.bridge.b;

/* renamed from: yd  reason: default package */
public final /* synthetic */ class yd implements zs0.a, xs0.a, dz.b, jb0.b {
    public final /* synthetic */ Object a;

    public /* synthetic */ yd(Object obj) {
        this.a = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
        if (((io.mrarm.mctoolbox.bridge.b) r0.a).p(r0.f) == ((java.lang.Integer) r0.p).intValue()) goto L12;
     */
    @Override // defpackage.xs0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a() {
        int i;
        px0 px0Var = (px0) this.a;
        lj ljVar = px0.t;
        if (px0Var.f != null) {
            Object obj = px0Var.p;
            if (obj instanceof Boolean) {
                boolean z = (!((Boolean) obj).booleanValue()) ^ px0Var.k.Q;
                ((b) px0Var.a).R(px0Var.f, z);
            }
            if (px0Var.p instanceof Integer) {
                if (!px0Var.k.Q) {
                }
                a aVar = px0Var.a;
                String str = px0Var.f;
                if (px0Var.k.Q) {
                    i = ((Integer) px0Var.p).intValue();
                } else {
                    i = 0;
                }
                ((b) aVar).T(i, str);
            }
        }
        px0Var.h();
    }

    @Override // defpackage.zs0.a
    public void afterTextChanged(Editable editable) {
        zd zdVar = (zd) this.a;
        zdVar.e(zdVar.V.j0, editable, 24);
    }

    @Override // defpackage.jb0.b
    public boolean c() {
        xz0 xz0Var = (xz0) this.a;
        if (xz0Var.t.Q && xz0Var.r.Q) {
            return true;
        }
        return false;
    }
}