package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: qf  reason: default package */
public abstract class qf<T> {
    public static final String f = y20.e("ConstraintTracker");
    public final bw0 a;
    public final Context b;
    public final Object c = new Object();
    public final LinkedHashSet d = new LinkedHashSet();
    public T e;

    /* renamed from: qf$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Runnable {
        public final /* synthetic */ List P;

        public a(ArrayList arrayList) {
            this.P = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (pf pfVar : this.P) {
                pfVar.a(qf.this.e);
            }
        }
    }

    public qf(Context context, bw0 bw0Var) {
        this.b = context.getApplicationContext();
        this.a = bw0Var;
    }

    public abstract T a();

    public final void b(T t) {
        synchronized (this.c) {
            T t2 = this.e;
            if (t2 != t && (t2 == null || !t2.equals(t))) {
                this.e = t;
                ((b71) this.a).c.execute(new a(new ArrayList(this.d)));
            }
        }
    }

    public abstract void c();

    public abstract void d();
}