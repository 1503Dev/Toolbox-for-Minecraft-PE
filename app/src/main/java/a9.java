package defpackage;

import java.io.IOException;

/* renamed from: a9  reason: default package */
public final class a9 implements g, ex {
    public kl5 P;

    public a9(kl5 kl5Var) {
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
        return new z8(this.P.c());
    }
}