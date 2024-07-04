package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: kl5  reason: default package */
public final /* synthetic */ class kl5 implements v64 {
    public final int P;
    public final Object Q;
    public final Object R;

    public /* synthetic */ kl5(int i, f10 f10Var) {
        this.Q = f10Var;
        this.P = i;
        this.R = new byte[11];
    }

    public /* synthetic */ kl5(int i, q63 q63Var, q63 q63Var2) {
        this.P = i;
        this.Q = q63Var;
        this.R = q63Var2;
    }

    public /* synthetic */ kl5(lk lkVar) {
        this(eu0.c(lkVar), lkVar);
    }

    public final g a() {
        int read = ((InputStream) this.Q).read();
        if (read == -1) {
            return null;
        }
        InputStream inputStream = (InputStream) this.Q;
        boolean z = false;
        if (inputStream instanceof fx) {
            ((fx) inputStream).t(false);
        }
        int F = k.F(read, (InputStream) this.Q);
        if ((read & 32) != 0) {
            z = true;
        }
        int y = k.y(this.P, (InputStream) this.Q);
        if (y < 0) {
            if (z) {
                kl5 kl5Var = new kl5(this.P, new fx(this.P, (InputStream) this.Q));
                if ((read & 64) != 0) {
                    return new t8(F, kl5Var);
                }
                if ((read & 128) != 0) {
                    return new c9(true, F, kl5Var);
                }
                if (F != 4) {
                    if (F != 8) {
                        if (F != 16) {
                            if (F == 17) {
                                return new a9(kl5Var);
                            }
                            StringBuilder b = e5.b("unknown BER object encountered: 0x");
                            b.append(Integer.toHexString(F));
                            throw new i(b.toString());
                        }
                        return new y8(kl5Var);
                    }
                    return new bi(kl5Var);
                }
                return new w8(kl5Var);
            }
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        lk lkVar = new lk(y, (InputStream) this.Q);
        if ((read & 64) != 0) {
            return new xh(F, z, lkVar.g());
        }
        if ((read & 128) != 0) {
            return new c9(z, F, new kl5(lkVar));
        }
        if (z) {
            if (F != 4) {
                if (F != 8) {
                    if (F != 16) {
                        if (F == 17) {
                            return new pi(new kl5(lkVar));
                        }
                        throw new IOException(bp.b("unknown tag ", F, " encountered"));
                    }
                    return new ni(new kl5(lkVar));
                }
                return new bi(new kl5(lkVar));
            }
            return new w8(new kl5(lkVar));
        } else if (F != 4) {
            try {
                return k.g(F, lkVar, (byte[][]) this.R);
            } catch (IllegalArgumentException e) {
                throw new i("corrupted stream detected", e);
            }
        } else {
            return new ji(lkVar);
        }
    }

    public final x b(int i, boolean z) {
        g yiVar;
        x8 x8Var;
        if (!z) {
            return new ri(false, i, new ii(((lk) ((InputStream) this.Q)).g()));
        }
        s82 c = c();
        if (((InputStream) this.Q) instanceof fx) {
            if (c.i() == 1) {
                return new b9(true, i, c.h(0));
            }
            x8 x8Var2 = u8.a;
            if (c.i() < 1) {
                x8Var = u8.a;
            } else {
                x8Var = new x8(c);
            }
            return new b9(false, i, x8Var);
        } else if (c.i() == 1) {
            return new ri(true, i, c.h(0));
        } else {
            mi miVar = ci.a;
            if (c.i() < 1) {
                yiVar = ci.a;
            } else {
                yiVar = new yi(c);
            }
            return new ri(false, i, yiVar);
        }
    }

    public final s82 c() {
        s82 s82Var = new s82(12);
        while (true) {
            g a = a();
            if (a == null) {
                return s82Var;
            }
            s82Var.g(a instanceof ex ? ((ex) a).m() : a.h());
        }
    }

    @Override // defpackage.v64
    /* renamed from: e */
    public final void mo5e(Object obj) {
        int i = bm5.X;
        ((b53) obj).o(this.P, (q63) this.Q, (q63) this.R);
    }
}