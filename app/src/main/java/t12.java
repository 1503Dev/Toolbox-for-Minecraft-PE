package defpackage;

/* renamed from: t12  reason: default package */
public final class t12 extends c22 {
    public final StackTraceElement[] h;

    public t12(l02 l02Var, gx1 gx1Var, int i, StackTraceElement[] stackTraceElementArr) {
        super(l02Var, "FZw69K6puYJxxRxEPnIcPhNWMb6KJOCrIG9Jmt7OCzqsABzt6hhEAApiISZy7jIX", "bNQyCiIh4bApN5OPBGky2u9xZmVV2JI0QXAUD4Niu0E=", gx1Var, i, 45);
        this.h = stackTraceElementArr;
    }

    @Override // defpackage.c22
    public final void b() {
        StackTraceElement[] stackTraceElementArr = this.h;
        if (stackTraceElementArr != null) {
            int i = 1;
            e02 e02Var = new e02((String) this.e.invoke(null, stackTraceElementArr));
            synchronized (this.d) {
                gx1 gx1Var = this.d;
                long longValue = e02Var.a.longValue();
                gx1Var.j();
                ey1.H((ey1) gx1Var.Q, longValue);
                if (e02Var.b.booleanValue()) {
                    gx1 gx1Var2 = this.d;
                    if (true != e02Var.c.booleanValue()) {
                        i = 2;
                    }
                    gx1Var2.j();
                    ey1.m0((ey1) gx1Var2.Q, i);
                } else {
                    gx1 gx1Var3 = this.d;
                    gx1Var3.j();
                    ey1.m0((ey1) gx1Var3.Q, 3);
                }
            }
        }
    }
}