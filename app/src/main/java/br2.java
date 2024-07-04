package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;

/* renamed from: br2  reason: default package */
public final class br2 extends ContextWrapper {
    public static Context a(Context context) {
        if (context instanceof br2) {
            return ((br2) context).getBaseContext();
        }
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        throw null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized ApplicationInfo getApplicationInfo() {
        throw null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized String getPackageName() {
        throw null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized String getPackageResourcePath() {
        throw null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized void startActivity(Intent intent) {
        throw null;
    }
}