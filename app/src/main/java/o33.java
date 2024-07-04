package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;

/* renamed from: o33  reason: default package */
public final class o33 {
    public final View a;
    public Activity b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final ViewTreeObserver.OnGlobalLayoutListener f;

    public o33(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.b = activity;
        this.a = view;
        this.f = onGlobalLayoutListener;
    }

    public final void a() {
        View decorView;
        if (!this.c) {
            Activity activity = this.b;
            if (activity != null) {
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f;
                Window window = activity.getWindow();
                ViewTreeObserver viewTreeObserver = null;
                if (window != null && (decorView = window.getDecorView()) != null) {
                    viewTreeObserver = decorView.getViewTreeObserver();
                }
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                }
            }
            gx2 gx2Var = jv5.A.z;
            hx2 hx2Var = new hx2(this.a, this.f);
            ViewTreeObserver f = hx2Var.f();
            if (f != null) {
                hx2Var.n(f);
            }
            this.c = true;
        }
    }
}