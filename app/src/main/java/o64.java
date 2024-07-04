package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: o64  reason: default package */
public final class o64 extends ci2 {
    public final /* synthetic */ x64 P;

    public /* synthetic */ o64(x64 x64Var) {
        this.P = x64Var;
    }

    @Override // defpackage.di2
    public final void l2(List list) {
        int i;
        ArrayList arrayList;
        synchronized (this.P.a) {
            x64 x64Var = this.P;
            x64Var.c = false;
            x64Var.d = true;
            arrayList = new ArrayList(this.P.b);
            this.P.b.clear();
        }
        x64.c(list);
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((dc0) arrayList.get(i)).a();
        }
    }
}