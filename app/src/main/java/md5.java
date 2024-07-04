package defpackage;

import java.nio.charset.Charset;
import java.util.List;

/* renamed from: md5  reason: default package */
public final class md5 {
    public final ld5 a;
    public int b;
    public int c;
    public int d = 0;

    public md5(ld5 ld5Var) {
        Charset charset = re5.a;
        this.a = ld5Var;
        ld5Var.b = this;
    }

    public static final void r(int i) {
        if ((i & 3) != 0) {
            throw te5.e();
        }
    }

    public static final void s(int i) {
        if ((i & 7) != 0) {
            throw te5.e();
        }
    }

    public final void a(List list) {
        int p;
        int p2;
        if (!(list instanceof df5)) {
            int i = this.b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(this.a.r()));
                    if (this.a.b()) {
                        return;
                    }
                    p = this.a.p();
                } while (p == this.b);
                this.d = p;
                return;
            } else if (i != 2) {
                throw te5.a();
            } else {
                int q = this.a.q();
                s(q);
                int i2 = this.a.i() + q;
                do {
                    list.add(Long.valueOf(this.a.r()));
                } while (this.a.i() < i2);
                return;
            }
        }
        df5 df5Var = (df5) list;
        int i3 = this.b & 7;
        if (i3 == 1) {
            do {
                df5Var.h(this.a.r());
                if (this.a.b()) {
                    return;
                }
                p2 = this.a.p();
            } while (p2 == this.b);
            this.d = p2;
        } else if (i3 != 2) {
            throw te5.a();
        } else {
            int q2 = this.a.q();
            s(q2);
            int i4 = this.a.i() + q2;
            do {
                df5Var.h(this.a.r());
            } while (this.a.i() < i4);
        }
    }

    public final void b(List list) {
        int p;
        int p2;
        if (!(list instanceof be5)) {
            int i = this.b & 7;
            if (i == 2) {
                int q = this.a.q();
                r(q);
                int i2 = this.a.i() + q;
                do {
                    list.add(Float.valueOf(this.a.h()));
                } while (this.a.i() < i2);
                return;
            } else if (i != 5) {
                throw te5.a();
            } else {
                do {
                    list.add(Float.valueOf(this.a.h()));
                    if (this.a.b()) {
                        return;
                    }
                    p = this.a.p();
                } while (p == this.b);
                this.d = p;
                return;
            }
        }
        be5 be5Var = (be5) list;
        int i3 = this.b & 7;
        if (i3 == 2) {
            int q2 = this.a.q();
            r(q2);
            int i4 = this.a.i() + q2;
            do {
                be5Var.h(this.a.h());
            } while (this.a.i() < i4);
        } else if (i3 != 5) {
            throw te5.a();
        } else {
            do {
                be5Var.h(this.a.h());
                if (this.a.b()) {
                    return;
                }
                p2 = this.a.p();
            } while (p2 == this.b);
            this.d = p2;
        }
    }

    @Deprecated
    public final void c(List list, dg5 dg5Var, ud5 ud5Var) {
        int p;
        int i = this.b;
        if ((i & 7) == 3) {
            do {
                ie5 b = dg5Var.b();
                n(b, dg5Var, ud5Var);
                dg5Var.a(b);
                list.add(b);
                if (!this.a.b() && this.d == 0) {
                    p = this.a.p();
                } else {
                    return;
                }
            } while (p == i);
            this.d = p;
            return;
        }
        int i2 = te5.Q;
        throw new se5();
    }

    public final void d(List list) {
        int p;
        int p2;
        if (!(list instanceof je5)) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.a.m()));
                    if (this.a.b()) {
                        return;
                    }
                    p = this.a.p();
                } while (p == this.b);
                this.d = p;
                return;
            } else if (i != 2) {
                throw te5.a();
            } else {
                int i2 = this.a.i() + this.a.q();
                do {
                    list.add(Integer.valueOf(this.a.m()));
                } while (this.a.i() < i2);
                p(i2);
                return;
            }
        }
        je5 je5Var = (je5) list;
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                je5Var.h(this.a.m());
                if (this.a.b()) {
                    return;
                }
                p2 = this.a.p();
            } while (p2 == this.b);
            this.d = p2;
        } else if (i3 != 2) {
            throw te5.a();
        } else {
            int i4 = this.a.i() + this.a.q();
            do {
                je5Var.h(this.a.m());
            } while (this.a.i() < i4);
            p(i4);
        }
    }

    public final void e(List list) {
        int p;
        int p2;
        if (!(list instanceof df5)) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(this.a.s()));
                    if (this.a.b()) {
                        return;
                    }
                    p = this.a.p();
                } while (p == this.b);
                this.d = p;
                return;
            } else if (i != 2) {
                throw te5.a();
            } else {
                int i2 = this.a.i() + this.a.q();
                do {
                    list.add(Long.valueOf(this.a.s()));
                } while (this.a.i() < i2);
                p(i2);
                return;
            }
        }
        df5 df5Var = (df5) list;
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                df5Var.h(this.a.s());
                if (this.a.b()) {
                    return;
                }
                p2 = this.a.p();
            } while (p2 == this.b);
            this.d = p2;
        } else if (i3 != 2) {
            throw te5.a();
        } else {
            int i4 = this.a.i() + this.a.q();
            do {
                df5Var.h(this.a.s());
            } while (this.a.i() < i4);
            p(i4);
        }
    }

    public final void f(List list, dg5 dg5Var, ud5 ud5Var) {
        int p;
        int i = this.b;
        if ((i & 7) == 2) {
            do {
                ie5 b = dg5Var.b();
                o(b, dg5Var, ud5Var);
                dg5Var.a(b);
                list.add(b);
                if (!this.a.b() && this.d == 0) {
                    p = this.a.p();
                } else {
                    return;
                }
            } while (p == i);
            this.d = p;
            return;
        }
        int i2 = te5.Q;
        throw new se5();
    }

    public final void g(List list) {
        int p;
        int p2;
        if (!(list instanceof je5)) {
            int i = this.b & 7;
            if (i == 2) {
                int q = this.a.q();
                r(q);
                int i2 = this.a.i() + q;
                do {
                    list.add(Integer.valueOf(this.a.n()));
                } while (this.a.i() < i2);
                return;
            } else if (i != 5) {
                throw te5.a();
            } else {
                do {
                    list.add(Integer.valueOf(this.a.n()));
                    if (this.a.b()) {
                        return;
                    }
                    p = this.a.p();
                } while (p == this.b);
                this.d = p;
                return;
            }
        }
        je5 je5Var = (je5) list;
        int i3 = this.b & 7;
        if (i3 == 2) {
            int q2 = this.a.q();
            r(q2);
            int i4 = this.a.i() + q2;
            do {
                je5Var.h(this.a.n());
            } while (this.a.i() < i4);
        } else if (i3 != 5) {
            throw te5.a();
        } else {
            do {
                je5Var.h(this.a.n());
                if (this.a.b()) {
                    return;
                }
                p2 = this.a.p();
            } while (p2 == this.b);
            this.d = p2;
        }
    }

    public final void h(List list) {
        int p;
        int p2;
        if (!(list instanceof df5)) {
            int i = this.b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(this.a.t()));
                    if (this.a.b()) {
                        return;
                    }
                    p = this.a.p();
                } while (p == this.b);
                this.d = p;
                return;
            } else if (i != 2) {
                throw te5.a();
            } else {
                int q = this.a.q();
                s(q);
                int i2 = this.a.i() + q;
                do {
                    list.add(Long.valueOf(this.a.t()));
                } while (this.a.i() < i2);
                return;
            }
        }
        df5 df5Var = (df5) list;
        int i3 = this.b & 7;
        if (i3 == 1) {
            do {
                df5Var.h(this.a.t());
                if (this.a.b()) {
                    return;
                }
                p2 = this.a.p();
            } while (p2 == this.b);
            this.d = p2;
        } else if (i3 != 2) {
            throw te5.a();
        } else {
            int q2 = this.a.q();
            s(q2);
            int i4 = this.a.i() + q2;
            do {
                df5Var.h(this.a.t());
            } while (this.a.i() < i4);
        }
    }

    public final void i(List list) {
        int p;
        int p2;
        if (!(list instanceof je5)) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.a.o()));
                    if (this.a.b()) {
                        return;
                    }
                    p = this.a.p();
                } while (p == this.b);
                this.d = p;
                return;
            } else if (i != 2) {
                throw te5.a();
            } else {
                int i2 = this.a.i() + this.a.q();
                do {
                    list.add(Integer.valueOf(this.a.o()));
                } while (this.a.i() < i2);
                p(i2);
                return;
            }
        }
        je5 je5Var = (je5) list;
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                je5Var.h(this.a.o());
                if (this.a.b()) {
                    return;
                }
                p2 = this.a.p();
            } while (p2 == this.b);
            this.d = p2;
        } else if (i3 != 2) {
            throw te5.a();
        } else {
            int i4 = this.a.i() + this.a.q();
            do {
                je5Var.h(this.a.o());
            } while (this.a.i() < i4);
            p(i4);
        }
    }

    public final void j(List list) {
        int p;
        int p2;
        if (!(list instanceof df5)) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(this.a.u()));
                    if (this.a.b()) {
                        return;
                    }
                    p = this.a.p();
                } while (p == this.b);
                this.d = p;
                return;
            } else if (i != 2) {
                throw te5.a();
            } else {
                int i2 = this.a.i() + this.a.q();
                do {
                    list.add(Long.valueOf(this.a.u()));
                } while (this.a.i() < i2);
                p(i2);
                return;
            }
        }
        df5 df5Var = (df5) list;
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                df5Var.h(this.a.u());
                if (this.a.b()) {
                    return;
                }
                p2 = this.a.p();
            } while (p2 == this.b);
            this.d = p2;
        } else if (i3 != 2) {
            throw te5.a();
        } else {
            int i4 = this.a.i() + this.a.q();
            do {
                df5Var.h(this.a.u());
            } while (this.a.i() < i4);
            p(i4);
        }
    }

    public final void k(List list, boolean z) {
        String x;
        int p;
        int p2;
        if ((this.b & 7) == 2) {
            if ((list instanceof ye5) && !z) {
                ye5 ye5Var = (ye5) list;
                do {
                    ye5Var.k(u());
                    if (this.a.b()) {
                        return;
                    }
                    p2 = this.a.p();
                } while (p2 == this.b);
                this.d = p2;
                return;
            }
            do {
                if (z) {
                    q(2);
                    x = this.a.y();
                } else {
                    q(2);
                    x = this.a.x();
                }
                list.add(x);
                if (this.a.b()) {
                    return;
                }
                p = this.a.p();
            } while (p == this.b);
            this.d = p;
            return;
        }
        int i = te5.Q;
        throw new se5();
    }

    public final void l(List list) {
        int p;
        int p2;
        if (!(list instanceof je5)) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.a.q()));
                    if (this.a.b()) {
                        return;
                    }
                    p = this.a.p();
                } while (p == this.b);
                this.d = p;
                return;
            } else if (i != 2) {
                throw te5.a();
            } else {
                int i2 = this.a.i() + this.a.q();
                do {
                    list.add(Integer.valueOf(this.a.q()));
                } while (this.a.i() < i2);
                p(i2);
                return;
            }
        }
        je5 je5Var = (je5) list;
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                je5Var.h(this.a.q());
                if (this.a.b()) {
                    return;
                }
                p2 = this.a.p();
            } while (p2 == this.b);
            this.d = p2;
        } else if (i3 != 2) {
            throw te5.a();
        } else {
            int i4 = this.a.i() + this.a.q();
            do {
                je5Var.h(this.a.q());
            } while (this.a.i() < i4);
            p(i4);
        }
    }

    public final void m(List list) {
        int p;
        int p2;
        if (!(list instanceof df5)) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(this.a.v()));
                    if (this.a.b()) {
                        return;
                    }
                    p = this.a.p();
                } while (p == this.b);
                this.d = p;
                return;
            } else if (i != 2) {
                throw te5.a();
            } else {
                int i2 = this.a.i() + this.a.q();
                do {
                    list.add(Long.valueOf(this.a.v()));
                } while (this.a.i() < i2);
                p(i2);
                return;
            }
        }
        df5 df5Var = (df5) list;
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                df5Var.h(this.a.v());
                if (this.a.b()) {
                    return;
                }
                p2 = this.a.p();
            } while (p2 == this.b);
            this.d = p2;
        } else if (i3 != 2) {
            throw te5.a();
        } else {
            int i4 = this.a.i() + this.a.q();
            do {
                df5Var.h(this.a.v());
            } while (this.a.i() < i4);
            p(i4);
        }
    }

    public final void n(Object obj, dg5 dg5Var, ud5 ud5Var) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            dg5Var.i(obj, this, ud5Var);
            if (this.b == this.c) {
                return;
            }
            throw te5.e();
        } finally {
            this.c = i;
        }
    }

    public final void o(Object obj, dg5 dg5Var, ud5 ud5Var) {
        ld5 ld5Var;
        int q = this.a.q();
        ld5 ld5Var2 = this.a;
        if (ld5Var2.a >= 100) {
            throw new te5("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int j = ld5Var2.j(q);
        this.a.a++;
        dg5Var.i(obj, this, ud5Var);
        this.a.z(0);
        ld5Var.a--;
        this.a.a(j);
    }

    public final void p(int i) {
        if (this.a.i() != i) {
            throw te5.f();
        }
    }

    public final void q(int i) {
        if ((this.b & 7) != i) {
            throw te5.a();
        }
    }

    public final int t() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            i = this.a.p();
            this.b = i;
        }
        if (i == 0 || i == this.c) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    public final gd5 u() {
        q(2);
        return this.a.w();
    }

    public final void v(List list) {
        int p;
        int p2;
        if (!(list instanceof ad5)) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Boolean.valueOf(this.a.c()));
                    if (this.a.b()) {
                        return;
                    }
                    p = this.a.p();
                } while (p == this.b);
                this.d = p;
                return;
            } else if (i != 2) {
                throw te5.a();
            } else {
                int i2 = this.a.i() + this.a.q();
                do {
                    list.add(Boolean.valueOf(this.a.c()));
                } while (this.a.i() < i2);
                p(i2);
                return;
            }
        }
        ad5 ad5Var = (ad5) list;
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                ad5Var.h(this.a.c());
                if (this.a.b()) {
                    return;
                }
                p2 = this.a.p();
            } while (p2 == this.b);
            this.d = p2;
        } else if (i3 != 2) {
            throw te5.a();
        } else {
            int i4 = this.a.i() + this.a.q();
            do {
                ad5Var.h(this.a.c());
            } while (this.a.i() < i4);
            p(i4);
        }
    }

    public final void w(List list) {
        int p;
        if ((this.b & 7) != 2) {
            throw te5.a();
        }
        do {
            list.add(u());
            if (this.a.b()) {
                return;
            }
            p = this.a.p();
        } while (p == this.b);
        this.d = p;
    }

    public final void x(List list) {
        int p;
        int p2;
        if (!(list instanceof sd5)) {
            int i = this.b & 7;
            if (i == 1) {
                do {
                    list.add(Double.valueOf(this.a.g()));
                    if (this.a.b()) {
                        return;
                    }
                    p = this.a.p();
                } while (p == this.b);
                this.d = p;
                return;
            } else if (i != 2) {
                throw te5.a();
            } else {
                int q = this.a.q();
                s(q);
                int i2 = this.a.i() + q;
                do {
                    list.add(Double.valueOf(this.a.g()));
                } while (this.a.i() < i2);
                return;
            }
        }
        sd5 sd5Var = (sd5) list;
        int i3 = this.b & 7;
        if (i3 == 1) {
            do {
                sd5Var.h(this.a.g());
                if (this.a.b()) {
                    return;
                }
                p2 = this.a.p();
            } while (p2 == this.b);
            this.d = p2;
        } else if (i3 != 2) {
            throw te5.a();
        } else {
            int q2 = this.a.q();
            s(q2);
            int i4 = this.a.i() + q2;
            do {
                sd5Var.h(this.a.g());
            } while (this.a.i() < i4);
        }
    }

    public final void y(List list) {
        int p;
        int p2;
        if (!(list instanceof je5)) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.a.k()));
                    if (this.a.b()) {
                        return;
                    }
                    p = this.a.p();
                } while (p == this.b);
                this.d = p;
                return;
            } else if (i != 2) {
                throw te5.a();
            } else {
                int i2 = this.a.i() + this.a.q();
                do {
                    list.add(Integer.valueOf(this.a.k()));
                } while (this.a.i() < i2);
                p(i2);
                return;
            }
        }
        je5 je5Var = (je5) list;
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                je5Var.h(this.a.k());
                if (this.a.b()) {
                    return;
                }
                p2 = this.a.p();
            } while (p2 == this.b);
            this.d = p2;
        } else if (i3 != 2) {
            throw te5.a();
        } else {
            int i4 = this.a.i() + this.a.q();
            do {
                je5Var.h(this.a.k());
            } while (this.a.i() < i4);
            p(i4);
        }
    }

    public final void z(List list) {
        int p;
        int p2;
        if (!(list instanceof je5)) {
            int i = this.b & 7;
            if (i == 2) {
                int q = this.a.q();
                r(q);
                int i2 = this.a.i() + q;
                do {
                    list.add(Integer.valueOf(this.a.l()));
                } while (this.a.i() < i2);
                return;
            } else if (i != 5) {
                throw te5.a();
            } else {
                do {
                    list.add(Integer.valueOf(this.a.l()));
                    if (this.a.b()) {
                        return;
                    }
                    p = this.a.p();
                } while (p == this.b);
                this.d = p;
                return;
            }
        }
        je5 je5Var = (je5) list;
        int i3 = this.b & 7;
        if (i3 == 2) {
            int q2 = this.a.q();
            r(q2);
            int i4 = this.a.i() + q2;
            do {
                je5Var.h(this.a.l());
            } while (this.a.i() < i4);
        } else if (i3 != 5) {
            throw te5.a();
        } else {
            do {
                je5Var.h(this.a.l());
                if (this.a.b()) {
                    return;
                }
                p2 = this.a.p();
            } while (p2 == this.b);
            this.d = p2;
        }
    }
}