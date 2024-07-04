package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: dq3  reason: default package */
public final class dq3 implements lj5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ dq3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.uj5
    public final /* synthetic */ Object c() {
        switch (this.a) {
            case 0:
                if (((ed3) ((uj5) this.b)).a().o.P == 3) {
                    return "rewarded_interstitial";
                }
                return "rewarded";
            case 1:
                return new js3((kd) ((uj5) this.b).c());
            case 2:
                return new n94((bg4) ((uj5) this.b).c());
            case 3:
                ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, (ThreadFactory) ((uj5) this.b).c()));
                tv2.C(unconfigurableScheduledExecutorService);
                return unconfigurableScheduledExecutorService;
            default:
                Set emptySet = Collections.emptySet();
                tv2.C(emptySet);
                return emptySet;
        }
    }
}