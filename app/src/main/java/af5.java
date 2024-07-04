package defpackage;

import java.util.List;

/* renamed from: af5  reason: default package */
public final class af5 extends cf5 {
    @Override // defpackage.cf5
    public final List a(long j, Object obj) {
        qe5 qe5Var = (qe5) zg5.m(j, obj);
        if (qe5Var.d()) {
            return qe5Var;
        }
        int size = qe5Var.size();
        qe5 e = qe5Var.e(size == 0 ? 10 : size + size);
        zg5.v(j, obj, e);
        return e;
    }

    @Override // defpackage.cf5
    public final void b(long j, Object obj) {
        ((qe5) zg5.m(j, obj)).c();
    }

    @Override // defpackage.cf5
    public final void c(long j, Object obj, Object obj2) {
        qe5 qe5Var = (qe5) zg5.m(j, obj);
        qe5 qe5Var2 = (qe5) zg5.m(j, obj2);
        int size = qe5Var.size();
        int size2 = qe5Var2.size();
        if (size > 0 && size2 > 0) {
            if (!qe5Var.d()) {
                qe5Var = qe5Var.e(size2 + size);
            }
            qe5Var.addAll(qe5Var2);
        }
        if (size > 0) {
            qe5Var2 = qe5Var;
        }
        zg5.v(j, obj, qe5Var2);
    }
}