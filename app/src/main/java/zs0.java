package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: zs0  reason: default package */
public final class zs0 implements TextWatcher {
    public a P;

    /* renamed from: zs0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a {
        void afterTextChanged(Editable editable);
    }

    public zs0(a aVar) {
        this.P = aVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.P.afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}