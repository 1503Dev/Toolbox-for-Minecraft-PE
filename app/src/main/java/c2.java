package defpackage;

import defpackage.r2;
import defpackage.tv;
import java.util.concurrent.ExecutorService;

/* renamed from: c2  reason: default package */
public final class c2 extends z61 {
    public final /* synthetic */ tv.a f;

    public c2(r2.b bVar) {
        this.f = bVar;
    }

    @Override // defpackage.z61
    public final void Q0() {
        w1.e();
        this.f.a();
    }

    @Override // defpackage.z61
    public final void U0(i2 i2Var) {
        if (i2Var.c()) {
            r10 r10Var = new r10(this.f);
            ExecutorService executorService = w1.a;
            if (!ga1.R) {
                t1.b(0, 1, "Ignoring call to AdColony.setRewardListener() as AdColony has not yet been configured.", false);
            } else {
                ga1.h().p = r10Var;
            }
            this.f.c();
        }
    }

    @Override // defpackage.z61
    public final void V0() {
        this.f.b();
        w1.e();
    }
}