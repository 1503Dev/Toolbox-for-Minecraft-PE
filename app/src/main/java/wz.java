package defpackage;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: wz  reason: default package */
public abstract class wz {
    public boolean g() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public float h() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int m() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final qz n() {
        if (this instanceof qz) {
            return (qz) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public final zz o() {
        if (this instanceof zz) {
            return (zz) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public final b00 p() {
        if (this instanceof b00) {
            return (b00) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public String q() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            i00 i00Var = new i00(stringWriter);
            i00Var.U = true;
            o11.A.b(i00Var, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}