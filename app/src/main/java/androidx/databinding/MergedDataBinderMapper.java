package androidx.databinding;

import android.util.Log;
import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MergedDataBinderMapper extends gj {
    public HashSet a = new HashSet();
    public CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public CopyOnWriteArrayList c = new CopyOnWriteArrayList();

    @Override // defpackage.gj
    public final ViewDataBinding b(hj hjVar, View view, int i) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ViewDataBinding b = ((gj) it.next()).b(hjVar, view, i);
            if (b != null) {
                return b;
            }
        }
        if (f()) {
            return b(hjVar, view, i);
        }
        return null;
    }

    @Override // defpackage.gj
    public final ViewDataBinding c(hj hjVar, View[] viewArr, int i) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ViewDataBinding c = ((gj) it.next()).c(hjVar, viewArr, i);
            if (c != null) {
                return c;
            }
        }
        if (f()) {
            return c(hjVar, viewArr, i);
        }
        return null;
    }

    @Override // defpackage.gj
    public final int d(String str) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            int d = ((gj) it.next()).d(str);
            if (d != 0) {
                return d;
            }
        }
        if (f()) {
            return d(str);
        }
        return 0;
    }

    public final void e(gj gjVar) {
        if (this.a.add(gjVar.getClass())) {
            this.b.add(gjVar);
            for (gj gjVar2 : gjVar.a()) {
                e(gjVar2);
            }
        }
    }

    public final boolean f() {
        StringBuilder sb;
        Iterator it = this.c.iterator();
        boolean z = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                Class<?> cls = Class.forName(str);
                if (gj.class.isAssignableFrom(cls)) {
                    e((gj) cls.newInstance());
                    this.c.remove(str);
                    z = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e) {
                e = e;
                sb = new StringBuilder();
                sb.append("unable to add feature mapper for ");
                sb.append(str);
                Log.e("MergedDataBinderMapper", sb.toString(), e);
            } catch (InstantiationException e2) {
                e = e2;
                sb = new StringBuilder();
                sb.append("unable to add feature mapper for ");
                sb.append(str);
                Log.e("MergedDataBinderMapper", sb.toString(), e);
            }
        }
        return z;
    }
}