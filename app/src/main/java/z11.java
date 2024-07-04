package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import defpackage.xq;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: z11  reason: default package */
public class z11 extends x11 {
    public final Class<?> g;
    public final Constructor<?> h;
    public final Method i;
    public final Method j;
    public final Method k;
    public final Method l;
    public final Method m;

    public z11() {
        Method method;
        Method method2;
        Constructor<?> constructor;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            method3 = o(cls2);
            method4 = p(cls2);
            method5 = cls2.getMethod("freeze", new Class[0]);
            method2 = cls2.getMethod("abortCreation", new Class[0]);
            method = q(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            StringBuilder b = e5.b("Unable to collect necessary methods for class ");
            b.append(e.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", b.toString(), e);
            method = null;
            method2 = null;
            constructor = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.g = cls;
        this.h = constructor;
        this.i = method3;
        this.j = method4;
        this.k = method5;
        this.l = method2;
        this.m = method;
    }

    public static Method o(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public static Method p(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    @Override // defpackage.x11, defpackage.e21
    public final Typeface a(Context context, xq.b bVar, Resources resources, int i) {
        Object obj;
        xq.c[] cVarArr;
        if (!n()) {
            return super.a(context, bVar, resources, i);
        }
        try {
            obj = this.h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (xq.c cVar : bVar.a) {
            if (!k(context, obj, cVar.a, cVar.e, cVar.b, cVar.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.d))) {
                try {
                    this.l.invoke(obj, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
                return null;
            }
        }
        if (!m(obj)) {
            return null;
        }
        return l(obj);
    }

    /* JADX WARN: Type inference failed for: r15v2, types: [android.graphics.Typeface$Builder] */
    @Override // defpackage.x11, defpackage.e21
    public final Typeface b(Context context, zq[] zqVarArr, int i) {
        Object obj;
        Typeface l;
        boolean z;
        if (zqVarArr.length < 1) {
            return null;
        }
        if (!n()) {
            zq f = f(i, zqVarArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(f.a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                final FileDescriptor fileDescriptor = openFileDescriptor.getFileDescriptor();
                Typeface build = new Object(fileDescriptor) { // from class: android.graphics.Typeface$Builder
                    static {
                        throw new NoClassDefFoundError();
                    }

                    public native /* synthetic */ Typeface build();

                    public native /* synthetic */ Typeface$Builder setItalic(boolean z2);

                    public native /* synthetic */ Typeface$Builder setWeight(int i2);
                }.setWeight(f.c).setItalic(f.d).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (zq zqVar : zqVarArr) {
            if (zqVar.e == 0) {
                Uri uri = zqVar.a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, f21.e(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        try {
            obj = this.h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        boolean z2 = false;
        for (zq zqVar2 : zqVarArr) {
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(zqVar2.a);
            if (byteBuffer != null) {
                try {
                    z = ((Boolean) this.j.invoke(obj, byteBuffer, Integer.valueOf(zqVar2.b), null, Integer.valueOf(zqVar2.c), Integer.valueOf(zqVar2.d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused3) {
                    z = false;
                }
                if (!z) {
                    try {
                        this.l.invoke(obj, new Object[0]);
                    } catch (IllegalAccessException | InvocationTargetException unused4) {
                    }
                    return null;
                }
                z2 = true;
            }
        }
        if (!z2) {
            try {
                this.l.invoke(obj, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused5) {
            }
            return null;
        } else if (!m(obj) || (l = l(obj)) == null) {
            return null;
        } else {
            return Typeface.create(l, i);
        }
    }

    @Override // defpackage.e21
    public final Typeface d(Context context, Resources resources, int i, String str, int i2) {
        Object obj;
        if (!n()) {
            return super.d(context, resources, i, str, i2);
        }
        try {
            obj = this.h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        if (!k(context, obj, str, 0, -1, -1, null)) {
            try {
                this.l.invoke(obj, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
            return null;
        } else if (!m(obj)) {
            return null;
        } else {
            return l(obj);
        }
    }

    public final boolean k(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean m(Object obj) {
        try {
            return ((Boolean) this.k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean n() {
        if (this.i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.i != null;
    }

    public Method q(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}