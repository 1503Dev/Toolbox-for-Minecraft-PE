package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* renamed from: ev3  reason: default package */
public final class ev3 implements lj5 {
    public final uj5 a;

    public ev3(uj5 uj5Var) {
        this.a = uj5Var;
    }

    @Override // defpackage.uj5
    /* renamed from: a */
    public final ApplicationInfo c() {
        ApplicationInfo applicationInfo = ((Context) this.a.c()).getApplicationInfo();
        tv2.C(applicationInfo);
        return applicationInfo;
    }
}