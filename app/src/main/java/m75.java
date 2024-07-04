package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: m75  reason: default package */
public final class m75 extends k65 {
    public m75() {
        super(p05.class);
    }

    @Override // defpackage.k65
    public final /* bridge */ /* synthetic */ Object a(nf5 nf5Var) {
        ea5 ea5Var = (ea5) nf5Var;
        int B = ea5Var.B().B();
        SecretKeySpec secretKeySpec = new SecretKeySpec(ea5Var.C().g(), "HMAC");
        int w = ea5Var.B().w();
        int i = B - 2;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return new mc5(new lc5("HMACSHA224", secretKeySpec), w);
                        }
                        throw new GeneralSecurityException("unknown hash");
                    }
                    return new mc5(new lc5("HMACSHA512", secretKeySpec), w);
                }
                return new mc5(new lc5("HMACSHA256", secretKeySpec), w);
            }
            return new mc5(new lc5("HMACSHA384", secretKeySpec), w);
        }
        return new mc5(new lc5("HMACSHA1", secretKeySpec), w);
    }
}