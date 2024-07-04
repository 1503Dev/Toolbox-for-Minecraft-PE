package defpackage;

import android.view.View;
import com.google.android.material.textfield.b;

/* renamed from: ym  reason: default package */
public final class ym implements View.OnFocusChangeListener {
    public final /* synthetic */ b a;

    public ym(b bVar) {
        this.a = bVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        this.a.a.setEndIconActivated(z);
        if (!z) {
            this.a.g(false);
            this.a.g = false;
        }
    }
}