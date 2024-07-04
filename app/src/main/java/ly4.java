package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.CheckForNull;

/* renamed from: ly4  reason: default package */
public final class ly4 extends ey4 {
    @CheckForNull
    public List e0;

    public ly4(nv4 nv4Var) {
        super(nv4Var, true, true);
        List arrayList;
        if (nv4Var.isEmpty()) {
            arrayList = Collections.emptyList();
        } else {
            int size = nv4Var.size();
            ou4.a(size, "initialArraySize");
            arrayList = new ArrayList(size);
        }
        for (int i = 0; i < nv4Var.size(); i++) {
            arrayList.add(null);
        }
        this.e0 = arrayList;
        w();
    }

    @Override // defpackage.ey4
    public final void u(int i, Object obj) {
        List list = this.e0;
        if (list != null) {
            list.set(i, new my4(obj));
        }
    }

    @Override // defpackage.ey4
    public final void v() {
        Object obj;
        List<my4> list = this.e0;
        if (list != null) {
            int size = list.size();
            ou4.a(size, "initialArraySize");
            ArrayList arrayList = new ArrayList(size);
            for (my4 my4Var : list) {
                if (my4Var != null) {
                    obj = my4Var.a;
                } else {
                    obj = null;
                }
                arrayList.add(obj);
            }
            h(Collections.unmodifiableList(arrayList));
        }
    }

    @Override // defpackage.ey4
    public final void x(int i) {
        this.a0 = null;
        this.e0 = null;
    }
}