package defpackage;

import java.io.Serializable;

/* renamed from: uw4  reason: default package */
public final class uw4 extends mw4 implements Serializable {
    public static final uw4 P = new uw4();

    @Override // defpackage.mw4
    public final mw4 a() {
        return kw4.P;
    }

    @Override // defpackage.mw4, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}