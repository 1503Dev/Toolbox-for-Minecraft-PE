package defpackage;

/* renamed from: xh4  reason: default package */
public final class xh4 {
    public final kd a;
    public final Object b = new Object();
    public volatile int d = 1;
    public volatile long c = 0;

    public xh4(kd kdVar) {
        this.a = kdVar;
    }

    public final void a() {
        long a = this.a.a();
        synchronized (this.b) {
            if (this.d == 3) {
                if (this.c + ((Long) w82.d.c.a(x92.T4)).longValue() <= a) {
                    this.d = 1;
                }
            }
        }
    }

    public final void b(int i, int i2) {
        a();
        long a = this.a.a();
        synchronized (this.b) {
            if (this.d != i) {
                return;
            }
            this.d = i2;
            if (this.d == 3) {
                this.c = a;
            }
        }
    }
}