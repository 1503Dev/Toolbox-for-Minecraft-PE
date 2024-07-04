package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;

/* renamed from: fb4  reason: default package */
public final class fb4 implements nc4, mc4 {
    public final ApplicationInfo a;
    public final PackageInfo b;

    public fb4(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        this.a = applicationInfo;
        this.b = packageInfo;
    }

    @Override // defpackage.nc4
    public final int a() {
        return 29;
    }

    @Override // defpackage.mc4
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.a.packageName;
        PackageInfo packageInfo = this.b;
        Integer valueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        bundle.putString("pn", str);
        if (valueOf != null) {
            bundle.putInt("vc", valueOf.intValue());
        }
        PackageInfo packageInfo2 = this.b;
        String str2 = packageInfo2 != null ? packageInfo2.versionName : null;
        if (str2 != null) {
            bundle.putString("vnm", str2);
        }
    }

    @Override // defpackage.nc4
    public final dz4 c() {
        return zw4.C(this);
    }
}