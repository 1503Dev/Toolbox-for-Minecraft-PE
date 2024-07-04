package defpackage;

import java.io.Serializable;
import java.util.Comparator;
import javax.annotation.CheckForNull;

/* renamed from: zu4  reason: default package */
public final class zu4 extends mw4 implements Serializable {
    public final Comparator P;

    public zu4(Comparator comparator) {
        this.P = comparator;
    }

    @Override // defpackage.mw4, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.P.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zu4) {
            return this.P.equals(((zu4) obj).P);
        }
        return false;
    }

    public final int hashCode() {
        return this.P.hashCode();
    }

    public final String toString() {
        return this.P.toString();
    }
}