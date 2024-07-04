package defpackage;

import defpackage.hs0;
import defpackage.ns0;
import defpackage.qs0;
import defpackage.tc0;
import defpackage.uo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Pattern;

/* renamed from: re0  reason: default package */
public final /* synthetic */ class re0 implements tc0.a, uo.b, qs0.b {
    public final /* synthetic */ Object a;

    public /* synthetic */ re0(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.uo.b
    public final void a(String str, int[] iArr) {
        jl jlVar = (jl) this.a;
        Pattern pattern = dz.f;
        jlVar.t0.d(str);
        jlVar.t0.b(iArr);
    }

    @Override // defpackage.qs0.b
    public final void b(ol0 ol0Var) {
        ns0 ns0Var = (ns0) this.a;
        ns0Var.h = false;
        ns0Var.d = (hs0) ol0Var.b;
        long currentTimeMillis = System.currentTimeMillis();
        hs0 hs0Var = ns0Var.d;
        ns0Var.e = currentTimeMillis + (hs0Var.a * 1000.0f);
        ns0Var.c.getClass();
        ArrayList arrayList = new ArrayList();
        hs0.a[] aVarArr = hs0Var.d;
        int length = aVarArr.length;
        for (int i = 0; i < length; i++) {
            arrayList.addAll(Arrays.asList(aVarArr[i].c));
        }
        Iterator it = ns0Var.f.iterator();
        while (it.hasNext()) {
            ((ns0.a) it.next()).c();
        }
        ns0Var.f.clear();
    }
}