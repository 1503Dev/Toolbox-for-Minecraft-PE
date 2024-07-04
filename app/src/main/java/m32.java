package defpackage;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

/* renamed from: m32  reason: default package */
public final class m32 implements cl4 {
    public final /* synthetic */ int P;
    public Object Q;
    public Object R;

    public m32() {
        this.P = 0;
        this.Q = new ByteArrayOutputStream(4096);
        this.R = new Base64OutputStream((ByteArrayOutputStream) this.Q, 10);
    }

    @Override // defpackage.cl4
    public final void a() {
        ((t54) this.Q).c.M3((ma2) this.R);
    }

    public final void b(uj5 uj5Var) {
        ((List) this.R).add(uj5Var);
    }

    public final void c(uj5 uj5Var) {
        ((List) this.Q).add(uj5Var);
    }

    public final sj5 d() {
        return new sj5((List) this.Q, (List) this.R);
    }

    public final String toString() {
        String str;
        switch (this.P) {
            case 0:
                try {
                    ((Base64OutputStream) this.R).close();
                } catch (IOException e) {
                    sv2.e("HashManager: Unable to convert to Base64.", e);
                }
                try {
                    try {
                        ((ByteArrayOutputStream) this.Q).close();
                        str = ((ByteArrayOutputStream) this.Q).toString();
                    } catch (IOException e2) {
                        sv2.e("HashManager: Unable to convert to Base64.", e2);
                        str = "";
                    }
                    return str;
                } finally {
                    this.Q = null;
                    this.R = null;
                }
            default:
                return super.toString();
        }
    }

    public /* synthetic */ m32(int i, int i2) {
        this.P = 3;
        this.Q = ea2.G(i);
        this.R = ea2.G(i2);
    }

    public /* synthetic */ m32(t54 t54Var, ma2 ma2Var) {
        this.P = 1;
        this.Q = t54Var;
        this.R = ma2Var;
    }
}