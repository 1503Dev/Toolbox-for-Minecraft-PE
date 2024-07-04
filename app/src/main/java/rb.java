package defpackage;

import defpackage.hp;
import defpackage.nl0;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.logging.Logger;

/* renamed from: rb  reason: default package */
public final class rb implements cy {
    public final boolean a;

    public rb(boolean z) {
        this.a = z;
    }

    @Override // defpackage.cy
    public final nl0 a(bk0 bk0Var) {
        boolean z;
        nl0.a aVar;
        nl0.a c;
        hp hpVar = bk0Var.c;
        if (hpVar != null) {
            uk0 uk0Var = bk0Var.e;
            long currentTimeMillis = System.currentTimeMillis();
            try {
                hpVar.b.getClass();
                hpVar.d.a(uk0Var);
                hpVar.b.getClass();
                nl0.a aVar2 = null;
                boolean z2 = true;
                if (vj.x(uk0Var.b) && uk0Var.d != null) {
                    if ("100-continue".equalsIgnoreCase(uk0Var.a("Expect"))) {
                        try {
                            hpVar.d.d();
                            hpVar.b.getClass();
                            c = hpVar.c(true);
                            z = true;
                        } catch (IOException e) {
                            hpVar.b.getClass();
                            hpVar.d(e);
                            throw e;
                        }
                    } else {
                        c = null;
                        z = false;
                    }
                    if (c == null) {
                        if (uk0Var.d.isDuplex()) {
                            try {
                                hpVar.d.d();
                                hpVar.e = true;
                                long contentLength = uk0Var.d.contentLength();
                                hpVar.b.getClass();
                                hp.a aVar3 = new hp.a(hpVar.d.e(uk0Var, contentLength), contentLength);
                                Logger logger = rb0.a;
                                uk0Var.d.writeTo(new vj0(aVar3));
                            } catch (IOException e2) {
                                hpVar.b.getClass();
                                hpVar.d(e2);
                                throw e2;
                            }
                        } else {
                            hpVar.e = false;
                            long contentLength2 = uk0Var.d.contentLength();
                            hpVar.b.getClass();
                            hp.a aVar4 = new hp.a(hpVar.d.e(uk0Var, contentLength2), contentLength2);
                            Logger logger2 = rb0.a;
                            vj0 vj0Var = new vj0(aVar4);
                            uk0Var.d.writeTo(vj0Var);
                            vj0Var.close();
                        }
                    } else {
                        hpVar.a.c(hpVar, true, false, null);
                        if (hpVar.b().h == null) {
                            z2 = false;
                        }
                        if (!z2) {
                            hpVar.d.h().h();
                        }
                    }
                    aVar2 = c;
                } else {
                    hpVar.a.c(hpVar, true, false, null);
                    z = false;
                }
                vk0 vk0Var = uk0Var.d;
                if (vk0Var == null || !vk0Var.isDuplex()) {
                    try {
                        hpVar.d.c();
                    } catch (IOException e3) {
                        hpVar.b.getClass();
                        hpVar.d(e3);
                        throw e3;
                    }
                }
                if (!z) {
                    hpVar.b.getClass();
                }
                if (aVar2 == null) {
                    aVar2 = hpVar.c(false);
                }
                aVar2.a = uk0Var;
                aVar2.e = hpVar.b().f;
                aVar2.k = currentTimeMillis;
                aVar2.l = System.currentTimeMillis();
                nl0 a = aVar2.a();
                int i = a.R;
                if (i == 100) {
                    nl0.a c2 = hpVar.c(false);
                    c2.a = uk0Var;
                    c2.e = hpVar.b().f;
                    c2.k = currentTimeMillis;
                    c2.l = System.currentTimeMillis();
                    a = c2.a();
                    i = a.R;
                }
                hpVar.b.getClass();
                if (this.a && i == 101) {
                    aVar = new nl0.a(a);
                    aVar.g = c31.d;
                } else {
                    aVar = new nl0.a(a);
                    try {
                        hpVar.b.getClass();
                        String d = a.d("Content-Type");
                        long f = hpVar.d.f(a);
                        hp.b bVar = new hp.b(hpVar.d.b(a), f);
                        Logger logger3 = rb0.a;
                        aVar.g = new ck0(d, f, new wj0(bVar));
                    } catch (IOException e4) {
                        hpVar.b.getClass();
                        hpVar.d(e4);
                        throw e4;
                    }
                }
                nl0 a2 = aVar.a();
                if ("close".equalsIgnoreCase(a2.P.a("Connection")) || "close".equalsIgnoreCase(a2.d("Connection"))) {
                    hpVar.d.h().h();
                }
                if ((i != 204 && i != 205) || a2.V.g() <= 0) {
                    return a2;
                }
                throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + a2.V.g());
            } catch (IOException e5) {
                hpVar.b.getClass();
                hpVar.d(e5);
                throw e5;
            }
        }
        throw new IllegalStateException();
    }
}