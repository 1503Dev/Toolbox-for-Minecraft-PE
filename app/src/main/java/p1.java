package defpackage;

import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: p1  reason: default package */
public final class p1 implements Runnable {
    public final /* synthetic */ Object P;
    public final /* synthetic */ Object Q;

    public p1(Object obj, Object obj2) {
        this.P = obj;
        this.Q = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Method method = o1.d;
            if (method != null) {
                method.invoke(this.P, this.Q, Boolean.FALSE, "AppCompat recreation");
            } else {
                o1.e.invoke(this.P, this.Q, Boolean.FALSE);
            }
        } catch (RuntimeException e) {
            if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                throw e;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}