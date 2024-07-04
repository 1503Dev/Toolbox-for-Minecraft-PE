package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: g0  reason: default package */
public final class g0 extends ClickableSpan {
    public final int P;
    public final s0 Q;
    public final int R;

    public g0(int i, s0 s0Var, int i2) {
        this.P = i;
        this.Q = s0Var;
        this.R = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.P);
        s0 s0Var = this.Q;
        s0Var.a.performAction(this.R, bundle);
    }
}