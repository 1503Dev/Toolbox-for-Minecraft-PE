package defpackage;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* renamed from: yk0  reason: default package */
public final class yk0 implements ThreadFactory {
    public String a = "fonts-androidx";
    public int b = 10;

    /* renamed from: yk0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends Thread {
        public final int P;

        public a(Runnable runnable, String str, int i) {
            super(runnable, str);
            this.P = i;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(this.P);
            super.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new a(runnable, this.a, this.b);
    }
}