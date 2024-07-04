package defpackage;

import android.os.RemoteException;
import defpackage.p31;

/* renamed from: vp3  reason: default package */
public final class vp3 extends p31.a {
    public final nl3 a;

    public vp3(nl3 nl3Var) {
        this.a = nl3Var;
    }

    @Override // defpackage.p31.a
    public final void a() {
        cs3 g = this.a.g();
        iu3 iu3Var = null;
        if (g != null) {
            try {
                iu3Var = g.g();
            } catch (RemoteException unused) {
            }
        }
        if (iu3Var == null) {
            return;
        }
        try {
            iu3Var.b();
        } catch (RemoteException e) {
            sv2.h("Unable to call onVideoEnd()", e);
        }
    }

    @Override // defpackage.p31.a
    public final void b() {
        cs3 g = this.a.g();
        iu3 iu3Var = null;
        if (g != null) {
            try {
                iu3Var = g.g();
            } catch (RemoteException unused) {
            }
        }
        if (iu3Var == null) {
            return;
        }
        try {
            iu3Var.h();
        } catch (RemoteException e) {
            sv2.h("Unable to call onVideoEnd()", e);
        }
    }

    @Override // defpackage.p31.a
    public final void c() {
        cs3 g = this.a.g();
        iu3 iu3Var = null;
        if (g != null) {
            try {
                iu3Var = g.g();
            } catch (RemoteException unused) {
            }
        }
        if (iu3Var == null) {
            return;
        }
        try {
            iu3Var.g();
        } catch (RemoteException e) {
            sv2.h("Unable to call onVideoEnd()", e);
        }
    }
}