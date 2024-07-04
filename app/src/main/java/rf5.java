package defpackage;

/* renamed from: rf5  reason: default package */
public final class rf5 implements dg5 {
    public final nf5 a;
    public final og5 b;
    public final boolean c;
    public final vd5 d;

    public rf5(og5 og5Var, vd5 vd5Var, nf5 nf5Var) {
        this.b = og5Var;
        this.c = vd5Var.h(nf5Var);
        this.d = vd5Var;
        this.a = nf5Var;
    }

    @Override // defpackage.dg5
    public final void a(Object obj) {
        this.b.m(obj);
        this.d.e(obj);
    }

    @Override // defpackage.dg5
    public final ie5 b() {
        nf5 nf5Var = this.a;
        return nf5Var instanceof ie5 ? ((ie5) nf5Var).i() : nf5Var.a().i();
    }

    @Override // defpackage.dg5
    public final void c(Object obj, Object obj2) {
        og5 og5Var = this.b;
        Class cls = eg5.a;
        og5Var.o(obj, og5Var.e(og5Var.d(obj), og5Var.d(obj2)));
        if (!this.c) {
            return;
        }
        this.d.a(obj2);
        throw null;
    }

    @Override // defpackage.dg5
    public final boolean d(Object obj, Object obj2) {
        if (this.b.d(obj).equals(this.b.d(obj2))) {
            if (this.c) {
                this.d.a(obj);
                this.d.a(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.dg5
    public final int e(Object obj) {
        og5 og5Var = this.b;
        int b = og5Var.b(og5Var.d(obj));
        if (this.c) {
            this.d.a(obj);
            throw null;
        }
        return b;
    }

    @Override // defpackage.dg5
    public final int f(Object obj) {
        int hashCode = this.b.d(obj).hashCode();
        if (this.c) {
            this.d.a(obj);
            throw null;
        }
        return hashCode;
    }

    @Override // defpackage.dg5
    public final boolean g(Object obj) {
        this.d.a(obj);
        throw null;
    }

    @Override // defpackage.dg5
    public final void h(Object obj, byte[] bArr, int i, int i2, yc5 yc5Var) {
        ie5 ie5Var = (ie5) obj;
        if (ie5Var.zzc == pg5.f) {
            ie5Var.zzc = pg5.b();
        }
        ge5 ge5Var = (ge5) obj;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0097 A[EDGE_INSN: B:83:0x0097->B:43:0x0097 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0052 A[SYNTHETIC] */
    @Override // defpackage.dg5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Object obj, md5 md5Var, ud5 ud5Var) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        og5 og5Var = this.b;
        vd5 vd5Var = this.d;
        pg5 c = og5Var.c(obj);
        vd5Var.b(obj);
        while (md5Var.t() != Integer.MAX_VALUE) {
            try {
                int i3 = md5Var.b;
                boolean z3 = false;
                if (i3 != 11) {
                    if ((i3 & 7) == 2) {
                        if (vd5Var.c(ud5Var, this.a, i3 >>> 3) != null) {
                            vd5Var.f();
                        } else {
                            z = og5Var.p(c, md5Var);
                        }
                    } else {
                        if (!md5Var.a.b() && (i = md5Var.b) != md5Var.c) {
                            z3 = md5Var.a.d(i);
                        }
                        z = z3;
                    }
                    if (!z) {
                        return;
                    }
                } else {
                    he5 he5Var = null;
                    gd5 gd5Var = null;
                    int i4 = 0;
                    while (md5Var.t() != Integer.MAX_VALUE) {
                        int i5 = md5Var.b;
                        if (i5 == 16) {
                            md5Var.q(0);
                            i4 = md5Var.a.q();
                            he5Var = vd5Var.c(ud5Var, this.a, i4);
                        } else if (i5 == 26) {
                            if (he5Var != null) {
                                vd5Var.f();
                            } else {
                                gd5Var = md5Var.u();
                            }
                        } else {
                            if (!md5Var.a.b() && (i2 = md5Var.b) != md5Var.c) {
                                z2 = md5Var.a.d(i2);
                                if (z2) {
                                    break;
                                }
                            }
                            z2 = false;
                            if (z2) {
                            }
                        }
                    }
                    if (md5Var.b == 12) {
                        if (gd5Var != null) {
                            if (he5Var != null) {
                                vd5Var.g();
                            } else {
                                og5Var.k(c, i4, gd5Var);
                            }
                        }
                    } else {
                        throw new te5("Protocol message end-group tag did not match expected tag.");
                    }
                }
            } finally {
                og5Var.n(obj, c);
            }
        }
    }

    @Override // defpackage.dg5
    public final void j(Object obj, rd5 rd5Var) {
        this.d.a(obj);
        throw null;
    }
}