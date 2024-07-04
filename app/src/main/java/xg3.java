package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: xg3  reason: default package */
public class xg3 {
    public final HashMap P = new HashMap();

    public xg3(Set set) {
        synchronized (this) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ii3 ii3Var = (ii3) it.next();
                synchronized (this) {
                    Q0(ii3Var.a, ii3Var.b);
                }
            }
        }
    }

    public final synchronized void Q0(Object obj, Executor executor) {
        this.P.put(obj, executor);
    }

    public final synchronized void R0(final wg3 wg3Var) {
        for (Map.Entry entry : this.P.entrySet()) {
            final Object key = entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: vg3
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        wg3.this.mo0e(key);
                    } catch (Throwable th) {
                        jv5.A.g.e("EventEmitter.notify", th);
                        vz3.l("Event emitter exception.", th);
                    }
                }
            });
        }
    }
}