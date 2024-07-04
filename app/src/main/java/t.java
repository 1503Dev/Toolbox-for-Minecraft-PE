package defpackage;

import java.io.IOException;

/* renamed from: t  reason: default package */
public abstract class t extends n {
    public static t s(byte[] bArr) {
        k kVar = new k(bArr);
        try {
            t E = kVar.E();
            if (kVar.available() == 0) {
                return E;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    @Override // defpackage.n
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && p(((g) obj).h());
    }

    @Override // defpackage.n, defpackage.g
    public final t h() {
        return this;
    }

    @Override // defpackage.n
    public abstract int hashCode();

    public abstract boolean p(t tVar);

    public abstract void q(r rVar);

    public abstract int r();

    public abstract boolean t();

    public t u() {
        return this;
    }

    public t v() {
        return this;
    }
}