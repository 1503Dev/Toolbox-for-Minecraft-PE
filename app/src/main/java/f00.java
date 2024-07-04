package defpackage;

import android.content.Context;
import io.mrarm.mctoolbox.bridge.a;
import io.mrarm.mctoolbox.bridge.b;

/* renamed from: f00  reason: default package */
public final class f00 extends sz implements ow {
    @wq0("show_if")
    private uz l;
    private a.InterfaceC0035a m;

    @Override // defpackage.sz
    public final void h(Context context, b bVar) {
        super.h(context, bVar);
        this.l.h();
    }

    @Override // defpackage.ow
    public final uz isVisible() {
        return this.l;
    }
}