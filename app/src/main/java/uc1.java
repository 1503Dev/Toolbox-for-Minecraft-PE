package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: uc1  reason: default package */
public final class uc1 implements Runnable {
    public final /* synthetic */ tc1 P;

    public uc1(tc1 tc1Var) {
        this.P = tc1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                ic1 poll = this.P.e.poll(60L, TimeUnit.SECONDS);
                if (poll != null) {
                    tc1.b(this.P, poll);
                } else {
                    synchronized (this.P.e) {
                        if (this.P.e.peek() == null) {
                            this.P.f = false;
                            return;
                        }
                    }
                }
            } catch (InterruptedException e) {
                StringBuilder b = e5.b("Native messages thread was interrupted: ");
                b.append(e.toString());
                t1.b(0, 0, b.toString(), true);
            }
        }
    }
}