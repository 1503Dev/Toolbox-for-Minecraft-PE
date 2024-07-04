package defpackage;

import java.util.List;
import java.util.ListIterator;

/* renamed from: hu4  reason: default package */
public final class hu4 extends fu4 implements ListIterator {
    public final /* synthetic */ ju4 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu4(ju4 ju4Var) {
        super(ju4Var);
        this.S = ju4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu4(ju4 ju4Var, int i) {
        super(ju4Var, ((List) ju4Var.Q).listIterator(i));
        this.S = ju4Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean isEmpty = this.S.isEmpty();
        a();
        ((ListIterator) this.P).add(obj);
        ju4 ju4Var = this.S;
        ju4Var.U.T++;
        if (isEmpty) {
            ju4Var.g();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.P).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.P).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.P).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.P).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.P).set(obj);
    }
}