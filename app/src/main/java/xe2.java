package defpackage;

import android.os.RemoteException;
import defpackage.g70;

/* renamed from: xe2  reason: default package */
public final class xe2 extends zd2 {
    public final /* synthetic */ ze2 P;

    public /* synthetic */ xe2(ze2 ze2Var) {
        this.P = ze2Var;
    }

    @Override // defpackage.ae2
    public final void d1(sd2 sd2Var, String str) {
        td2 td2Var;
        ze2 ze2Var = this.P;
        g70.a aVar = ze2Var.b;
        if (aVar == null) {
            return;
        }
        synchronized (ze2Var) {
            td2Var = ze2Var.c;
            if (td2Var == null) {
                td2Var = new td2(sd2Var);
                ze2Var.c = td2Var;
            }
        }
        am2 am2Var = (am2) ((zz3) aVar).Q;
        am2Var.getClass();
        try {
            am2Var.a.m1(td2Var.a, str);
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
    }
}