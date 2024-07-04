package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;

/* renamed from: of4  reason: default package */
public final class of4 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ of4(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        switch (this.P) {
            case 0:
                gf2 gf2Var = ((ig4) this.Q).P;
                if (gf2Var != null) {
                    try {
                        gf2Var.y(1);
                        return;
                    } catch (RemoteException e) {
                        sv2.h("Could not notify onAdFailedToLoad event.", e);
                        return;
                    }
                }
                return;
            default:
                y02 y02Var = (y02) this.Q;
                y02Var.getClass();
                r42 r42Var = jv5.A.m;
                Context context = y02Var.a;
                String str = y02Var.d;
                String str2 = y02Var.e;
                String str3 = y02Var.f;
                synchronized (r42Var.a) {
                    z = r42Var.d;
                }
                boolean f = r42Var.f(context, str, str2);
                synchronized (r42Var.a) {
                    r42Var.d = f;
                }
                synchronized (r42Var.a) {
                    z2 = r42Var.d;
                }
                if (z2) {
                    if (!z && !TextUtils.isEmpty(str3)) {
                        r42Var.c(context, str2, str3, str);
                    }
                    sv2.b("Device is linked for debug signals.");
                    r42.e(context, "The device is successfully linked for troubleshooting.", false, true);
                    return;
                }
                r42Var.b(context, str, str2);
                return;
        }
    }
}