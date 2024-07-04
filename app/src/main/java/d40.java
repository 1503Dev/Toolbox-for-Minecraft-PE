package defpackage;

import android.view.View;
import com.google.android.material.datepicker.b;

/* renamed from: d40  reason: default package */
public final class d40 extends h0 {
    public final /* synthetic */ b d;

    public d40(b bVar) {
        this.d = bVar;
    }

    @Override // defpackage.h0
    public final void d(View view, s0 s0Var) {
        b bVar;
        int i;
        this.a.onInitializeAccessibilityNodeInfo(view, s0Var.a);
        if (this.d.R0.getVisibility() == 0) {
            bVar = this.d;
            i = ui0.mtrl_picker_toggle_to_year_selection;
        } else {
            bVar = this.d;
            i = ui0.mtrl_picker_toggle_to_day_selection;
        }
        s0Var.k(bVar.m(i));
    }
}