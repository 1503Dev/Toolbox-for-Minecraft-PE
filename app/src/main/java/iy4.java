package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* renamed from: iy4  reason: default package */
public abstract class iy4 extends sx4 {
    public static final fy4 Y;
    public static final Logger Z = Logger.getLogger(iy4.class.getName());
    @CheckForNull
    public volatile Set<Throwable> W = null;
    public volatile int X;

    static {
        Throwable th;
        fy4 hy4Var;
        try {
            hy4Var = new gy4(AtomicReferenceFieldUpdater.newUpdater(iy4.class, Set.class, "W"), AtomicIntegerFieldUpdater.newUpdater(iy4.class, "X"));
            th = null;
        } catch (Error | RuntimeException e) {
            th = e;
            hy4Var = new hy4();
        }
        Throwable th2 = th;
        Y = hy4Var;
        if (th2 != null) {
            Z.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
    }

    public iy4(int i) {
        this.X = i;
    }
}