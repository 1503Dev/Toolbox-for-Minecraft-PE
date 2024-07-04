package defpackage;

import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: en2  reason: default package */
public final class en2 implements i50, h23, v64 {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;

    public /* synthetic */ en2(int i, Object obj, Object obj2) {
        this.P = i;
        this.Q = obj;
        this.R = obj2;
    }

    @Override // defpackage.i50
    public final void c(n2 n2Var) {
        try {
            ((nm2) this.Q).p(n2Var.a());
        } catch (RemoteException e) {
            sv2.e("", e);
        }
    }

    @Override // defpackage.h23
    public final void d(boolean z) {
        qm3 qm3Var = (qm3) this.Q;
        qm3Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) ((Map) this.R).get("id"));
        qm3Var.b.b(hashMap);
    }

    @Override // defpackage.v64
    /* renamed from: e */
    public final void mo5e(Object obj) {
        switch (this.P) {
            case 2:
                jo5 jo5Var = (jo5) obj;
                return;
            default:
                jo5 jo5Var2 = (jo5) obj;
                return;
        }
    }

    public en2(nm2 nm2Var, cl2 cl2Var) {
        this.P = 0;
        this.Q = nm2Var;
        this.R = cl2Var;
    }
}