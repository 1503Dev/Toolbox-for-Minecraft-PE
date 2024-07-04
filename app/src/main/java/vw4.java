package defpackage;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* renamed from: vw4  reason: default package */
public final class vw4 extends mw4 implements Serializable {
    public final mw4 P;

    public vw4(mw4 mw4Var) {
        this.P = mw4Var;
    }

    @Override // defpackage.mw4
    public final mw4 a() {
        return this.P;
    }

    @Override // defpackage.mw4, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.P.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vw4) {
            return this.P.equals(((vw4) obj).P);
        }
        return false;
    }

    public final int hashCode() {
        return -this.P.hashCode();
    }

    public final String toString() {
        return this.P.toString().concat(".reverse()");
    }
}