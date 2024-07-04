package defpackage;

import android.content.Context;
import android.view.WindowManager;

/* renamed from: y54  reason: default package */
public final class y54 implements wg3, p06 {
    public final Object P;

    public /* synthetic */ y54(Object obj) {
        this.P = obj;
    }

    @Override // defpackage.p06
    public final void a() {
    }

    @Override // defpackage.p06
    public final void b(dk5 dk5Var) {
        s06.b((s06) dk5Var.Q, ((WindowManager) this.P).getDefaultDisplay());
    }

    @Override // defpackage.wg3
    /* renamed from: e */
    public final void mo0e(Object obj) {
        ((be3) obj).e((Context) this.P);
    }
}