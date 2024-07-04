package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.StrictMode;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* renamed from: w92  reason: default package */
public final class w92 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public Context g;
    public final Object a = new Object();
    public final ConditionVariable b = new ConditionVariable();
    public volatile boolean c = false;
    public volatile boolean d = false;
    public SharedPreferences e = null;
    public Bundle f = new Bundle();
    public JSONObject h = new JSONObject();

    public final Object a(q92 q92Var) {
        if (!this.b.block(5000L)) {
            synchronized (this.a) {
                if (!this.d) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.c || this.e == null) {
            synchronized (this.a) {
                if (this.c && this.e != null) {
                }
                return q92Var.c;
            }
        }
        int i = q92Var.a;
        if (i == 2) {
            Bundle bundle = this.f;
            if (bundle == null) {
                return q92Var.c;
            }
            return q92Var.b(bundle);
        } else if (i == 1 && this.h.has(q92Var.b)) {
            return q92Var.a(this.h);
        } else {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return q92Var.c(this.e);
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str) && this.e != null) {
            try {
                this.h = new JSONObject((String) aa2.a(new zw5(1, this)));
            } catch (JSONException unused) {
            }
        }
    }
}