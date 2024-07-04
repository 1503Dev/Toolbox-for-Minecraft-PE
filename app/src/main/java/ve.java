package defpackage;

import android.widget.CompoundButton;

/* renamed from: ve  reason: default package */
public final class ve implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ CompoundButton.OnCheckedChangeListener a;
    public final /* synthetic */ jy b;

    public ve(wb0 wb0Var, jy jyVar) {
        this.a = wb0Var;
        this.b = jyVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.a;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z);
        }
        this.b.a();
    }
}