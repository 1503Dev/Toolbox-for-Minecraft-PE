package defpackage;

import java.io.Serializable;

/* renamed from: od0  reason: default package */
public final class od0<A, B> implements Serializable {
    public final A P;
    public final B Q;

    /* JADX WARN: Multi-variable type inference failed */
    public od0(String str, String str2) {
        this.P = str;
        this.Q = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof od0) {
                od0 od0Var = (od0) obj;
                return hy.a(this.P, od0Var.P) && hy.a(this.Q, od0Var.Q);
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        A a = this.P;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.Q;
        return hashCode + (b != null ? b.hashCode() : 0);
    }

    public final String toString() {
        return '(' + this.P + ", " + this.Q + ')';
    }
}