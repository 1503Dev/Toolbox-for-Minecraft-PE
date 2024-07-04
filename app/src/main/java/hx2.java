package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* renamed from: hx2  reason: default package */
public final class hx2 extends yg5 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final WeakReference Q;

    public hx2(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.Q = new WeakReference(onGlobalLayoutListener);
    }

    public final void n(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    public final void o(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) this.Q.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
            return;
        }
        ViewTreeObserver f = f();
        if (f != null) {
            o(f);
        }
    }
}