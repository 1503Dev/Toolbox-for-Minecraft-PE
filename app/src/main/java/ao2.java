package defpackage;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import defpackage.b70;

/* renamed from: ao2  reason: default package */
public final class ao2 extends b70.b {
    public final ad2 a;

    public ao2(ad2 ad2Var) {
        this.a = ad2Var;
        try {
            hw e = ad2Var.e();
            if (e != null) {
                Drawable drawable = (Drawable) va0.c0(e);
            }
        } catch (RemoteException e2) {
            sv2.e("", e2);
        }
        try {
            this.a.b();
        } catch (RemoteException e3) {
            sv2.e("", e3);
        }
        try {
            this.a.c();
        } catch (RemoteException e4) {
            sv2.e("", e4);
        }
        try {
            this.a.i();
        } catch (RemoteException e5) {
            sv2.e("", e5);
        }
        try {
            this.a.d();
        } catch (RemoteException e6) {
            sv2.e("", e6);
        }
    }
}