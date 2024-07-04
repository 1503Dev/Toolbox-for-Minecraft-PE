package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Callable;

/* renamed from: ec4  reason: default package */
public final class ec4 implements nc4 {
    public final ez4 a;
    public final Context b;
    public final xv2 c;

    public ec4(yw2 yw2Var, Context context, xv2 xv2Var) {
        this.a = yw2Var;
        this.b = context;
        this.c = xv2Var;
    }

    @Override // defpackage.nc4
    public final int a() {
        return 35;
    }

    @Override // defpackage.nc4
    public final dz4 c() {
        return this.a.b(new Callable() { // from class: dc4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                boolean z;
                int i;
                ec4 ec4Var = ec4.this;
                boolean c = c81.a(ec4Var.b).c();
                cu5 cu5Var = jv5.A.c;
                boolean H = cu5.H(ec4Var.b);
                String str = ec4Var.c.P;
                int myUid = Process.myUid();
                if (myUid != 0 && myUid != 1000) {
                    z = false;
                } else {
                    z = true;
                }
                ApplicationInfo applicationInfo = ec4Var.b.getApplicationInfo();
                if (applicationInfo == null) {
                    i = 0;
                } else {
                    i = applicationInfo.targetSdkVersion;
                }
                return new fc4(c, H, str, z, i, DynamiteModule.d(ec4Var.b, ModuleDescriptor.MODULE_ID, false), DynamiteModule.a(ec4Var.b, ModuleDescriptor.MODULE_ID));
            }
        });
    }
}