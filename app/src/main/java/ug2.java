package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ug2  reason: default package */
public final class ug2 {
    public static final Intent a(Intent intent, ResolveInfo resolveInfo) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }

    public static final ResolveInfo b(Intent intent, ArrayList arrayList, Context context) {
        PackageManager packageManager;
        ResolveInfo resolveInfo = null;
        try {
            packageManager = context.getPackageManager();
        } catch (Throwable th) {
            jv5.A.g.f("OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent", th);
        }
        if (packageManager == null) {
            return null;
        }
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
        if (queryIntentActivities != null && resolveActivity != null) {
            int i = 0;
            while (true) {
                if (i >= queryIntentActivities.size()) {
                    break;
                } else if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i).activityInfo.name)) {
                    resolveInfo = resolveActivity;
                    break;
                } else {
                    i++;
                }
            }
        }
        arrayList.addAll(queryIntentActivities);
        return resolveInfo;
    }
}