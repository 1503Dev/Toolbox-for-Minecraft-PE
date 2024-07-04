package defpackage;

import android.os.Handler;
import java.util.ArrayList;

/* renamed from: dl4  reason: default package */
public final class dl4 implements a54 {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public dl4(Handler handler) {
        this.a = handler;
    }

    public static mk4 d() {
        mk4 mk4Var;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            mk4Var = arrayList.isEmpty() ? new mk4(0) : (mk4) arrayList.remove(arrayList.size() - 1);
        }
        return mk4Var;
    }

    public final mk4 a(int i, Object obj) {
        mk4 d = d();
        d.a = this.a.obtainMessage(i, obj);
        return d;
    }

    public final boolean b(Runnable runnable) {
        return this.a.post(runnable);
    }

    public final boolean c(int i) {
        return this.a.sendEmptyMessage(i);
    }
}