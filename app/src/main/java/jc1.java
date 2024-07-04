package defpackage;

import defpackage.ra1;

/* renamed from: jc1  reason: default package */
public final class jc1 implements kb1, ra1.a {
    public static jc1 f;
    public float a = 0.0f;
    public final dt4 b;
    public final s45 c;
    public yb1 d;
    public aa1 e;

    public jc1(dt4 dt4Var, s45 s45Var) {
        this.b = dt4Var;
        this.c = s45Var;
    }

    public static jc1 a() {
        if (f == null) {
            f = new jc1(new dt4(), new s45());
        }
        return f;
    }
}