package defpackage;

import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: c5  reason: default package */
public abstract class c5 {
    public static final g7<WeakReference<c5>> P = new g7<>();
    public static final Object Q = new Object();

    public static void p(c5 c5Var) {
        synchronized (Q) {
            Iterator<WeakReference<c5>> it = P.iterator();
            while (it.hasNext()) {
                c5 c5Var2 = it.next().get();
                if (c5Var2 == c5Var || c5Var2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public void d() {
    }

    public abstract <T extends View> T e(int i);

    public abstract MenuInflater f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n();

    public abstract void o();

    public abstract boolean q(int i);

    public abstract void r(int i);

    public abstract void s(View view);

    public abstract void t(View view, ViewGroup.LayoutParams layoutParams);

    public void u(int i) {
    }

    public abstract void v(CharSequence charSequence);
}