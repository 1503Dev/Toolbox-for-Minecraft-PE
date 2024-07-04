package defpackage;

import defpackage.ct1;
import defpackage.du1;
import java.io.IOException;
import java.util.logging.Logger;

/* renamed from: du1  reason: default package */
public abstract class du1<MessageType extends du1<MessageType, BuilderType>, BuilderType extends ct1<MessageType, BuilderType>> implements fk3 {
    public int zza = 0;

    public int a(lr3 lr3Var) {
        throw null;
    }

    @Override // defpackage.fk3
    public final p52 c() {
        try {
            ox2 ox2Var = (ox2) this;
            int i = ox2Var.i();
            p52 p52Var = y82.Q;
            byte[] bArr = new byte[i];
            Logger logger = hg2.R;
            ld2 ld2Var = new ld2(bArr, i);
            lr3 a = lq3.c.a(ox2Var.getClass());
            eh2 eh2Var = ld2Var.Q;
            if (eh2Var == null) {
                eh2Var = new eh2(ld2Var);
            }
            a.h(ox2Var, eh2Var);
            if (i - ld2Var.V == 0) {
                return new p52(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(ij.c("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
        }
    }
}