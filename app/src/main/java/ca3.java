package defpackage;

/* renamed from: ca3  reason: default package */
public final class ca3 extends wb3 {
    @Override // defpackage.wb3
    public final void a(long j, Object obj) {
        ((b13) hc4.j(j, obj)).c();
    }

    @Override // defpackage.wb3
    public final void b(long j, Object obj, Object obj2) {
        b13 b13Var = (b13) hc4.j(j, obj);
        b13 b13Var2 = (b13) hc4.j(j, obj2);
        int size = b13Var.size();
        int size2 = b13Var2.size();
        if (size > 0 && size2 > 0) {
            if (!b13Var.d()) {
                b13Var = b13Var.e(size2 + size);
            }
            b13Var.addAll(b13Var2);
        }
        if (size > 0) {
            b13Var2 = b13Var;
        }
        hc4.r(j, obj, b13Var2);
    }
}