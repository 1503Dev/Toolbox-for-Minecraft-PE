package defpackage;

import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;

/* renamed from: nx4  reason: default package */
public final class nx4 {
    public static final nx4 d = new nx4();
    @CheckForNull
    public final Runnable a;
    @CheckForNull
    public final Executor b;
    @CheckForNull
    public nx4 c;

    public nx4() {
        this.a = null;
        this.b = null;
    }

    public nx4(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}