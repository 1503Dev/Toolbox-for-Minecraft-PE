package defpackage;

import java.io.IOException;

/* renamed from: ef  reason: default package */
public final class ef implements cy {
    @Override // defpackage.cy
    public final nl0 a(bk0 bk0Var) {
        uk0 uk0Var = bk0Var.e;
        d11 d11Var = bk0Var.b;
        boolean z = !uk0Var.b.equals("GET");
        synchronized (d11Var.b) {
            if (!d11Var.o) {
                if (d11Var.j != null) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                }
            } else {
                throw new IllegalStateException("released");
            }
        }
        jp jpVar = d11Var.h;
        nb0 nb0Var = d11Var.a;
        jpVar.getClass();
        try {
            hp hpVar = new hp(d11Var, d11Var.c, d11Var.d, d11Var.h, jpVar.b(bk0Var.g, bk0Var.h, bk0Var.i, nb0Var.o0, nb0Var.j0, z).g(nb0Var, bk0Var));
            synchronized (d11Var.b) {
                d11Var.j = hpVar;
                d11Var.k = false;
                d11Var.l = false;
            }
            return bk0Var.b(uk0Var, d11Var, hpVar);
        } catch (IOException e) {
            synchronized (jpVar.c) {
                jpVar.h = true;
                throw new mm0(e);
            }
        } catch (mm0 e2) {
            synchronized (jpVar.c) {
                jpVar.h = true;
                throw e2;
            }
        }
    }
}