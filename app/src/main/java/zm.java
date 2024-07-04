package defpackage;

import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.b;

/* renamed from: zm  reason: default package */
public final class zm implements AutoCompleteTextView.OnDismissListener {
    public final /* synthetic */ b a;

    public zm(b bVar) {
        this.a = bVar;
    }

    @Override // android.widget.AutoCompleteTextView.OnDismissListener
    public final void onDismiss() {
        b bVar = this.a;
        bVar.g = true;
        bVar.i = System.currentTimeMillis();
        this.a.g(false);
    }
}