package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import java.io.File;

/* renamed from: cg  reason: default package */
public class cg {
    public static final Object a = new Object();

    /* renamed from: cg$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        public static void a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        public static void b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* renamed from: cg$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b {
        public static File a(Context context) {
            return d4.d(context);
        }

        public static Drawable b(Context context, int i) {
            Drawable drawable;
            drawable = context.getDrawable(i);
            return drawable;
        }

        public static File c(Context context) {
            return dg.b(context);
        }
    }

    /* renamed from: cg$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class c {
        public static int a(Context context, int i) {
            return fg.a(context, i);
        }

        public static ColorStateList b(Context context, int i) {
            return y5.a(context, i);
        }

        public static <T> T c(Context context, Class<T> cls) {
            return (T) d5.a(context, cls);
        }

        public static String d(Context context, Class<?> cls) {
            return eg.a(context, cls);
        }
    }

    /* renamed from: cg$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class d {
        public static Context a(Context context) {
            return hg.a(context);
        }

        public static File b(Context context) {
            return ig.a(context);
        }

        public static boolean c(Context context) {
            boolean isDeviceProtectedStorage;
            isDeviceProtectedStorage = context.isDeviceProtectedStorage();
            return isDeviceProtectedStorage;
        }
    }

    /* renamed from: cg$e */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class e {
        public static ComponentName a(Context context, Intent intent) {
            return jg.a(context, intent);
        }
    }

    public static int a(Context context, int i) {
        return Build.VERSION.SDK_INT >= 23 ? c.a(context, i) : context.getResources().getColor(i);
    }

    public static Drawable b(Context context, int i) {
        return Build.VERSION.SDK_INT >= 21 ? b.b(context, i) : context.getResources().getDrawable(i);
    }
}