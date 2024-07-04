package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: fe5  reason: default package */
public final class fe5 implements fv4 {
    public final fv4 a;
    public long b;
    public Uri c;
    public Map d;

    public fe5(fv4 fv4Var) {
        fv4Var.getClass();
        this.a = fv4Var;
        this.c = Uri.EMPTY;
        this.d = Collections.emptyMap();
    }

    @Override // defpackage.fv4
    public final long a(kz4 kz4Var) {
        this.c = kz4Var.a;
        this.d = Collections.emptyMap();
        long a = this.a.a(kz4Var);
        Uri d = d();
        d.getClass();
        this.c = d;
        this.d = b();
        return a;
    }

    @Override // defpackage.fv4
    public final Map b() {
        return this.a.b();
    }

    @Override // defpackage.fv4
    public final void c(bf5 bf5Var) {
        bf5Var.getClass();
        this.a.c(bf5Var);
    }

    @Override // defpackage.fv4
    public final Uri d() {
        return this.a.d();
    }

    @Override // defpackage.fv4
    public final void i() {
        this.a.i();
    }

    @Override // defpackage.gv5
    public final int x(byte[] bArr, int i, int i2) {
        int x = this.a.x(bArr, i, i2);
        if (x != -1) {
            this.b += x;
        }
        return x;
    }
}