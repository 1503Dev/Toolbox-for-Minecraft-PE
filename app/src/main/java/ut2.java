package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: ut2  reason: default package */
public final class ut2 {
    public final HashMap a = new HashMap();
    public final ArrayList b = new ArrayList();
    public final Context c;
    public final ln1 d;

    public ut2(Context context, ln1 ln1Var) {
        this.c = context;
        this.d = ln1Var;
    }

    public final synchronized void a(String str) {
        if (this.a.containsKey(str)) {
            return;
        }
        SharedPreferences defaultSharedPreferences = "__default__".equals(str) ? PreferenceManager.getDefaultSharedPreferences(this.c) : this.c.getSharedPreferences(str, 0);
        tt2 tt2Var = new tt2(this, str);
        this.a.put(str, tt2Var);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(tt2Var);
    }
}