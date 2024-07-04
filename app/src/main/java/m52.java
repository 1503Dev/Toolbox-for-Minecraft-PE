package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* renamed from: m52  reason: default package */
public final class m52 {
    public n22 a;
    public boolean b;
    public final ExecutorService c;

    public m52() {
        this.c = jv2.b;
    }

    public m52(Context context) {
        ExecutorService executorService = jv2.b;
        this.c = executorService;
        executorService.execute(new yk5(1, this, context));
    }
}