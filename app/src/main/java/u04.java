package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* renamed from: u04  reason: default package */
public final /* synthetic */ class u04 implements kv1, bz1, ex2, nw3, wy4, aa3, e74 {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ u04(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // defpackage.aa3, defpackage.qt4
    public final cs3 a() {
        try {
            return ((zm2) ((h14) this.Q).b).b();
        } catch (RemoteException e) {
            throw new ni4(e);
        }
    }

    @Override // defpackage.e74
    /* renamed from: a */
    public final void mo1a() {
        synchronized (((q64) this.Q)) {
            ((q64) this.Q).W = null;
        }
    }

    /*  JADX ERROR: Type inference failed with exception
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r84v4 ?? I:??[int, boolean, short, byte, char])
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:114)
        */
    @Override // defpackage.bz1
    public final void b(byte[] r95, byte[] r96) {
        /*
            Method dump skipped, instructions count: 2683
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u04.b(byte[], byte[]):void");
    }

    @Override // defpackage.kv1
    public final void c(ov1 ov1Var) {
        ((bx2) this.Q).c(ov1Var);
    }

    @Override // defpackage.nw3
    public final dz4 d(rq2 rq2Var) {
        return ((cy3) ((ow3) this.Q).c.c()).t4(rq2Var, Binder.getCallingUid());
    }

    @Override // defpackage.ex2
    public final void e(Object obj) {
        rj2 rj2Var = (rj2) this.Q;
        rj2Var.getClass();
        if (((ui2) obj).g()) {
            rj2Var.g = 1;
        }
    }

    @Override // defpackage.wy4
    public final void f(Object obj) {
        switch (this.P) {
            case 6:
                try {
                    ((hq2) this.Q).T((ParcelFileDescriptor) obj);
                    return;
                } catch (RemoteException e) {
                    vz3.l("Ad service can't call client", e);
                    return;
                }
            default:
                h83 h83Var = (h83) obj;
                synchronized (((q64) this.Q)) {
                    h83 h83Var2 = ((q64) this.Q).W;
                    if (h83Var2 != null) {
                        ee3 ee3Var = h83Var2.c;
                        ee3Var.getClass();
                        ee3Var.R0(new cz1(1, null));
                    }
                    Object obj2 = this.Q;
                    ((q64) obj2).W = h83Var;
                    ((q64) obj2).W.a();
                }
                return;
        }
    }

    public final mk5[] g(Handler handler, xl5 xl5Var, xl5 xl5Var2) {
        l03 l03Var = (l03) this.Q;
        Context context = l03Var.R;
        gq5 gq5Var = gq5.b;
        kr3[] kr3VarArr = new kr3[0];
        fe3 fe3Var = new fe3();
        if (gq5Var != null || gq5Var != null) {
            fe3Var.P = gq5Var;
            fe3Var.R = new vc2(kr3VarArr);
            return new mk5[]{new ur5(context, handler, xl5Var2, new rr5(fe3Var)), new j06(l03Var.R, handler, xl5Var)};
        }
        throw new NullPointerException("Both parameters are null");
    }

    @Override // defpackage.wy4
    public final void h(Throwable th) {
        try {
            ((hq2) this.Q).n0(h72.c(th));
        } catch (RemoteException e) {
            vz3.l("Ad service can't call client", e);
        }
    }

    public /* synthetic */ u04(fz1 fz1Var) {
        this.P = 2;
        this.Q = fz1Var;
    }

    public u04(hq2 hq2Var) {
        this.P = 6;
        this.Q = hq2Var;
    }
}