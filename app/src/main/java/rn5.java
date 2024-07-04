package defpackage;

import android.net.Uri;
import java.util.concurrent.Callable;

/* renamed from: rn5  reason: default package */
public final /* synthetic */ class rn5 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rn5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                wi4 wi4Var = cu5.i;
                cu5 cu5Var = jv5.A.c;
                return cu5.h((Uri) this.b);
            default:
                return new de4(((ce4) this.b).b);
        }
    }
}