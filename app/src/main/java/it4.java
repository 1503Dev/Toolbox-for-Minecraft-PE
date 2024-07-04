package defpackage;

import java.io.Serializable;
import java.util.List;
import javax.annotation.CheckForNull;

/* renamed from: it4  reason: default package */
public final class it4 implements Serializable, ht4 {
    public final List P;

    public /* synthetic */ it4(List list) {
        this.P = list;
    }

    @Override // defpackage.ht4
    public final boolean e(Object obj) {
        for (int i = 0; i < this.P.size(); i++) {
            if (!((ht4) this.P.get(i)).e(obj)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof it4) {
            return this.P.equals(((it4) obj).P);
        }
        return false;
    }

    public final int hashCode() {
        return this.P.hashCode() + 306654252;
    }

    public final String toString() {
        List list = this.P;
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append("and(");
        boolean z = true;
        for (Object obj : list) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}