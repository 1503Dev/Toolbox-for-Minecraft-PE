package defpackage;

import defpackage.wn;

/* renamed from: ap0  reason: default package */
public final class ap0 extends wn.a {
    public ap0(hn hnVar, jn jnVar, jn jnVar2, boolean z) {
        super(hnVar, jnVar, jnVar2);
        if ((jnVar == null) != (jnVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = z;
    }

    public ap0(hn hnVar, jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        super(hnVar, jnVar, jnVar2, jnVarArr);
        this.e = z;
    }

    @Override // defpackage.wn
    public final wn a(wn wnVar) {
        jn jnVar;
        jn jnVar2;
        jn jnVar3;
        jn jnVar4;
        jn jnVar5;
        jn jnVar6;
        jn jnVar7;
        if (j()) {
            return wnVar;
        }
        if (wnVar.j()) {
            return this;
        }
        hn hnVar = this.a;
        jn jnVar8 = this.b;
        jn jnVar9 = wnVar.b;
        if (jnVar8.i()) {
            if (jnVar9.i()) {
                return hnVar.k();
            }
            return wnVar.a(this);
        }
        jn jnVar10 = this.c;
        jn jnVar11 = this.d[0];
        jn jnVar12 = wnVar.c;
        jn i = wnVar.i();
        boolean h = jnVar11.h();
        if (!h) {
            jnVar = jnVar9.j(jnVar11);
            jnVar2 = jnVar12.j(jnVar11);
        } else {
            jnVar = jnVar9;
            jnVar2 = jnVar12;
        }
        boolean h2 = i.h();
        if (!h2) {
            jnVar8 = jnVar8.j(i);
            jnVar3 = jnVar10.j(i);
        } else {
            jnVar3 = jnVar10;
        }
        jn a = jnVar3.a(jnVar2);
        jn a2 = jnVar8.a(jnVar);
        if (a2.i()) {
            if (a.i()) {
                return w();
            }
            return hnVar.k();
        }
        if (jnVar9.i()) {
            wn n = n();
            jn jnVar13 = n.b;
            jn h3 = n.h();
            jn d = h3.a(jnVar12).d(jnVar13);
            jnVar6 = vn.a(d, d, jnVar13).a(hnVar.b);
            if (jnVar6.i()) {
                return new ap0(hnVar, jnVar6, hnVar.c.n(), this.e);
            }
            jn a3 = d.j(jnVar13.a(jnVar6)).a(jnVar6).a(h3).d(jnVar6).a(jnVar6);
            jnVar7 = hnVar.i(gn.b);
            jnVar5 = a3;
        } else {
            jn o = a2.o();
            jn j = a.j(jnVar8);
            jn j2 = a.j(jnVar);
            jn j3 = j.j(j2);
            if (j3.i()) {
                return new ap0(hnVar, j3, hnVar.c.n(), this.e);
            }
            jn j4 = a.j(o);
            if (!h2) {
                j4 = j4.j(i);
            }
            jn p = j2.a(o).p(j4, jnVar10.a(jnVar11));
            if (!h) {
                jnVar4 = j4.j(jnVar11);
            } else {
                jnVar4 = j4;
            }
            jnVar5 = p;
            jnVar6 = j3;
            jnVar7 = jnVar4;
        }
        return new ap0(hnVar, jnVar6, jnVar5, new jn[]{jnVar7}, this.e);
    }

    @Override // defpackage.wn
    public final wn c() {
        b();
        return new ap0(null, this.b, e(), false);
    }

    @Override // defpackage.wn
    public final jn h() {
        jn jnVar = this.b;
        jn jnVar2 = this.c;
        if (j() || jnVar.i()) {
            return jnVar2;
        }
        jn j = jnVar2.a(jnVar).j(jnVar);
        jn jnVar3 = this.d[0];
        return !jnVar3.h() ? j.d(jnVar3) : j;
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
        jn jnVar2 = this.c;
        jn jnVar3 = this.d[0];
        return new ap0(this.a, jnVar, jnVar2.a(jnVar3), new jn[]{jnVar3}, this.e);
    }

    @Override // defpackage.wn
    public final wn w() {
        jn j;
        jn o;
        jn j2;
        if (j()) {
            return this;
        }
        hn hnVar = this.a;
        jn jnVar = this.b;
        if (jnVar.i()) {
            return hnVar.k();
        }
        jn jnVar2 = this.c;
        jn jnVar3 = this.d[0];
        boolean h = jnVar3.h();
        if (h) {
            j = jnVar2;
        } else {
            j = jnVar2.j(jnVar3);
        }
        if (h) {
            o = jnVar3;
        } else {
            o = jnVar3.o();
        }
        jn jnVar4 = hnVar.b;
        if (!h) {
            jnVar4 = jnVar4.j(o);
        }
        jn a = vn.a(jnVar2, j, jnVar4);
        if (a.i()) {
            return new ap0(hnVar, a, hnVar.c.n(), this.e);
        }
        jn o2 = a.o();
        if (h) {
            j2 = a;
        } else {
            j2 = a.j(o);
        }
        if (!h) {
            jnVar = jnVar.j(jnVar3);
        }
        return new ap0(hnVar, o2, jnVar.p(a, j).a(o2).a(j2), new jn[]{j2}, this.e);
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
        jn jnVar2 = wnVar.b;
        jn i = wnVar.i();
        if (!jnVar2.i() && i.h()) {
            jn jnVar3 = this.c;
            jn jnVar4 = this.d[0];
            jn jnVar5 = wnVar.c;
            jn o = jnVar.o();
            jn o2 = jnVar3.o();
            jn o3 = jnVar4.o();
            jn a = hnVar.b.j(o3).a(o2).a(jnVar3.j(jnVar4));
            jn b = jnVar5.b();
            jn l = hnVar.b.a(b).j(o3).a(o2).l(a, o, o3);
            jn j = jnVar2.j(o3);
            jn o4 = j.a(a).o();
            if (o4.i()) {
                if (l.i()) {
                    return wnVar.w();
                }
                return hnVar.k();
            } else if (l.i()) {
                return new ap0(hnVar, l, hnVar.c.n(), this.e);
            } else {
                jn j2 = l.o().j(j);
                jn j3 = l.j(o4).j(o3);
                return new ap0(hnVar, j2, l.a(o4).o().l(a, b, j3), new jn[]{j3}, this.e);
            }
        }
        return w().a(wnVar);
    }
}