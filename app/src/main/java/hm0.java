package defpackage;

/* renamed from: hm0  reason: default package */
public interface hm0 {
    public static final o a;
    public static final o b;
    public static final o c;
    public static final o d;

    static {
        o oVar = new o("1", new o("1.2.643.7"));
        oVar.w("1.2.2");
        oVar.w("1.2.3");
        oVar.w("1.4.1");
        yg.d(oVar, "1.4.2", "1.1.1", "1.1.2", "1.3.2");
        oVar.w("1.3.3");
        o oVar2 = new o("1.6", oVar);
        oVar2.w("1");
        oVar2.w("2");
        a = new o("2.1.1.1", oVar);
        b = new o("2.1.2.1", oVar);
        c = new o("2.1.2.2", oVar);
        d = new o("2.1.2.3", oVar);
        oVar.w("2.5.1.1");
    }
}