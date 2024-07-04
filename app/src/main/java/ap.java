package defpackage;

import android.app.Activity;
import io.mrarm.mctoolbox.ErrorActivity;
import io.mrarm.mctoolbox.MinecraftActivity;

/* renamed from: ap  reason: default package */
public final /* synthetic */ class ap implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Activity Q;

    public /* synthetic */ ap(Activity activity, int i) {
        this.P = i;
        this.Q = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                ErrorActivity errorActivity = (ErrorActivity) this.Q;
                int i = ErrorActivity.d0;
                errorActivity.r(errorActivity.getPackageName());
                return;
            default:
                d70.a((MinecraftActivity) this.Q);
                return;
        }
    }
}