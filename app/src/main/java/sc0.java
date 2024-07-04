package defpackage;

import android.util.Log;
import defpackage.qs0;
import io.mrarm.mctoolbox.ui.a;
import io.mrarm.mctoolbox.ui.b;
import io.mrarm.mctoolbox.ui.c;

/* renamed from: sc0  reason: default package */
public final /* synthetic */ class sc0 implements qs0.a, a.InterfaceC0037a {
    public final /* synthetic */ Object a;

    public /* synthetic */ sc0(Object obj) {
        this.a = obj;
    }

    @Override // io.mrarm.mctoolbox.ui.a.InterfaceC0037a
    public final void a(Class cls, String str) {
        b.a aVar = (b.a) this.a;
        aVar.getClass();
        ((c.b) aVar.a).c.add(c.a(str, wv0.a(wv0.b(cls))));
    }

    @Override // defpackage.qs0.a
    public final void b(Throwable th) {
        Log.e("LicenseVerify", "Failed to verify Google Play subscription");
        th.printStackTrace();
        ((Runnable) this.a).run();
    }
}