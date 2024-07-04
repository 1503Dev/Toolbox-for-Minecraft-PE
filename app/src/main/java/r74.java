package defpackage;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: r74  reason: default package */
public final class r74 implements mc4 {
    public final Context a;
    public final zr5 b;
    public final List c;

    public r74(Context context, zr5 zr5Var, ArrayList arrayList) {
        this.a = context;
        this.b = zr5Var;
        this.c = arrayList;
    }

    @Override // defpackage.mc4
    public final void b(Object obj) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        ComponentName componentName;
        Bundle bundle = (Bundle) obj;
        if (!((Boolean) sb2.a.d()).booleanValue()) {
            return;
        }
        Bundle bundle2 = new Bundle();
        cu5 cu5Var = jv5.A.c;
        String str = null;
        try {
            ActivityManager activityManager = (ActivityManager) this.a.getSystemService("activity");
            if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && (componentName = runningTaskInfo.topActivity) != null) {
                str = componentName.getClassName();
            }
        } catch (Exception unused) {
        }
        bundle2.putString("activity", str);
        Bundle bundle3 = new Bundle();
        bundle3.putInt("width", this.b.T);
        bundle3.putInt("height", this.b.Q);
        bundle2.putBundle("size", bundle3);
        if (!this.c.isEmpty()) {
            List list = this.c;
            bundle2.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
        }
        bundle.putBundle("view_hierarchy", bundle2);
    }
}