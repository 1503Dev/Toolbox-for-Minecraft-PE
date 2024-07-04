package defpackage;

/* renamed from: tu1  reason: default package */
public final class tu1 implements Runnable {
    public final /* synthetic */ int P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public /* synthetic */ tu1(int i, Object obj, Object obj2, Object obj3) {
        this.P = i;
        this.Q = obj;
        this.R = obj2;
        this.S = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kv1 kv1Var;
        boolean z = false;
        switch (this.P) {
            case 0:
                synchronized (((gv1) this.Q).T) {
                }
                lv1 lv1Var = (lv1) this.R;
                ov1 ov1Var = lv1Var.c;
                if (ov1Var == null) {
                    z = true;
                }
                if (z) {
                    ((gv1) this.Q).h(lv1Var.a);
                } else {
                    gv1 gv1Var = (gv1) this.Q;
                    synchronized (gv1Var.T) {
                        kv1Var = gv1Var.U;
                    }
                    if (kv1Var != null) {
                        kv1Var.c(ov1Var);
                    }
                }
                if (((lv1) this.R).d) {
                    ((gv1) this.Q).g("intermediate-response");
                } else {
                    ((gv1) this.Q).i("done");
                }
                Runnable runnable = (Runnable) this.S;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                qt2 qt2Var = (qt2) this.Q;
                pt2 pt2Var = (pt2) this.R;
                String str = (String) this.S;
                if (((m23) qt2Var.j.get()) != null) {
                    try {
                        pt2Var.c((m23) qt2Var.j.get());
                        return;
                    } catch (Exception unused) {
                        qt2Var.c(str, false);
                        return;
                    }
                }
                return;
        }
    }
}