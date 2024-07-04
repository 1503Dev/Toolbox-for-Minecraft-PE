package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import defpackage.w30;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* renamed from: lt  reason: default package */
public final class lt implements Handler.Callback {
    public static final Status d0 = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status e0 = new Status(4, "The user must be signed in to make this API call.");
    public static final Object f0 = new Object();
    @GuardedBy("lock")
    public static lt g0;
    public long P;
    public boolean Q;
    public gw0 R;
    public wi1 S;
    public final Context T;
    public final ht U;
    public final oi1 V;
    public final AtomicInteger W;
    public final AtomicInteger X;
    public final ConcurrentHashMap Y;
    @GuardedBy("lock")
    public final g7 Z;
    public final g7 a0;
    @NotOnlyInitialized
    public final aj1 b0;
    public volatile boolean c0;

    public lt(Context context, Looper looper) {
        ht htVar = ht.d;
        this.P = 10000L;
        this.Q = false;
        boolean z = true;
        this.W = new AtomicInteger(1);
        this.X = new AtomicInteger(0);
        this.Y = new ConcurrentHashMap(5, 0.75f, 1);
        this.Z = new g7();
        this.a0 = new g7();
        this.c0 = true;
        this.T = context;
        aj1 aj1Var = new aj1(looper, this);
        this.b0 = aj1Var;
        this.U = htVar;
        this.V = new oi1();
        PackageManager packageManager = context.getPackageManager();
        if (sk.e == null) {
            sk.e = Boolean.valueOf((qe0.a() && packageManager.hasSystemFeature("android.hardware.type.automotive")) ? false : false);
        }
        if (sk.e.booleanValue()) {
            this.c0 = false;
        }
        aj1Var.sendMessage(aj1Var.obtainMessage(6));
    }

