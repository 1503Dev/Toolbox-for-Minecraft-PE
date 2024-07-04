package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: yr  reason: default package */
public final class yr implements Runnable {
    public final /* synthetic */ ArrayList P;
    public final /* synthetic */ Map Q;

    public yr(ArrayList arrayList, e7 e7Var) {
        this.P = arrayList;
        this.Q = e7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        int size = this.P.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.P.get(i);
            String g = a41.g(view);
            if (g != null) {
                Iterator it = this.Q.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (g.equals(entry.getValue())) {
                            str = (String) entry.getKey();
                            break;
                        }
                    } else {
                        str = null;
                        break;
                    }
                }
                a41.o(view, str);
            }
        }
    }
}