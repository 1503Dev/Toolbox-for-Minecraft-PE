package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;

/* renamed from: f8  reason: default package */
public final class f8 implements Key, PublicKey {
    public final x60 P;

    public f8(nu0 nu0Var) {
        this.P = new x60(nu0Var.Q.w());
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof f8)) {
            return j7.a(j7.c(this.P.U), j7.c(((f8) obj).P.U));
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return new nu0(new u3(hd0.e), j7.c(this.P.U)).n();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return j7.h(j7.c(this.P.U));
    }
}