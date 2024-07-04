package defpackage;

import java.io.IOException;

/* renamed from: t8  reason: default package */
public final class t8 implements g, ex {
    public final int P;
    public final kl5 Q;

    public t8(int i, kl5 kl5Var) {
        this.P = i;
        this.Q = kl5Var;
    }

    @Override // defpackage.g
    public final t h() {
        try {
            return m();
        } catch (IOException e) {
            throw new s(0, e.getMessage(), e);
        }
    }

    @Override // defpackage.ex
    public final t m() {
        return new s8(this.P, this.Q.c());
    }
}