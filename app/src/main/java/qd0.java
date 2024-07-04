package defpackage;

import javax.annotation.Nullable;

/* renamed from: qd0  reason: default package */
public final class qd0 extends sd0<Iterable<Object>> {
    public final /* synthetic */ sd0 a;

    public qd0(sd0 sd0Var) {
        this.a = sd0Var;
    }

    @Override // defpackage.sd0
    public final void a(wk0 wk0Var, @Nullable Iterable<Object> iterable) {
        Iterable<Object> iterable2 = iterable;
        if (iterable2 == null) {
            return;
        }
        for (Object obj : iterable2) {
            this.a.a(wk0Var, obj);
        }
    }
}