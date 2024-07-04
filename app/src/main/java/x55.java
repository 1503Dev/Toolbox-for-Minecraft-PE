package defpackage;

import java.util.Arrays;

/* renamed from: x55  reason: default package */
public final class x55 extends o7 {
    public final q65 U;

    public x55(q65 q65Var) {
        this.U = q65Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x55)) {
            return false;
        }
        q65 q65Var = ((x55) obj).U;
        if (!cm0.a(((va5) this.U.b).z(), ((va5) q65Var.b).z()) || !((va5) this.U.b).B().equals(((va5) q65Var.b).B()) || !((va5) this.U.b).A().equals(((va5) q65Var.b).A())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        q65 q65Var = this.U;
        return Arrays.hashCode(new Object[]{(va5) q65Var.b, (sc5) q65Var.a});
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[2];
        objArr[0] = ((va5) this.U.b).B();
        int b = cm0.b(((va5) this.U.b).z());
        if (b != 1) {
            if (b != 2) {
                if (b != 3) {
                    if (b != 4) {
                        str = "UNKNOWN";
                    } else {
                        str = "CRUNCHY";
                    }
                } else {
                    str = "RAW";
                }
            } else {
                str = "LEGACY";
            }
        } else {
            str = "TINK";
        }
        objArr[1] = str;
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }
}