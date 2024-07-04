package defpackage;

import defpackage.jn;
import java.math.BigInteger;
import java.util.Hashtable;

/* renamed from: wn  reason: default package */
public abstract class wn {
    public static jn[] g = new jn[0];
    public hn a;
    public jn b;
    public jn c;
    public jn[] d;
    public boolean e;
    public Hashtable f;

    /* renamed from: wn$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class a extends wn {
        public a(hn hnVar, jn jnVar, jn jnVar2) {
            super(hnVar, jnVar, jnVar2);
        }

        public a(hn hnVar, jn jnVar, jn jnVar2, jn[] jnVarArr) {
            super(hnVar, jnVar, jnVar2, jnVarArr);
        }

        @Override // defpackage.wn
        public final boolean q() {
            jn l;
            jn p;
            hn hnVar = this.a;
            jn jnVar = this.b;
            jn jnVar2 = hnVar.b;
            jn jnVar3 = hnVar.c;
            int i = hnVar.f;
            if (i == 6) {
                jn jnVar4 = this.d[0];
                boolean h = jnVar4.h();
                if (jnVar.i()) {
                    jn o = this.c.o();
                    if (!h) {
                        jnVar3 = jnVar3.j(jnVar4.o());
                    }
                    return o.equals(jnVar3);
                }
                jn jnVar5 = this.c;
                jn o2 = jnVar.o();
                if (h) {
                    l = vn.a(jnVar5, jnVar5, jnVar2);
                    p = o2.o().a(jnVar3);
                } else {
                    jn o3 = jnVar4.o();
                    jn o4 = o3.o();
                    l = jnVar5.a(jnVar4).l(jnVar5, jnVar2, o3);
                    p = o2.p(jnVar3, o4);
                }
                return l.j(o2).equals(p);
            }
            jn jnVar6 = this.c;
            jn j = jnVar6.a(jnVar).j(jnVar6);
            if (i != 0) {
                if (i == 1) {
                    jn jnVar7 = this.d[0];
                    if (!jnVar7.h()) {
                        jn j2 = jnVar7.j(jnVar7.o());
                        j = j.j(jnVar7);
                        jnVar2 = jnVar2.j(jnVar7);
                        jnVar3 = jnVar3.j(j2);
                    }
                } else {
                    throw new IllegalStateException("unsupported coordinate system");
                }
            }
            return j.equals(jnVar.a(jnVar2).j(jnVar.o()).a(jnVar3));
        }

        @Override // defpackage.wn
        public final wn r(jn jnVar) {
            if (j()) {
                return this;
            }
            int f = f();
            if (f != 5) {
                if (f != 6) {
                    return super.r(jnVar);
                }
                jn jnVar2 = this.b;
                jn jnVar3 = this.c;
                jn jnVar4 = this.d[0];
                jn j = jnVar2.j(jnVar.o());
                return this.a.e(j, jnVar3.a(jnVar2).a(j), new jn[]{jnVar4.j(jnVar)}, this.e);
            }
            jn jnVar5 = this.b;
            return this.a.e(jnVar5, this.c.a(jnVar5).d(jnVar).a(jnVar5.j(jnVar)), this.d, this.e);
        }

        @Override // defpackage.wn
        public final wn s(jn jnVar) {
            if (j()) {
                return this;
            }
            int f = f();
            if (f != 5 && f != 6) {
                return super.s(jnVar);
            }
            jn jnVar2 = this.b;
            return this.a.e(jnVar2, this.c.a(jnVar2).j(jnVar).a(jnVar2), this.d, this.e);
        }

        @Override // defpackage.wn
        public final wn t(wn wnVar) {
            return wnVar.j() ? this : a(wnVar.m());
        }

        public final a y(int i) {
            wn d;
            if (j()) {
                return this;
            }
            hn hnVar = this.a;
            int i2 = hnVar.f;
            jn jnVar = this.b;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 5) {
                        if (i2 != 6) {
                            throw new IllegalStateException("unsupported coordinate system");
                        }
                    }
                }
                d = hnVar.e(jnVar.q(i), this.c.q(i), new jn[]{this.d[0].q(i)}, this.e);
                return (a) d;
            }
            d = hnVar.d(jnVar.q(i), this.c.q(i), this.e);
            return (a) d;
        }
    }

    /* renamed from: wn$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class b extends wn {
        public b(hn hnVar, jn jnVar, jn jnVar2) {
            super(hnVar, jnVar, jnVar2);
        }

        public b(hn hnVar, jn jnVar, jn jnVar2, jn[] jnVarArr) {
            super(hnVar, jnVar, jnVar2, jnVarArr);
        }

        @Override // defpackage.wn
        public final boolean q() {
            jn jnVar = this.b;
            jn jnVar2 = this.c;
            hn hnVar = this.a;
            jn jnVar3 = hnVar.b;
            jn jnVar4 = hnVar.c;
            jn o = jnVar2.o();
            int f = f();
            if (f != 0) {
                if (f != 1) {
                    if (f != 2 && f != 3 && f != 4) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    jn jnVar5 = this.d[0];
                    if (!jnVar5.h()) {
                        jn o2 = jnVar5.o();
                        jn o3 = o2.o();
                        jn j = o2.j(o3);
                        jnVar3 = jnVar3.j(o3);
                        jnVar4 = jnVar4.j(j);
                    }
                } else {
                    jn jnVar6 = this.d[0];
                    if (!jnVar6.h()) {
                        jn o4 = jnVar6.o();
                        jn j2 = jnVar6.j(o4);
                        o = o.j(jnVar6);
                        jnVar3 = jnVar3.j(o4);
                        jnVar4 = jnVar4.j(j2);
                    }
                }
            }
            return o.equals(jnVar.o().a(jnVar3).j(jnVar).a(jnVar4));
        }

        @Override // defpackage.wn
        public final wn t(wn wnVar) {
            return wnVar.j() ? this : a(wnVar.m());
        }
    }

    /* renamed from: wn$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class c extends a {
        public c(hn hnVar, jn jnVar, jn jnVar2, boolean z) {
            super(hnVar, jnVar, jnVar2);
            if ((jnVar == null) != (jnVar2 == null)) {
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            }
            if (jnVar != null) {
                jn.a.u(this.b, this.c);
                if (hnVar != null) {
                    jn.a.u(this.b, this.a.b);
                }
            }
            this.e = z;
        }

        public c(hn hnVar, jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
            super(hnVar, jnVar, jnVar2, jnVarArr);
            this.e = z;
        }

        @Override // defpackage.wn
        public final wn a(wn wnVar) {
            jn j;
            jn j2;
            jn jnVar;
            jn jnVar2;
            jn jnVar3;
            jn p;
            jn jnVar4;
            jn jnVar5;
            if (j()) {
                return wnVar;
            }
            if (wnVar.j()) {
                return this;
            }
            hn hnVar = this.a;
            int i = hnVar.f;
            jn jnVar6 = this.b;
            jn jnVar7 = wnVar.b;
            if (i != 0) {
                if (i != 1) {
                    if (i == 6) {
                        if (jnVar6.i()) {
                            if (jnVar7.i()) {
                                return hnVar.k();
                            }
                            return wnVar.a(this);
                        }
                        jn jnVar8 = this.c;
                        jn jnVar9 = this.d[0];
                        jn jnVar10 = wnVar.c;
                        jn jnVar11 = wnVar.d[0];
                        boolean h = jnVar9.h();
                        if (!h) {
                            jnVar = jnVar7.j(jnVar9);
                            jnVar2 = jnVar10.j(jnVar9);
                        } else {
                            jnVar = jnVar7;
                            jnVar2 = jnVar10;
                        }
                        boolean h2 = jnVar11.h();
                        if (!h2) {
                            jnVar6 = jnVar6.j(jnVar11);
                            jnVar3 = jnVar8.j(jnVar11);
                        } else {
                            jnVar3 = jnVar8;
                        }
                        jn a = jnVar3.a(jnVar2);
                        jn a2 = jnVar6.a(jnVar);
                        if (a2.i()) {
                            if (a.i()) {
                                return w();
                            }
                            return hnVar.k();
                        }
                        if (jnVar7.i()) {
                            wn n = n();
                            jn jnVar12 = n.b;
                            jn h3 = n.h();
                            jn d = h3.a(jnVar10).d(jnVar12);
                            jnVar5 = vn.a(d, d, jnVar12).a(hnVar.b);
                            if (jnVar5.i()) {
                                return new c(hnVar, jnVar5, hnVar.c.n(), this.e);
                            }
                            p = d.j(jnVar12.a(jnVar5)).a(jnVar5).a(h3).d(jnVar5).a(jnVar5);
                            jnVar4 = hnVar.i(gn.b);
                        } else {
                            jn o = a2.o();
                            jn j3 = a.j(jnVar6);
                            jn j4 = a.j(jnVar);
                            jn j5 = j3.j(j4);
                            if (j5.i()) {
                                return new c(hnVar, j5, hnVar.c.n(), this.e);
                            }
                            jn j6 = a.j(o);
                            if (!h2) {
                                j6 = j6.j(jnVar11);
                            }
                            p = j4.a(o).p(j6, jnVar8.a(jnVar9));
                            if (!h) {
                                jnVar4 = j6.j(jnVar9);
                            } else {
                                jnVar4 = j6;
                            }
                            jnVar5 = j5;
                        }
                        return new c(hnVar, jnVar5, p, new jn[]{jnVar4}, this.e);
                    }
                    throw new IllegalStateException("unsupported coordinate system");
                }
                jn jnVar13 = this.c;
                jn jnVar14 = this.d[0];
                jn jnVar15 = wnVar.c;
                jn jnVar16 = wnVar.d[0];
                boolean h4 = jnVar16.h();
                jn j7 = jnVar14.j(jnVar15);
                if (h4) {
                    j = jnVar13;
                } else {
                    j = jnVar13.j(jnVar16);
                }
                jn a3 = j7.a(j);
                jn j8 = jnVar14.j(jnVar7);
                if (h4) {
                    j2 = jnVar6;
                } else {
                    j2 = jnVar6.j(jnVar16);
                }
                jn a4 = j8.a(j2);
                if (a4.i()) {
                    if (a3.i()) {
                        return w();
                    }
                    return hnVar.k();
                }
                jn o2 = a4.o();
                jn j9 = o2.j(a4);
                if (!h4) {
                    jnVar14 = jnVar14.j(jnVar16);
                }
                jn a5 = a3.a(a4);
                jn a6 = a5.l(a3, o2, hnVar.b).j(jnVar14).a(j9);
                jn j10 = a4.j(a6);
                if (!h4) {
                    o2 = o2.j(jnVar16);
                }
                return new c(hnVar, j10, a3.l(jnVar6, a4, jnVar13).l(o2, a5, a6), new jn[]{j9.j(jnVar14)}, this.e);
            }
            jn jnVar17 = this.c;
            jn jnVar18 = wnVar.c;
            jn a7 = jnVar6.a(jnVar7);
            jn a8 = jnVar17.a(jnVar18);
            if (a7.i()) {
                if (a8.i()) {
                    return w();
                }
                return hnVar.k();
            }
            jn d2 = a8.d(a7);
            jn a9 = vn.a(d2, d2, a7).a(hnVar.b);
            return new c(hnVar, a9, d2.j(jnVar6.a(a9)).a(a9).a(jnVar17), this.e);
        }

        @Override // defpackage.wn
        public final wn c() {
            b();
            return new c(null, this.b, e(), false);
        }

        @Override // defpackage.wn
        public final jn h() {
            int f = f();
            if (f == 5 || f == 6) {
                jn jnVar = this.b;
                jn jnVar2 = this.c;
                if (j() || jnVar.i()) {
                    return jnVar2;
                }
                jn j = jnVar2.a(jnVar).j(jnVar);
                if (6 == f) {
                    jn jnVar3 = this.d[0];
                    return !jnVar3.h() ? j.d(jnVar3) : j;
                }
                return j;
            }
            return this.c;
        }

        @Override // defpackage.wn
        public final wn m() {
            if (j()) {
                return this;
            }
            jn jnVar = this.b;
            if (jnVar.i()) {
                return this;
            }
            int f = f();
            if (f != 0) {
                if (f == 1) {
                    return new c(this.a, jnVar, this.c.a(jnVar), new jn[]{this.d[0]}, this.e);
                } else if (f != 5) {
                    if (f == 6) {
                        jn jnVar2 = this.c;
                        jn jnVar3 = this.d[0];
                        return new c(this.a, jnVar, jnVar2.a(jnVar3), new jn[]{jnVar3}, this.e);
                    }
                    throw new IllegalStateException("unsupported coordinate system");
                } else {
                    return new c(this.a, jnVar, this.c.b(), this.e);
                }
            }
            return new c(this.a, jnVar, this.c.a(jnVar), this.e);
        }

        @Override // defpackage.wn
        public final wn w() {
            jn j;
            jn j2;
            jn o;
            jn j3;
            jn j4;
            jn a;
            jn p;
            if (j()) {
                return this;
            }
            hn hnVar = this.a;
            jn jnVar = this.b;
            if (jnVar.i()) {
                return hnVar.k();
            }
            int i = hnVar.f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 6) {
                        jn jnVar2 = this.c;
                        jn jnVar3 = this.d[0];
                        boolean h = jnVar3.h();
                        if (h) {
                            j2 = jnVar2;
                        } else {
                            j2 = jnVar2.j(jnVar3);
                        }
                        if (h) {
                            o = jnVar3;
                        } else {
                            o = jnVar3.o();
                        }
                        jn jnVar4 = hnVar.b;
                        if (h) {
                            j3 = jnVar4;
                        } else {
                            j3 = jnVar4.j(o);
                        }
                        jn a2 = vn.a(jnVar2, j2, j3);
                        if (a2.i()) {
                            return new c(hnVar, a2, hnVar.c.n(), this.e);
                        }
                        jn o2 = a2.o();
                        if (h) {
                            j4 = a2;
                        } else {
                            j4 = a2.j(o);
                        }
                        jn jnVar5 = hnVar.c;
                        if (jnVar5.c() < (hnVar.j() >> 1)) {
                            jn o3 = jnVar2.a(jnVar).o();
                            if (jnVar5.h()) {
                                p = j3.a(o).o();
                            } else {
                                p = j3.p(jnVar5, o.o());
                            }
                            a = o3.a(a2).a(o).j(o3).a(p).a(o2);
                            if (!jnVar4.i()) {
                                if (!jnVar4.h()) {
                                    a = a.a(jnVar4.b().j(j4));
                                }
                                return new c(hnVar, o2, a, new jn[]{j4}, this.e);
                            }
                        } else {
                            if (!h) {
                                jnVar = jnVar.j(jnVar3);
                            }
                            a = jnVar.p(a2, j2).a(o2);
                        }
                        a = a.a(j4);
                        return new c(hnVar, o2, a, new jn[]{j4}, this.e);
                    }
                    throw new IllegalStateException("unsupported coordinate system");
                }
                jn jnVar6 = this.c;
                jn jnVar7 = this.d[0];
                boolean h2 = jnVar7.h();
                if (h2) {
                    j = jnVar;
                } else {
                    j = jnVar.j(jnVar7);
                }
                if (!h2) {
                    jnVar6 = jnVar6.j(jnVar7);
                }
                jn o4 = jnVar.o();
                jn a3 = o4.a(jnVar6);
                jn o5 = j.o();
                jn a4 = a3.a(j);
                jn l = a4.l(a3, o5, hnVar.b);
                return new c(hnVar, j.j(l), o4.o().l(j, l, a4), new jn[]{j.j(o5)}, this.e);
            }
            jn a5 = this.c.d(jnVar).a(jnVar);
            jn a6 = a5.o().a(a5).a(hnVar.b);
            return new c(hnVar, a6, jnVar.p(a6, a5.b()), this.e);
        }

        @Override // defpackage.wn
        public final wn x(wn wnVar) {
            if (j()) {
                return wnVar;
            }
            if (wnVar.j()) {
                return w();
            }
            hn hnVar = this.a;
            jn jnVar = this.b;
            if (jnVar.i()) {
                return wnVar;
            }
            if (hnVar.f != 6) {
                return w().a(wnVar);
            }
            jn jnVar2 = wnVar.b;
            jn jnVar3 = wnVar.d[0];
            if (!jnVar2.i() && jnVar3.h()) {
                jn jnVar4 = this.c;
                jn jnVar5 = this.d[0];
                jn jnVar6 = wnVar.c;
                jn o = jnVar.o();
                jn o2 = jnVar4.o();
                jn o3 = jnVar5.o();
                jn a = hnVar.b.j(o3).a(o2).a(jnVar4.j(jnVar5));
                jn b = jnVar6.b();
                jn l = hnVar.b.a(b).j(o3).a(o2).l(a, o, o3);
                jn j = jnVar2.j(o3);
                jn o4 = j.a(a).o();
                if (o4.i()) {
                    if (l.i()) {
                        return wnVar.w();
                    }
                    return hnVar.k();
                } else if (l.i()) {
                    return new c(hnVar, l, hnVar.c.n(), this.e);
                } else {
                    jn j2 = l.o().j(j);
                    jn j3 = l.j(o4).j(o3);
                    return new c(hnVar, j2, l.a(o4).o().l(a, b, j3), new jn[]{j3}, this.e);
                }
            }
            return w().a(wnVar);
        }
    }

    /* renamed from: wn$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class d extends b {
        public d(hn hnVar, jn jnVar, jn jnVar2, boolean z) {
            super(hnVar, jnVar, jnVar2);
            if ((jnVar == null) != (jnVar2 == null)) {
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            }
            this.e = z;
        }

        public d(hn hnVar, jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
            super(hnVar, jnVar, jnVar2, jnVarArr);
            this.e = z;
        }

        public static jn B(jn jnVar) {
            return jnVar.a(jnVar).a(jnVar);
        }

        public static jn z(jn jnVar) {
            jn a = jnVar.a(jnVar);
            return a.a(a);
        }

        public final jn A() {
            jn[] jnVarArr = this.d;
            jn jnVar = jnVarArr[1];
            if (jnVar == null) {
                jn y = y(jnVarArr[0], null);
                jnVarArr[1] = y;
                return y;
            }
            return jnVar;
        }

        public final d C(boolean z) {
            jn jnVar;
            jn jnVar2 = this.b;
            jn jnVar3 = this.c;
            jn jnVar4 = this.d[0];
            jn A = A();
            jn a = B(jnVar2.o()).a(A);
            jn a2 = jnVar3.a(jnVar3);
            jn j = a2.j(jnVar3);
            jn j2 = jnVar2.j(j);
            jn a3 = j2.a(j2);
            jn r = a.o().r(a3.a(a3));
            jn o = j.o();
            jn a4 = o.a(o);
            jn r2 = a.j(a3.r(r)).r(a4);
            if (z) {
                jn j3 = a4.j(A);
                jnVar = j3.a(j3);
            } else {
                jnVar = null;
            }
            if (!jnVar4.h()) {
                a2 = a2.j(jnVar4);
            }
            return new d(this.a, r, r2, new jn[]{a2, jnVar}, this.e);
        }

        /* JADX WARN: Code restructure failed: missing block: B:58:0x011f, code lost:
            if (r1 == r6) goto L34;
         */
        @Override // defpackage.wn
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final wn a(wn wnVar) {
            jn o;
            jn jnVar;
            jn jnVar2;
            jn jnVar3;
            jn jnVar4;
            jn[] jnVarArr;
            if (j()) {
                return wnVar;
            }
            if (wnVar.j()) {
                return this;
            }
            if (this == wnVar) {
                return w();
            }
            hn hnVar = this.a;
            int i = hnVar.f;
            jn jnVar5 = this.b;
            jn jnVar6 = this.c;
            jn jnVar7 = wnVar.b;
            jn jnVar8 = wnVar.c;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2 && i != 4) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    jn jnVar9 = this.d[0];
                    jn jnVar10 = wnVar.d[0];
                    boolean h = jnVar9.h();
                    if (!h && jnVar9.equals(jnVar10)) {
                        jn r = jnVar5.r(jnVar7);
                        jn r2 = jnVar6.r(jnVar8);
                        if (r.i()) {
                            if (r2.i()) {
                                return w();
                            }
                            return hnVar.k();
                        }
                        jn o2 = r.o();
                        jn j = jnVar5.j(o2);
                        jn j2 = jnVar7.j(o2);
                        jn j3 = j.r(j2).j(jnVar6);
                        jn r3 = r2.o().r(j).r(j2);
                        jn r4 = j.r(r3).j(r2).r(j3);
                        jnVar2 = r.j(jnVar9);
                        jnVar3 = r4;
                        jnVar4 = r3;
                    } else {
                        if (!h) {
                            jn o3 = jnVar9.o();
                            jnVar7 = o3.j(jnVar7);
                            jnVar8 = o3.j(jnVar9).j(jnVar8);
                        }
                        boolean h2 = jnVar10.h();
                        if (!h2) {
                            jn o4 = jnVar10.o();
                            jnVar5 = o4.j(jnVar5);
                            jnVar6 = o4.j(jnVar10).j(jnVar6);
                        }
                        jn r5 = jnVar5.r(jnVar7);
                        jn r6 = jnVar6.r(jnVar8);
                        if (r5.i()) {
                            if (r6.i()) {
                                return w();
                            }
                            return hnVar.k();
                        }
                        o = r5.o();
                        jn j4 = o.j(r5);
                        jn j5 = o.j(jnVar5);
                        jn r7 = r6.o().a(j4).r(j5.a(j5));
                        jn k = j5.r(r7).k(r6, j4, jnVar6);
                        if (!h) {
                            jnVar = r5.j(jnVar9);
                        } else {
                            jnVar = r5;
                        }
                        if (!h2) {
                            jnVar2 = jnVar.j(jnVar10);
                        } else {
                            jnVar2 = jnVar;
                        }
                        jnVar3 = k;
                        jnVar4 = r7;
                    }
                    o = null;
                    if (i == 4) {
                        jnVarArr = new jn[]{jnVar2, y(jnVar2, o)};
                    } else {
                        jnVarArr = new jn[]{jnVar2};
                    }
                    return new d(hnVar, jnVar4, jnVar3, jnVarArr, this.e);
                }
                jn jnVar11 = this.d[0];
                jn jnVar12 = wnVar.d[0];
                boolean h3 = jnVar11.h();
                boolean h4 = jnVar12.h();
                if (!h3) {
                    jnVar8 = jnVar8.j(jnVar11);
                }
                if (!h4) {
                    jnVar6 = jnVar6.j(jnVar12);
                }
                jn r8 = jnVar8.r(jnVar6);
                if (!h3) {
                    jnVar7 = jnVar7.j(jnVar11);
                }
                if (!h4) {
                    jnVar5 = jnVar5.j(jnVar12);
                }
                jn r9 = jnVar7.r(jnVar5);
                if (r9.i()) {
                    if (r8.i()) {
                        return w();
                    }
                    return hnVar.k();
                }
                if (h3) {
                    jnVar11 = jnVar12;
                } else if (!h4) {
                    jnVar11 = jnVar11.j(jnVar12);
                }
                jn o5 = r9.o();
                jn j6 = o5.j(r9);
                jn j7 = o5.j(jnVar5);
                jn r10 = r8.o().j(jnVar11).r(j6).r(j7.a(j7));
                return new d(hnVar, r9.j(r10), j7.r(r10).k(r8, jnVar6, j6), new jn[]{j6.j(jnVar11)}, this.e);
            }
            jn r11 = jnVar7.r(jnVar5);
            jn r12 = jnVar8.r(jnVar6);
            if (r11.i()) {
                if (r12.i()) {
                    return w();
                }
                return hnVar.k();
            }
            jn d = r12.d(r11);
            jn r13 = d.o().r(jnVar5).r(jnVar7);
            return new d(hnVar, r13, d.j(jnVar5.r(r13)).r(jnVar6), this.e);
        }

        @Override // defpackage.wn
        public final wn c() {
            b();
            return new d(null, this.b, e(), false);
        }

        @Override // defpackage.wn
        public final jn i() {
            return super.i();
        }

        @Override // defpackage.wn
        public final wn m() {
            if (j()) {
                return this;
            }
            hn hnVar = this.a;
            if (hnVar.f != 0) {
                return new d(hnVar, this.b, this.c.m(), this.d, this.e);
            }
            return new d(hnVar, this.b, this.c.m(), this.e);
        }

        @Override // defpackage.wn
        public final wn u() {
            if (j()) {
                return this;
            }
            jn jnVar = this.c;
            if (jnVar.i()) {
                return this;
            }
            hn hnVar = this.a;
            int i = hnVar.f;
            if (i != 0) {
                if (i != 4) {
                    return w().a(this);
                }
                return C(false).a(this);
            }
            jn jnVar2 = this.b;
            jn a = jnVar.a(jnVar);
            jn o = a.o();
            jn a2 = B(jnVar2.o()).a(this.a.b);
            jn r = jnVar2.a(jnVar2).a(jnVar2).j(o).r(a2.o());
            if (r.i()) {
                return this.a.k();
            }
            jn g = r.j(a).g();
            jn j = r.j(g).j(a2);
            jn r2 = o.o().j(g).r(j);
            jn a3 = r2.r(j).j(j.a(r2)).a(jnVar2);
            return new d(hnVar, a3, jnVar2.r(a3).j(r2).r(jnVar), this.e);
        }

        @Override // defpackage.wn
        public final wn v(int i) {
            jn jnVar;
            jn o;
            if (i >= 0) {
                if (i == 0 || j()) {
                    return this;
                }
                if (i == 1) {
                    return w();
                }
                hn hnVar = this.a;
                jn jnVar2 = this.c;
                if (jnVar2.i()) {
                    return hnVar.k();
                }
                int i2 = hnVar.f;
                jn jnVar3 = hnVar.b;
                jn jnVar4 = this.b;
                jn[] jnVarArr = this.d;
                if (jnVarArr.length < 1) {
                    jnVar = hnVar.i(gn.b);
                } else {
                    jnVar = jnVarArr[0];
                }
                if (!jnVar.h() && i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 4) {
                                jnVar3 = A();
                            } else {
                                throw new IllegalStateException("unsupported coordinate system");
                            }
                        } else {
                            o = null;
                        }
                    } else {
                        o = jnVar.o();
                        jnVar4 = jnVar4.j(jnVar);
                        jnVar2 = jnVar2.j(o);
                    }
                    jnVar3 = y(jnVar, o);
                }
                int i3 = 0;
                jn jnVar5 = jnVar3;
                jn jnVar6 = jnVar2;
                jn jnVar7 = jnVar4;
                jn jnVar8 = jnVar5;
                while (i3 < i) {
                    if (jnVar6.i()) {
                        return hnVar.k();
                    }
                    jn B = B(jnVar7.o());
                    jn a = jnVar6.a(jnVar6);
                    jn j = a.j(jnVar6);
                    jn j2 = jnVar7.j(j);
                    jn a2 = j2.a(j2);
                    jn o2 = j.o();
                    jn a3 = o2.a(o2);
                    if (!jnVar8.i()) {
                        B = B.a(jnVar8);
                        jn j3 = a3.j(jnVar8);
                        jnVar8 = j3.a(j3);
                    }
                    jn r = B.o().r(a2.a(a2));
                    jnVar6 = B.j(a2.r(r)).r(a3);
                    if (jnVar.h()) {
                        jnVar = a;
                    } else {
                        jnVar = a.j(jnVar);
                    }
                    i3++;
                    jnVar7 = r;
                }
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 4) {
                                return new d(hnVar, jnVar7, jnVar6, new jn[]{jnVar, jnVar8}, this.e);
                            }
                            throw new IllegalStateException("unsupported coordinate system");
                        }
                        return new d(hnVar, jnVar7, jnVar6, new jn[]{jnVar}, this.e);
                    }
                    return new d(hnVar, jnVar7.j(jnVar), jnVar6, new jn[]{jnVar.j(jnVar.o())}, this.e);
                }
                jn g = jnVar.g();
                jn o3 = g.o();
                return new d(hnVar, jnVar7.j(o3), jnVar6.j(o3.j(g)), this.e);
            }
            throw new IllegalArgumentException("'e' cannot be negative");
        }

        @Override // defpackage.wn
        public final wn w() {
            jn j;
            jn j2;
            jn o;
            jn a;
            jn j3;
            jn o2;
            if (j()) {
                return this;
            }
            hn hnVar = this.a;
            jn jnVar = this.c;
            if (jnVar.i()) {
                return hnVar.k();
            }
            int i = hnVar.f;
            jn jnVar2 = this.b;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 4) {
                            return C(true);
                        }
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    jn jnVar3 = this.d[0];
                    boolean h = jnVar3.h();
                    jn o3 = jnVar.o();
                    jn o4 = o3.o();
                    jn jnVar4 = hnVar.b;
                    jn m = jnVar4.m();
                    if (m.t().equals(BigInteger.valueOf(3L))) {
                        if (h) {
                            o2 = jnVar3;
                        } else {
                            o2 = jnVar3.o();
                        }
                        a = B(jnVar2.a(o2).j(jnVar2.r(o2)));
                        j3 = o3.j(jnVar2);
                    } else {
                        jn B = B(jnVar2.o());
                        if (!h) {
                            if (!jnVar4.i()) {
                                jn o5 = jnVar3.o().o();
                                if (m.c() < jnVar4.c()) {
                                    a = B.r(o5.j(m));
                                } else {
                                    jnVar4 = o5.j(jnVar4);
                                }
                            } else {
                                a = B;
                            }
                            j3 = jnVar2.j(o3);
                        }
                        a = B.a(jnVar4);
                        j3 = jnVar2.j(o3);
                    }
                    jn z = z(j3);
                    jn r = a.o().r(z.a(z));
                    jn r2 = z.r(r).j(a).r(z(o4.a(o4)));
                    jn a2 = jnVar.a(jnVar);
                    if (!h) {
                        a2 = a2.j(jnVar3);
                    }
                    return new d(hnVar, r, r2, new jn[]{a2}, this.e);
                }
                jn jnVar5 = this.d[0];
                boolean h2 = jnVar5.h();
                jn jnVar6 = hnVar.b;
                if (!jnVar6.i() && !h2) {
                    jnVar6 = jnVar6.j(jnVar5.o());
                }
                jn a3 = jnVar6.a(B(jnVar2.o()));
                if (h2) {
                    j = jnVar;
                } else {
                    j = jnVar.j(jnVar5);
                }
                if (h2) {
                    j2 = jnVar.o();
                } else {
                    j2 = j.j(jnVar);
                }
                jn z2 = z(jnVar2.j(j2));
                jn r3 = a3.o().r(z2.a(z2));
                jn a4 = j.a(j);
                jn j4 = r3.j(a4);
                jn a5 = j2.a(j2);
                jn j5 = z2.r(r3).j(a3);
                jn o6 = a5.o();
                jn r4 = j5.r(o6.a(o6));
                if (h2) {
                    o = a5.a(a5);
                } else {
                    o = a4.o();
                }
                return new d(hnVar, j4, r4, new jn[]{o.a(o).j(j)}, this.e);
            }
            jn d = B(jnVar2.o()).a(this.a.b).d(jnVar.a(jnVar));
            jn r5 = d.o().r(jnVar2.a(jnVar2));
            return new d(hnVar, r5, d.j(jnVar2.r(r5)).r(jnVar), this.e);
        }

        @Override // defpackage.wn
        public final wn x(wn wnVar) {
            if (this == wnVar) {
                return u();
            }
            if (j()) {
                return wnVar;
            }
            if (wnVar.j()) {
                return w();
            }
            jn jnVar = this.c;
            if (jnVar.i()) {
                return wnVar;
            }
            hn hnVar = this.a;
            int i = hnVar.f;
            if (i != 0) {
                if (i != 4) {
                    return w().a(wnVar);
                }
                return C(false).a(wnVar);
            }
            jn jnVar2 = this.b;
            jn jnVar3 = wnVar.b;
            jn jnVar4 = wnVar.c;
            jn r = jnVar3.r(jnVar2);
            jn r2 = jnVar4.r(jnVar);
            if (r.i()) {
                if (r2.i()) {
                    return u();
                }
                return this;
            }
            jn o = r.o();
            jn r3 = o.j(jnVar2.a(jnVar2).a(jnVar3)).r(r2.o());
            if (r3.i()) {
                return hnVar.k();
            }
            jn g = r3.j(r).g();
            jn j = r3.j(g).j(r2);
            jn r4 = jnVar.a(jnVar).j(o).j(r).j(g).r(j);
            jn a = r4.r(j).j(j.a(r4)).a(jnVar3);
            return new d(hnVar, a, jnVar2.r(a).j(r4).r(jnVar), this.e);
        }

        public final jn y(jn jnVar, jn jnVar2) {
            jn jnVar3 = this.a.b;
            if (!jnVar3.i() && !jnVar.h()) {
                if (jnVar2 == null) {
                    jnVar2 = jnVar.o();
                }
                jn o = jnVar2.o();
                jn m = jnVar3.m();
                if (m.c() < jnVar3.c()) {
                    return o.j(m).m();
                }
                return o.j(jnVar3);
            }
            return jnVar3;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wn(hn hnVar, jn jnVar, jn jnVar2) {
        this(hnVar, jnVar, jnVar2, r1);
        jn[] jnVarArr;
        int i = hnVar == null ? 0 : hnVar.f;
        if (i != 0 && i != 5) {
            jn i2 = hnVar.i(gn.b);
            if (i != 1 && i != 2) {
                if (i == 3) {
                    jnVarArr = new jn[]{i2, i2, i2};
                } else if (i == 4) {
                    jnVarArr = new jn[]{i2, hnVar.b};
                } else if (i != 6) {
                    throw new IllegalArgumentException("unknown coordinate system");
                }
            }
            jnVarArr = new jn[]{i2};
        } else {
            jnVarArr = g;
        }
    }

    public wn(hn hnVar, jn jnVar, jn jnVar2, jn[] jnVarArr) {
        this.f = null;
        this.a = hnVar;
        this.b = jnVar;
        this.c = jnVar2;
        this.d = jnVarArr;
    }

    public abstract wn a(wn wnVar);

    public final void b() {
        int f = f();
        boolean z = false;
        if ((f == 0 || f == 5 || j() || this.d[0].h()) ? true : true) {
            return;
        }
        throw new IllegalStateException("point not in normal form");
    }

    public abstract wn c();

    public final boolean d(wn wnVar) {
        boolean z;
        boolean z2;
        wn wnVar2;
        if (wnVar == null) {
            return false;
        }
        hn hnVar = this.a;
        hn hnVar2 = wnVar.a;
        if (hnVar == null) {
            z = true;
        } else {
            z = false;
        }
        if (hnVar2 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean j = j();
        boolean j2 = wnVar.j();
        if (!j && !j2) {
            if (!z || !z2) {
                if (z) {
                    wnVar = wnVar.n();
                } else {
                    if (z2) {
                        wnVar2 = n();
                    } else if (!hnVar.h(hnVar2)) {
                        return false;
                    } else {
                        wn[] wnVarArr = {this, hnVar.m(wnVar)};
                        hnVar.o(wnVarArr, 0, 2, null);
                        wnVar2 = wnVarArr[0];
                        wnVar = wnVarArr[1];
                    }
                    if (!wnVar2.b.equals(wnVar.b) && wnVar2.h().equals(wnVar.h())) {
                        return true;
                    }
                }
            }
            wnVar2 = this;
            return !wnVar2.b.equals(wnVar.b) ? false : false;
        } else if (!j || !j2) {
            return false;
        } else {
            if (!z && !z2 && !hnVar.h(hnVar2)) {
                return false;
            }
            return true;
        }
    }

    public final jn e() {
        b();
        return h();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wn) {
            return d((wn) obj);
        }
        return false;
    }

    public final int f() {
        hn hnVar = this.a;
        if (hnVar == null) {
            return 0;
        }
        return hnVar.f;
    }

    public final byte[] g() {
        if (j()) {
            return new byte[1];
        }
        wn n = n();
        byte[] e = n.b.e();
        byte[] e2 = n.h().e();
        byte[] bArr = new byte[e.length + e2.length + 1];
        bArr[0] = 4;
        System.arraycopy(e, 0, bArr, 1, e.length);
        System.arraycopy(e2, 0, bArr, e.length + 1, e2.length);
        return bArr;
    }

    public jn h() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode;
        hn hnVar = this.a;
        if (hnVar == null) {
            hashCode = 0;
        } else {
            hashCode = hnVar.hashCode() ^ (-1);
        }
        if (!j()) {
            wn n = n();
            return (hashCode ^ (n.b.hashCode() * 17)) ^ (n.h().hashCode() * 257);
        }
        return hashCode;
    }

    public jn i() {
        jn[] jnVarArr = this.d;
        if (jnVarArr.length <= 0) {
            return null;
        }
        return jnVarArr[0];
    }

    public final boolean j() {
        if (this.b != null && this.c != null) {
            jn[] jnVarArr = this.d;
            if (jnVarArr.length <= 0 || !jnVarArr[0].i()) {
                return false;
            }
        }
        return true;
    }

    public final boolean k() {
        if (j() || this.a == null || (q() && p())) {
            return true;
        }
        return false;
    }

    public final wn l(BigInteger bigInteger) {
        z61 z61Var;
        hn hnVar = this.a;
        synchronized (hnVar) {
            if (hnVar.h == null) {
                hnVar.h = hnVar.b();
            }
            z61Var = hnVar.h;
        }
        return z61Var.J0(this, bigInteger);
    }

    public abstract wn m();

    public final wn n() {
        int f;
        if (j() || (f = f()) == 0 || f == 5) {
            return this;
        }
        jn i = i();
        return i.h() ? this : o(i.g());
    }

    public final wn o(jn jnVar) {
        int f = f();
        if (f != 1) {
            if (f != 2 && f != 3 && f != 4) {
                if (f != 6) {
                    throw new IllegalStateException("not a projective coordinate system");
                }
            } else {
                jn o = jnVar.o();
                return this.a.d(this.b.j(o), this.c.j(o.j(jnVar)), this.e);
            }
        }
        return this.a.d(this.b.j(jnVar), this.c.j(jnVar), this.e);
    }

    public final boolean p() {
        BigInteger bigInteger = this.a.e;
        if (bigInteger != null && !bigInteger.equals(gn.b)) {
            BigInteger abs = bigInteger.abs();
            wn k = this.a.k();
            int bitLength = abs.bitLength();
            if (bitLength > 0) {
                if (abs.testBit(0)) {
                    k = this;
                }
                wn wnVar = this;
                for (int i = 1; i < bitLength; i++) {
                    wnVar = wnVar.w();
                    if (abs.testBit(i)) {
                        k = k.a(wnVar);
                    }
                }
            }
            if (bigInteger.signum() < 0) {
                k = k.m();
            }
            if (k.j()) {
                return false;
            }
        }
        return true;
    }

    public abstract boolean q();

    public wn r(jn jnVar) {
        if (j()) {
            return this;
        }
        return this.a.e(this.b.j(jnVar), this.c, this.d, this.e);
    }

    public wn s(jn jnVar) {
        if (j()) {
            return this;
        }
        return this.a.e(this.b, this.c.j(jnVar), this.d, this.e);
    }

    public abstract wn t(wn wnVar);

    public final String toString() {
        if (j()) {
            return "INF";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        stringBuffer.append(this.b);
        stringBuffer.append(',');
        stringBuffer.append(this.c);
        for (int i = 0; i < this.d.length; i++) {
            stringBuffer.append(',');
            stringBuffer.append(this.d[i]);
        }
        stringBuffer.append(')');
        return stringBuffer.toString();
    }

    public wn u() {
        return x(this);
    }

    public wn v(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("'e' cannot be negative");
        }
        wn wnVar = this;
        while (true) {
            i--;
            if (i < 0) {
                return wnVar;
            }
            wnVar = wnVar.w();
        }
    }

    public abstract wn w();

    public wn x(wn wnVar) {
        return w().a(wnVar);
    }
}