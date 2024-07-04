package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: w41  reason: default package */
public final class w41 {
    public WeakReference<View> a;

    public w41(View view) {
        this.a = new WeakReference<>(view);
    }

    public final void a(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void b() {
        View view = this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(y41 y41Var) {
        View view = this.a.get();
        if (view != null) {
            if (y41Var != null) {
                view.animate().setListener(new u41(y41Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}