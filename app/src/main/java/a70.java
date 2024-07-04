package defpackage;

/* renamed from: a70  reason: default package */
public abstract class a70 implements Runnable {
    public final String P;

    public a70(String str, Object... objArr) {
        this.P = c31.j(str, objArr);
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.P);
        try {
            b();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}