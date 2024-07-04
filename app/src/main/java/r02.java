package defpackage;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* renamed from: r02  reason: default package */
public final class r02 implements AppOpsManager$OnOpActiveChangedListener {
    public final /* synthetic */ t02 a;

    public r02(t02 t02Var) {
        this.a = t02Var;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        if (z) {
            this.a.a = System.currentTimeMillis();
            this.a.d = true;
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        t02 t02Var = this.a;
        long j = t02Var.b;
        if (j > 0 && currentTimeMillis >= j) {
            t02Var.c = currentTimeMillis - j;
        }
        t02Var.d = false;
    }
}