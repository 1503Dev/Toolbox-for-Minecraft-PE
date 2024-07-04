package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: dm2  reason: default package */
public final class dm2 extends ol2 {
    public final bk1 P;

    public dm2(bk1 bk1Var) {
        this.P = bk1Var;
    }

    @Override // defpackage.pl2
    public final void F() {
        this.P.getClass();
    }

    @Override // defpackage.pl2
    public final String G() {
        return this.P.i;
    }

    @Override // defpackage.pl2
    public final boolean J() {
        return this.P.m;
    }

    @Override // defpackage.pl2
    public final void L0(hw hwVar) {
        bk1 bk1Var = this.P;
        View view = (View) va0.c0(hwVar);
        bk1Var.getClass();
    }

    @Override // defpackage.pl2
    public final boolean Q() {
        return this.P.n;
    }

    @Override // defpackage.pl2
    public final void Q0(hw hwVar, hw hwVar2, hw hwVar3) {
        HashMap hashMap = (HashMap) va0.c0(hwVar2);
        HashMap hashMap2 = (HashMap) va0.c0(hwVar3);
        bk1 bk1Var = this.P;
        View view = (View) va0.c0(hwVar);
        bk1Var.getClass();
        if (view instanceof b25) {
            b25 b25Var = (b25) view;
            throw null;
        } else if (((rz3) rz3.a.get(view)) != null) {
            throw null;
        }
    }

    @Override // defpackage.pl2
    public final double b() {
        Double d = this.P.g;
        if (d != null) {
            return d.doubleValue();
        }
        return -1.0d;
    }

    @Override // defpackage.pl2
    public final float e() {
        this.P.getClass();
        return 0.0f;
    }

    @Override // defpackage.pl2
    public final float f() {
        this.P.getClass();
        return 0.0f;
    }

    @Override // defpackage.pl2
    public final Bundle g() {
        return this.P.l;
    }

    @Override // defpackage.pl2
    public final float h() {
        this.P.getClass();
        return 0.0f;
    }

    @Override // defpackage.pl2
    public final cs3 j() {
        cs3 cs3Var;
        p31 p31Var = this.P.j;
        if (p31Var != null) {
            synchronized (p31Var.a) {
                cs3Var = p31Var.b;
            }
            return cs3Var;
        }
        return null;
    }

    @Override // defpackage.pl2
    public final hw k() {
        this.P.getClass();
        return null;
    }

    @Override // defpackage.pl2
    public final uc2 l() {
        return null;
    }

    @Override // defpackage.pl2
    public final String m() {
        return this.P.f;
    }

    @Override // defpackage.pl2
    public final ad2 n() {
        c70 c70Var = this.P.d;
        if (c70Var != null) {
            return new lc2(c70Var.a(), c70Var.c(), c70Var.b(), c70Var.e(), c70Var.d());
        }
        return null;
    }

    @Override // defpackage.pl2
    public final hw o() {
        this.P.getClass();
        return null;
    }

    @Override // defpackage.pl2
    public final String q() {
        return this.P.c;
    }

    @Override // defpackage.pl2
    public final void q3(hw hwVar) {
        bk1 bk1Var = this.P;
        View view = (View) va0.c0(hwVar);
        bk1Var.getClass();
    }

    @Override // defpackage.pl2
    public final List r() {
        List<c70> list = this.P.b;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (c70 c70Var : list) {
                arrayList.add(new lc2(c70Var.a(), c70Var.c(), c70Var.b(), c70Var.e(), c70Var.d()));
            }
        }
        return arrayList;
    }

    @Override // defpackage.pl2
    public final String s() {
        return this.P.a;
    }

    @Override // defpackage.pl2
    public final hw t() {
        Object obj = this.P.k;
        if (obj == null) {
            return null;
        }
        return new va0(obj);
    }

    @Override // defpackage.pl2
    public final String u() {
        return this.P.h;
    }

    @Override // defpackage.pl2
    public final String w() {
        return this.P.e;
    }
}