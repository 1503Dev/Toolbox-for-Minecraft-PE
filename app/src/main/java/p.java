package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: p  reason: default package */
public abstract class p extends t implements q {
    public byte[] P;

    public p(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("string cannot be null");
        }
        this.P = bArr;
    }

    public static p w(Object obj) {
        if (obj != null && !(obj instanceof p)) {
            if (obj instanceof byte[]) {
                try {
                    return w(t.s((byte[]) obj));
                } catch (IOException e) {
                    StringBuilder b = e5.b("failed to construct OCTET STRING from byte[]: ");
                    b.append(e.getMessage());
                    throw new IllegalArgumentException(b.toString());
                }
            }
            if (obj instanceof g) {
                t h = ((g) obj).h();
                if (h instanceof p) {
                    return (p) h;
                }
            }
            StringBuilder b2 = e5.b("illegal object in getInstance: ");
            b2.append(obj.getClass().getName());
            throw new IllegalArgumentException(b2.toString());
        }
        return (p) obj;
    }

    @Override // defpackage.q
    public final InputStream g() {
        return new ByteArrayInputStream(this.P);
    }

    @Override // defpackage.t, defpackage.n
    public final int hashCode() {
        return j7.h(x());
    }

    @Override // defpackage.ex
    public final t m() {
        return this;
    }

    @Override // defpackage.t
    public final boolean p(t tVar) {
        if (tVar instanceof p) {
            return j7.a(this.P, ((p) tVar).P);
        }
        return false;
    }

    public final String toString() {
        StringBuilder b = e5.b("#");
        byte[] bArr = this.P;
        jk3 jk3Var = qu.a;
        b.append(hu0.a(qu.b(bArr, bArr.length)));
        return b.toString();
    }

    @Override // defpackage.t
    public final t u() {
        return new ii(this.P);
    }

    @Override // defpackage.t
    public final t v() {
        return new ii(this.P);
    }

    public byte[] x() {
        return this.P;
    }
}