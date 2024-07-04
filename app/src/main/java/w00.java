package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Enumeration;

/* renamed from: w00  reason: default package */
public final class w00 implements Enumeration {
    public k a;
    public t b = a();

    public w00(byte[] bArr) {
        this.a = new k(new ByteArrayInputStream(bArr), bArr.length, true);
    }

    public final t a() {
        try {
            return this.a.E();
        } catch (IOException e) {
            throw new s(0, "malformed DER construction: " + e, e);
        }
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.b != null;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        t tVar = this.b;
        this.b = a();
        return tVar;
    }
}