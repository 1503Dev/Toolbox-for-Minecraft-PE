package defpackage;

/* renamed from: mj4  reason: default package */
public final class mj4 {
    public final zk2 a;

    public mj4(zk2 zk2Var) {
        this.a = zk2Var;
    }

    public final boolean a() {
        try {
            return this.a.R();
        } catch (Throwable th) {
            throw new ni4(th);
        }
    }

    public final void b(boolean z) {
        try {
            this.a.T1(z);
        } catch (Throwable th) {
            throw new ni4(th);
        }
    }
}