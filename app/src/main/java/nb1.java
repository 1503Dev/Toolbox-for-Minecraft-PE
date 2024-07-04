package defpackage;

import defpackage.ua1;
import java.util.ArrayDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: nb1  reason: default package */
public final class nb1 implements ua1.a {
    public final ArrayDeque<ua1> b = new ArrayDeque<>();
    public ua1 c = null;
    public final ThreadPoolExecutor a = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public final void a() {
        ua1 poll = this.b.poll();
        this.c = poll;
        if (poll != null) {
            poll.executeOnExecutor(this.a, new Object[0]);
        }
    }
}