package defpackage;

import java.io.IOException;

/* renamed from: ni  reason: default package */
public final class ni implements v {
    public kl5 P;

    public ni(kl5 kl5Var) {
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
        return new mi(this.P.c());
    }
}