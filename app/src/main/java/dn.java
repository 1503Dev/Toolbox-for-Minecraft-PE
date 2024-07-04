package defpackage;

/* renamed from: dn  reason: default package */
public interface dn {
    public static final o a;
    public static final o b;
    public static final o c;
    public static final o d;
    public static final o e;

    static {
        o oVar = new o("0.4.0.127.0.7");
        o oVar2 = new o("2.2.1", oVar);
        oVar2.w("1");
        oVar2.w("2");
        o oVar3 = new o("2.2.3", oVar);
        new o("1", oVar3).w("1");
        new o("2", oVar3).w("1");
        o oVar4 = new o("2.2.2", oVar);
        o oVar5 = new o("1", oVar4);
        oVar5.w("1");
        oVar5.w("2");
        oVar5.w("3");
        oVar5.w("4");
        oVar5.w("5");
        oVar5.w("6");
        o oVar6 = new o("2", oVar4);
        a = new o("1", oVar6);
        b = new o("2", oVar6);
        c = new o("3", oVar6);
        d = new o("4", oVar6);
        e = new o("5", oVar6);
        oVar.w("3.1.2.1");
    }
}