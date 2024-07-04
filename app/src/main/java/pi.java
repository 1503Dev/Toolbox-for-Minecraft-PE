package defpackage;

import java.io.IOException;

/* renamed from: pi  reason: default package */
public final class pi implements g, ex {
    public kl5 P;

    public pi(kl5 kl5Var) {
        this.P = kl5Var;
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
        return new oi(this.P.c());
    }
}