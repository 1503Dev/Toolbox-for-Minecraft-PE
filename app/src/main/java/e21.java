package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import defpackage.xq;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: e21  reason: default package */
public class e21 {
    @SuppressLint({"BanConcurrentHashMap"})
    public ConcurrentHashMap<Long, xq.b> a = new ConcurrentHashMap<>();

    /* renamed from: e21$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a<T> {
        int a(T t);

        boolean b(T t);
    }

    public static <T> T e(T[] tArr, int i, a<T> aVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(aVar.a(t2) - i2) * 2) + (aVar.b(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    public static long g(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0L;
        } catch (NoSuchFieldException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0L;
        }
    }

    public Typeface a(Context context, xq.b bVar, Resources resources, int i) {
        xq.c cVar = (xq.c) e(bVar.a, i, new d21());
        if (cVar == null) {
            return null;
        }
        int i2 = cVar.f;
        Typeface d = w11.a.d(context, resources, i2, cVar.a, i);
        if (d != null) {
            w11.b.b(w11.b(resources, i2, i), d);
        }
        long g = g(d);
        if (g != 0) {
            this.a.put(Long.valueOf(g), bVar);
        }
        return d;
    }

    public Typeface b(Context context, zq[] zqVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (zqVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(f(i, zqVarArr).a);
            try {
                Typeface c = c(context, inputStream);
                f21.a(inputStream);
                return c;
            } catch (IOException unused) {
                f21.a(inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                f21.a(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public Typeface c(Context context, InputStream inputStream) {
        File d = f21.d(context);
        if (d == null) {
            return null;
        }
        try {
            if (f21.c(d, inputStream)) {
                return Typeface.createFromFile(d.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        File d = f21.d(context);
        if (d == null) {
            return null;
        }
        try {
            if (f21.b(d, resources, i)) {
                return Typeface.createFromFile(d.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d.delete();
        }
    }

    public zq f(int i, zq[] zqVarArr) {
        return (zq) e(zqVarArr, i, new c21());
    }
}