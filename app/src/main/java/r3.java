package defpackage;

import android.view.View;
import androidx.appcompat.app.AlertController;

/* renamed from: r3  reason: default package */
public final class r3 implements Runnable {
    public final /* synthetic */ View P;
    public final /* synthetic */ View Q;
    public final /* synthetic */ AlertController R;

    public r3(AlertController alertController, View view, View view2) {
        this.R = alertController;
        this.P = view;
        this.Q = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AlertController.b(this.R.w, this.P, this.Q);
    }
}