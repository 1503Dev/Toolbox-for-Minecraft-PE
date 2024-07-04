package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: km3  reason: default package */
public final class km3 implements View.OnClickListener {
    public final kp3 P;
    public final kd Q;
    public re2 R;
    public jm3 S;
    public String T;
    public Long U;
    public WeakReference V;

    public km3(kp3 kp3Var, kd kdVar) {
        this.P = kp3Var;
        this.Q = kdVar;
    }

    public final void a() {
        View view;
        this.T = null;
        this.U = null;
        WeakReference weakReference = this.V;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.V = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference weakReference = this.V;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.T != null && this.U != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.T);
            hashMap.put("time_interval", String.valueOf(this.Q.a() - this.U.longValue()));
            hashMap.put("messageType", "onePointFiveClick");
            this.P.b(hashMap);
        }
        a();
    }
}