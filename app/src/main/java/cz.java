package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: cz  reason: default package */
public final class cz extends jz {
    public final /* synthetic */ Context T;
    public final /* synthetic */ jl U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz(cw cwVar, sy syVar, Activity activity, jl jlVar) {
        super(cwVar, syVar);
        this.T = activity;
        this.U = jlVar;
    }

    @Override // defpackage.jz, android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ((InputMethodManager) this.T.getSystemService("input_method")).hideSoftInputFromWindow(this.U.j0.getWindowToken(), 0);
        }
        super.onTouch(view, motionEvent);
        return true;
    }
}