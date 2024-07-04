package defpackage;

import android.content.Context;
import android.preference.PreferenceManager;
import java.util.Calendar;

/* renamed from: c3  reason: default package */
public final class c3 {
    public static c3 c;
    public final Context a;
    public int b;

    public c3(Context context) {
        this.a = context;
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("ad_cache_info", null);
        if (string != null) {
            try {
                String[] split = string.split(":");
                if (!split[0].equals(a())) {
                    return;
                }
                this.b = Integer.parseInt(split[1]);
            } catch (Exception unused) {
            }
        }
    }

    public static String a() {
        int i = Calendar.getInstance().get(1);
        return String.valueOf(481537659 ^ (((Calendar.getInstance().get(2) * 32) + ((i * 12) * 32)) + Calendar.getInstance().get(5)));
    }
}