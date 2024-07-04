package defpackage;

import android.annotation.SuppressLint;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: a0  reason: default package */
public final class a0 {
    @SuppressLint({"DiscouragedPrivateApi"})
    public static boolean a() {
        boolean is64Bit;
        int i = Build.VERSION.SDK_INT;
        if (i < 21) {
            return false;
        }
        if (i >= 23) {
            is64Bit = Process.is64Bit();
            return is64Bit;
        }
        try {
            Class<?> cls = Class.forName("dalvik.system.VMRuntime");
            Method declaredMethod = cls.getDeclaredMethod("getRuntime", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            Method declaredMethod2 = cls.getDeclaredMethod("is64Bit", new Class[0]);
            declaredMethod2.setAccessible(true);
            return ((Boolean) declaredMethod2.invoke(invoke, new Object[0])).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean b(ApplicationInfo applicationInfo) {
        try {
            Field declaredField = ApplicationInfo.class.getDeclaredField("primaryCpuAbi");
            declaredField.setAccessible(true);
            String str = (String) declaredField.get(applicationInfo);
            if (str != null) {
                if (!str.equals("armeabi-v7a")) {
                    if (!str.equals("x86")) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}