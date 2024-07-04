package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: dp5  reason: default package */
public final class dp5 implements View.OnTouchListener {
    public final /* synthetic */ gu5 P;

    public dp5(gu5 gu5Var) {
        this.P = gu5Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        rz1 rz1Var = this.P.W;
        if (rz1Var != null) {
            rz1Var.b.b(motionEvent);
            return false;
        }
        return false;
    }
}