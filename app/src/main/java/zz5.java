package defpackage;

import android.net.Uri;
import android.os.RemoteException;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nonnull;

/* renamed from: zz5  reason: default package */
public final class zz5 implements wy4 {
    public final /* synthetic */ bp2 P;
    public final /* synthetic */ boolean Q;
    public final /* synthetic */ dk1 R;

    public zz5(dk1 dk1Var, bp2 bp2Var, boolean z) {
        this.R = dk1Var;
        this.P = bp2Var;
        this.Q = z;
    }

    @Override // defpackage.wy4
    public final void f(@Nonnull Object obj) {
        gn4 gn4Var;
        List<Uri> list = (List) obj;
        try {
            dk1 dk1Var = this.R;
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (dk1.y4((Uri) it.next(), dk1Var.o0, dk1Var.p0)) {
                        dk1Var.k0.getAndIncrement();
                        break;
                    }
                } else {
                    break;
                }
            }
            this.P.Z1(list);
            if (this.R.f0 || this.Q) {
                for (Uri uri : list) {
                    dk1 dk1Var2 = this.R;
                    if (dk1.y4(uri, dk1Var2.o0, dk1Var2.p0)) {
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