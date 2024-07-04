package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* renamed from: uq3  reason: default package */
public final class uq3 {
    public Context a;
    public PopupWindow b;

    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Context context, View view) {
        boolean z;
        Window window;
        PopupWindow popupWindow;
        if (Build.VERSION.SDK_INT >= 21) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        if (context instanceof Activity) {
            window = ((Activity) context).getWindow();
        } else {
            window = null;
        }
        if (window != null && window.getDecorView() != null && !((Activity) context).isDestroyed()) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.addView(view, -1, -1);
            popupWindow = new PopupWindow((View) frameLayout, 1, 1, false);
            popupWindow.setOutsideTouchable(true);
            popupWindow.setClippingEnabled(false);
            sv2.b("Displaying the 1x1 popup off the screen.");
            try {
                popupWindow.showAtLocation(window.getDecorView(), 0, -1, -1);
            } catch (Exception unused) {
            }
            this.b = popupWindow;
            if (popupWindow == null) {
                context = null;
            }
            this.a = context;
        }
        popupWindow = null;
        this.b = popupWindow;
        if (popupWindow == null) {
        }
        this.a = context;
    }

    public final void b() {
        Context context = this.a;
        if (context == null || this.b == null) {
            return;
        }
        if ((!(context instanceof Activity) || !((Activity) context).isDestroyed()) && this.b.isShowing()) {
            this.b.dismiss();
        }
        this.a = null;
        this.b = null;
    }
}