package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: tz2  reason: default package */
public final class tz2 extends oz2 implements bf5 {
    public String S;
    public final fy2 T;
    public boolean U;
    public final sz2 V;
    public final zy2 W;
    public ByteBuffer X;
    public boolean Y;
    public final Object Z;
    public final String a0;
    public final int b0;
    public boolean c0;

    public tz2(gy2 gy2Var, fy2 fy2Var) {
        super(gy2Var);
        et4 jt4Var;
        this.T = fy2Var;
        this.V = new sz2();
        this.W = new zy2();
        this.Z = new Object();
        String U = gy2Var.U();
        if (U == null) {
            jt4Var = rs4.P;
        } else {
            jt4Var = new jt4(U);
        }
        this.a0 = (String) jt4Var.b();
        this.b0 = gy2Var.e();
    }

    @Override // defpackage.bf5
    public final void d() {
    }

    @Override // defpackage.bf5
    public final void g(kz4 kz4Var, boolean z, int i) {
    }

    @Override // defpackage.bf5
    public final void h(kz4 kz4Var, boolean z) {
    }

    @Override // defpackage.bf5
    public final void i(fv4 fv4Var, kz4 kz4Var, boolean z) {
        if (fv4Var instanceof l55) {
            this.V.a.add((l55) fv4Var);
        }
    }

    @Override // defpackage.oz2
    public final void l() {
        this.U = true;
    }

    public final void r() {
        boolean z;
        sz2 sz2Var = this.V;
        Iterator it = sz2Var.a.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((l55) it.next()).b().entrySet()) {
                try {
                    if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                        sz2Var.b = Math.max(sz2Var.b, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                    }
                } catch (RuntimeException unused) {
                }
            }
            it.remove();
        }
        int i = (int) sz2Var.b;
        int a = (int) this.W.a(this.X);
        int position = this.X.position();
        int round = Math.round((position / i) * a);
        int i2 = yx2.P.get();
        int i3 = yx2.Q.get();
        String str = this.S;
        String concat = "cache:".concat(String.valueOf(mv2.m(str, "MD5")));
        long j = round;
        if (round > 0) {
            z = true;
        } else {
            z = false;
        }
        mv2.b.post(new kz2(this, str, concat, position, i, j, a, z, i2, i3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v24, types: [xy2] */
    @Override // defpackage.oz2
    public final boolean t(String str) {
        String str2;
        String str3;
        l55 l55Var;
        l55 l55Var2;
        this.S = str;
        String concat = "cache:".concat(String.valueOf(mv2.m(str, "MD5")));
        int i = 0;
        try {
            o15 o15Var = new o15();
            o15Var.R = this.Q;
            fy2 fy2Var = this.T;
            o15Var.S = fy2Var.d;
            o15Var.T = fy2Var.e;
            o15Var.U = true;
            o15Var.Q = this;
            l55 mo4a = o15Var.mo4a();
            if (this.T.i) {
                mo4a = new xy2(this.P, mo4a, this.a0, this.b0);
            }
            mo4a.a(new kz4(Uri.parse(str), 0L, Collections.emptyMap(), 0L, -1L, 0));
            gy2 gy2Var = (gy2) this.R.get();
            if (gy2Var != null) {
                gy2Var.v(concat, this);
            }
            jv5.A.j.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            n92 n92Var = x92.s;
            w82 w82Var = w82.d;
            long longValue = ((Long) w82Var.c.a(n92Var)).longValue();
            long longValue2 = ((Long) w82Var.c.a(x92.r)).longValue();
            this.X = ByteBuffer.allocate(this.T.c);
            int i2 = 8192;
            byte[] bArr = new byte[8192];
            long j = currentTimeMillis;
            str2 = "error";
            while (true) {
                try {
                    int x = mo4a.x(bArr, i, Math.min(this.X.remaining(), i2));
                    if (x == -1) {
                        this.c0 = true;
                        mv2.b.post(new mz2(this, str, concat, (int) this.W.a(this.X)));
                        return true;
                    }
                    synchronized (this.Z) {
                        if (!this.U) {
                            l55Var = mo4a;
                            l55Var2 = null;
                            this.X.put(bArr, 0, x);
                        } else {
                            l55Var = mo4a;
                            l55Var2 = mo4a;
                        }
                    }
                    if (this.X.remaining() <= 0) {
                        r();
                        return true;
                    }
                    try {
                        if (!this.U) {
                            long currentTimeMillis2 = System.currentTimeMillis();
                            if (currentTimeMillis2 - j >= longValue) {
                                r();
                                j = currentTimeMillis2;
                            }
                            if (currentTimeMillis2 - currentTimeMillis <= 1000 * longValue2) {
                                i = 0;
                                i2 = 8192;
                                mo4a = l55Var;
                            } else {
                                throw new IOException("Timeout exceeded. Limit: " + longValue2 + " sec");
                            }
                        } else {
                            int limit = this.X.limit();
                            throw new IOException("Precache abort at " + limit + " bytes");
                        }
                    } catch (Exception e) {
                        e = e;
                        str3 = l55Var2;
                        String c = ij.c(e.getClass().getCanonicalName(), ":", e.getMessage());
                        sv2.g("Failed to preload url " + str + " Exception: " + c);
                        m(str, concat, str3, c);
                        return false;
                    }
                } catch (Exception e2) {
                    e = e2;
                    str3 = str2;
                    String c2 = ij.c(e.getClass().getCanonicalName(), ":", e.getMessage());
                    sv2.g("Failed to preload url " + str + " Exception: " + c2);
                    m(str, concat, str3, c2);
                    return false;
                }
            }
        } catch (Exception e3) {
            e = e3;
            str2 = "error";
        }
    }
}