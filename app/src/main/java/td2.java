package defpackage;

import android.content.Context;
import android.os.RemoteException;

/* renamed from: td2  reason: default package */
public final class td2 implements g70 {
    public final sd2 a;

    public td2(sd2 sd2Var) {
        Context context;
        this.a = sd2Var;
        try {
            context = (Context) va0.c0(sd2Var.f());
        } catch (RemoteException | NullPointerException e) {
            sv2.e("", e);
            context = null;
        }
        if (context != null) {
            try {
                this.a.m0(new va0(new g50(context)));
            } catch (RemoteException e2) {
                sv2.e("", e2);
            }
        }
    }
}