package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import defpackage.xq;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* renamed from: y11  reason: default package */
public final class y11 extends e21 {
    public static final Class<?> b;
    public static final Constructor<?> c;
    public static final Method d;
    public static final Method e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method = null;
            method2 = null;
        }
        c = constructor;
        b = cls;
        d = method2;
        e = method;
    }

    public static boolean h(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // defpackage.e21
    public final Typeface a(Context context, xq.b bVar, Resources resources, int i) {
        Object obj;
        xq.c[] cVarArr;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (xq.c cVar : bVar.a) {
            int i2 = cVar.f;
            File d2 = f21.d(context);
            if (d2 != null) {
                try {
                    if (f21.b(d2, resources, i2)) {
                        try {
                            fileInputStream = new FileInputStream(d2);
                        } catch (IOException unused2) {
                            mappedByteBuffer = null;
                        }
                        try {
                            FileChannel channel = fileInputStream.getChannel();
                            mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                            fileInputStream.close();
                            if (mappedByteBuffer != null || !h(obj, mappedByteBuffer, cVar.e, cVar.b, cVar.c)) {
                                return null;
                            }
                        } finally {
                            break;
                        }
                    }
                } finally {
                    d2.delete();
                }
            }
            mappedByteBuffer = null;
            if (mappedByteBuffer != null) {
                return null;
            }
        }
        try {
            Object newInstance = Array.newInstance(b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused3) {
            return null;
        }
    }

    @Override // defpackage.e21
    public final Typeface b(Context context, zq[] zqVarArr, int i) {
        Object obj;
        Typeface typeface;
        try {
            obj = c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        os0 os0Var = new os0();
        for (zq zqVar : zqVarArr) {
            Uri uri = zqVar.a;
            ByteBuffer byteBuffer = (ByteBuffer) os0Var.getOrDefault(uri, null);
            if (byteBuffer == null) {
                byteBuffer = f21.e(context, uri);
                os0Var.put(uri, byteBuffer);
            }
            if (byteBuffer == null || !h(obj, byteBuffer, zqVar.b, zqVar.c, zqVar.d)) {
                return null;
            }
        }
        try {
            Object newInstance = Array.newInstance(b, 1);
            Array.set(newInstance, 0, obj);
            typeface = (Typeface) e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused2) {
            typeface = null;
        }
        if (typeface == null) {
            return null;
        }
        return Typeface.create(typeface, i);
    }
}