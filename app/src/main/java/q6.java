package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: q6  reason: default package */
public final class q6 {
    public static WeakHashMap<Activity, q6> c = new WeakHashMap<>();
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();

    public static q6 b(Context context) {
        Activity h = ea2.h(context);
        if (h != null) {
            q6 q6Var = c.get(h);
            if (q6Var == null) {
                q6 q6Var2 = new q6();
                c.put(h, q6Var2);
                return q6Var2;
            }
            return q6Var;
        }
        return null;
    }

    public final int a(Dialog dialog) {
        for (int i = 0; i < this.a.size(); i++) {
            if (((WeakReference) this.a.get(i)).get() == dialog) {
                return i;
            }
        }
        return -1;
    }
}