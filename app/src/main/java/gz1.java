package defpackage;

import android.os.RemoteException;

/* renamed from: gz1  reason: default package */
public final /* synthetic */ class gz1 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ gz1(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                y02 y02Var = (y02) this.Q;
                y02Var.getClass();
                jv5.A.m.a(y02Var.a);
                return;
            case 1:
                ((nl5) this.Q).E();
                return;
            case 2:
            default:
                ((zv3) this.Q).a();
                return;
            case 3:
                jl3 jl3Var = (jl3) this.Q;
                nw4 nw4Var = jl3.G;
                try {
                    nl3 nl3Var = jl3Var.j;
                    int e = nl3Var.e();
                    if (e != 1) {
                        if (e != 2) {
                            if (e != 3) {
                                if (e != 6) {
                                    if (e != 7) {
                                        sv2.d("Wrong native template id!");
                                        return;
                                    }
                                    ni2 ni2Var = jl3Var.n.e;
                                    if (ni2Var != null) {
                                        ni2Var.F1((ji2) jl3Var.r.c());
                                        return;
                                    }
                                    return;
                                } else if (jl3Var.n.c != null) {
                                    jl3Var.l();
                                    jl3Var.n.c.p1((ue2) jl3Var.q.c());
                                    return;
                                } else {
                                    return;
                                }
                            }
                            wl3 wl3Var = jl3Var.n;
                            if (((de2) wl3Var.f.getOrDefault(nl3Var.m(), null)) != null) {
                                if (jl3Var.j.j() != null) {
                                    jl3Var.s("Google", true);
                                }
                                wl3 wl3Var2 = jl3Var.n;
                                ((de2) wl3Var2.f.getOrDefault(jl3Var.j.m(), null)).y1((sd2) jl3Var.s.c());
                                return;
                            }
                            return;
                        } else if (jl3Var.n.b != null) {
                            jl3Var.l();
                            jl3Var.n.b.j2((nd2) jl3Var.p.c());
                            return;
                        } else {
                            return;
                        }
                    } else if (jl3Var.n.a != null) {
                        jl3Var.l();
                        jl3Var.n.a.Y3((pd2) jl3Var.o.c());
                        return;
                    } else {
                        return;
                    }
                } catch (RemoteException e2) {
                    sv2.e("RemoteException when notifyAdLoad is called", e2);
                    return;
                }
            case 4:
                ar3 ar3Var = (ar3) this.Q;
                ar3Var.c.execute(new d06(2, ar3Var));
                return;
        }
    }
}