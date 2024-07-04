package defpackage;

import javax.annotation.CheckForNull;

/* renamed from: rs4  reason: default package */
public final class rs4 extends et4 {
    public static final rs4 P = new rs4();

    @Override // defpackage.et4
    public final et4 a(at4 at4Var) {
        return P;
    }

    @Override // defpackage.et4
    public final Object b() {
        return "";
    }

    public final boolean equals(@CheckForNull Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}