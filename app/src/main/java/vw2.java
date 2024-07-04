package defpackage;

import java.util.Iterator;

/* renamed from: vw2  reason: default package */
public final class vw2 implements jh, v64 {
    public Object P;
    public Object Q;

    public /* synthetic */ vw2(Object obj, Object obj2) {
        this.P = obj;
        this.Q = obj2;
    }

    public /* synthetic */ vw2(ot4 ot4Var) {
        xs4 xs4Var = xs4.P;
        this.Q = ot4Var;
        this.P = xs4Var;
    }

    public static vw2 a(ts4 ts4Var) {
        return new vw2(new wr1(6, ts4Var));
    }

    public final Iterator b(CharSequence charSequence) {
        return ((ot4) this.Q).f(this, charSequence);
    }

    @Override // defpackage.v64
    /* renamed from: e */
    public final void mo5e(Object obj) {
        jo5 jo5Var = (jo5) obj;
    }
}