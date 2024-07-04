package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* renamed from: t90  reason: default package */
public class t90 extends PopupWindow {
    public static final /* synthetic */ int b = 0;
    public boolean a;

    public t90() {
        this.a = false;
    }

    public t90(int i) {
        super(-1, -1);
        this.a = false;
    }

    @Override // android.widget.PopupWindow
    public final void showAtLocation(View view, int i, int i2, int i3) {
        setFocusable(false);
        super.showAtLocation(view, i, i2, i3);
        getContentView().setSystemUiVisibility(5894);
        getContentView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: r90
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public final void onSystemUiVisibilityChange(int i4) {
                t90 t90Var = t90.this;
                t90Var.getContentView().postDelayed(new m30(2, t90Var), 500L);
            }
        });
        if (!this.a) {
            getContentView().getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: s90
                @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
                public final void onWindowFocusChanged(boolean z) {
                    t90 t90Var = t90.this;
                    if (z) {
                        t90Var.getContentView().postDelayed(new dy0(1, t90Var), 500L);
                    } else {
                        t90Var.getClass();
                    }
                }
            });
            this.a = true;
        }
        setFocusable(true);
        update();
    }
}