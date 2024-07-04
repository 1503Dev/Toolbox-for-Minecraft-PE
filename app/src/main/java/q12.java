package defpackage;

import java.lang.reflect.InvocationTargetException;

/* renamed from: q12  reason: default package */
public final class q12 extends c22 {
    public q12(l02 l02Var, gx1 gx1Var, int i) {
        super(l02Var, "+Lr3mNK9DiW6aOFsrAhw/ufFUWF1jNkYNrUOryhl9dmdhxcK7UxVybCFjyLF5UVn", "z6qQV45Nmnz8yfEHycE7xvBh5frOehaJSTK9o+9gqcg=", gx1Var, i, 73);
    }

    @Override // defpackage.c22
    public final void b() {
        try {
            int i = 1;
            boolean booleanValue = ((Boolean) this.e.invoke(null, this.a.a)).booleanValue();
            gx1 gx1Var = this.d;
            if (true == booleanValue) {
                i = 2;
            }
            gx1Var.j();
            ey1.n0((ey1) gx1Var.Q, i);
        } catch (InvocationTargetException unused) {
            gx1 gx1Var2 = this.d;
            gx1Var2.j();
            ey1.n0((ey1) gx1Var2.Q, 3);
        }
    }
}