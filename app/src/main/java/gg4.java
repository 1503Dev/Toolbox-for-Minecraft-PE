package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: gg4 */
public final class gg4 {
    public static gg4 e;
    public final Handler a = new Handler(Looper.getMainLooper());
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final Object c = new Object();
    public int d = 0;

    public gg4(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new mf4(this), intentFilter);
    }

    public static synchronized gg4 a(Context context) {
        gg4 gg4Var;
        synchronized (gg4.class) {
            if (e == null) {
                e = new gg4(context);
            }
            gg4Var = e;
        }
        return gg4Var;
    }

    public static /* synthetic */ void b(gg4 gg4Var, int i) {
        synchronized (gg4Var.c) {
            if (gg4Var.d == i) {
                return;
            }
            gg4Var.d = i;
            Iterator it = gg4Var.b.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                kz5 kz5Var = (kz5) weakReference.get();
                if (kz5Var != null) {
                    lz5.b(kz5Var.a, i);
                } else {
                    gg4Var.b.remove(weakReference);
                }
            }
        }
    }
}