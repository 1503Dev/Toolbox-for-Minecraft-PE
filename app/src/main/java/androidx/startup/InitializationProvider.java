package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import java.util.HashSet;

public final class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            if (s6.d == null) {
                synchronized (s6.e) {
                    if (s6.d == null) {
                        s6.d = new s6(context);
                    }
                }
            }
            s6 s6Var = s6.d;
            s6Var.getClass();
            try {
                try {
                    Trace.beginSection("Startup");
                    Bundle bundle = s6Var.c.getPackageManager().getProviderInfo(new ComponentName(s6Var.c.getPackageName(), InitializationProvider.class.getName()), 128).metaData;
                    String string = s6Var.c.getString(qi0.androidx_startup);
                    if (bundle != null) {
                        HashSet hashSet = new HashSet();
                        for (String str : bundle.keySet()) {
                            if (string.equals(bundle.getString(str, null))) {
                                Class<?> cls = Class.forName(str);
                                if (qx.class.isAssignableFrom(cls)) {
                                    s6Var.b.add(cls);
                                    s6Var.a(cls, hashSet);
                                }
                            }
                        }
                    }
                    Trace.endSection();
                    return true;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } catch (PackageManager.NameNotFoundException | ClassNotFoundException e) {
                throw new st0(e);
            }
        }
        throw new st0(0);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}