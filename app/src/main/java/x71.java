package defpackage;

import android.content.Context;
import android.database.Cursor;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

/* renamed from: x71  reason: default package */
public final class x71 implements Runnable {
    public static final String i0 = y20.e("WorkerWrapper");
    public Context P;
    public String Q;
    public List<mn0> R;
    public WorkerParameters.a S;
    public l71 T;
    public bw0 V;
    public androidx.work.a X;
    public dr Y;
    public WorkDatabase Z;
    public m71 a0;
    public pk b0;
    public p71 c0;
    public ArrayList d0;
    public String e0;
    public volatile boolean h0;
    public ListenableWorker.a W = new ListenableWorker.a.C0012a();
    public yq0<Boolean> f0 = new yq0<>();
    public i20<ListenableWorker.a> g0 = null;
    public ListenableWorker U = null;

    /* renamed from: x71$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        public Context a;
        public dr b;
        public bw0 c;
        public androidx.work.a d;
        public WorkDatabase e;
        public String f;
        public List<mn0> g;
        public WorkerParameters.a h = new WorkerParameters.a();

        public a(Context context, androidx.work.a aVar, bw0 bw0Var, dr drVar, WorkDatabase workDatabase, String str) {
            this.a = context.getApplicationContext();
            this.c = bw0Var;
            this.b = drVar;
            this.d = aVar;
            this.e = workDatabase;
            this.f = str;
        }
    }

    public x71(a aVar) {
        this.P = aVar.a;
        this.V = aVar.c;
        this.Y = aVar.b;
        this.Q = aVar.f;
        this.R = aVar.g;
        this.S = aVar.h;
        this.X = aVar.d;
        WorkDatabase workDatabase = aVar.e;
        this.Z = workDatabase;
        this.a0 = workDatabase.n();
        this.b0 = this.Z.i();
        this.c0 = this.Z.o();
    }

    public final void b(ListenableWorker.a aVar) {
        if (aVar instanceof ListenableWorker.a.c) {
            y20.c().d(i0, String.format("Worker result SUCCESS for %s", this.e0), new Throwable[0]);
            if (!this.T.c()) {
                this.Z.c();
                try {
                    ((n71) this.a0).p(y61.SUCCEEDED, this.Q);
                    ((n71) this.a0).n(this.Q, ((ListenableWorker.a.c) this.W).a);
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator it = ((qk) this.b0).a(this.Q).iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (((n71) this.a0).f(str) == y61.BLOCKED && ((qk) this.b0).b(str)) {
                            y20.c().d(i0, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                            ((n71) this.a0).p(y61.ENQUEUED, str);
                            ((n71) this.a0).o(str, currentTimeMillis);
                        }
                    }
                    this.Z.h();
                    return;
                } finally {
                    this.Z.f();
                    g(false);
                }
            }
        } else if (aVar instanceof ListenableWorker.a.b) {
            y20.c().d(i0, String.format("Worker result RETRY for %s", this.e0), new Throwable[0]);
            e();
            return;
        } else {
            y20.c().d(i0, String.format("Worker result FAILURE for %s", this.e0), new Throwable[0]);
            if (!this.T.c()) {
                i();
                return;
            }
        }
        f();
    }

    public final void c(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (((n71) this.a0).f(str2) != y61.CANCELLED) {
                ((n71) this.a0).p(y61.FAILED, str2);
            }
            linkedList.addAll(((qk) this.b0).a(str2));
        }
    }

    public final void d() {
        if (!j()) {
            this.Z.c();
            try {
                y61 f = ((n71) this.a0).f(this.Q);
                ((h71) this.Z.m()).a(this.Q);
                if (f == null) {
                    g(false);
                } else if (f == y61.RUNNING) {
                    b(this.W);
                } else if (!f.b()) {
                    e();
                }
                this.Z.h();
            } finally {
                this.Z.f();
            }
        }
        List<mn0> list = this.R;
        if (list != null) {
            for (mn0 mn0Var : list) {
                mn0Var.b(this.Q);
            }
            nn0.a(this.X, this.Z, this.R);
        }
    }

    public final void e() {
        this.Z.c();
        try {
            ((n71) this.a0).p(y61.ENQUEUED, this.Q);
            ((n71) this.a0).o(this.Q, System.currentTimeMillis());
            ((n71) this.a0).l(this.Q, -1L);
            this.Z.h();
        } finally {
            this.Z.f();
            g(true);
        }
    }

    public final void f() {
        this.Z.c();
        try {
            ((n71) this.a0).o(this.Q, System.currentTimeMillis());
            ((n71) this.a0).p(y61.ENQUEUED, this.Q);
            ((n71) this.a0).m(this.Q);
            ((n71) this.a0).l(this.Q, -1L);
            this.Z.h();
        } finally {
            this.Z.f();
            g(false);
        }
    }

    public final void g(boolean z) {
        boolean z2;
        ListenableWorker listenableWorker;
        this.Z.c();
        try {
            n71 n71Var = (n71) this.Z.n();
            n71Var.getClass();
            em0 a2 = em0.a(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
            n71Var.a.b();
            Cursor g = n71Var.a.g(a2);
            if (g.moveToFirst() && g.getInt(0) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            g.close();
            a2.F();
            if (!z2) {
                kd0.a(this.P, RescheduleReceiver.class, false);
            }
            if (z) {
                ((n71) this.a0).p(y61.ENQUEUED, this.Q);
                ((n71) this.a0).l(this.Q, -1L);
            }
            if (this.T != null && (listenableWorker = this.U) != null && listenableWorker.isRunInForeground()) {
                dr drVar = this.Y;
                String str = this.Q;
                eg0 eg0Var = (eg0) drVar;
                synchronized (eg0Var.Z) {
                    eg0Var.U.remove(str);
                    eg0Var.g();
                }
            }
            this.Z.h();
            this.Z.f();
            this.f0.j(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.Z.f();
            throw th;
        }
    }

    public final void h() {
        y61 f = ((n71) this.a0).f(this.Q);
        if (f == y61.RUNNING) {
            y20.c().a(i0, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.Q), new Throwable[0]);
            g(true);
            return;
        }
        y20.c().a(i0, String.format("Status for %s is %s; not doing any work", this.Q, f), new Throwable[0]);
        g(false);
    }

    public final void i() {
        this.Z.c();
        try {
            c(this.Q);
            b bVar = ((ListenableWorker.a.C0012a) this.W).a;
            ((n71) this.a0).n(this.Q, bVar);
            this.Z.h();
        } finally {
            this.Z.f();
            g(false);
        }
    }

    public final boolean j() {
        if (this.h0) {
            y20.c().a(i0, String.format("Work interrupted for %s", this.e0), new Throwable[0]);
            y61 f = ((n71) this.a0).f(this.Q);
            if (f == null) {
                g(false);
            } else {
                g(!f.b());
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ba, code lost:
        if (r1 != false) goto L96;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        b a2;
        boolean z2;
        boolean z3;
        ArrayList a3 = ((q71) this.c0).a(this.Q);
        this.d0 = a3;
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.Q);
        sb.append(", tags={ ");
        Iterator it = a3.iterator();
        boolean z4 = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z4) {
                z4 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        this.e0 = sb.toString();
        y61 y61Var = y61.ENQUEUED;
        if (!j()) {
            this.Z.c();
            try {
                l71 i = ((n71) this.a0).i(this.Q);
                this.T = i;
                if (i == null) {
                    y20.c().b(i0, String.format("Didn't find WorkSpec for id %s", this.Q), new Throwable[0]);
                    g(false);
                } else if (i.b != y61Var) {
                    h();
                    this.Z.h();
                    y20.c().a(i0, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.T.c), new Throwable[0]);
                } else {
                    if (!i.c()) {
                        l71 l71Var = this.T;
                        if (l71Var.b == y61Var && l71Var.k > 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    l71 l71Var2 = this.T;
                    if (l71Var2.n == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z && currentTimeMillis < l71Var2.a()) {
                        y20.c().a(i0, String.format("Delaying execution for %s because it is being executed before schedule.", this.T.c), new Throwable[0]);
                        g(true);
                    }
                    this.Z.h();
                    this.Z.f();
                    if (this.T.c()) {
                        a2 = this.T.e;
                    } else {
                        sx sxVar = this.X.d;
                        String str2 = this.T.d;
                        sxVar.getClass();
                        String str3 = rx.a;
                        rx rxVar = null;
                        try {
                            rxVar = (rx) Class.forName(str2).newInstance();
                        } catch (Exception e) {
                            y20.c().b(rx.a, k6.b("Trouble instantiating + ", str2), e);
                        }
                        if (rxVar == null) {
                            y20.c().b(i0, String.format("Could not create Input Merger %s", this.T.d), new Throwable[0]);
                            i();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.T.e);
                        m71 m71Var = this.a0;
                        String str4 = this.Q;
                        n71 n71Var = (n71) m71Var;
                        n71Var.getClass();
                        em0 a4 = em0.a(1, "SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                        if (str4 == null) {
                            a4.y(1);
                        } else {
                            a4.E(1, str4);
                        }
                        n71Var.a.b();
                        Cursor g = n71Var.a.g(a4);
                        try {
                            ArrayList arrayList2 = new ArrayList(g.getCount());
                            while (g.moveToNext()) {
                                arrayList2.add(b.a(g.getBlob(0)));
                            }
                            g.close();
                            a4.F();
                            arrayList.addAll(arrayList2);
                            a2 = rxVar.a(arrayList);
                        } catch (Throwable th) {
                            g.close();
                            a4.F();
                            throw th;
                        }
                    }
                    b bVar = a2;
                    UUID fromString = UUID.fromString(this.Q);
                    ArrayList arrayList3 = this.d0;
                    WorkerParameters.a aVar = this.S;
                    int i2 = this.T.k;
                    androidx.work.a aVar2 = this.X;
                    WorkerParameters workerParameters = new WorkerParameters(fromString, bVar, arrayList3, aVar, i2, aVar2.a, this.V, aVar2.c, new j71(this.Z, this.V), new x61(this.Z, this.Y, this.V));
                    if (this.U == null) {
                        this.U = this.X.c.a(this.P, this.T.c, workerParameters);
                    }
                    ListenableWorker listenableWorker = this.U;
                    if (listenableWorker == null) {
                        y20.c().b(i0, String.format("Could not create Worker %s", this.T.c), new Throwable[0]);
                    } else if (listenableWorker.isUsed()) {
                        y20.c().b(i0, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.T.c), new Throwable[0]);
                    } else {
                        this.U.setUsed();
                        this.Z.c();
                        try {
                            if (((n71) this.a0).f(this.Q) == y61Var) {
                                ((n71) this.a0).p(y61.RUNNING, this.Q);
                                ((n71) this.a0).k(this.Q);
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            this.Z.h();
                            if (z2) {
                                if (!j()) {
                                    yq0 yq0Var = new yq0();
                                    v61 v61Var = new v61(this.P, this.T, this.U, workerParameters.j, this.V);
                                    ((b71) this.V).c.execute(v61Var);
                                    yq0<Void> yq0Var2 = v61Var.P;
                                    yq0Var2.c(new v71(this, yq0Var2, yq0Var), ((b71) this.V).c);
                                    yq0Var.c(new w71(this, yq0Var, this.e0), ((b71) this.V).a);
                                    return;
                                }
                                return;
                            }
                            h();
                            return;
                        } finally {
                        }
                    }
                    i();
                    return;
                }
                this.Z.h();
            } finally {
            }
        }
    }
}