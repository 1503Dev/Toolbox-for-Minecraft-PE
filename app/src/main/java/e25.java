package defpackage;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/* renamed from: e25  reason: default package */
public final class e25 extends RelativeLayout {
    public final y02 P;
    public boolean Q;

    public e25(Activity activity, String str, String str2, String str3) {
        super(activity);
        y02 y02Var = new y02(activity);
        y02Var.c = str;
        this.P = y02Var;
        y02Var.e = str2;
        y02Var.d = str3;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.Q) {
            return false;
        }
        this.P.a(motionEvent);
        return false;
    }
}