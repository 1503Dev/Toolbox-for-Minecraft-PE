package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: be1  reason: default package */
public final class be1 implements zc1 {

    /* renamed from: be1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Runnable {
        public final /* synthetic */ rc1 P;

        /* renamed from: be1$a$a  reason: collision with other inner class name */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class RunnableC0017a implements Runnable {
            public final /* synthetic */ ic1 P;

            public RunnableC0017a(ic1 ic1Var) {
                this.P = ic1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.this.P.a(this.P).b();
            }
        }

        public a(rc1 rc1Var) {
            this.P = rc1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            he1 l = ga1.h().l();
            l.getClass();
            ArrayList arrayList = new ArrayList(Collections.singletonList(l.c()));
            ArrayList arrayList2 = new ArrayList();
            if (l.a.a) {
                arrayList.add(l.b());
            } else {
                arrayList2.add(new ce1(l));
            }
            if (l.b.a) {
                ic1 ic1Var = new ic1();
                eb1.j(ic1Var, "app_set_id", l.e);
                arrayList.add(ic1Var);
            } else {
                arrayList2.add(new ee1(l));
            }
            if (!arrayList2.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(arrayList2.size());
                ArrayList arrayList4 = new ArrayList();
                try {
                    arrayList4.addAll(newFixedThreadPool.invokeAll(arrayList2));
                    newFixedThreadPool.shutdownNow();
                } catch (Exception unused) {
                }
                for (int i = 0; i < arrayList4.size(); i++) {
                    Future future = (Future) arrayList4.get(i);
                    if (!future.isCancelled()) {
                        try {
                            arrayList3.add(future.get());
                        } catch (Exception unused2) {
                        }
                    } else if (arrayList2.get(i) instanceof ge1) {
                        arrayList3.add(((ge1) arrayList2.get(i)).a());
                    }
                }
                arrayList.addAll(arrayList3);
            }
            eg1.n(new RunnableC0017a(eb1.f((ic1[]) arrayList.toArray(new ic1[0]))));
        }
    }

    @Override // defpackage.zc1
    public final void a(rc1 rc1Var) {
        boolean z;
        try {
            eg1.a.execute(new a(rc1Var));
            z = true;
        } catch (RejectedExecutionException unused) {
            z = false;
        }
        if (!z) {
            ga1.h().n().d(0, 0, "Error retrieving device info, disabling AdColony.", true);
            w1.d();
        }
    }
}