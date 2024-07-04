package defpackage;

/* renamed from: mc1  reason: default package */
public final class mc1 {
    public boolean a;

    public final synchronized void a(long j) {
        if (!this.a) {
            try {
                wait(j);
            } catch (InterruptedException unused) {
            }
        }
    }

    public final synchronized void b(boolean z) {
        this.a = z;
        if (z) {
            notifyAll();
        }
    }
}