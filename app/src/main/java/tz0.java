package defpackage;

import defpackage.xs0;

/* renamed from: tz0  reason: default package */
public final /* synthetic */ class tz0 implements xs0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tz0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.xs0.a
    public final void a() {
        Runnable runnable;
        switch (this.a) {
            case 0:
                ((uz0) this.b).a();
                return;
            default:
                xa0 xa0Var = (xa0) this.b;
                if (xa0Var.c.Q) {
                    runnable = xa0Var.a;
                } else {
                    runnable = xa0Var.b;
                }
                runnable.run();
                return;
        }
    }
}