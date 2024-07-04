package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.IOException;

/* renamed from: er4  reason: default package */
public final class er4 {
    public static er4 c;
    public final String a;
    public final SharedPreferences b;

    public er4(Context context) {
        this.a = context.getPackageName();
        this.b = context.getSharedPreferences("paid_storage_sp", 0);
    }

    public final void a(String str, Object obj) {
        SharedPreferences.Editor putBoolean;
        if (obj instanceof String) {
            putBoolean = this.b.edit().putString(str, (String) obj);
        } else if (obj instanceof Long) {
            putBoolean = this.b.edit().putLong(str, ((Long) obj).longValue());
        } else if (!(obj instanceof Boolean)) {
            String str2 = "Unexpected object class " + String.valueOf(obj.getClass()) + " for app " + this.a;
            Log.e("PaidLifecycleSPHandler", str2);
            throw new IllegalArgumentException(str2);
        } else {
            putBoolean = this.b.edit().putBoolean(str, ((Boolean) obj).booleanValue());
        }
        if (putBoolean.commit()) {
            return;
        }
        String str3 = "Failed to store " + str + " for app " + this.a;
        Log.e("PaidLifecycleSPHandler", str3);
        throw new IOException(str3);
    }

    public final void b(String str) {
        if (this.b.edit().remove(str).commit()) {
            return;
        }
        String str2 = "Failed to remove " + str + " for app " + this.a;
        Log.e("PaidLifecycleSPHandler", str2);
        throw new IOException(str2);
    }
}