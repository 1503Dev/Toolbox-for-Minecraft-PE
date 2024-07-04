package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: fs2  reason: default package */
public final class fs2 extends xl0 {
    public final wr2 a;
    public final Context b;
    public final os2 c;

    public fs2(Context context, String str) {
        this.b = context.getApplicationContext();
        t42 t42Var = n62.f.b;
        tk2 tk2Var = new tk2();
        t42Var.getClass();
        this.a = (wr2) new s32(context, str, tk2Var).d(context, false);
        this.c = new os2();
    }

    @Override // defpackage.xl0
    public final rl0 a() {
        mq3 mq3Var;
        wr2 wr2Var;
        try {
            wr2Var = this.a;
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
        if (wr2Var != null) {
            mq3Var = wr2Var.d();
            return new rl0(mq3Var);
        }
        mq3Var = null;
        return new rl0(mq3Var);
    }

    @Override // defpackage.xl0
    public final void c(y2 y2Var) {
        this.c.P = y2Var;
    }

    @Override // defpackage.xl0
    public final void d(Activity activity, jc0 jc0Var) {
        this.c.Q = jc0Var;
        if (activity == null) {
            sv2.g("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            wr2 wr2Var = this.a;
            if (wr2Var != null) {
                wr2Var.t2(this.c);
                this.a.S(new va0(activity));
            }
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
    }
}