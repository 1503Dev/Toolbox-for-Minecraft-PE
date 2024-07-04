package defpackage;

import androidx.databinding.ViewDataBinding;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: a61  reason: default package */
public final class a61<T> extends WeakReference<ViewDataBinding> {
    public final gb0<T> a;
    public final int b;
    public T c;

    public a61(ViewDataBinding viewDataBinding, int i, gb0<T> gb0Var, ReferenceQueue<ViewDataBinding> referenceQueue) {
        super(viewDataBinding, referenceQueue);
        this.b = i;
        this.a = gb0Var;
    }

    public final boolean a() {
        boolean z;
        T t = this.c;
        if (t != null) {
            this.a.d(t);
            z = true;
        } else {
            z = false;
        }
        this.c = null;
        return z;
    }
}