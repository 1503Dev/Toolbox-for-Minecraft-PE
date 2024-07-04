package defpackage;

import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: te3  reason: default package */
public final class te3 implements h23, v64 {
    public final /* synthetic */ int P;
    public Object Q;
    public Object R;

    public /* synthetic */ te3(int i, Object obj, Object obj2) {
        this.P = i;
        this.Q = obj;
        this.R = obj2;
    }

    @Override // defpackage.h23
    public final void d(boolean z) {
        xm3 xm3Var = (xm3) this.Q;
        xm3Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put("id", (String) ((Map) this.R).get("id"));
        xm3Var.b.b(hashMap);
    }

    @Override // defpackage.v64
    /* renamed from: e */
    public final void mo5e(Object obj) {
        jo5 jo5Var = (jo5) obj;
    }

    public final String toString() {
        switch (this.P) {
            case 0:
                return (String) this.Q;
            default:
                return super.toString();
        }
    }

    public te3(de3 de3Var) {
        String str;
        this.P = 0;
        this.R = de3Var;
        try {
            str = de3Var.b();
        } catch (RemoteException e) {
            sv2.e("", e);
            str = null;
        }
        this.Q = str;
    }
}