package defpackage;

import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: xl4  reason: default package */
public final class xl4 implements wl4 {
    public final wl4 a;
    public final LinkedBlockingQueue b = new LinkedBlockingQueue();
    public final int c;
    public final AtomicBoolean d;

    public xl4(wl4 wl4Var, ScheduledExecutorService scheduledExecutorService) {
        this.a = wl4Var;
        m92 m92Var = x92.n7;
        w82 w82Var = w82.d;
        this.c = ((Integer) w82Var.c.a(m92Var)).intValue();
        this.d = new AtomicBoolean(false);
        long intValue = ((Integer) w82Var.c.a(x92.m7)).intValue();
        scheduledExecutorService.scheduleAtFixedRate(new d06(4, this), intValue, intValue, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.wl4
    public final void a(vl4 vl4Var) {
        if (this.b.size() < this.c) {
            this.b.offer(vl4Var);
        } else if (this.d.getAndSet(true)) {
        } else {
            LinkedBlockingQueue linkedBlockingQueue = this.b;
            vl4 b = vl4.b("dropped_event");
            HashMap g = vl4Var.g();
            if (g.containsKey("action")) {
                b.a("dropped_action", (String) g.get("action"));
            }
            linkedBlockingQueue.offer(b);
        }
    }

    @Override // defpackage.wl4
    public final String b(vl4 vl4Var) {
        return this.a.b(vl4Var);
    }
}