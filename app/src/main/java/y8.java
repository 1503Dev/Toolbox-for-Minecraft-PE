package defpackage;

import java.io.IOException;

/* renamed from: y8  reason: default package */
public final class y8 implements v {
    public kl5 P;

    public y8(kl5 kl5Var) {
        this.P = kl5Var;
    }

    @Override // defpackage.g
    public final t h() {
        try {
            return m();
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    @Override // defpackage.ex
    public final t m() {
        return new x8(this.P.c());
    }
}