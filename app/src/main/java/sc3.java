package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: sc3  reason: default package */
public final /* synthetic */ class sc3 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sc3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        bx2 bx2Var;
        boolean z;
        switch (this.a) {
            case 0:
                tc3 tc3Var = (tc3) this.b;
                tc3Var.getClass();
                Bundle bundle = (Bundle) ((dz4) this.c).get();
                xv2 xv2Var = tc3Var.b;
                ApplicationInfo applicationInfo = tc3Var.c;
                String str = tc3Var.d;
                List list = tc3Var.e;
                PackageInfo packageInfo = tc3Var.f;
                String str2 = (String) ((dz4) tc3Var.g.c()).get();
                String str3 = tc3Var.h;
                if (((Boolean) w82.d.c.a(x92.e6)).booleanValue() && tc3Var.j.C()) {
                    z = true;
                } else {
                    z = false;
                }
                return new rq2(bundle, xv2Var, applicationInfo, str, list, packageInfo, str2, str3, null, null, z, tc3Var.k.b());
            default:
                rq2 rq2Var = (rq2) this.c;
                uv3 uv3Var = ((yu3) this.b).c;
                synchronized (uv3Var.b) {
                    if (!uv3Var.c) {
                        uv3Var.c = true;
                        uv3Var.e = rq2Var;
                        uv3Var.f.n();
                        uv3Var.a.b(new vz2(1, uv3Var), zw2.f);
                    }
                    bx2Var = uv3Var.a;
                }
                return (InputStream) bx2Var.get(((Integer) w82.d.c.a(x92.y4)).intValue(), TimeUnit.SECONDS);
        }
    }
}