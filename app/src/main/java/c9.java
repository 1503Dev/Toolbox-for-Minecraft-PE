package defpackage;

import java.io.IOException;

/* renamed from: c9  reason: default package */
public final class c9 implements g, ex {
    public boolean P;
    public int Q;
    public kl5 R;

    public c9(boolean z, int i, kl5 kl5Var) {
        this.P = z;
        this.Q = i;
        this.R = kl5Var;
    }

    @Override // defpackage.g
    public final t h() {
        try {
            return m();
        } catch (IOException e) {
            throw new s(e.getMessage());
        }
    }

    @Override // defpackage.ex
    public final t m() {
        return this.R.b(this.Q, this.P);
    }
}