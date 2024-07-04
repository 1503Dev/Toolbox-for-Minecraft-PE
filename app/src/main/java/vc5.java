package defpackage;

import defpackage.uc5;
import defpackage.vc5;
import java.io.IOException;
import java.util.logging.Logger;

/* renamed from: vc5  reason: default package */
public abstract class vc5<MessageType extends vc5<MessageType, BuilderType>, BuilderType extends uc5<MessageType, BuilderType>> implements nf5 {
    public int zza = 0;

    @Override // defpackage.nf5
    public final byte[] D() {
        try {
            ie5 ie5Var = (ie5) this;
            int d = ie5Var.d();
            byte[] bArr = new byte[d];
            Logger logger = qd5.R;
            nd5 nd5Var = new nd5(bArr, d);
            ie5Var.p(nd5Var);
            if (d - nd5Var.V == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(ij.c("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    @Override // defpackage.nf5
    public final ed5 c() {
        try {
            ie5 ie5Var = (ie5) this;
            int d = ie5Var.d();
            ed5 ed5Var = gd5.Q;
            byte[] bArr = new byte[d];
            Logger logger = qd5.R;
            nd5 nd5Var = new nd5(bArr, d);
            ie5Var.p(nd5Var);
            if (d - nd5Var.V == 0) {
                return new ed5(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(ij.c("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
        }
    }

    public int e(dg5 dg5Var) {
        throw null;
    }
}