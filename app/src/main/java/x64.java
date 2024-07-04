package defpackage;

import android.content.Context;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: x64  reason: default package */
public final class x64 {
    @GuardedBy("InternalMobileAds.class")
    public static x64 h;
    @GuardedBy("settingManagerLock")
    public q73 f;
    public final Object a = new Object();
    @GuardedBy("stateLock")
    public boolean c = false;
    @GuardedBy("stateLock")
    public boolean d = false;
    public final Object e = new Object();
    public xk0 g = new xk0(new ArrayList());
    @GuardedBy("stateLock")
    public final ArrayList b = new ArrayList();

    public static x64 b() {
        x64 x64Var;
        synchronized (x64.class) {
            if (h == null) {
                h = new x64();
            }
            x64Var = h;
        }
        return x64Var;
    }

    public static wk1 c(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vh2 vh2Var = (vh2) it.next();
            hashMap.put(vh2Var.P, new ya2(vh2Var.Q ? l3.READY : l3.NOT_READY, vh2Var.S, vh2Var.R));
        }
        return new wk1(hashMap);
    }

    @GuardedBy("settingManagerLock")
    public final void a(Context context) {
        if (this.f == null) {
            this.f = (q73) new iz1(n62.f.b, context).d(context, false);
        }
    }

    @GuardedBy("settingManagerLock")
    public final void d(Context context) {
        try {
            if (qk2.b == null) {
                qk2.b = new qk2();
            }
            if (qk2.b.a.compareAndSet(false, true)) {
                new Thread(new pk2(context, null)).start();
            }
            this.f.l();
            this.f.f2(new va0(null), null);
        } catch (RemoteException e) {
            sv2.h("MobileAdsSettingManager initialization failed", e);
        }
    }
}