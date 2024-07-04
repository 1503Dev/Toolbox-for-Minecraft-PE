package defpackage;

import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: jp3  reason: default package */
public final class jp3 implements mg2 {
    public final WeakReference P;
    public final String Q;
    public final mg2 R;
    public final /* synthetic */ kp3 S;

    public /* synthetic */ jp3(kp3 kp3Var, WeakReference weakReference, String str, mg2 mg2Var) {
        this.S = kp3Var;
        this.P = weakReference;
        this.Q = str;
        this.R = mg2Var;
    }

    @Override // defpackage.mg2
    public final void b(Object obj, Map map) {
        Object obj2 = this.P.get();
        if (obj2 == null) {
            kp3 kp3Var = this.S;
            String str = this.Q;
            synchronized (kp3Var) {
                by4 by4Var = kp3Var.l;
                if (by4Var != null) {
                    zw4.J(by4Var, new mr1(str, this), kp3Var.f);
                }
            }
            return;
        }
        this.R.b(obj2, map);
    }
}