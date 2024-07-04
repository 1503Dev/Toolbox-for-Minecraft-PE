package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: t05  reason: default package */
public final class t05 implements fv4 {
    public final Context a;
    public final ArrayList b = new ArrayList();
    public final fv4 c;
    public k75 d;
    public hq4 e;
    public ws4 f;
    public fv4 g;
    public rg5 h;
    public mt4 i;
    public jd5 j;
    public fv4 k;

    public t05(Context context, l55 l55Var) {
        this.a = context.getApplicationContext();
        this.c = l55Var;
    }

    public static final void h(fv4 fv4Var, bf5 bf5Var) {
        if (fv4Var != null) {
            fv4Var.c(bf5Var);
        }
    }

    @Override // defpackage.fv4
    public final long a(kz4 kz4Var) {
        fv4 fv4Var;
        tv2.I(this.k == null);
        String scheme = kz4Var.a.getScheme();
        Uri uri = kz4Var.a;
        int i = zn4.a;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || "file".equals(scheme2)) {
            String path = kz4Var.a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.d == null) {
                    k75 k75Var = new k75();
                    this.d = k75Var;
                    g(k75Var);
                }
                fv4Var = this.d;
            }
            fv4Var = f();
        } else {
            if (!"asset".equals(scheme)) {
                if ("content".equals(scheme)) {
                    if (this.f == null) {
                        ws4 ws4Var = new ws4(this.a);
                        this.f = ws4Var;
                        g(ws4Var);
                    }
                    fv4Var = this.f;
                } else if ("rtmp".equals(scheme)) {
                    if (this.g == null) {
                        try {
                            fv4 fv4Var2 = (fv4) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                            this.g = fv4Var2;
                            g(fv4Var2);
                        } catch (ClassNotFoundException unused) {
                            lb4.c("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                        } catch (Exception e) {
                            throw new RuntimeException("Error instantiating RTMP extension", e);
                        }
                        if (this.g == null) {
                            this.g = this.c;
                        }
                    }
                    fv4Var = this.g;
                } else if ("udp".equals(scheme)) {
                    if (this.h == null) {
                        rg5 rg5Var = new rg5();
                        this.h = rg5Var;
                        g(rg5Var);
                    }
                    fv4Var = this.h;
                } else if ("data".equals(scheme)) {
                    if (this.i == null) {
                        mt4 mt4Var = new mt4();
                        this.i = mt4Var;
                        g(mt4Var);
                    }
                    fv4Var = this.i;
                } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                    if (this.j == null) {
                        jd5 jd5Var = new jd5(this.a);
                        this.j = jd5Var;
                        g(jd5Var);
                    }
                    fv4Var = this.j;
                } else {
                    fv4Var = this.c;
                }
            }
            fv4Var = f();
        }
        this.k = fv4Var;
        return fv4Var.a(kz4Var);
    }

    @Override // defpackage.fv4
    public final Map b() {
        fv4 fv4Var = this.k;
        return fv4Var == null ? Collections.emptyMap() : fv4Var.b();
    }

    @Override // defpackage.fv4
    public final void c(bf5 bf5Var) {
        bf5Var.getClass();
        this.c.c(bf5Var);
        this.b.add(bf5Var);
        h(this.d, bf5Var);
        h(this.e, bf5Var);
        h(this.f, bf5Var);
        h(this.g, bf5Var);
        h(this.h, bf5Var);
        h(this.i, bf5Var);
        h(this.j, bf5Var);
    }

    @Override // defpackage.fv4
    public final Uri d() {
        fv4 fv4Var = this.k;
        if (fv4Var == null) {
            return null;
        }
        return fv4Var.d();
    }

    public final fv4 f() {
        if (this.e == null) {
            hq4 hq4Var = new hq4(this.a);
            this.e = hq4Var;
            g(hq4Var);
        }
        return this.e;
    }

    public final void g(fv4 fv4Var) {
        for (int i = 0; i < this.b.size(); i++) {
            fv4Var.c((bf5) this.b.get(i));
        }
    }

    @Override // defpackage.fv4
    public final void i() {
        fv4 fv4Var = this.k;
        if (fv4Var != null) {
            try {
                fv4Var.i();
            } finally {
                this.k = null;
            }
        }
    }

    @Override // defpackage.gv5
    public final int x(byte[] bArr, int i, int i2) {
        fv4 fv4Var = this.k;
        fv4Var.getClass();
        return fv4Var.x(bArr, i, i2);
    }
}