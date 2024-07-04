package defpackage;

import androidx.databinding.ViewDataBinding;
import defpackage.lj;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: kj  reason: default package */
public final class kj<T, CT> extends j41<T, CT> {
    public final ViewDataBinding i0;
    public final lj j0;
    public ArrayList k0;

    public kj(ViewDataBinding viewDataBinding, lj ljVar) {
        super(viewDataBinding.T);
        this.i0 = viewDataBinding;
        this.j0 = ljVar;
    }

    @Override // defpackage.j41
    public final void B(T t, CT ct) {
        int i = this.j0.e;
        if (i != -1) {
            this.i0.P(i, t);
        }
        int i2 = this.j0.f;
        if (i2 != -1) {
            this.i0.P(i2, ct);
        }
        lj.a<T, ?, ?> aVar = this.j0.g;
        if (aVar != null) {
            ((lj.b) ((mj) aVar).a).b(this, this.i0, t);
        }
        ViewDataBinding viewDataBinding = this.i0;
        if (viewDataBinding.U) {
            viewDataBinding.O();
        } else if (viewDataBinding.J()) {
            viewDataBinding.U = true;
            viewDataBinding.I();
            viewDataBinding.U = false;
        }
    }

    @Override // defpackage.j41
    public final void C() {
        a61[] a61VarArr;
        for (a61 a61Var : this.i0.S) {
            if (a61Var != null) {
                a61Var.a();
            }
        }
        ArrayList arrayList = this.k0;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            this.k0.clear();
        }
    }
}