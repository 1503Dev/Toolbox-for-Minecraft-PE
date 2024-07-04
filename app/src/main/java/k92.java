package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: k92  reason: default package */
public final class k92 {
    public final Context a;

    public k92(Context context) {
        if (context == null) {
            throw new NullPointerException("Context can not be null");
        }
        this.a = context;
    }

    public final boolean a(Intent intent) {
        if (intent != null) {
            return !this.a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
        }
        throw new NullPointerException("Intent can not be null");
    }
}