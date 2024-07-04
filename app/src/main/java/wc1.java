package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: wc1  reason: default package */
public final class wc1 implements Runnable {
    public final /* synthetic */ String P;
    public final /* synthetic */ ic1 Q;
    public final /* synthetic */ tc1 R;

    public wc1(tc1 tc1Var, String str, ic1 ic1Var) {
        this.R = tc1Var;
        this.P = str;
        this.Q = ic1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tc1 tc1Var = this.R;
        String str = this.P;
        ic1 ic1Var = this.Q;
        synchronized (tc1Var.c) {
            ArrayList<zc1> arrayList = tc1Var.c.get(str);
            if (arrayList != null) {
                ArrayList arrayList2 = new ArrayList(arrayList);
                rc1 rc1Var = new rc1(ic1Var);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    try {
                        ((zc1) it.next()).a(rc1Var);
                    } catch (RuntimeException e) {
                        ga1.h().n().d(0, 0, e.toString(), true);
                        e.printStackTrace();
                        return;
                    }
                }
            }
        }
    }
}