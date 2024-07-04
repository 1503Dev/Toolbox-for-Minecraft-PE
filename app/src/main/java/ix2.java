package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* renamed from: ix2  reason: default package */
public final class ix2 extends yg5 implements ViewTreeObserver.OnScrollChangedListener {
    public final WeakReference Q;

    public ix2(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        super(view);
        this.Q = new WeakReference(onScrollChangedListener);
    }

    public final void n(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this);
    }

    public final void o(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = (ViewTreeObserver.OnScrollChangedListener) this.Q.get();
        if (onScrollChangedListener != null) {
            onScrollChangedListener.onScrollChanged();
            return;
        }
        ViewTreeObserver f = f();
        if (f != null) {
            o(f);
        }
    }
}