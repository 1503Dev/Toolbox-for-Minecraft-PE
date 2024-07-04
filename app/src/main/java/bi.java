package defpackage;

import java.io.IOException;

/* renamed from: bi  reason: default package */
public final class bi implements g, ex {
    public kl5 P;

    public bi(kl5 kl5Var) {
        this.P = kl5Var;
    }

    @Override // defpackage.g
    public final t h() {
        try {
            return m();
        } catch (IOException e) {
            throw new s(0, "unable to get DER object", e);
        } catch (IllegalArgumentException e2) {
            throw new s(0, "unable to get DER object", e2);
        }
    }

    @Override // defpackage.ex
    public final t m() {
        try {
            return new ai(this.P.c());
        } catch (IllegalArgumentException e) {
            throw new i(e.getMessage(), e);
        }
    }
}