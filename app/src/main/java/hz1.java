package defpackage;

import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: hz1  reason: default package */
public final /* synthetic */ class hz1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hz1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return ((xv0) this.b).getClickSignals((String) this.c);
            default:
                dz4 b = ((jv3) this.b).d.b((rq2) this.c);
                return (InputStream) ((bx2) b).get(((Integer) w82.d.c.a(x92.y4)).intValue(), TimeUnit.SECONDS);
        }
    }
}