package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: b03  reason: default package */
public final class b03 extends xq4 {
    public final Context e;
    public final fv4 f;
    public final String g;
    public final int h;
    public final boolean i;
    public InputStream j;
    public boolean k;
    public Uri l;
    public volatile y42 m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public long r;
    public dz4 s;
    public final AtomicLong t;
    public final ee4 u;

    public b03(Context context, fv4 fv4Var, String str, int i, l03 l03Var, ee4 ee4Var) {
        super(false);
        this.e = context;
        this.f = fv4Var;
        this.u = ee4Var;
        this.g = str;
        this.h = i;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = 0L;
        this.t = new AtomicLong(-1L);
        this.s = null;
        this.i = ((Boolean) w82.d.c.a(x92.x1)).booleanValue();
        c(l03Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0200  */
    /* JADX WARN: Type inference failed for: r11v1, types: [bx2, b52] */
    /* JADX WARN: Type inference failed for: r3v21, types: [long] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45 */
    @Override // defpackage.fv4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(kz4 kz4Var) {
        v42 v42Var;
        boolean z;
        boolean z2;
        boolean z3;
        long j;
        n92 n92Var;
        boolean z4;
        boolean z5;
        long elapsedRealtime;
        StringBuilder sb;
        h52 h52Var;
        if (!this.k) {
            boolean z6 = true;
            this.k = true;
            this.l = kz4Var.a;
            if (!this.i) {
                h(kz4Var);
            }
            this.m = y42.c(kz4Var.a);
            l92 l92Var = x92.z3;
            w82 w82Var = w82.d;
            if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                if (this.m != null) {
                    this.m.W = kz4Var.d;
                    this.m.X = pt4.b(this.g);
                    this.m.Y = this.h;
                    if (this.m.V) {
                        n92Var = x92.B3;
                    } else {
                        n92Var = x92.A3;
                    }
                    ?? longValue = ((Long) w82Var.c.a(n92Var)).longValue();
                    jv5 jv5Var = jv5.A;
                    jv5Var.j.getClass();
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    ?? k = da2.k(this.e, this.m);
                    try {
                        try {
                            h52Var = (h52) k.get(longValue, TimeUnit.MILLISECONDS);
                        } catch (Throwable th) {
                            th = th;
                            z6 = longValue;
                        }
                        try {
                            this.n = h52Var.b;
                            this.p = h52Var.c;
                            this.q = h52Var.e;
                            this.r = h52Var.d;
                        } catch (InterruptedException unused) {
                            z5 = true;
                            k.cancel(true);
                            Thread.currentThread().interrupt();
                            jv5.A.j.getClass();
                            elapsedRealtime = SystemClock.elapsedRealtime() - elapsedRealtime2;
                            xx2 xx2Var = ((l03) this.u.Q).a0;
                            if (xx2Var != null) {
                                xx2Var.e(elapsedRealtime, z5);
                            }
                            this.o = z5;
                            sb = new StringBuilder();
                            longValue = z5;
                            sb.append("Cache connection took ");
                            sb.append(elapsedRealtime);
                            sb.append("ms");
                            vz3.k(sb.toString());
                            this.o = false;
                            if (this.m != null) {
                            }
                            return this.f.a(kz4Var);
                        } catch (ExecutionException | TimeoutException unused2) {
                            z4 = true;
                            k.cancel(true);
                            jv5.A.j.getClass();
                            elapsedRealtime = SystemClock.elapsedRealtime() - elapsedRealtime2;
                            xx2 xx2Var2 = ((l03) this.u.Q).a0;
                            if (xx2Var2 != null) {
                                xx2Var2.e(elapsedRealtime, z4);
                            }
                            this.o = z4;
                            sb = new StringBuilder();
                            longValue = z4;
                            sb.append("Cache connection took ");
                            sb.append(elapsedRealtime);
                            sb.append("ms");
                            vz3.k(sb.toString());
                            this.o = false;
                            if (this.m != null) {
                            }
                            return this.f.a(kz4Var);
                        } catch (Throwable th2) {
                            th = th2;
                            jv5.A.j.getClass();
                            long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime2;
                            xx2 xx2Var3 = ((l03) this.u.Q).a0;
                            if (xx2Var3 != null) {
                                xx2Var3.e(elapsedRealtime3, z6);
                            }
                            this.o = z6;
                            vz3.k("Cache connection took " + elapsedRealtime3 + "ms");
                            throw th;
                        }
                    } catch (InterruptedException unused3) {
                        z5 = false;
                    } catch (ExecutionException | TimeoutException unused4) {
                        z4 = false;
                    } catch (Throwable th3) {
                        th = th3;
                        z6 = false;
                    }
                    if (!k()) {
                        this.j = h52Var.a;
                        if (this.i) {
                            h(kz4Var);
                        }
                        jv5Var.j.getClass();
                        long elapsedRealtime4 = SystemClock.elapsedRealtime() - elapsedRealtime2;
                        xx2 xx2Var4 = ((l03) this.u.Q).a0;
                        if (xx2Var4 != null) {
                            xx2Var4.e(elapsedRealtime4, true);
                        }
                        this.o = true;
                        vz3.k("Cache connection took " + elapsedRealtime4 + "ms");
                        return -1L;
                    }
                    jv5Var.j.getClass();
                    long elapsedRealtime5 = SystemClock.elapsedRealtime() - elapsedRealtime2;
                    xx2 xx2Var5 = ((l03) this.u.Q).a0;
                    if (xx2Var5 != null) {
                        xx2Var5.e(elapsedRealtime5, true);
                    }
                    this.o = true;
                    sb = new StringBuilder();
                    sb.append("Cache connection took ");
                    sb.append(elapsedRealtime5);
                    sb.append("ms");
                    vz3.k(sb.toString());
                }
            } else {
                if (this.m != null) {
                    this.m.W = kz4Var.d;
                    this.m.X = pt4.b(this.g);
                    this.m.Y = this.h;
                    v42Var = jv5.A.i.a(this.m);
                } else {
                    v42Var = null;
                }
                if (v42Var != null && v42Var.d()) {
                    synchronized (v42Var) {
                        z = v42Var.Q;
                    }
                    this.n = z;
                    synchronized (v42Var) {
                        z2 = v42Var.T;
                    }
                    this.p = z2;
                    synchronized (v42Var) {
                        z3 = v42Var.R;
                    }
                    this.q = z3;
                    synchronized (v42Var) {
                        j = v42Var.S;
                    }
                    this.r = j;
                    this.o = true;
                    if (!k()) {
                        this.j = v42Var.c();
                        if (this.i) {
                            h(kz4Var);
                        }
                        return -1L;
                    }
                }
            }
            this.o = false;
            if (this.m != null) {
                kz4Var = new kz4(Uri.parse(this.m.P), kz4Var.c, kz4Var.d, kz4Var.e, kz4Var.f);
            }
            return this.f.a(kz4Var);
        }
        throw new IOException("Attempt to open an already open GcacheDataSource.");
    }

    @Override // defpackage.fv4
    public final Uri d() {
        return this.l;
    }

    @Override // defpackage.fv4
    public final void i() {
        if (!this.k) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        boolean z = false;
        this.k = false;
        this.l = null;
        z = (this.i && this.j == null) ? true : true;
        InputStream inputStream = this.j;
        if (inputStream != null) {
            gw.j(inputStream);
            this.j = null;
        } else {
            this.f.i();
        }
        if (z) {
            f();
        }
    }

    public final boolean k() {
        if (!this.i) {
            return false;
        }
        l92 l92Var = x92.C3;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue() && !this.p) {
            return true;
        }
        if (!((Boolean) w82Var.c.a(x92.D3)).booleanValue() || this.q) {
            return false;
        }
        return true;
    }

    @Override // defpackage.gv5
    public final int x(byte[] bArr, int i, int i2) {
        if (this.k) {
            InputStream inputStream = this.j;
            int read = inputStream != null ? inputStream.read(bArr, i, i2) : this.f.x(bArr, i, i2);
            if (!this.i || this.j != null) {
                v(read);
            }
            return read;
        }
        throw new IOException("Attempt to read closed GcacheDataSource.");
    }
}