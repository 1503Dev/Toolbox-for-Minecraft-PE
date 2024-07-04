package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import defpackage.il0;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
/* renamed from: z5  reason: default package */
public final class z5 {
    public static final ThreadLocal<TypedValue> a = new ThreadLocal<>();
    public static final WeakHashMap<Context, SparseArray<a>> b = new WeakHashMap<>(0);
    public static final Object c = new Object();

    /* renamed from: z5$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        public final ColorStateList a;
        public final Configuration b;

        public a(ColorStateList colorStateList, Configuration configuration) {
            this.a = colorStateList;
            this.b = configuration;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList a(Context context, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        boolean z;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        il0.a aVar;
        a aVar2;
        if (Build.VERSION.SDK_INT >= 23) {
            return y5.a(context, i);
        }
        synchronized (c) {
            SparseArray<a> sparseArray = b.get(context);
            colorStateList = null;
            if (sparseArray != null && sparseArray.size() > 0 && (aVar2 = sparseArray.get(i)) != null) {
                if (aVar2.b.equals(context.getResources().getConfiguration())) {
                    colorStateList2 = aVar2.a;
                } else {
                    sparseArray.remove(i);
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        Resources resources = context.getResources();
        ThreadLocal<TypedValue> threadLocal = a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        boolean z2 = true;
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 >= 28 && i2 <= 31) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Resources resources2 = context.getResources();
            try {
                colorStateList3 = ae.a(resources2, resources2.getXml(i), context.getTheme());
            } catch (Exception e) {
                Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
            if (colorStateList3 == null) {
                synchronized (c) {
                    WeakHashMap<Context, SparseArray<a>> weakHashMap = b;
                    SparseArray<a> sparseArray2 = weakHashMap.get(context);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray<>();
                        weakHashMap.put(context, sparseArray2);
                    }
                    sparseArray2.append(i, new a(colorStateList3, context.getResources().getConfiguration()));
                }
                return colorStateList3;
            }
            Object obj = cg.a;
            Resources resources3 = context.getResources();
            Resources.Theme theme = context.getTheme();
            ThreadLocal<TypedValue> threadLocal2 = il0.a;
            if (Build.VERSION.SDK_INT >= 23) {
                return hl0.a(resources3, i, theme);
            }
            il0.b bVar = new il0.b(resources3, theme);
            synchronized (il0.c) {
                SparseArray<il0.a> sparseArray3 = il0.b.get(bVar);
                if (sparseArray3 != null && sparseArray3.size() > 0 && (aVar = sparseArray3.get(i)) != null) {
                    if (aVar.b.equals(resources3.getConfiguration())) {
                        colorStateList4 = aVar.a;
                    } else {
                        sparseArray3.remove(i);
                    }
                }
                colorStateList4 = null;
            }
            if (colorStateList4 != null) {
                return colorStateList4;
            }
            ThreadLocal<TypedValue> threadLocal3 = il0.a;
            TypedValue typedValue2 = threadLocal3.get();
            if (typedValue2 == null) {
                typedValue2 = new TypedValue();
                threadLocal3.set(typedValue2);
            }
            resources3.getValue(i, typedValue2, true);
            int i3 = typedValue2.type;
            if (!((i3 < 28 || i3 > 31) ? false : false)) {
                try {
                    colorStateList = ae.a(resources3, resources3.getXml(i), theme);
                } catch (Exception e2) {
                    Log.e("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
                }
            }
            if (colorStateList != null) {
                synchronized (il0.c) {
                    WeakHashMap<il0.b, SparseArray<il0.a>> weakHashMap2 = il0.b;
                    SparseArray<il0.a> sparseArray4 = weakHashMap2.get(bVar);
                    if (sparseArray4 == null) {
                        sparseArray4 = new SparseArray<>();
                        weakHashMap2.put(bVar, sparseArray4);
                    }
                    sparseArray4.append(i, new il0.a(colorStateList, bVar.a.getConfiguration()));
                }
                return colorStateList;
            }
            return resources3.getColorStateList(i);
        }
        colorStateList3 = null;
        if (colorStateList3 == null) {
        }
    }

    public static Drawable b(Context context, int i) {
        return gl0.d().f(context, i);
    }
}