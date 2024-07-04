package defpackage;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: tt2  reason: default package */
public final class tt2 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final String a;
    public final /* synthetic */ ut2 b;

    public tt2(ut2 ut2Var, String str) {
        this.b = ut2Var;
        this.a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.b) {
            Iterator it = this.b.b.iterator();
            while (it.hasNext()) {
                st2 st2Var = (st2) it.next();
                String str2 = this.a;
                ut2 ut2Var = st2Var.a;
                Map map = st2Var.b;
                ut2Var.getClass();
                if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                    ln1 ln1Var = ut2Var.d;
                    ((bt2) ln1Var.R).a(((kd) ln1Var.Q).a(), -1);
                }
            }
        }
    }
}