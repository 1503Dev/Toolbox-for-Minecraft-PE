package defpackage;

import android.os.Build;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: nn0  reason: default package */
public final class nn0 {
    public static final String a = y20.e("Schedulers");

    public static void a(a aVar, WorkDatabase workDatabase, List<mn0> list) {
        int i;
        if (list != null && list.size() != 0) {
            m71 n = workDatabase.n();
            workDatabase.c();
            try {
                if (Build.VERSION.SDK_INT == 23) {
                    i = aVar.h / 2;
                } else {
                    i = aVar.h;
                }
                n71 n71Var = (n71) n;
                ArrayList c = n71Var.c(i);
                ArrayList b = n71Var.b();
                if (c.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator it = c.iterator();
                    while (it.hasNext()) {
                        n71Var.l(((l71) it.next()).a, currentTimeMillis);
                    }
                }
                workDatabase.h();
                workDatabase.f();
                if (c.size() > 0) {
                    l71[] l71VarArr = (l71[]) c.toArray(new l71[c.size()]);
                    for (mn0 mn0Var : list) {
                        if (mn0Var.f()) {
                            mn0Var.d(l71VarArr);
                        }
                    }
                }
                if (b.size() > 0) {
                    l71[] l71VarArr2 = (l71[]) b.toArray(new l71[b.size()]);
                    for (mn0 mn0Var2 : list) {
                        if (!mn0Var2.f()) {
                            mn0Var2.d(l71VarArr2);
                        }
                    }
                }
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
    }
}