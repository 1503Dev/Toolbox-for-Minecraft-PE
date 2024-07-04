package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: cx0  reason: default package */
public class cx0 {
    public static final a d = new a();
    public boolean a;
    public long b;
    public long c;

    /* renamed from: cx0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends cx0 {
        @Override // defpackage.cx0
        public final cx0 d(long j) {
            return this;
        }

        @Override // defpackage.cx0
        public final void f() {
        }

        @Override // defpackage.cx0
        public final cx0 g(long j, TimeUnit timeUnit) {
            return this;
        }
    }

    public cx0 a() {
        this.a = false;
        return this;
    }

    public cx0 b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline");
    }

    public cx0 d(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public cx0 g(long j, TimeUnit timeUnit) {
        if (j >= 0) {
            if (timeUnit != null) {
                this.c = timeUnit.toNanos(j);
                return this;
            }
            throw new IllegalArgumentException("unit == null");
        }
        throw new IllegalArgumentException("timeout < 0: " + j);
    }

    public long h() {
        return this.c;
    }
}