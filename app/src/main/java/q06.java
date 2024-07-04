package defpackage;

import android.hardware.display.DisplayManager;

/* renamed from: q06  reason: default package */
public final class q06 implements DisplayManager.DisplayListener, p06 {
    public final DisplayManager P;
    public dk5 Q;

    public q06(DisplayManager displayManager) {
        this.P = displayManager;
    }

    @Override // defpackage.p06
    public final void a() {
        this.P.unregisterDisplayListener(this);
        this.Q = null;
    }

    @Override // defpackage.p06
    public final void b(dk5 dk5Var) {
        this.Q = dk5Var;
        this.P.registerDisplayListener(this, zn4.u());
        s06.b((s06) dk5Var.Q, this.P.getDisplay(0));
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        dk5 dk5Var = this.Q;
        if (dk5Var != null && i == 0) {
            s06.b((s06) dk5Var.Q, this.P.getDisplay(0));
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}