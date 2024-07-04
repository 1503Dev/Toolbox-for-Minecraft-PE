package defpackage;

import java.lang.Thread;

/* renamed from: gp2  reason: default package */
public final class gp2 implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ Thread.UncaughtExceptionHandler a;
    public final /* synthetic */ ip2 b;

    public gp2(ip2 ip2Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.b = ip2Var;
        this.a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            try {
                this.b.e(th);
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            } catch (Throwable th2) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.a;
                if (uncaughtExceptionHandler2 != null) {
                    uncaughtExceptionHandler2.uncaughtException(thread, th);
                }
                throw th2;
            }
        } catch (Throwable unused) {
            sv2.d("AdMob exception reporter failed reporting the exception.");
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = this.a;
            if (uncaughtExceptionHandler3 != null) {
                uncaughtExceptionHandler3.uncaughtException(thread, th);
            }
        }
    }
}