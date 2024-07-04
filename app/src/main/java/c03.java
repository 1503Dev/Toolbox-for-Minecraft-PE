package defpackage;

import android.net.Uri;
import java.util.Map;

/* renamed from: c03  reason: default package */
public final class c03 implements fv4 {
    public final fv4 a;
    public final long b;
    public final fv4 c;
    public long d;
    public Uri e;

    public c03(mr4 mr4Var, int i, fv4 fv4Var) {
        this.a = mr4Var;
        this.b = i;
        this.c = fv4Var;
    }

    @Override // defpackage.fv4
    public final long a(kz4 kz4Var) {
        kz4 kz4Var2;
        this.e = kz4Var.a;
        long j = kz4Var.d;
        long j2 = this.b;
        kz4 kz4Var3 = null;
        if (j >= j2) {
            kz4Var2 = null;
        } else {
            long j3 = kz4Var.e;
            long j4 = j2 - j;
            if (j3 != -1) {
                j4 = Math.min(j3, j4);
            }
            kz4Var2 = new kz4(kz4Var.a, j, j, j4, 0);
        }
        long j5 = kz4Var.e;
        if (j5 == -1 || kz4Var.d + j5 > this.b) {
            long max = Math.max(this.b, kz4Var.d);
            long j6 = kz4Var.e;
            kz4Var3 = new kz4(kz4Var.a, max, max, j6 != -1 ? Math.min(j6, (kz4Var.d + j6) - this.b) : -1L, 0);
        }
        long a = kz4Var2 != null ? this.a.a(kz4Var2) : 0L;
        long a2 = kz4Var3 != null ? this.c.a(kz4Var3) : 0L;
        this.d = kz4Var.d;
        if (a == -1 || a2 == -1) {
            return -1L;
        }
        return a + a2;
    }

    @Override // defpackage.fv4
    public final Map b() {
        return sw4.V;
    }

    @Override // defpackage.fv4
    public final void c(bf5 bf5Var) {
    }

    @Override // defpackage.fv4
    public final Uri d() {
        return this.e;
    }

    @Override // defpackage.fv4
    public final void i() {
        this.a.i();
        this.c.i();
    }

    @Override // defpackage.gv5
    public final int x(byte[] bArr, int i, int i2) {
        int i3;
        long j = this.d;
        long j2 = this.b;
        if (j < j2) {
            int x = this.a.x(bArr, i, (int) Math.min(i2, j2 - j));
            long j3 = this.d + x;
            this.d = j3;
            i3 = x;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j >= this.b) {
            int x2 = this.c.x(bArr, i + i3, i2 - i3);
            int i4 = i3 + x2;
            this.d += x2;
            return i4;
        }
        return i3;
    }
}