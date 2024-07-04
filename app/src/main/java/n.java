package defpackage;

import java.io.ByteArrayOutputStream;

/* renamed from: n  reason: default package */
public abstract class n implements g {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return h().equals(((g) obj).h());
        }
        return false;
    }

    @Override // defpackage.g
    public abstract t h();

    public int hashCode() {
        return h().hashCode();
    }

    public final byte[] n() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new r(byteArrayOutputStream).g(this);
        return byteArrayOutputStream.toByteArray();
    }

    public final byte[] o(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        if (str.equals("DER")) {
            byteArrayOutputStream = new ByteArrayOutputStream();
            new ki(byteArrayOutputStream).g(this);
        } else if (!str.equals("DL")) {
            return n();
        } else {
            byteArrayOutputStream = new ByteArrayOutputStream();
            new xi(byteArrayOutputStream).g(this);
        }
        return byteArrayOutputStream.toByteArray();
    }
}