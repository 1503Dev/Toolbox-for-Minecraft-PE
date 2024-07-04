package defpackage;

import android.content.Context;
import android.os.RemoteException;

/* renamed from: p64  reason: default package */
public final class p64 extends mj2 {
    public final b74 P;

    public p64(Context context, q23 q23Var, ki4 ki4Var, wl3 wl3Var, gf2 gf2Var) {
        d74 d74Var = new d74(wl3Var, q23Var.p());
        d74Var.b.P.set(gf2Var);
        this.P = new b74(new j74(q23Var, context, d74Var, ki4Var), ki4Var.c);
    }

    @Override // defpackage.ik2
    public final void X2(pn5 pn5Var) {
        this.P.a(pn5Var, 1);
    }

    @Override // defpackage.ik2
    public final synchronized String b() {
        String str;
        b74 b74Var = this.P;
        synchronized (b74Var) {
            str = null;
            try {
                mq3 mq3Var = (mq3) b74Var.R;
                if (mq3Var != null) {
                    str = mq3Var.h();
                }
            } catch (RemoteException e) {
                sv2.i("#007 Could not call remote method.", e);
            }
        }
        return str;
    }

    @Override // defpackage.ik2
    public final synchronized String e() {
        String str;
        b74 b74Var = this.P;
        synchronized (b74Var) {
            str = null;
            try {
                mq3 mq3Var = (mq3) b74Var.R;
                if (mq3Var != null) {
                    str = mq3Var.h();
                }
            } catch (RemoteException e) {
                sv2.i("#007 Could not call remote method.", e);
            }
        }
        return str;
    }

    @Override // defpackage.ik2
    public final synchronized boolean g() {
        boolean a;
        b74 b74Var = this.P;
        synchronized (b74Var) {
            a = ((f74) b74Var.P).a();
        }
        return a;
    }

    @Override // defpackage.ik2
    public final synchronized void v2(pn5 pn5Var, int i) {
        this.P.a(pn5Var, i);
    }
}