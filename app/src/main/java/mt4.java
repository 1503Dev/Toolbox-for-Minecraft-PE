package defpackage;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;

/* renamed from: mt4  reason: default package */
public final class mt4 extends xq4 {
    public kz4 e;
    public byte[] f;
    public int g;
    public int h;

    public mt4() {
        super(false);
    }

    @Override // defpackage.fv4
    public final long a(kz4 kz4Var) {
        g(kz4Var);
        this.e = kz4Var;
        Uri uri = kz4Var.a;
        String scheme = uri.getScheme();
        tv2.H("Unsupported scheme: ".concat(String.valueOf(scheme)), "data".equals(scheme));
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i = zn4.a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e) {
                    throw new jy2("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e, true, 0);
                }
            } else {
                this.f = URLDecoder.decode(str, zs4.a.name()).getBytes(zs4.c);
            }
            long j = kz4Var.d;
            int length = this.f.length;
            if (j <= length) {
                int i2 = (int) j;
                this.g = i2;
                int i3 = length - i2;
                this.h = i3;
                long j2 = kz4Var.e;
                if (j2 != -1) {
                    this.h = (int) Math.min(i3, j2);
                }
                h(kz4Var);
                long j3 = kz4Var.e;
                if (j3 != -1) {
                    return j3;
                }
                return this.h;
            }
            this.f = null;
            throw new bw4(2008);
        }
        throw new jy2("Unexpected URI format: ".concat(String.valueOf(uri)), null, true, 0);
    }

    @Override // defpackage.fv4
    public final Uri d() {
        kz4 kz4Var = this.e;
        if (kz4Var != null) {
            return kz4Var.a;
        }
        return null;
    }

    @Override // defpackage.fv4
    public final void i() {
        if (this.f != null) {
            this.f = null;
            f();
        }
        this.e = null;
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
        byte[] bArr2 = this.f;
        int i4 = zn4.a;
        System.arraycopy(bArr2, this.g, bArr, i, min);
        this.g += min;
        this.h -= min;
        v(min);
        return min;
    }
}