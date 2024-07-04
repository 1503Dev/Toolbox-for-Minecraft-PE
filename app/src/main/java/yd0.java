package defpackage;

import android.graphics.Color;
import android.text.Editable;
import defpackage.jb0;
import defpackage.rs0;
import defpackage.xs0;
import defpackage.zs0;
import io.mrarm.mctoolbox.bridge.b;

/* renamed from: yd0  reason: default package */
public final /* synthetic */ class yd0 implements rs0.b, zs0.a, jb0.b, xs0.a {
    public final /* synthetic */ Object a;

    public /* synthetic */ yd0(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.xs0.a
    public final void a() {
        nw0 nw0Var = (nw0) this.a;
        lj ljVar = nw0.l;
        String str = nw0Var.f;
        if (str != null) {
            ((b) nw0Var.a).U(str, nw0Var.k.Q);
        }
        nw0Var.h();
    }

    @Override // defpackage.zs0.a
    public final void afterTextChanged(Editable editable) {
        zd zdVar = (zd) this.a;
        if (!zdVar.W) {
            try {
                if (editable.length() == 0) {
                    return;
                }
                zdVar.g(Color.parseColor(editable.toString()), zdVar.V.m0);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // defpackage.jb0.b
    public final boolean c() {
        xz0 xz0Var = (xz0) this.a;
        if (xz0Var.w.Q && xz0Var.o.Q) {
            return true;
        }
        return false;
    }
}