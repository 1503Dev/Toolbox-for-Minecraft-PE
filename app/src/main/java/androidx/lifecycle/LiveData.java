package androidx.lifecycle;

import android.os.Looper;
import androidx.lifecycle.c;
import defpackage.hn0;
import java.util.Map;

public abstract class LiveData<T> {
    public static final Object j = new Object();
    public final Object a = new Object();
    public hn0<kb0<? super T>, LiveData<T>.b> b = new hn0<>();
    public int c = 0;
    public volatile Object d;
    public volatile Object e;
    public int f;
    public boolean g;
    public boolean h;
    public final a i;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class LifecycleBoundObserver extends LiveData<T>.b implements d {
        @Override // androidx.lifecycle.d
        public final void d(b10 b10Var, c.b bVar) {
            throw null;
        }

        @Override // androidx.lifecycle.LiveData.b
        public final void f() {
            throw null;
        }

        @Override // androidx.lifecycle.LiveData.b
        public final boolean g() {
            throw null;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            synchronized (LiveData.this.a) {
                obj = LiveData.this.e;
                LiveData.this.e = LiveData.j;
            }
            LiveData.this.g(obj);
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public abstract class b {
        public boolean a;
        public int b;

        public final void e(boolean z) {
            if (z == this.a) {
                return;
            }
            this.a = z;
            throw null;
        }

        public void f() {
        }

        public abstract boolean g();
    }

    public LiveData() {
        Object obj = j;
        this.e = obj;
        this.i = new a();
        this.d = obj;
        this.f = -1;
    }

    public static void a(String str) {
        boolean z;
        a7.D1().f.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IllegalStateException(ij.c("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(LiveData<T>.b bVar) {
        if (bVar.a) {
            if (!bVar.g()) {
                bVar.e(false);
                return;
            }
            int i = bVar.b;
            int i2 = this.f;
            if (i >= i2) {
                return;
            }
            bVar.b = i2;
            bVar.getClass();
            throw null;
        }
    }

    public final void c(LiveData<T>.b bVar) {
        if (this.g) {
            this.h = true;
            return;
        }
        this.g = true;
        do {
            this.h = false;
            if (bVar != null) {
                b(bVar);
                bVar = null;
            } else {
                hn0<kb0<? super T>, LiveData<T>.b> hn0Var = this.b;
                hn0Var.getClass();
                hn0.d dVar = new hn0.d();
                hn0Var.R.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((b) ((Map.Entry) dVar.next()).getValue());
                    if (this.h) {
                        break;
                    }
                }
            }
        } while (this.h);
        this.g = false;
    }

    public void d() {
    }

    public void e() {
    }

    public void f(kb0<? super T> kb0Var) {
        a("removeObserver");
        LiveData<T>.b h = this.b.h(kb0Var);
        if (h == null) {
            return;
        }
        h.f();
        h.e(false);
    }

    public void g(T t) {
        a("setValue");
        this.f++;
        this.d = t;
        c(null);
    }
}