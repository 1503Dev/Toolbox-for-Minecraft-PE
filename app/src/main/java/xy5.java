package defpackage;

/* renamed from: xy5  reason: default package */
public final class xy5 {
    public final int a;
    public final zn5[] b;
    public final qy5[] c;
    public final vk3 d;
    public final Object e;

    public xy5(zn5[] zn5VarArr, qy5[] qy5VarArr, vk3 vk3Var, sy5 sy5Var) {
        this.b = zn5VarArr;
        this.c = (qy5[]) qy5VarArr.clone();
        this.d = vk3Var;
        this.e = sy5Var;
        this.a = zn5VarArr.length;
    }

    public final boolean a(xy5 xy5Var, int i) {
        return xy5Var != null && zn4.b(this.b[i], xy5Var.b[i]) && zn4.b(this.c[i], xy5Var.c[i]);
    }

    public final boolean b(int i) {
        return this.b[i] != null;
    }
}