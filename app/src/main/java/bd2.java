package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;

/* renamed from: bd2  reason: default package */
public final class bd2 extends c70 {
    public final ad2 a;
    public final Drawable b;
    public final Uri c;
    public final double d;
    public final int e;
    public final int f;

    /* JADX WARN: Can't wrap try/catch for region: R(18:1|(2:2|3)|(15:5|6|7|8|9|10|11|12|13|14|15|16|17|18|19)|34|6|7|8|9|10|11|12|13|14|15|16|17|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
        defpackage.sv2.e("", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
        defpackage.sv2.e("", r4);
        r1 = 1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
        defpackage.sv2.e("", r1);
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
        defpackage.sv2.e("", r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bd2(ad2 ad2Var) {
        Drawable drawable;
        hw e;
        this.a = ad2Var;
        Uri uri = null;
        try {
            e = ad2Var.e();
        } catch (RemoteException e2) {
            sv2.e("", e2);
        }
        if (e != null) {
            drawable = (Drawable) va0.c0(e);
            this.b = drawable;
            uri = this.a.b();
            this.c = uri;
            double d = this.a.c();
            this.d = d;
            int i = -1;
            int i2 = this.a.i();
            this.e = i2;
            i = this.a.d();
            this.f = i;
        }
        drawable = null;
        this.b = drawable;
        uri = this.a.b();
        this.c = uri;
        double d2 = this.a.c();
        this.d = d2;
        int i3 = -1;
        int i22 = this.a.i();
        this.e = i22;
        i3 = this.a.d();
        this.f = i3;
    }

    @Override // defpackage.c70
    public final Drawable a() {
        return this.b;
    }

    @Override // defpackage.c70
    public final double b() {
        return this.d;
    }

    @Override // defpackage.c70
    public final Uri c() {
        return this.c;
    }

    @Override // defpackage.c70
    public final int d() {
        return this.f;
    }

    @Override // defpackage.c70
    public final int e() {
        return this.e;
    }
}