package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: xy2  reason: default package */
public final class xy2 implements fv4 {
    public final Context a;
    public final fv4 b;
    public final String c;
    public final int d;
    public final boolean e;
    public InputStream f;
    public boolean g;
    public Uri h;
    public volatile y42 i;
    public boolean j = false;
    public boolean k = false;
    public kz4 l;

    public xy2(Context context, l55 l55Var, String str, int i) {
        this.a = context;
        this.b = l55Var;
        this.c = str;
        this.d = i;
        new AtomicLong(-1L);
        this.e = ((Boolean) w82.d.c.a(x92.x1)).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.fv4
    public final long a(kz4 kz4Var) {
        boolean z;
        boolean z2;
        n92 n92Var;
        if (!this.g) {
            this.g = true;
            Uri uri = kz4Var.a;
            this.h = uri;
            this.l = kz4Var;
            this.i = y42.c(uri);
            l92 l92Var = x92.z3;
            w82 w82Var = w82.d;
            v42 v42Var = 0;
            if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                if (this.i != null) {
                    this.i.W = kz4Var.d;
                    this.i.X = pt4.b(this.c);
                    this.i.Y = this.d;
                    if (this.i.V) {
                        n92Var = x92.B3;
                    } else {
                        n92Var = x92.A3;
                    }
                    long longValue = ((Long) w82Var.c.a(n92Var)).longValue();
                    jv5 jv5Var = jv5.A;
                    jv5Var.j.getClass();
                    SystemClock.elapsedRealtime();
                    b52 k = da2.k(this.a, this.i);
                    try {
                        h52 h52Var = (h52) k.get(longValue, TimeUnit.MILLISECONDS);
                        h52Var.getClass();
                        this.j = h52Var.c;
                        this.k = h52Var.e;
                        if (!f()) {
                            this.f = h52Var.a;
                            jv5Var.j.getClass();
                            SystemClock.elapsedRealtime();
                            throw null;
                        }
                        jv5Var.j.getClass();
                        SystemClock.elapsedRealtime();
                        throw null;
                    } catch (InterruptedException unused) {
                        k.cancel(false);
                        Thread.currentThread().interrupt();
                        jv5.A.j.getClass();
                        SystemClock.elapsedRealtime();
                        throw null;
                    } catch (ExecutionException | TimeoutException unused2) {
                        k.cancel(false);
                        jv5.A.j.getClass();
                        SystemClock.elapsedRealtime();
                        throw null;
                    }
                }
            } else {
                if (this.i != null) {
                    this.i.W = kz4Var.d;
                    this.i.X = pt4.b(this.c);
                    this.i.Y = this.d;
                    v42Var = jv5.A.i.a(this.i);
                }
                if (v42Var != 0 && v42Var.d()) {
                    synchronized (v42Var) {
                        z = v42Var.T;
                    }
                    this.j = z;
                    synchronized (v42Var) {
                        z2 = v42Var.R;
                    }
                    this.k = z2;
                    if (!f()) {
                        this.f = v42Var.c();
                        return -1L;
                    }
                }
            }
            if (this.i != null) {
                this.l = new kz4(Uri.parse(this.i.P), kz4Var.c, kz4Var.d, kz4Var.e, kz4Var.f);
            }
            return this.b.a(this.l);
        }
        throw new IOException("Attempt to open an already open CacheDataSource.");
    }

    @Override // defpackage.fv4
    public final /* synthetic */ Map b() {
        return Collections.emptyMap();
    }

    @Override // defpackage.fv4
    public final void c(bf5 bf5Var) {
    }

    @Override // defpackage.fv4
    public final Uri d() {
        return this.h;
    }

    public final boolean f() {
        if (!this.e) {
            return false;
        }
        l92 l92Var = x92.C3;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue() && !this.j) {
            return true;
        }
        if (!((Boolean) w82Var.c.a(x92.D3)).booleanValue() || this.k) {
            return false;
        }
        return true;
    }

    @Override // defpackage.fv4
    public final void i() {
        if (!this.g) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.g = false;
        this.h = null;
        InputStream inputStream = this.f;
        if (inputStream == null) {
            this.b.i();
            return;
        }
        gw.j(inputStream);
        this.f = null;
    }

    @Override // defpackage.gv5
    public final int x(byte[] bArr, int i, int i2) {
        if (this.g) {
            InputStream inputStream = this.f;
            return inputStream != null ? inputStream.read(bArr, i, i2) : this.b.x(bArr, i, i2);
        }
        throw new IOException("Attempt to read closed CacheDataSource.");
    }
}