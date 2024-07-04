package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;

/* renamed from: md0  reason: default package */
public final class md0 {
    public final Context a;

    public md0(Context context) {
        this.a = context;
    }

    public final ApplicationInfo a(String str, int i) {
        return this.a.getPackageManager().getApplicationInfo(str, i);
    }

    public final PackageInfo b(String str, int i) {
        return this.a.getPackageManager().getPackageInfo(str, i);
    }

    public final boolean c() {
        String nameForUid;
        boolean isInstantApp;
        if (Binder.getCallingUid() == Process.myUid()) {
            return vx.j(this.a);
        }
        if (!qe0.a() || (nameForUid = this.a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        isInstantApp = this.a.getPackageManager().isInstantApp(nameForUid);
        return isInstantApp;
    }
}