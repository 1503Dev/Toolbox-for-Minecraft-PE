package defpackage;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: kd0  reason: default package */
public final class kd0 {
    public static final String a = y20.e("PackageManagerHelper");

    public static void a(Context context, Class<?> cls, boolean z) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            y20 c = y20.c();
            String str = a;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z ? "enabled" : "disabled";
            c.a(str, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e) {
            y20 c2 = y20.c();
            String str2 = a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            objArr2[1] = z ? "enabled" : "disabled";
            c2.a(str2, String.format("%s could not be %s", objArr2), e);
        }
    }
}