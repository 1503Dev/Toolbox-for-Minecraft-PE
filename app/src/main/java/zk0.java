package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;

/* renamed from: zk0  reason: default package */
public final class zk0<T> implements Runnable {
    public Callable<T> P;
    public ag<T> Q;
    public Handler R;

    /* renamed from: zk0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Runnable {
        public final /* synthetic */ ag P;
        public final /* synthetic */ Object Q;

        public a(ag agVar, Object obj) {
            this.P = agVar;
            this.Q = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            this.P.accept(this.Q);
        }
    }

    public zk0(Handler handler, uq uqVar, vq vqVar) {
        this.P = uqVar;
        this.Q = vqVar;
        this.R = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        T t;
        try {
            t = this.P.call();
        } catch (Exception unused) {
            t = null;
        }
        this.R.post(new a(this.Q, t));
    }
}