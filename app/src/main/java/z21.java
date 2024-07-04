package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: z21  reason: default package */
public final /* synthetic */ class z21 implements ThreadFactory {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ z21(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.a;
        boolean z = this.b;
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }
}