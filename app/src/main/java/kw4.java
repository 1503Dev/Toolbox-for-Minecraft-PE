package defpackage;

import java.io.Serializable;

/* renamed from: kw4  reason: default package */
public final class kw4 extends mw4 implements Serializable {
    public static final kw4 P = new kw4();

    @Override // defpackage.mw4
    public final mw4 a() {
        return uw4.P;
    }

    @Override // defpackage.mw4, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}