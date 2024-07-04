package defpackage;

import android.content.Context;

/* renamed from: vq3  reason: default package */
public final class vq3 implements be3 {
    public final y03 P;

    public vq3(y03 y03Var) {
        this.P = y03Var;
    }

    @Override // defpackage.be3
    public final void a(Context context) {
        y03 y03Var = this.P;
        if (y03Var != null) {
            y03Var.destroy();
        }
    }

    @Override // defpackage.be3
    public final void d(Context context) {
        y03 y03Var = this.P;
        if (y03Var != null) {
            y03Var.onResume();
        }
    }

    @Override // defpackage.be3
    public final void e(Context context) {
        y03 y03Var = this.P;
        if (y03Var != null) {
            y03Var.onPause();
        }
    }
}