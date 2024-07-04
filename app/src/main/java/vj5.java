package defpackage;

import android.content.ComponentName;
import java.lang.ref.WeakReference;

/* renamed from: vj5  reason: default package */
public final class vj5 extends qh {
    public final WeakReference b;

    public vj5(ua2 ua2Var) {
        this.b = new WeakReference(ua2Var);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ua2 ua2Var = (ua2) this.b.get();
        if (ua2Var != null) {
            ua2Var.b = null;
            ua2Var.a = null;
        }
    }
}