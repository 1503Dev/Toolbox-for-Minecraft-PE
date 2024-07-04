package defpackage;

/* renamed from: aw0  reason: default package */
public final class aw0<TResult> {
    public final ay5<TResult> a = new ay5<>();

    public final void a(Exception exc) {
        ay5<TResult> ay5Var = this.a;
        ay5Var.getClass();
        if (exc != null) {
            synchronized (ay5Var.a) {
                if (!ay5Var.c) {
                    ay5Var.c = true;
                    ay5Var.f = exc;
                    ay5Var.b.b(ay5Var);
                    return;
                }
                return;
            }
        }
        throw new NullPointerException("Exception must not be null");
    }
}