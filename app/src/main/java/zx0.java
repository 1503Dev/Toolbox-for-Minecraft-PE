package defpackage;

import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.e;

/* renamed from: zx0  reason: default package */
public final class zx0 implements View.OnClickListener {
    public final d1 P;
    public final /* synthetic */ e Q;

    public zx0(e eVar) {
        this.Q = eVar;
        this.P = new d1(eVar.a.getContext(), eVar.i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        e eVar = this.Q;
        Window.Callback callback = eVar.l;
        if (callback == null || !eVar.m) {
            return;
        }
        callback.onMenuItemSelected(0, this.P);
    }
}