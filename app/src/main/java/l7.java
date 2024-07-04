package defpackage;

import android.content.res.AssetManager;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: l7  reason: default package */
public final class l7 {
    public static Method a;

    static {
        Method method;
        try {
            method = AssetManager.class.getDeclaredMethod("openNonAsset", String.class);
            method.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            Log.w("ReflectionHelper", "Failed to resolve method: openNonAsset in " + AssetManager.class.getName());
            method = null;
        }
        a = method;
    }
}