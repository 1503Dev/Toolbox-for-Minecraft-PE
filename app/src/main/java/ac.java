package defpackage;

import androidx.work.impl.WorkDatabase;
import defpackage.uc0;
import java.util.LinkedList;

/* renamed from: ac  reason: default package */
public abstract class ac implements Runnable {
    public final vc0 P = new vc0();

    public static void b(a71 a71Var, String str) {
        boolean z;
        WorkDatabase workDatabase = a71Var.h;
        m71 n = workDatabase.n();
        pk i = workDatabase.i();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (true) {
            z = true;
            if (linkedList.isEmpty()) {
                break;
            }
            String str2 = (String) linkedList.remove();
            n71 n71Var = (n71) n;
            y61 f = n71Var.f(str2);
            if (f != y61.SUCCEEDED && f != y61.FAILED) {
                n71Var.p(y61.CANCELLED, str2);
            }
            linkedList.addAll(((qk) i).a(str2));
        }
        eg0 eg0Var = a71Var.k;
        synchronized (eg0Var.Z) {
            y20.c().a(eg0.a0, String.format("Processor cancelling %s", str), new Throwable[0]);
            eg0Var.X.add(str);
            x71 x71Var = (x71) eg0Var.U.remove(str);
            if (x71Var == null) {
                z = false;
            }
            if (x71Var == null) {
                x71Var = (x71) eg0Var.V.remove(str);
            }
            eg0.c(str, x71Var);
            if (z) {
                eg0Var.g();
            }
        }
        for (mn0 mn0Var : a71Var.j) {
            mn0Var.b(str);
        }
    }

    public abstract void c();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            c();
            this.P.a(uc0.a);
        } catch (Throwable th) {
            this.P.a(new uc0.a.C0047a(th));
        }
    }
}