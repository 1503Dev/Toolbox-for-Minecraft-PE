package defpackage;

import android.util.Log;
import defpackage.z20;
import io.mrarm.mctoolbox.RelaunchActivity;

/* renamed from: ok0  reason: default package */
public final /* synthetic */ class ok0 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ ok0(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                RelaunchActivity relaunchActivity = (RelaunchActivity) this.Q;
                boolean z = RelaunchActivity.S;
                relaunchActivity.getClass();
                RelaunchActivity.b(relaunchActivity);
                return;
            case 1:
                ny0 ny0Var = (ny0) this.Q;
                ((iy0) ny0Var.c).I0(new ly0(0, ny0Var));
                return;
            default:
                z20 z20Var = (z20) this.Q;
                z20Var.getClass();
                try {
                    z20Var.g();
                    return;
                } catch (z20.a e) {
                    Log.e("LoginStage", "Task failed asynchronously");
                    e.printStackTrace();
                    z20Var.d(e.getMessage());
                    return;
                }
        }
    }
}