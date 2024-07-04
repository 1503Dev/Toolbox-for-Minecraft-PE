package androidx.lifecycle;

import androidx.lifecycle.a;
import androidx.lifecycle.c;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
@Deprecated
public class ReflectiveGenericLifecycleObserver implements d {
    public final Object a;
    public final a.C0006a b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.a = obj;
        this.b = a.c.b(obj.getClass());
    }

    @Override // androidx.lifecycle.d
    public final void d(b10 b10Var, c.b bVar) {
        a.C0006a c0006a = this.b;
        Object obj = this.a;
        a.C0006a.a((List) c0006a.a.get(bVar), b10Var, bVar, obj);
        a.C0006a.a((List) c0006a.a.get(c.b.ON_ANY), b10Var, bVar, obj);
    }
}