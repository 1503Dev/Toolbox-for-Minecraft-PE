package defpackage;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;

/* renamed from: og0  reason: default package */
public final /* synthetic */ class og0 {
    public static /* bridge */ /* synthetic */ Drawable a(PackageManager packageManager, ComponentName componentName) {
        return packageManager.getActivityBanner(componentName);
    }
}