package defpackage;

import android.content.Context;
import defpackage.wq;
import java.util.concurrent.Callable;

/* renamed from: uq  reason: default package */
public final class uq implements Callable<wq.a> {
    public final /* synthetic */ String a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ rq c;
    public final /* synthetic */ int d;

    public uq(String str, Context context, rq rqVar, int i) {
        this.a = str;
        this.b = context;
        this.c = rqVar;
        this.d = i;
    }

    @Override // java.util.concurrent.Callable
    public final wq.a call() {
        return wq.a(this.a, this.b, this.c, this.d);
    }
}