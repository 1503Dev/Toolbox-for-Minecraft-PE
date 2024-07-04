package defpackage;

import android.os.Bundle;

/* renamed from: zu2  reason: default package */
public final class zu2 {
    public final String g;
    public final f25 h;
    public long a = -1;
    public long b = -1;
    public int c = -1;
    public int d = -1;
    public long e = 0;
    public final Object f = new Object();
    public int i = 0;
    public int j = 0;

    public zu2(String str, nl5 nl5Var) {
        this.g = str;
        this.h = nl5Var;
    }

    public final void a(pn5 pn5Var, long j) {
        Bundle bundle;
        synchronized (this.f) {
            long i = this.h.i();
            jv5.A.j.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (this.b == -1) {
                if (currentTimeMillis - i > ((Long) w82.d.c.a(x92.F0)).longValue()) {
                    this.d = -1;
                } else {
                    this.d = this.h.d();
                }
                this.b = j;
            }
            this.a = j;
            if (!((Boolean) w82.d.c.a(x92.S2)).booleanValue() && (bundle = pn5Var.R) != null && bundle.getInt("gw", 2) == 1) {
                return;
            }
            this.c++;
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 == 0) {
                this.e = 0L;
                this.h.p(currentTimeMillis);
            } else {
                this.e = currentTimeMillis - this.h.b();
            }
        }
    }

    public final void b() {
        if (((Boolean) ub2.a.d()).booleanValue()) {
            synchronized (this.f) {
                this.c--;
                this.d--;
            }
        }
    }
}