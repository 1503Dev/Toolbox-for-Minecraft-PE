package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: w10  reason: default package */
public final class w10 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ x10 P;

    public w10(x10 x10Var) {
        this.P = x10Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        wm wmVar;
        if (i == -1 || (wmVar = this.P.R) == null) {
            return;
        }
        wmVar.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}