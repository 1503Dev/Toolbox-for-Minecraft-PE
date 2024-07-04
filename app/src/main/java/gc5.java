package defpackage;

/* renamed from: gc5  reason: default package */
public final class gc5 {
    public static final gc5 b = new gc5(new lp5());
    public static final gc5 c = new gc5(new ar());
    public static final gc5 d;
    public static final gc5 e;
    public static final gc5 f;
    public final fc5 a;

    static {
        new gc5(new xa2());
        new gc5(new o7((Object) null));
        d = new gc5(new zf());
        e = new gc5(new vj());
        f = new gc5(new ga1());
    }

    public gc5(hc5 hc5Var) {
        fc5 fkVar;
        if (d45.a()) {
            fkVar = new ij2(hc5Var);
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            fkVar = new jz1(hc5Var);
        } else {
            fkVar = new fk(hc5Var);
        }
        this.a = fkVar;
    }

    public final Object a(String str) {
        return this.a.m(str);
    }
}