package defpackage;

import java.util.concurrent.ScheduledFuture;

/* renamed from: pd1  reason: default package */
public final class pd1 implements zc1 {
    public final /* synthetic */ rd1 a;

    public pd1(rd1 rd1Var) {
        this.a = rd1Var;
    }

    @Override // defpackage.zc1
    public final void a(rc1 rc1Var) {
        rd1 rd1Var = this.a;
        ScheduledFuture<?> scheduledFuture = rd1Var.b;
        if (scheduledFuture != null) {
            if (!scheduledFuture.isCancelled()) {
                rd1Var.b.cancel(false);
            }
            rd1Var.b = null;
        }
    }
}