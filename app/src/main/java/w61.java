package defpackage;

import android.content.Context;
import androidx.work.impl.foreground.a;
import defpackage.e0;
import java.util.UUID;

/* renamed from: w61  reason: default package */
public final class w61 implements Runnable {
    public final /* synthetic */ yq0 P;
    public final /* synthetic */ UUID Q;
    public final /* synthetic */ br R;
    public final /* synthetic */ Context S;
    public final /* synthetic */ x61 T;

    public w61(x61 x61Var, yq0 yq0Var, UUID uuid, br brVar, Context context) {
        this.T = x61Var;
        this.P = yq0Var;
        this.Q = uuid;
        this.R = brVar;
        this.S = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!(this.P.P instanceof e0.b)) {
                String uuid = this.Q.toString();
                y61 f = ((n71) this.T.c).f(uuid);
                if (f != null && !f.b()) {
                    ((eg0) this.T.b).e(uuid, this.R);
                    this.S.startService(a.b(this.S, uuid, this.R));
                } else {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
            }
            this.P.j(null);
        } catch (Throwable th) {
            this.P.k(th);
        }
    }
}