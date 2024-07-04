package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: s8  reason: default package */
public final class s8 extends d {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s8(int i, s82 s82Var) {
        super(i, true, r0.toByteArray());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i2 = 0; i2 != s82Var.i(); i2++) {
            try {
                byteArrayOutputStream.write(((n) s82Var.h(i2)).o("BER"));
            } catch (IOException e) {
                throw new s(0, "malformed object: " + e, e);
            }
        }
    }

    @Override // defpackage.d, defpackage.t
    public final void q(r rVar) {
        int i;
        if (this.P) {
            i = 96;
        } else {
            i = 64;
        }
        rVar.h(i, this.Q);
        rVar.c(128);
        rVar.a.write(this.R);
        rVar.c(0);
        rVar.c(0);
    }
}