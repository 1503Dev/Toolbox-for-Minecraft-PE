package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* renamed from: ju4  reason: default package */
public class ju4 extends gu4 implements List {
    public final /* synthetic */ ku4 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju4(ku4 ku4Var, Object obj, @CheckForNull List list, gu4 gu4Var) {
        super(ku4Var, obj, list, gu4Var);
        this.U = ku4Var;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        c();
        boolean isEmpty = this.Q.isEmpty();
        ((List) this.Q).add(i, obj);
        this.U.T++;
        if (isEmpty) {
            g();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.Q).addAll(i, collection);
        if (addAll) {
            int size2 = this.Q.size();
            ku4 ku4Var = this.U;
            ku4Var.T = (size2 - size) + ku4Var.T;
            if (size == 0) {
                g();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int i) {
        c();
        return ((List) this.Q).get(i);
    }

    @Override // java.util.List
    public final int indexOf(@CheckForNull Object obj) {
        c();
        return ((List) this.Q).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(@CheckForNull Object obj) {
        c();
        return ((List) this.Q).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        c();
        return new hu4(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        c();
        return new hu4(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        c();
        Object remove = ((List) this.Q).remove(i);
        ku4 ku4Var = this.U;
        ku4Var.T--;
        h();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        c();
        return ((List) this.Q).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        c();
        ku4 ku4Var = this.U;
        Object obj = this.P;
        List subList = ((List) this.Q).subList(i, i2);
        gu4 gu4Var = this.R;
        if (gu4Var == null) {
            gu4Var = this;
        }
        ku4Var.getClass();
        return subList instanceof RandomAccess ? new cu4(ku4Var, obj, subList, gu4Var) : new ju4(ku4Var, obj, subList, gu4Var);
    }
}