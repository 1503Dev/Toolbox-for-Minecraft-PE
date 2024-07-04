package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: fu4  reason: default package */
public class fu4 implements Iterator {
    public final Iterator P;
    public final Collection Q;
    public final /* synthetic */ gu4 R;

    public fu4(gu4 gu4Var) {
        this.R = gu4Var;
        Collection collection = gu4Var.Q;
        this.Q = collection;
        this.P = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public fu4(gu4 gu4Var, ListIterator listIterator) {
        this.R = gu4Var;
        this.Q = gu4Var.Q;
        this.P = listIterator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.R.c();
        if (this.R.Q != this.Q) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.P.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.P.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.P.remove();
        gu4 gu4Var = this.R;
        ku4 ku4Var = gu4Var.T;
        ku4Var.T--;
        gu4Var.h();
    }
}