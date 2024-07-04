package defpackage;

/* renamed from: py5  reason: default package */
public final class py5 {
    public final qe3 a;
    public final int[] b;

    public py5(qe3 qe3Var, int[] iArr) {
        if (iArr.length == 0) {
            lb4.b("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = qe3Var;
        this.b = iArr;
    }
}