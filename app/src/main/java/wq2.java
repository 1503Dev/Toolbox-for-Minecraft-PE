package defpackage;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* renamed from: wq2  reason: default package */
public final class wq2 implements Callable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ s82 b;

    public wq2(s82 s82Var, Context context) {
        this.b = s82Var;
        this.a = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        vq2 a;
        xq2 xq2Var = (xq2) ((WeakHashMap) this.b.Q).get(this.a);
        if (xq2Var != null) {
            long longValue = ((Long) cb2.a.d()).longValue() + xq2Var.a;
            jv5.A.j.getClass();
            if (longValue >= System.currentTimeMillis()) {
                a = new uq2(this.a, xq2Var.b).a();
                ((WeakHashMap) this.b.Q).put(this.a, new xq2(a));
                return a;
            }
        }
        a = new uq2(this.a).a();
        ((WeakHashMap) this.b.Q).put(this.a, new xq2(a));
        return a;
    }
}