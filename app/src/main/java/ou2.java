package defpackage;

import android.content.Context;
import java.io.IOException;

/* renamed from: ou2  reason: default package */
public final class ou2 implements Runnable {
    public final /* synthetic */ Context P;
    public final /* synthetic */ bx2 Q;

    public ou2(Context context, bx2 bx2Var) {
        this.P = context;
        this.Q = bx2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.Q.a(o3.a(this.P));
        } catch (IOException | IllegalStateException | mt e) {
            this.Q.c(e);
            sv2.e("Exception while getting advertising Id info", e);
        }
    }
}