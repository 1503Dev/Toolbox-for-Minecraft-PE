package androidx.work;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class a {
    public final ExecutorService a = a(false);
    public final ExecutorService b = a(true);
    public final t71 c;
    public final sx d;
    public final fk e;
    public final int f;
    public final int g;
    public final int h;

    /* renamed from: androidx.work.a$a  reason: collision with other inner class name */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class C0013a {
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface b {
        a a();
    }

    public a(C0013a c0013a) {
        String str = u71.a;
        this.c = new t71();
        this.d = new sx();
        this.e = new fk(0);
        this.f = 4;
        this.g = Integer.MAX_VALUE;
        this.h = 20;
    }

    public static ExecutorService a(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new cf(z));
    }
}