package defpackage;

/* renamed from: sy3  reason: default package */
public final class sy3 {
    public boolean a;

    public final synchronized void a() {
        boolean z = false;
        while (!this.a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean b() {
        if (this.a) {
            return false;
        }
        this.a = true;
        notifyAll();
        return true;
    }
}