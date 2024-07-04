package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.b;

/* renamed from: xm  reason: default package */
public final class xm implements View.OnTouchListener {
    public final /* synthetic */ AutoCompleteTextView P;
    public final /* synthetic */ b Q;

    public xm(b bVar, AutoCompleteTextView autoCompleteTextView) {
        this.Q = bVar;
        this.P = autoCompleteTextView;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z = true;
        if (motionEvent.getAction() == 1) {
            b bVar = this.Q;
            bVar.getClass();
            long currentTimeMillis = System.currentTimeMillis() - bVar.i;
            if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
                z = false;
            }
            if (z) {
                this.Q.g = false;
            }
            b.d(this.Q, this.P);
            view.performClick();
        }
        return false;
    }
}