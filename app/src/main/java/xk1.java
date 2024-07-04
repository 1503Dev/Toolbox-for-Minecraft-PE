package defpackage;

/* renamed from: xk1  reason: default package */
public final class xk1 {
    public boolean a = false;
    public float b = 1.0f;

    public final synchronized float a() {
        float f;
        boolean z;
        synchronized (this) {
            f = this.b;
            if (f >= 0.0f) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            return f;
        }
        return 1.0f;
    }
}