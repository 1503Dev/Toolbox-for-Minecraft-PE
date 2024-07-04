package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;

/* renamed from: pg0  reason: default package */
public final /* synthetic */ class pg0 {
    public static /* bridge */ /* synthetic */ Drawable a(PackageManager packageManager, Intent intent) {
        return packageManager.getActivityBanner(intent);
    }
}