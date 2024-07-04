package defpackage;

import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: p31  reason: default package */
public final class p31 {
    public final Object a = new Object();
    @GuardedBy("lock")
    public cs3 b;
    @GuardedBy("lock")
    public a c;

    /* renamed from: p31$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class a {
        public void a() {
        }

        public void b() {
        }

        public void c() {
        }
    }

    public final void a(cs3 cs3Var) {
        synchronized (this.a) {
            try {
                this.b = cs3Var;
                a aVar = this.c;
                if (aVar != null) {
                    synchronized (this.a) {
                        this.c = aVar;
                        cs3 cs3Var2 = this.b;
                        if (cs3Var2 != null) {
                            try {
                                cs3Var2.m3(new iq4(aVar));
                            } catch (RemoteException e) {
                                sv2.e("Unable to call setVideoLifecycleCallbacks on video controller.", e);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }
}