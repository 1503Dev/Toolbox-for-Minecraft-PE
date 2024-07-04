package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ve2  reason: default package */
public final class ve2 extends i21 {
    public final ue2 a;
    public final bd2 c;
    public final ArrayList b = new ArrayList();
    public final p31 d = new p31();
    public final ArrayList e = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:59:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0027 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ve2(ue2 ue2Var) {
        ad2 ad2Var;
        IBinder iBinder;
        this.a = ue2Var;
        bd2 bd2Var = null;
        try {
            List u = ue2Var.u();
            if (u != null) {
                for (Object obj : u) {
                    if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        ad2Var = queryLocalInterface instanceof ad2 ? (ad2) queryLocalInterface : new zc2(iBinder);
                        if (ad2Var == null) {
                            this.b.add(new bd2(ad2Var));
                        }
                    }
                    ad2Var = null;
                    if (ad2Var == null) {
                    }
                }
            }
        } catch (RemoteException e) {
            sv2.e("", e);
        }
        try {
            List r = this.a.r();
            if (r != null) {
                for (Object obj2 : r) {
                    de3 t4 = obj2 instanceof IBinder ? n84.t4((IBinder) obj2) : null;
                    if (t4 != null) {
                        this.e.add(new te3(t4));
                    }
                }
            }
        } catch (RemoteException e2) {
            sv2.e("", e2);
        }
        try {
            ad2 l = this.a.l();
            if (l != null) {
                bd2Var = new bd2(l);
            }
        } catch (RemoteException e3) {
            sv2.e("", e3);
        }
        this.c = bd2Var;
        try {
            if (this.a.g() != null) {
                new vc2(this.a.g());
            }
        } catch (RemoteException e4) {
            sv2.e("", e4);
        }
    }
}