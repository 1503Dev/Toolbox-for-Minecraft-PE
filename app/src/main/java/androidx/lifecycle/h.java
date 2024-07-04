package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.c;

public final class h {
    public final e a;
    public final Handler b = new Handler();
    public a c;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a implements Runnable {
        public final e P;
        public final c.b Q;
        public boolean R = false;

        public a(e eVar, c.b bVar) {
            this.P = eVar;
            this.Q = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.R) {
                return;
            }
            this.P.d(this.Q);
            this.R = true;
        }
    }

    public h(b10 b10Var) {
        this.a = new e(b10Var);
    }

    public final void a(c.b bVar) {
        a aVar = this.c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.a, bVar);
        this.c = aVar2;
        this.b.postAtFrontOfQueue(aVar2);
    }
}