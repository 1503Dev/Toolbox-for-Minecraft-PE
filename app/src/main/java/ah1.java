package defpackage;

import defpackage.wa0;
import java.util.Arrays;

/* renamed from: ah1  reason: default package */
public final class ah1 {
    public final n4<?> a;
    public final wp b;

    public /* synthetic */ ah1(n4 n4Var, wp wpVar) {
        this.a = n4Var;
        this.b = wpVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof ah1)) {
            ah1 ah1Var = (ah1) obj;
            if (wa0.a(this.a, ah1Var.a) && wa0.a(this.b, ah1Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        wa0.a aVar = new wa0.a(this);
        aVar.a("key", this.a);
        aVar.a("feature", this.b);
        return aVar.toString();
    }
}