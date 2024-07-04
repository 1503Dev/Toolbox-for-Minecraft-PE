package defpackage;

import android.net.Uri;

/* renamed from: mr4  reason: default package */
public final class mr4 extends xq4 {
    public final byte[] e;
    public Uri f;
    public int g;
    public int h;
    public boolean i;

    public mr4(byte[] bArr) {
        super(false);
        bArr.getClass();
        tv2.G(bArr.length > 0);
        this.e = bArr;
    }

    @Override // defpackage.fv4
    public final long a(kz4 kz4Var) {
        this.f = kz4Var.a;
        g(kz4Var);
        long j = kz4Var.d;
        int length = this.e.length;
        if (j <= length) {
            int i = (int) j;
            this.g = i;
            int i2 = length - i;
            this.h = i2;
            long j2 = kz4Var.e;
            if (j2 != -1) {
                this.h = (int) Math.min(i2, j2);
            }
            this.i = true;
            h(kz4Var);
            long j3 = kz4Var.e;
            return j3 != -1 ? j3 : this.h;
        }
        throw new bw4(2008);
    }

    @Override // defpackage.fv4
    public final Uri d() {
        return this.f;
    }

    @Override // defpackage.fv4
    public final void i() {
        if (this.i) {
            this.i = false;
            f();
        }
        this.f = null;
    }

    @Override // defpackage.gv5
    public final int x(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.e, this.g, bArr, i, min);
        this.g += min;
        this.h -= min;
        v(min);
        return min;
    }
}