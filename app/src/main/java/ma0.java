package defpackage;

import java.lang.Comparable;
import java.lang.Number;

/* renamed from: ma0  reason: default package */
public abstract class ma0<T extends Number & Comparable<T>> extends tv0<T> {
    public ma0(T t) {
        super(t);
    }

    @Override // defpackage.tv0
    public final String u(int i) {
        return ((Number) this.P).toString();
    }
}