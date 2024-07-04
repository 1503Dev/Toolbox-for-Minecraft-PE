package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;

/* renamed from: mg0  reason: default package */
public final /* synthetic */ class mg0 {
    public static /* bridge */ /* synthetic */ Drawable a(PackageManager packageManager, ApplicationInfo applicationInfo) {
        return packageManager.getApplicationBanner(applicationInfo);
    }
}