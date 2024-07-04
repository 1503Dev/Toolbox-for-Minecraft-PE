package defpackage;

import android.net.Uri;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.annotation.Nonnull;

/* renamed from: bz5  reason: default package */
public final class bz5 implements wy4 {
    public final /* synthetic */ bp2 P;
    public final /* synthetic */ boolean Q;
    public final /* synthetic */ dk1 R;

    public bz5(dk1 dk1Var, bp2 bp2Var, boolean z) {
        this.R = dk1Var;
        this.P = bp2Var;
        this.Q = z;
    }

    @Override // defpackage.wy4
    public final void f(@Nonnull Object obj) {
        gn4 gn4Var;
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.P.Z1(arrayList);
            if (this.R.e0 || this.Q) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Uri uri = (Uri) it.next();
                    dk1 dk1Var = this.R;
                    if (dk1.y4(uri, dk1Var.q0, dk1Var.r0)) {
                        uri = dk1.z4(uri, this.R.n0, "1");
                        gn4Var = this.R.d0;
                    } else {
                        if (((Boolean) w82.d.c.a(x92.s6)).booleanValue()) {
                            gn4Var = this.R.d0;
                        }
                    }
                    gn4Var.a(uri.toString(), null);
                }
            }
        } catch (RemoteException e) {
            sv2.e("", e);
        }
    }

    @Override // defpackage.wy4
    public final void h(Throwable th) {
        try {
            bp2 bp2Var = this.P;
            String message = th.getMessage();
            bp2Var.D("Internal error: " + message);
        } catch (RemoteException e) {
            sv2.e("", e);
        }
    }
}