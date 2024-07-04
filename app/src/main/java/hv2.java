package defpackage;

import java.util.HashSet;

/* renamed from: hv2  reason: default package */
public final class hv2 implements e32 {
    public final f25 b;
    public final zu2 d;
    public final Object a = new Object();
    public final HashSet e = new HashSet();
    public final HashSet f = new HashSet();
    public boolean g = false;
    public final av2 c = new av2(0);

    public hv2(String str, nl5 nl5Var) {
        this.d = new zu2(str, nl5Var);
        this.b = nl5Var;
    }

    public final void a(ru2 ru2Var) {
        synchronized (this.a) {
            this.e.add(ru2Var);
        }
    }

    @Override // defpackage.e32
    public final void d(boolean z) {
        zu2 zu2Var;
        int d;
        jv5.A.j.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            if (currentTimeMillis - this.b.i() > ((Long) w82.d.c.a(x92.F0)).longValue()) {
                zu2Var = this.d;
                d = -1;
            } else {
                zu2Var = this.d;
                d = this.b.d();
            }
            zu2Var.d = d;
            this.g = true;
            return;
        }
        this.b.r(currentTimeMillis);
        this.b.u(this.d.d);
    }
}