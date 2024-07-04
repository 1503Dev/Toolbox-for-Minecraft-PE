package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;

/* renamed from: m83  reason: default package */
public final class m83 extends h83 {
    public final Context i;
    public final View j;
    public final y03 k;
    public final zh4 l;
    public final aa3 m;
    public final wl3 n;
    public final qi3 o;
    public final hj5 p;
    public final Executor q;
    public zr5 r;

    public m83(ba3 ba3Var, Context context, zh4 zh4Var, View view, y03 y03Var, aa3 aa3Var, wl3 wl3Var, qi3 qi3Var, hj5 hj5Var, Executor executor) {
        super(ba3Var);
        this.i = context;
        this.j = view;
        this.k = y03Var;
        this.l = zh4Var;
        this.m = aa3Var;
        this.n = wl3Var;
        this.o = qi3Var;
        this.p = hj5Var;
        this.q = executor;
    }

    @Override // defpackage.ea3
    public final void a() {
        this.q.execute(new ty2(1, this));
        super.a();
    }

    @Override // defpackage.h83
    public final int b() {
        l92 l92Var = x92.A6;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue() && this.b.g0) {
            if (!((Boolean) w82Var.c.a(x92.B6)).booleanValue()) {
                return 0;
            }
        }
        return ((ci4) this.a.b.Q).c;
    }

    @Override // defpackage.h83
    public final View c() {
        return this.j;
    }

    @Override // defpackage.h83
    public final cs3 d() {
        try {
            return this.m.a();
        } catch (ni4 unused) {
            return null;
        }
    }

    @Override // defpackage.h83
    public final zh4 e() {
        zr5 zr5Var = this.r;
        if (zr5Var != null) {
            if (zr5Var.X) {
                return new zh4(-3, 0, true);
            }
            return new zh4(zr5Var.T, zr5Var.Q, false);
        }
        yh4 yh4Var = this.b;
        if (yh4Var.c0) {
            for (String str : yh4Var.a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            return new zh4(this.j.getWidth(), this.j.getHeight(), false);
        }
        return (zh4) this.b.r.get(0);
    }

    @Override // defpackage.h83
    public final zh4 f() {
        return this.l;
    }

    @Override // defpackage.h83
    public final void g() {
        qi3 qi3Var = this.o;
        synchronized (qi3Var) {
            qi3Var.R0(pi3.P);
        }
    }

    @Override // defpackage.h83
    public final void h(FrameLayout frameLayout, zr5 zr5Var) {
        y03 y03Var;
        if (frameLayout == null || (y03Var = this.k) == null) {
            return;
        }
        y03Var.A0(k23.a(zr5Var));
        frameLayout.setMinimumHeight(zr5Var.R);
        frameLayout.setMinimumWidth(zr5Var.U);
        this.r = zr5Var;
    }
}