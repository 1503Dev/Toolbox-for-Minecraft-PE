package com.google.android.gms.dynamite;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import dalvik.system.PathClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;

public final class DynamiteModule {
    @GuardedBy("DynamiteModule.class")
    public static Boolean d = null;
    @GuardedBy("DynamiteModule.class")
    public static String e = null;
    @GuardedBy("DynamiteModule.class")
    public static boolean f = false;
    @GuardedBy("DynamiteModule.class")
    public static int g = -1;
    @GuardedBy("DynamiteModule.class")
    public static ds5 k;
    @GuardedBy("DynamiteModule.class")
    public static dt5 l;
    public final Context a;
    public static final ThreadLocal<jp5> h = new ThreadLocal<>();
    public static final ig3 i = new ig3();
    public static final com.google.android.gms.dynamite.a j = new com.google.android.gms.dynamite.a();
    public static final com.google.android.gms.dynamite.b b = new com.google.android.gms.dynamite.b();
    public static final c c = new c();

    @DynamiteApi
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class DynamiteLoaderClassLoader {
        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends Exception {
        public /* synthetic */ a(String str) {
            super(str);
        }

        public /* synthetic */ a(String str, Throwable th) {
            super(str, th);
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface b {

        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public interface a {
            int a(Context context, String str);

            int b(Context context, String str, boolean z);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b  reason: collision with other inner class name */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public static class C0021b {
            public int a = 0;
            public int b = 0;
            public int c = 0;
        }

        C0021b a(Context context, String str, a aVar);
    }

    public DynamiteModule(Context context) {
        uf0.f(context);
        this.a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(str.length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".");
            sb.append("ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (wa0.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 51 + str.length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(str.length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e2) {
            String valueOf2 = String.valueOf(e2.getMessage());
            Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    public static DynamiteModule c(Context context, b bVar, String str) {
        String str2;
        Boolean bool;
        hw c0;
        DynamiteModule dynamiteModule;
        dt5 dt5Var;
        boolean z;
        Boolean valueOf;
        hw c02;
        ThreadLocal<jp5> threadLocal = h;
        jp5 jp5Var = threadLocal.get();
        jp5 jp5Var2 = new jp5(0);
        threadLocal.set(jp5Var2);
        ig3 ig3Var = i;
        long longValue = ig3Var.get().longValue();
        try {
            ig3Var.set(Long.valueOf(SystemClock.elapsedRealtime()));
            b.C0021b a2 = bVar.a(context, str, j);
            int i2 = a2.a;
            int i3 = a2.b;
            StringBuilder sb = new StringBuilder(str.length() + 68 + str.length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i2);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i3);
            Log.i("DynamiteModule", sb.toString());
            int i4 = a2.c;
            if (i4 != 0) {
                if (i4 == -1) {
                    if (a2.a != 0) {
                        i4 = -1;
                    }
                }
                if (i4 != 1 || a2.b != 0) {
                    if (i4 == -1) {
                        DynamiteModule f2 = f(context, str);
                        if (longValue == 0) {
                            ig3Var.remove();
                        } else {
                            ig3Var.set(Long.valueOf(longValue));
                        }
                        Cursor cursor = jp5Var2.a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(jp5Var);
                        return f2;
                    } else if (i4 == 1) {
                        try {
                            int i5 = a2.b;
                            try {
                                synchronized (DynamiteModule.class) {
                                    bool = d;
                                }
                                if (bool != null) {
                                    if (bool.booleanValue()) {
                                        StringBuilder sb2 = new StringBuilder(str.length() + 51);
                                        sb2.append("Selected remote version of ");
                                        sb2.append(str);
                                        sb2.append(", version >= ");
                                        sb2.append(i5);
                                        Log.i("DynamiteModule", sb2.toString());
                                        synchronized (DynamiteModule.class) {
                                            dt5Var = l;
                                        }
                                        if (dt5Var != null) {
                                            jp5 jp5Var3 = threadLocal.get();
                                            if (jp5Var3 != null && jp5Var3.a != null) {
                                                Context applicationContext = context.getApplicationContext();
                                                Cursor cursor2 = jp5Var3.a;
                                                new va0(null);
                                                synchronized (DynamiteModule.class) {
                                                    if (g >= 2) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                    valueOf = Boolean.valueOf(z);
                                                }
                                                if (valueOf.booleanValue()) {
                                                    Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                    c02 = dt5Var.b2(new va0(applicationContext), str, i5, new va0(cursor2));
                                                } else {
                                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                    c02 = dt5Var.c0(new va0(applicationContext), str, i5, new va0(cursor2));
                                                }
                                                Context context2 = (Context) va0.c0(c02);
                                                if (context2 != null) {
                                                    dynamiteModule = new DynamiteModule(context2);
                                                } else {
                                                    throw new a("Failed to get module context");
                                                }
                                            } else {
                                                throw new a("No result cursor");
                                            }
                                        } else {
                                            throw new a("DynamiteLoaderV2 was not cached.");
                                        }
                                    } else {
                                        StringBuilder sb3 = new StringBuilder(str.length() + 51);
                                        sb3.append("Selected remote version of ");
                                        sb3.append(str);
                                        sb3.append(", version >= ");
                                        sb3.append(i5);
                                        Log.i("DynamiteModule", sb3.toString());
                                        ds5 h2 = h(context);
                                        if (h2 != null) {
                                            Parcel A = h2.A(h2.Z(), 6);
                                            int readInt = A.readInt();
                                            A.recycle();
                                            if (readInt >= 3) {
                                                jp5 jp5Var4 = threadLocal.get();
                                                if (jp5Var4 != null) {
                                                    c0 = h2.b2(new va0(context), str, i5, new va0(jp5Var4.a));
                                                } else {
                                                    throw new a("No cached result cursor holder");
                                                }
                                            } else if (readInt == 2) {
                                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                c0 = h2.d3(new va0(context), str, i5);
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                c0 = h2.c0(new va0(context), str, i5);
                                            }
                                            if (va0.c0(c0) != null) {
                                                dynamiteModule = new DynamiteModule((Context) va0.c0(c0));
                                            } else {
                                                throw new a("Failed to load remote module.");
                                            }
                                        } else {
                                            throw new a("Failed to create IDynamiteLoader.");
                                        }
                                    }
                                    if (longValue == 0) {
                                        ig3Var.remove();
                                    } else {
                                        ig3Var.set(Long.valueOf(longValue));
                                    }
                                    Cursor cursor3 = jp5Var2.a;
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    threadLocal.set(jp5Var);
                                    return dynamiteModule;
                                }
                                throw new a("Failed to determine which loading route to use.");
                            } catch (RemoteException e2) {
                                throw new a("Failed to load remote module.", e2);
                            } catch (a e3) {
                                throw e3;
                            } catch (Throwable th) {
                                wg.a(context, th);
                                throw new a("Failed to load remote module.", th);
                            }
                        } catch (a e4) {
                            String valueOf2 = String.valueOf(e4.getMessage());
                            if (valueOf2.length() != 0) {
                                str2 = "Failed to load remote module: ".concat(valueOf2);
                            } else {
                                str2 = new String("Failed to load remote module: ");
                            }
                            Log.w("DynamiteModule", str2);
                            int i6 = a2.a;
                            if (i6 != 0 && bVar.a(context, str, new d(i6)).c == -1) {
                                DynamiteModule f3 = f(context, str);
                                int i7 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
                                ig3 ig3Var2 = i;
                                if (i7 == 0) {
                                    ig3Var2.remove();
                                } else {
                                    ig3Var2.set(Long.valueOf(longValue));
                                }
                                Cursor cursor4 = jp5Var2.a;
                                if (cursor4 != null) {
                                    cursor4.close();
                                }
                                h.set(jp5Var);
                                return f3;
                            }
                            throw new a("Remote load failed. No local fallback found.", e4);
                        }
                    } else {
                        StringBuilder sb4 = new StringBuilder(47);
                        sb4.append("VersionPolicy returned invalid code:");
                        sb4.append(i4);
                        throw new a(sb4.toString());
                    }
                }
            }
            int i8 = a2.a;
            int i9 = a2.b;
            StringBuilder sb5 = new StringBuilder(str.length() + 92);
            sb5.append("No acceptable module ");
            sb5.append(str);
            sb5.append(" found. Local version is ");
            sb5.append(i8);
            sb5.append(" and remote version is ");
            sb5.append(i9);
            sb5.append(".");
            throw new a(sb5.toString());
        } catch (Throwable th2) {
            int i10 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
            ig3 ig3Var3 = i;
            if (i10 == 0) {
                ig3Var3.remove();
            } else {
                ig3Var3.set(Long.valueOf(longValue));
            }
            Cursor cursor5 = jp5Var2.a;
            if (cursor5 != null) {
                cursor5.close();
            }
            h.set(jp5Var);
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x0167, code lost:
        if (r1 != false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int d(Context context, String str, boolean z) {
        Field declaredField;
        Object systemClassLoader;
        String str2;
        Throwable th;
        Cursor cursor;
        RemoteException e2;
        String str3;
        int readInt;
        Cursor cursor2;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = d;
                Cursor cursor3 = null;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e3) {
                        String obj = e3.toString();
                        StringBuilder sb = new StringBuilder(obj.length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(obj);
                        Log.w("DynamiteModule", sb.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader != null) {
                            if (classLoader != ClassLoader.getSystemClassLoader()) {
                                try {
                                    g(classLoader);
                                } catch (a unused) {
                                }
                                bool = Boolean.TRUE;
                                d = bool;
                            }
                        } else {
                            if (!f) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int e4 = e(context, str, z);
                                        String str4 = e;
                                        if (str4 != null && !str4.isEmpty()) {
                                            ClassLoader i2 = j82.i();
                                            if (i2 == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    final String str5 = e;
                                                    uf0.f(str5);
                                                    final ClassLoader systemClassLoader2 = ClassLoader.getSystemClassLoader();
                                                    i2 = new PathClassLoader(str5, systemClassLoader2) { // from class: dalvik.system.DelegateLastClassLoader
                                                        static {
                                                            throw new NoClassDefFoundError();
                                                        }
                                                    };
                                                } else {
                                                    String str6 = e;
                                                    uf0.f(str6);
                                                    i2 = new hw2(ClassLoader.getSystemClassLoader(), str6);
                                                }
                                            }
                                            g(i2);
                                            declaredField.set(null, i2);
                                            d = bool2;
                                            return e4;
                                        }
                                        return e4;
                                    } catch (a unused2) {
                                        systemClassLoader = ClassLoader.getSystemClassLoader();
                                    }
                                }
                            }
                            systemClassLoader = ClassLoader.getSystemClassLoader();
                            declaredField.set(null, systemClassLoader);
                        }
                        bool = Boolean.FALSE;
                        d = bool;
                    }
                }
                boolean booleanValue = bool.booleanValue();
                boolean z2 = false;
                if (booleanValue) {
                    try {
                        return e(context, str, z);
                    } catch (a e5) {
                        String valueOf = String.valueOf(e5.getMessage());
                        if (valueOf.length() != 0) {
                            str2 = "Failed to retrieve remote module version: ".concat(valueOf);
                        } else {
                            str2 = new String("Failed to retrieve remote module version: ");
                        }
                        Log.w("DynamiteModule", str2);
                        return 0;
                    }
                }
                ds5 h2 = h(context);
                if (h2 == null) {
                    return 0;
                }
                try {
                    try {
                        Parcel A = h2.A(h2.Z(), 6);
                        int readInt2 = A.readInt();
                        A.recycle();
                        if (readInt2 >= 3) {
                            ThreadLocal<jp5> threadLocal = h;
                            jp5 jp5Var = threadLocal.get();
                            if (jp5Var != null && (cursor2 = jp5Var.a) != null) {
                                return cursor2.getInt(0);
                            }
                            cursor = (Cursor) va0.c0(h2.n3(new va0(context), str, z, i.get().longValue()));
                            if (cursor != null) {
                                try {
                                    if (cursor.moveToFirst()) {
                                        readInt = cursor.getInt(0);
                                        if (readInt > 0) {
                                            jp5 jp5Var2 = threadLocal.get();
                                            if (jp5Var2 != null && jp5Var2.a == null) {
                                                jp5Var2.a = cursor;
                                                z2 = true;
                                            }
                                        }
                                        cursor3 = cursor;
                                        if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                    }
                                } catch (RemoteException e6) {
                                    e2 = e6;
                                    cursor3 = cursor;
                                    String valueOf2 = String.valueOf(e2.getMessage());
                                    if (valueOf2.length() != 0) {
                                        str3 = "Failed to retrieve remote module version: ".concat(valueOf2);
                                    } else {
                                        str3 = new String("Failed to retrieve remote module version: ");
                                    }
                                    Log.w("DynamiteModule", str3);
                                    if (cursor3 == null) {
                                        return 0;
                                    }
                                    cursor3.close();
                                    return 0;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor == null) {
                                return 0;
                            }
                            cursor.close();
                            return 0;
                        } else if (readInt2 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            va0 va0Var = new va0(context);
                            Parcel Z = h2.Z();
                            lw2.b(Z, va0Var);
                            Z.writeString(str);
                            Z.writeInt(z ? 1 : 0);
                            Parcel A2 = h2.A(Z, 5);
                            readInt = A2.readInt();
                            A2.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            va0 va0Var2 = new va0(context);
                            Parcel Z2 = h2.Z();
                            lw2.b(Z2, va0Var2);
                            Z2.writeString(str);
                            Z2.writeInt(z ? 1 : 0);
                            Parcel A3 = h2.A(Z2, 3);
                            readInt = A3.readInt();
                            A3.recycle();
                        }
                        return readInt;
                    } catch (RemoteException e7) {
                        e2 = e7;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor = null;
                }
            }
        } catch (Throwable th4) {
            wg.a(context, th4);
            throw th4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int e(Context context, String str, boolean z) {
        Exception e2;
        boolean z2;
        Cursor cursor = null;
        try {
            try {
                long longValue = i.get().longValue();
                ContentResolver contentResolver = context.getContentResolver();
                String str2 = "api_force_staging";
                boolean z3 = true;
                if (true != z) {
                    str2 = "api";
                }
                Cursor query = contentResolver.query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(str2).appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(longValue)).build(), null, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            boolean z4 = false;
                            int i2 = query.getInt(0);
                            if (i2 > 0) {
                                synchronized (DynamiteModule.class) {
                                    e = query.getString(2);
                                    int columnIndex = query.getColumnIndex("loaderVersion");
                                    if (columnIndex >= 0) {
                                        g = query.getInt(columnIndex);
                                    }
                                    int columnIndex2 = query.getColumnIndex("disableStandaloneDynamiteLoader");
                                    if (columnIndex2 >= 0) {
                                        if (query.getInt(columnIndex2) != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        f = z2;
                                    } else {
                                        z2 = false;
                                    }
                                }
                                jp5 jp5Var = h.get();
                                if (jp5Var != null && jp5Var.a == null) {
                                    jp5Var.a = query;
                                } else {
                                    z3 = false;
                                }
                                if (!z3) {
                                    cursor = query;
                                }
                                z4 = z2;
                            } else {
                                cursor = query;
                            }
                            if (!z4) {
                                if (cursor != null) {
                                    cursor.close();
                                }
                                return i2;
                            }
                            try {
                                throw new a("forcing fallback to container DynamiteLoader impl");
                            } catch (Exception e3) {
                                e2 = e3;
                                if (e2 instanceof a) {
                                    throw e2;
                                }
                                throw new a("V2 version check failed", e2);
                            }
                        }
                    } catch (Exception e4) {
                        e2 = e4;
                    } catch (Throwable th) {
                        th = th;
                        cursor = query;
                        th = th;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new a("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e5) {
            e2 = e5;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
            }
            throw th;
        }
    }

    public static DynamiteModule f(Context context, String str) {
        Log.i("DynamiteModule", str.length() != 0 ? "Selected local version of ".concat(str) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    @GuardedBy("DynamiteModule.class")
    public static void g(ClassLoader classLoader) {
        dt5 dt5Var;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                dt5Var = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                dt5Var = queryLocalInterface instanceof dt5 ? (dt5) queryLocalInterface : new dt5(iBinder);
            }
            l = dt5Var;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new a("Failed to instantiate dynamite loader", e2);
        }
    }

    public static ds5 h(Context context) {
        ds5 ds5Var;
        synchronized (DynamiteModule.class) {
            ds5 ds5Var2 = k;
            if (ds5Var2 != null) {
                return ds5Var2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    ds5Var = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    ds5Var = queryLocalInterface instanceof ds5 ? (ds5) queryLocalInterface : new ds5(iBinder);
                }
                if (ds5Var != null) {
                    k = ds5Var;
                    return ds5Var;
                }
            } catch (Exception e2) {
                String valueOf = String.valueOf(e2.getMessage());
                Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new a(str.length() != 0 ? "Failed to instantiate module class: ".concat(str) : new String("Failed to instantiate module class: "), e2);
        }
    }
}