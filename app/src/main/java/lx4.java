package defpackage;

import javax.annotation.CheckForNull;

/* renamed from: lx4  reason: default package */
public final class lx4 {
    @CheckForNull
    public static final lx4 c;
    @CheckForNull
    public static final lx4 d;
    public final boolean a;
    @CheckForNull
    public final Throwable b;

    static {
        if (vx4.S) {
            d = null;
            c = null;
            return;
        }
        d = new lx4(false, null);
        c = new lx4(true, null);
    }

    public lx4(boolean z, @CheckForNull Throwable th) {
        this.a = z;
        this.b = th;
    }
}