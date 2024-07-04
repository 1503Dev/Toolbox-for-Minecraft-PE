package defpackage;

import java.util.Comparator;

/* renamed from: ly5  reason: default package */
public final /* synthetic */ class ly5 implements Comparator {
    public static final /* synthetic */ ly5 P = new ly5();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ny5 ny5Var = (ny5) obj;
        ny5 ny5Var2 = (ny5) obj2;
        cv4 d = cv4.a.d(ny5Var.W, ny5Var2.W).b(ny5Var.a0, ny5Var2.a0).d(true, true).d(ny5Var.T, ny5Var2.T).d(ny5Var.V, ny5Var2.V);
        Integer valueOf = Integer.valueOf(ny5Var.Z);
        Integer valueOf2 = Integer.valueOf(ny5Var2.Z);
        kw4.P.getClass();
        cv4 c = d.c(valueOf, valueOf2, uw4.P);
        boolean z = ny5Var.c0;
        cv4 d2 = c.d(z, ny5Var2.c0);
        boolean z2 = ny5Var.d0;
        cv4 d3 = d2.d(z2, ny5Var2.d0);
        if (z && z2) {
            d3 = d3.b(ny5Var.e0, ny5Var2.e0);
        }
        return d3.a();
    }
}