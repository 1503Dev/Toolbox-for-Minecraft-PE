package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: dp2  reason: default package */
public final class dp2 {
    @GuardedBy("InternalQueryInfoGenerator.class")
    public static gu2 d;
    public final Object a;
    public Object b;
    public Object c;

    public /* synthetic */ dp2(Context context, o2 o2Var, fx3 fx3Var) {
        this.a = context;
        this.b = o2Var;
        this.c = fx3Var;
    }

    public /* synthetic */ dp2(w33 w33Var) {
        this.a = w33Var;
    }

    public final void a(z61 z61Var) {
        gu2 gu2Var;
        pn5 a;
        String str;
        Context context = (Context) this.a;
        synchronized (dp2.class) {
            try {
                if (d == null) {
                    t42 t42Var = n62.f.b;
                    tk2 tk2Var = new tk2();
                    t42Var.getClass();
                    d = (gu2) new io1(context, tk2Var).d(context, false);
                }
                gu2Var = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (gu2Var == null) {
            str = "Internal Error, query info generator is null.";
        } else {
            va0 va0Var = new va0((Context) this.a);
            fx3 fx3Var = (fx3) this.c;
            if (fx3Var == null) {
                a = new pn5(8, -1L, new Bundle(), -1, new ArrayList(), false, -1, false, null, null, null, null, new Bundle(), new Bundle(), new ArrayList(), null, null, false, null, -1, null, new ArrayList(), 60000, null);
            } else {
                a = zq5.a((Context) this.a, fx3Var);
            }
            try {
                gu2Var.u3(va0Var, new ku2(null, ((o2) this.b).name(), null, a), new cp2(z61Var));
                return;
            } catch (RemoteException unused) {
                str = "Internal Error.";
            }
        }
        z61Var.R0(str);
    }

    public final y43 b() {
        tv2.E(yc3.class, (yc3) this.b);
        tv2.E(go1.class, (go1) this.c);
        return new y43((w33) this.a, (go1) this.c, (yc3) this.b);
    }
}