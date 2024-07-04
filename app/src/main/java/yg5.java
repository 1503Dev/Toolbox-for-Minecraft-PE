package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* renamed from: yg5  reason: default package */
public abstract class yg5 {
    public final Object P;

    public /* synthetic */ yg5(View view) {
        this.P = new WeakReference(view);
    }

    public /* synthetic */ yg5(Object obj) {
        this.P = obj;
    }

    public abstract byte a(long j);

    public abstract boolean b(kh4 kh4Var);

    public abstract double c(long j, Object obj);

    public abstract boolean d(long j, kh4 kh4Var);

    public abstract float e(long j, Object obj);

    public final ViewTreeObserver f() {
        ViewTreeObserver viewTreeObserver;
        View view = (View) ((WeakReference) this.P).get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }

    public abstract void g(long j, byte[] bArr, long j2, long j3);

    public abstract void h(Object obj, long j, boolean z);

    public abstract void i(Object obj, long j, byte b);

    public final boolean j(long j, kh4 kh4Var) {
        return b(kh4Var) && d(j, kh4Var);
    }

    public abstract void k(Object obj, long j, double d);

    public abstract void l(Object obj, long j, float f);

    public abstract boolean m(long j, Object obj);
}