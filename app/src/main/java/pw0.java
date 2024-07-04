package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: pw0  reason: default package */
public final class pw0 implements TextWatcher {
    public final /* synthetic */ jy P;

    public pw0(jy jyVar) {
        this.P = jyVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        jy jyVar = this.P;
        if (jyVar != null) {
            jyVar.a();
        }
    }
}