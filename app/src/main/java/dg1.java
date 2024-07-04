package defpackage;

import android.content.Context;
import android.widget.Toast;

/* renamed from: dg1  reason: default package */
public final class dg1 implements Runnable {
    public final /* synthetic */ Context P;
    public final /* synthetic */ String Q;
    public final /* synthetic */ int R = 0;

    public dg1(Context context, String str) {
        this.P = context;
        this.Q = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText(this.P, this.Q, this.R).show();
    }
}