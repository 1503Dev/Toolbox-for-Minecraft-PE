package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import defpackage.b70;
import java.util.ArrayList;

/* renamed from: zn2  reason: default package */
public final class zn2 extends b70.a {
    public final ArrayList a = new ArrayList();

    public zn2(uc2 uc2Var) {
        try {
            uc2Var.h();
        } catch (RemoteException e) {
            sv2.e("", e);
        }
        try {
            for (Object obj : uc2Var.f()) {
                ad2 t4 = obj instanceof IBinder ? lc2.t4((IBinder) obj) : null;
                if (t4 != null) {
                    this.a.add(new ao2(t4));
                }
            }
        } catch (RemoteException e2) {
            sv2.e("", e2);
        }
    }
}