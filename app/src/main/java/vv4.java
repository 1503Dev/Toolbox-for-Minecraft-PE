package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: vv4  reason: default package */
public final class vv4 implements Iterator {
    public static final vv4 P;
    public static final /* synthetic */ vv4[] Q;

    static {
        vv4 vv4Var = new vv4();
        P = vv4Var;
        Q = new vv4[]{vv4Var};
    }

    public static vv4[] values() {
        return (vv4[]) Q.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        gt4.g("no calls to next() since the last call to remove()", false);
    }
}