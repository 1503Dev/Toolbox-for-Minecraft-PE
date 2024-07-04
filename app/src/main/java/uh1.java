package defpackage;

import android.app.Activity;
import android.content.Intent;

/* renamed from: uh1  reason: default package */
public final class uh1 extends ci1 {
    public final /* synthetic */ Intent P;
    public final /* synthetic */ Activity Q;
    public final /* synthetic */ int R = 2;

    public uh1(Activity activity, Intent intent) {
        this.P = intent;
        this.Q = activity;
    }

    @Override // defpackage.ci1
    public final void a() {
        Intent intent = this.P;
        if (intent != null) {
            this.Q.startActivityForResult(intent, this.R);
        }
    }
}