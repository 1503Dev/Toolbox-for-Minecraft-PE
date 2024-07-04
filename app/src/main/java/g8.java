package defpackage;

/* renamed from: g8  reason: default package */
public interface g8 {
    public static final o a;
    public static final o b;
    public static final o c;
    public static final o d;

    static {
        o oVar = new o("1.3.6.1.4.1.22554");
        o oVar2 = new o("1", oVar);
        o oVar3 = new o("1", oVar2);
        o oVar4 = new o("2.1", oVar2);
        oVar2.w("2.2");
        oVar2.w("2.3");
        oVar2.w("2.4");
        oVar3.w("1");
        o oVar5 = new o("2", oVar3);
        oVar4.w("1");
        o oVar6 = new o("2", oVar4);
        oVar5.w("1.2");
        oVar5.w("1.22");
        oVar5.w("1.42");
        oVar6.w("1.2");
        oVar6.w("1.22");
        oVar6.w("1.42");
        o oVar7 = new o("2", oVar);
        o oVar8 = new o("1", oVar7);
        a = oVar8;
        new o("1", oVar8);
        new o("2", oVar8);
        new o("3", oVar8);
        o oVar9 = new o("2", oVar7);
        b = oVar9;
        new o("1", oVar9);
        new o("2", oVar9);
        new o("3", oVar9);
        new o("4", oVar9);
        o oVar10 = new o("3", oVar7);
        c = oVar10;
        new o("1", oVar10);
        new o("2", oVar10);
        new o("3", oVar10);
        new o("4", oVar10);
        d = new o("1", new o("3", oVar));
    }
}