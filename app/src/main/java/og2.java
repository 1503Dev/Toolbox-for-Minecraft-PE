package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: og2  reason: default package */
public final class og2 {
    public boolean a = false;
    public boolean b = false;
    public float c = 0.0f;
    public final AtomicBoolean d = new AtomicBoolean(false);

    public final synchronized boolean a(boolean z) {
        if (this.d.get()) {
            return this.a;
        }
        return z;
    }
}