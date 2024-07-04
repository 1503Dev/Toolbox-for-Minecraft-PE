package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: qv1  reason: default package */
public final class qv1 {
    public static final boolean c = rv1.a;
    public final ArrayList a = new ArrayList();
    public boolean b = false;

    public final synchronized void a(String str, long j) {
        if (this.b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.a.add(new pv1(j, str, SystemClock.elapsedRealtime()));
    }

    public final synchronized void b(String str) {
        ArrayList arrayList;
        long j;
        this.b = true;
        if (this.a.size() == 0) {
            j = 0;
        } else {
            j = ((pv1) this.a.get(arrayList.size() - 1)).c - ((pv1) this.a.get(0)).c;
        }
        if (j <= 0) {
            return;
        }
        long j2 = ((pv1) this.a.get(0)).c;
        rv1.a("(%-4d ms) %s", Long.valueOf(j), str);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            pv1 pv1Var = (pv1) it.next();
            long j3 = pv1Var.c;
            rv1.a("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(pv1Var.b), pv1Var.a);
            j2 = j3;
        }
    }

    public final void finalize() {
        if (this.b) {
            return;
        }
        b("Request on the loose");
        rv1.b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}