package defpackage;

import android.os.RemoteException;
import java.util.Map;

/* renamed from: dp3  reason: default package */
public final class dp3 implements mg2 {
    public final ae2 P;
    public final kp3 Q;
    public final hj5 R;

    public dp3(wl3 wl3Var, nl3 nl3Var, kp3 kp3Var, hj5 hj5Var) {
        this.P = (ae2) wl3Var.g.getOrDefault(nl3Var.m(), null);
        this.Q = kp3Var;
        this.R = hj5Var;
    }

    @Override // defpackage.mg2
    public final void b(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.P.d1((sd2) this.R.c(), str);
        } catch (RemoteException e) {
            sv2.h("Failed to call onCustomClick for asset " + str + ".", e);
        }
    }
}