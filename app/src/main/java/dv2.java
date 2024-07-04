package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: dv2  reason: default package */
public final class dv2 extends f03 {
    public final AtomicReference P = new AtomicReference();
    public boolean Q;

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0002, code lost:
        r3 = r3.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b2(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || obj == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", cls.getCanonicalName(), obj.getClass().getCanonicalName()), e);
            throw e;
        }
    }

    public final Bundle A(long j) {
        Bundle bundle;
        synchronized (this.P) {
            if (!this.Q) {
                try {
                    this.P.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.P.get();
        }
        return bundle;
    }

    public final String Z(long j) {
        return (String) b2(A(j), String.class);
    }

    public final void c0(Bundle bundle) {
        synchronized (this.P) {
            this.P.set(bundle);
            this.Q = true;
            this.P.notify();
        }
    }
}