package defpackage;

/* renamed from: og5  reason: default package */
public abstract class og5 {
    public abstract int a(Object obj);

    public abstract int b(Object obj);

    public abstract pg5 c(Object obj);

    public abstract pg5 d(Object obj);

    public abstract Object e(Object obj, Object obj2);

    public abstract pg5 f();

    public abstract Object g(Object obj);

    public abstract void h(int i, int i2, Object obj);

    public abstract void i(int i, long j, Object obj);

    public abstract void j(int i, Object obj, Object obj2);

    public abstract void k(Object obj, int i, gd5 gd5Var);

    public abstract void l(int i, long j, Object obj);

    public abstract void m(Object obj);

    public abstract void n(Object obj, Object obj2);

    public abstract void o(Object obj, Object obj2);

    public final boolean p(Object obj, md5 md5Var) {
        int i = md5Var.b;
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            return false;
                        }
                        if (i3 == 5) {
                            md5Var.q(5);
                            h(i2, md5Var.a.l(), obj);
                            return true;
                        }
                        int i4 = te5.Q;
                        throw new se5();
                    }
                    pg5 f = f();
                    int i5 = i2 << 3;
                    while (md5Var.t() != Integer.MAX_VALUE && p(f, md5Var)) {
                    }
                    if ((i5 | 4) == md5Var.b) {
                        g(f);
                        j(i2, obj, f);
                        return true;
                    }
                    throw new te5("Protocol message end-group tag did not match expected tag.");
                }
                k(obj, i2, md5Var.u());
                return true;
            }
            md5Var.q(1);
            i(i2, md5Var.a.r(), obj);
            return true;
        }
        md5Var.q(0);
        l(i2, md5Var.a.s(), obj);
        return true;
    }

    public abstract void q();

    public abstract void r(Object obj, rd5 rd5Var);
}