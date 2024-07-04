package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: od1  reason: default package */
public final class od1 implements zc1 {
    public final /* synthetic */ rd1 a;

    public od1(rd1 rd1Var) {
        this.a = rd1Var;
    }

    @Override // defpackage.zc1
    public final void a(rc1 rc1Var) {
        rd1 rd1Var = this.a;
        if (rd1Var.a == null) {
            rd1Var.a = Executors.newSingleThreadScheduledExecutor();
        }
        if (rd1Var.b == null) {
            try {
                rd1Var.b = rd1Var.a.scheduleAtFixedRate(new qd1(rd1Var), 0L, 1000L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                StringBuilder b = e5.b("Error when scheduling network checks: ");
                b.append(e.toString());
                t1.b(0, 0, b.toString(), true);
            }
            rd1Var.a();
        }
    }
}