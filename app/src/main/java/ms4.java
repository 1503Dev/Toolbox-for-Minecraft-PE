package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* renamed from: ms4  reason: default package */
public final class ms4 extends hs4 {
    public final /* synthetic */ IBinder Q;
    public final /* synthetic */ os4 R;

    public ms4(os4 os4Var, IBinder iBinder) {
        this.R = os4Var;
        this.Q = iBinder;
    }

    @Override // defpackage.hs4
    public final void b() {
        es4 cs4Var;
        ps4 ps4Var = this.R.a;
        IBinder iBinder = this.Q;
        int i = ds4.P;
        if (iBinder == null) {
            cs4Var = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
            if (queryLocalInterface instanceof es4) {
                cs4Var = (es4) queryLocalInterface;
            } else {
                cs4Var = new cs4(iBinder);
            }
        }
        ps4Var.m = cs4Var;
        ps4 ps4Var2 = this.R.a;
        ps4Var2.b.c("linkToDeath", new Object[0]);
        try {
            ps4Var2.m.asBinder().linkToDeath(ps4Var2.j, 0);
        } catch (RemoteException e) {
            ps4Var2.b.b(e, "linkToDeath failed", new Object[0]);
        }
        ps4 ps4Var3 = this.R.a;
        ps4Var3.g = false;
        Iterator it = ps4Var3.d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.R.a.d.clear();
    }
}