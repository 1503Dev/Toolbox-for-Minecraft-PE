package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: a7  reason: default package */
public final class a7 extends z61 {
    public static volatile a7 g;
    public static final a h = new a();
    public hk f = new hk();

    /* renamed from: a7$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            a7.D1().f.g.execute(runnable);
        }
    }

    public static a7 D1() {
        if (g != null) {
            return g;
        }
        synchronized (a7.class) {
            if (g == null) {
                g = new a7();
            }
        }
        return g;
    }

    public final void E1(Runnable runnable) {
        hk hkVar = this.f;
        if (hkVar.h == null) {
            synchronized (hkVar.f) {
                if (hkVar.h == null) {
                    hkVar.h = hk.D1(Looper.getMainLooper());
                }
            }
        }
        hkVar.h.post(runnable);
    }
}