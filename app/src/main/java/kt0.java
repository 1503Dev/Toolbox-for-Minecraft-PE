package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: kt0  reason: default package */
public class kt0 extends LinearLayoutManager {
    public kt0(int i) {
        super(i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void G0(RecyclerView recyclerView, int i) {
        jt0 jt0Var = new jt0(recyclerView.getContext());
        jt0Var.a = i;
        H0(jt0Var);
    }
}