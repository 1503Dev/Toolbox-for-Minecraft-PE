package defpackage;

import java.io.IOException;

/* renamed from: sy2  reason: default package */
public final /* synthetic */ class sy2 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ sy2(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f;
        switch (this.P) {
            case 0:
                wy2 wy2Var = (wy2) this.Q;
                oy2 oy2Var = wy2Var.Q;
                float f2 = 0.0f;
                if (oy2Var.e) {
                    f = 0.0f;
                } else {
                    f = oy2Var.f;
                }
                if (oy2Var.c) {
                    f2 = f;
                }
                l03 l03Var = wy2Var.W;
                if (l03Var != null) {
                    try {
                        co5 co5Var = l03Var.X;
                        if (co5Var != null) {
                            co5Var.w(f2);
                            return;
                        }
                        return;
                    } catch (IOException e) {
                        sv2.h("", e);
                        return;
                    }
                }
                sv2.g("Trying to set volume before player is initialized.");
                return;
            case 1:
                pj4.a(((h53) this.Q).P, true);
                return;
            case 2:
                yr3 yr3Var = (yr3) this.Q;
                yr3Var.b.a.a(yr3Var.a, true);
                return;
            default:
                h64 h64Var = (h64) this.Q;
                synchronized (h64Var) {
                    h64Var.t4(3, "Signal collection timeout.");
                }
                return;
        }
    }
}