    public static Status c(n4<?> n4Var, gf gfVar) {
        String str = n4Var.b.b;
        String valueOf = String.valueOf(gfVar);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + valueOf.length());
        sb.append("API: ");
        sb.append(str);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(1, 17, sb.toString(), gfVar.R, gfVar);
    }

    public static lt e(Context context) {
        lt ltVar;
        HandlerThread handlerThread;
        synchronized (f0) {
            try {
                if (g0 == null) {
                    synchronized (ft.a) {
                        handlerThread = ft.c;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            ft.c = handlerThread2;
                            handlerThread2.start();
                            handlerThread = ft.c;
                        }
                    }
                    Looper looper = handlerThread.getLooper();
                    Context applicationContext = context.getApplicationContext();
                    Object obj = ht.c;
                    g0 = new lt(applicationContext, looper);
                }
                ltVar = g0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ltVar;
    }

    public final boolean a() {
        if (this.Q) {
            return false;
        }
        gm0 gm0Var = fm0.a().a;
        if (gm0Var != null && !gm0Var.Q) {
            return false;
        }
        int i = this.V.a.get(203400000, -1);
        if (i != -1 && i != 0) {
            return false;
        }
        return true;
    }

    public final boolean b(gf gfVar, int i) {
        boolean z;
        PendingIntent activity;
        ht htVar = this.U;
        Context context = this.T;
        htVar.getClass();
        if (!vx.j(context)) {
            int i2 = gfVar.Q;
            if (i2 != 0 && gfVar.R != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                activity = gfVar.R;
            } else {
                Intent b = htVar.b(i2, context, null);
                if (b == null) {
                    activity = null;
                } else {
                    activity = PendingIntent.getActivity(context, 0, b, zf3.a | 134217728);
                }
            }
            if (activity != null) {
                int i3 = gfVar.Q;
                int i4 = GoogleApiActivity.Q;
                Intent intent = new Intent(context, GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                htVar.h(context, i3, PendingIntent.getActivity(context, 0, intent, pi1.a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final zg1<?> d(gt<?> gtVar) {
        n4<?> n4Var = gtVar.e;
        zg1<?> zg1Var = (zg1) this.Y.get(n4Var);
        if (zg1Var == null) {
            zg1Var = new zg1<>(this, gtVar);
            this.Y.put(n4Var, zg1Var);
        }
        if (zg1Var.Q.l()) {
            this.a0.add(n4Var);
        }
        zg1Var.l();
        return zg1Var;
    }

    public final void f(gf gfVar, int i) {
        if (b(gfVar, i)) {
            return;
        }
        aj1 aj1Var = this.b0;
        aj1Var.sendMessage(aj1Var.obtainMessage(5, i, 0, gfVar));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Status status;
        wp[] g;
        boolean z;
        int i = message.what;
        zg1 zg1Var = null;
        long j = 300000;
        switch (i) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.P = j;
                this.b0.removeMessages(12);
                for (n4 n4Var : this.Y.keySet()) {
                    aj1 aj1Var = this.b0;
                    aj1Var.sendMessageDelayed(aj1Var.obtainMessage(12, n4Var), this.P);
                }
                break;
            case 2:
                ((ri1) message.obj).getClass();
                throw null;
            case 3:
                for (zg1 zg1Var2 : this.Y.values()) {
                    uf0.a(zg1Var2.b0.b0);
                    zg1Var2.Z = null;
                    zg1Var2.l();
                }
                break;
            case 4:
            case 8:
            case 13:
                oh1 oh1Var = (oh1) message.obj;
                zg1<?> zg1Var3 = (zg1) this.Y.get(oh1Var.c.e);
                if (zg1Var3 == null) {
                    zg1Var3 = d(oh1Var.c);
                }
                if (zg1Var3.Q.l() && this.X.get() != oh1Var.b) {
                    oh1Var.a.a(d0);
                    zg1Var3.o();
                    break;
                } else {
                    zg1Var3.m(oh1Var.a);
                    break;
                }
            case 5:
                int i2 = message.arg1;
                gf gfVar = (gf) message.obj;
                Iterator it = this.Y.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        zg1 zg1Var4 = (zg1) it.next();
                        if (zg1Var4.V == i2) {
                            zg1Var = zg1Var4;
                        }
                    }
                }
                if (zg1Var != null) {
                    if (gfVar.Q == 13) {
                        ht htVar = this.U;
                        int i3 = gfVar.Q;
                        htVar.getClass();
                        AtomicBoolean atomicBoolean = ot.a;
                        String c = gf.c(i3);
                        String str = gfVar.S;
                        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 69 + String.valueOf(str).length());
                        sb.append("Error resolution was canceled by the user, original error message: ");
                        sb.append(c);
                        sb.append(": ");
                        sb.append(str);
                        zg1Var.b(new Status(17, sb.toString()));
                        break;
                    } else {
                        zg1Var.b(c(zg1Var.R, gfVar));
                        break;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i2);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                    break;
                }
            case 6:
                if (this.T.getApplicationContext() instanceof Application) {
                    Application application = (Application) this.T.getApplicationContext();
                    e9 e9Var = e9.T;
                    synchronized (e9Var) {
                        if (!e9Var.S) {
                            application.registerActivityLifecycleCallbacks(e9Var);
                            application.registerComponentCallbacks(e9Var);
                            e9Var.S = true;
                        }
                    }
                    ug1 ug1Var = new ug1(this);
                    synchronized (e9Var) {
                        e9Var.R.add(ug1Var);
                    }
                    if (!e9Var.Q.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!e9Var.Q.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            e9Var.P.set(true);
                        }
                    }
                    if (!e9Var.P.get()) {
                        this.P = 300000L;
                        break;
                    }
                }
                break;
            case 7:
                d((gt) message.obj);
                break;
            case 9:
                if (this.Y.containsKey(message.obj)) {
                    zg1 zg1Var5 = (zg1) this.Y.get(message.obj);
                    uf0.a(zg1Var5.b0.b0);
                    if (zg1Var5.X) {
                        zg1Var5.l();
                        break;
                    }
                }
                break;
            case 10:
                Iterator it2 = this.a0.iterator();
                while (true) {
                    w30.a aVar = (w30.a) it2;
                    if (aVar.hasNext()) {
                        zg1 zg1Var6 = (zg1) this.Y.remove((n4) aVar.next());
                        if (zg1Var6 != null) {
                            zg1Var6.o();
                        }
                    } else {
                        this.a0.clear();
                        break;
                    }
                }
            case 11:
                if (this.Y.containsKey(message.obj)) {
                    zg1 zg1Var7 = (zg1) this.Y.get(message.obj);
                    uf0.a(zg1Var7.b0.b0);
                    if (zg1Var7.X) {
                        zg1Var7.h();
                        lt ltVar = zg1Var7.b0;
                        if (ltVar.U.d(ltVar.T) == 18) {
                            status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
                        } else {
                            status = new Status(22, "API failed to connect while resuming due to an unknown error.");
                        }
                        zg1Var7.b(status);
                        zg1Var7.Q.d("Timing out connection while resuming.");
                        break;
                    }
                }
                break;
            case 12:
                if (this.Y.containsKey(message.obj)) {
                    ((zg1) this.Y.get(message.obj)).k(true);
                    break;
                }
                break;
            case 14:
                ((mg1) message.obj).getClass();
                if (!this.Y.containsKey(null)) {
                    throw null;
                }
                ((zg1) this.Y.get(null)).k(false);
                throw null;
            case 15:
                ah1 ah1Var = (ah1) message.obj;
                if (this.Y.containsKey(ah1Var.a)) {
                    zg1 zg1Var8 = (zg1) this.Y.get(ah1Var.a);
                    if (zg1Var8.Y.contains(ah1Var) && !zg1Var8.X) {
                        if (!zg1Var8.Q.a()) {
                            zg1Var8.l();
                            break;
                        } else {
                            zg1Var8.d();
                            break;
                        }
                    }
                }
                break;
            case 16:
                ah1 ah1Var2 = (ah1) message.obj;
                if (this.Y.containsKey(ah1Var2.a)) {
                    zg1<?> zg1Var9 = (zg1) this.Y.get(ah1Var2.a);
                    if (zg1Var9.Y.remove(ah1Var2)) {
                        zg1Var9.b0.b0.removeMessages(15, ah1Var2);
                        zg1Var9.b0.b0.removeMessages(16, ah1Var2);
                        wp wpVar = ah1Var2.b;
                        ArrayList arrayList = new ArrayList(zg1Var9.P.size());
                        for (li1 li1Var : zg1Var9.P) {
                            if ((li1Var instanceof fh1) && (g = ((fh1) li1Var).g(zg1Var9)) != null) {
                                int length = g.length;
                                int i4 = 0;
                                while (true) {
                                    if (i4 < length) {
                                        if (wa0.a(g[i4], wpVar)) {
                                            if (i4 >= 0) {
                                                z = true;
                                            }
                                        } else {
                                            i4++;
                                        }
                                    }
                                }
                                z = false;
                                if (z) {
                                    arrayList.add(li1Var);
                                }
                            }
                        }
                        int size = arrayList.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            li1 li1Var2 = (li1) arrayList.get(i5);
                            zg1Var9.P.remove(li1Var2);
                            li1Var2.b(new t21(wpVar));
                        }
                        break;
                    }
                }
                break;
            case 17:
                gw0 gw0Var = this.R;
                if (gw0Var != null) {
                    if (gw0Var.P > 0 || a()) {
                        if (this.S == null) {
                            this.S = new wi1(this.T);
                        }
                        this.S.d(gw0Var);
                    }
                    this.R = null;
                    break;
                }
                break;
            case 18:
                mh1 mh1Var = (mh1) message.obj;
                if (mh1Var.c == 0) {
                    gw0 gw0Var2 = new gw0(mh1Var.b, Arrays.asList(mh1Var.a));
                    if (this.S == null) {
                        this.S = new wi1(this.T);
                    }
                    this.S.d(gw0Var2);
                    break;
                } else {
                    gw0 gw0Var3 = this.R;
                    if (gw0Var3 != null) {
                        List<e60> list = gw0Var3.Q;
                        if (gw0Var3.P == mh1Var.b && (list == null || list.size() < mh1Var.d)) {
                            gw0 gw0Var4 = this.R;
                            e60 e60Var = mh1Var.a;
                            if (gw0Var4.Q == null) {
                                gw0Var4.Q = new ArrayList();
                            }
                            gw0Var4.Q.add(e60Var);
                        } else {
                            this.b0.removeMessages(17);
                            gw0 gw0Var5 = this.R;
                            if (gw0Var5 != null) {
                                if (gw0Var5.P > 0 || a()) {
                                    if (this.S == null) {
                                        this.S = new wi1(this.T);
                                    }
                                    this.S.d(gw0Var5);
                                }
                                this.R = null;
                            }
                        }
                    }
                    if (this.R == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(mh1Var.a);
                        this.R = new gw0(mh1Var.b, arrayList2);
                        aj1 aj1Var2 = this.b0;
                        aj1Var2.sendMessageDelayed(aj1Var2.obtainMessage(17), mh1Var.c);
                        break;
                    }
                }
                break;
            case 19:
                this.Q = false;
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }
}