package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* renamed from: nt2  reason: default package */
public /* synthetic */ class nt2 implements pt2, wg3, v64 {
    public final /* synthetic */ int P;
    public final Object Q;

    public nt2(int i) {
        this.P = 3;
        this.Q = new LinkedHashMap(i < 3 ? i + 1 : i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Integer.MAX_VALUE);
    }

    public final void a(Object obj, uj5 uj5Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.Q;
        if (uj5Var == null) {
            throw new NullPointerException("provider");
        }
        linkedHashMap.put(obj, uj5Var);
    }

    @Override // defpackage.pt2
    public final void c(m23 m23Var) {
        m23Var.i0((Bundle) this.Q);
    }

    @Override // defpackage.wg3
    /* renamed from: e */
    public final void mo0e(Object obj) {
        switch (this.P) {
            case 1:
                ((ff3) obj).q0((rq2) this.Q);
                return;
            case 4:
                int i = bm5.X;
                ((b53) obj).x(((jn5) this.Q).f);
                return;
            default:
                jo5 jo5Var = (jo5) obj;
                return;
        }
    }

    public /* synthetic */ nt2(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }
}