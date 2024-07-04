package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.TreeMap;

/* renamed from: ht5  reason: default package */
public final class ht5 {
    public final Context a;
    public final String b;
    public final TreeMap c = new TreeMap();
    public String d;
    public String e;
    public final String f;

    public ht5(Context context, String str) {
        String concat;
        this.a = context.getApplicationContext();
        this.b = str;
        String packageName = context.getPackageName();
        try {
            concat = packageName + "-" + c81.a(context).b(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            sv2.e("Unable to get package version name for reporting", e);
            concat = String.valueOf(packageName).concat("-missing");
        }
        this.f = concat;
    }
}