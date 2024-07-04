package defpackage;

import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import java.security.GeneralSecurityException;

/* renamed from: eg3  reason: default package */
public final /* synthetic */ class eg3 implements h23, jy4, wy4, es0, iu4, h75 {
    public final /* synthetic */ int P;
    public final Object Q;

    public /* synthetic */ eg3(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // defpackage.jy4
    public final dz4 a() {
        dk1 dk1Var = (dk1) this.Q;
        return dk1Var.u4(dk1Var.R, null, "BANNER", null, null).b();
    }

    @Override // defpackage.iu4
    /* renamed from: a  reason: collision with other method in class */
    public final fv4 mo4a() {
        return new mr4((byte[]) this.Q);
    }

    @Override // defpackage.h23
    public final void d(boolean z) {
        y03 y03Var = ((qn5) this.Q).S;
        if (y03Var != null) {
            y03Var.f0();
        }
    }

    @Override // defpackage.wy4
    public final void f(Object obj) {
        switch (this.P) {
            case 2:
                new xt2(((y03) this.Q).getContext(), ((y03) this.Q).k().P, (String) obj).b();
                return;
            case 3:
            default:
                try {
                    ((kq2) this.Q).T((ParcelFileDescriptor) obj);
                    return;
                } catch (RemoteException e) {
                    vz3.l("Service can't call client", e);
                    return;
                }
            case 4:
                return;
        }
    }

    @Override // defpackage.wy4
    public final void h(Throwable th) {
        switch (this.P) {
            case 2:
                return;
            case 3:
            default:
                try {
                    ((kq2) this.Q).n0(h72.c(th));
                    return;
                } catch (RemoteException e) {
                    vz3.l("Service can't call client", e);
                    return;
                }
            case 4:
                jv5.A.g.f((String) this.Q, th);
                return;
        }
    }

    public /* synthetic */ eg3(IInterface iInterface, int i) {
        this.P = i;
        this.Q = iInterface;
    }

    public eg3(l75 l75Var) {
        this.P = 8;
        if (!ea2.C(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.Q = l75Var;
    }
}