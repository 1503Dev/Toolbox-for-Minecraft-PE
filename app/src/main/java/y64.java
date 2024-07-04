package defpackage;

import android.os.RemoteException;

/* renamed from: y64  reason: default package */
public final class y64 implements vj1, oi3 {
    public qc2 P;

    @Override // defpackage.vj1
    public final synchronized void J() {
        qc2 qc2Var = this.P;
        if (qc2Var != null) {
            try {
                qc2Var.c();
            } catch (RemoteException e) {
                sv2.h("Remote Exception at onAdClicked.", e);
            }
        }
    }

    @Override // defpackage.oi3
    public final synchronized void s() {
    }

    @Override // defpackage.oi3
    public final synchronized void w() {
        qc2 qc2Var = this.P;
        if (qc2Var != null) {
            try {
                qc2Var.c();
            } catch (RemoteException e) {
                sv2.h("Remote Exception at onPhysicalClick.", e);
            }
        }
    }
}