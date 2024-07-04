package defpackage;

import java.io.Serializable;

/* renamed from: r8  reason: default package */
public final class r8 implements Serializable {
    public v81 P;
    public final int Q;
    public int R;
    public int S;
    public boolean T = false;
    public boolean U = false;

    public r8(int i) {
        this.Q = i;
    }

    public final int a() {
        if (!this.T || this.U) {
            return Integer.MAX_VALUE;
        }
        return this.R;
    }
}