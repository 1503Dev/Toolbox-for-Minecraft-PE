package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import defpackage.xq;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: x11  reason: default package */
public class x11 extends e21 {
    public static Class<?> b = null;
    public static Constructor<?> c = null;
    public static Method d = null;
    public static Method e = null;
    public static boolean f = false;

    public static boolean h(Object obj, String str, int i, boolean z) {
        j();
        try {
            return ((Boolean) d.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static File i(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
            return null;
        } catch (ErrnoException unused) {
            return null;
        }
    }

    public static void j() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f) {
            return;
        }
        f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        c = constructor;
        b = cls;
        d = method2;
        e = method;
    }

    @Override // defpackage.e21
    public Typeface a(Context context, xq.b bVar, Resources resources, int i) {
        xq.c[] cVarArr;
        j();
        try {
            Object newInstance = c.newInstance(new Object[0]);
            for (xq.c cVar : bVar.a) {
                File d2 = f21.d(context);
                if (d2 == null) {
                    return null;
                }
                try {
                    if (!f21.b(d2, resources, cVar.f)) {
                        return null;
                    }
                    if (!h(newInstance, d2.getPath(), cVar.b, cVar.c)) {
                        return null;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    d2.delete();
                }
            }
            j();
            try {
                Object newInstance2 = Array.newInstance(b, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) e.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // defpackage.e21
    public Typeface b(Context context, zq[] zqVarArr, int i) {
        if (zqVarArr.length < 1) {
            return null;
        }
        zq f2 = f(i, zqVarArr);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(f2.a, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            File i2 = i(openFileDescriptor);
            if (i2 != null && i2.canRead()) {
                Typeface createFromFile = Typeface.createFromFile(i2);
                openFileDescriptor.close();
                return createFromFile;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            Typeface c2 = c(context, fileInputStream);
            fileInputStream.close();
            openFileDescriptor.close();
            return c2;
        } catch (IOException unused) {
            return null;
        }
    }
}