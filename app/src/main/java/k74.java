package defpackage;

import android.content.Context;
import android.os.Process;

/* renamed from: k74  reason: default package */
public final class k74 implements nc4 {
    public final Context a;

    public k74(Context context) {
        this.a = context;
    }

    @Override // defpackage.nc4
    public final int a() {
        return 2;
    }

    @Override // defpackage.nc4
    public final dz4 c() {
        l74 l74Var;
        boolean z;
        if (((Boolean) w82.d.c.a(x92.m2)).booleanValue()) {
            Context context = this.a;
            Object obj = cg.a;
            if (context.checkPermission("com.google.android.gms.permission.AD_ID", Process.myPid(), Process.myUid()) == 0) {
                z = true;
            } else {
                z = false;
            }
            l74Var = new l74(0, z);
        } else {
            l74Var = null;
        }
        return zw4.C(l74Var);
    }
}