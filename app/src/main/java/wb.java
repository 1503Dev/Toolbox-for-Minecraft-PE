package defpackage;

import android.graphics.Typeface;
import android.os.Handler;
import defpackage.w11;
import defpackage.wq;

/* renamed from: wb  reason: default package */
public final class wb {
    public final ar a;
    public final Handler b;

    public wb(w11.a aVar, Handler handler) {
        this.a = aVar;
        this.b = handler;
    }

    public final void a(wq.a aVar) {
        boolean z;
        int i = aVar.b;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Typeface typeface = aVar.a;
            this.b.post(new ub(this.a, typeface));
            return;
        }
        this.b.post(new vb(this.a, i));
    }
}