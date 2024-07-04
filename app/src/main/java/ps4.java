package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ps4  reason: default package */
public final class ps4 {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final gs4 b;
    public boolean g;
    public final Intent h;
    public os4 l;
    public IInterface m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final is4 j = new IBinder.DeathRecipient() { // from class: is4
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            ps4 ps4Var = ps4.this;
            ps4Var.b.c("reportBinderDeath", new Object[0]);
            ls4 ls4Var = (ls4) ps4Var.i.get();
            if (ls4Var != null) {
                ps4Var.b.c("calling onBinderDied", new Object[0]);
                ls4Var.a();
            } else {
                ps4Var.b.c("%s : Binder has died.", ps4Var.c);
                Iterator it = ps4Var.d.iterator();
                while (it.hasNext()) {
                    RemoteException remoteException = new RemoteException(String.valueOf(ps4Var.c).concat(" : Binder has died."));
                    aw0 aw0Var = ((hs4) it.next()).P;
                    if (aw0Var != null) {
                        aw0Var.a(remoteException);
                    }
                }
                ps4Var.d.clear();
            }
            synchronized (ps4Var.f) {
                ps4Var.c();
            }
        }
    };
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "OverlayDisplayService";
    public final WeakReference i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [is4] */
    public ps4(Context context, gs4 gs4Var, Intent intent) {
        this.a = context;
        this.b = gs4Var;
        this.h = intent;
    }

    public static void b(ps4 ps4Var, hs4 hs4Var) {
        if (ps4Var.m == null && !ps4Var.g) {
            ps4Var.b.c("Initiate binding to the service.", new Object[0]);
            ps4Var.d.add(hs4Var);
            os4 os4Var = new os4(ps4Var);
            ps4Var.l = os4Var;
            ps4Var.g = true;
            if (!ps4Var.a.bindService(ps4Var.h, os4Var, 1)) {
                ps4Var.b.c("Failed to bind to the service.", new Object[0]);
                ps4Var.g = false;
                Iterator it = ps4Var.d.iterator();
                while (it.hasNext()) {
                    st0 st0Var = new st0();
                    aw0 aw0Var = ((hs4) it.next()).P;
                    if (aw0Var != null) {
                        aw0Var.a(st0Var);
                    }
                }
                ps4Var.d.clear();
            }
        } else if (ps4Var.g) {
            ps4Var.b.c("Waiting to bind to the service.", new Object[0]);
            ps4Var.d.add(hs4Var);
        } else {
            hs4Var.run();
        }
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = n;
        synchronized (hashMap) {
            if (!hashMap.containsKey(this.c)) {
                HandlerThread handlerThread = new HandlerThread(this.c, 10);
                handlerThread.start();
                hashMap.put(this.c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) hashMap.get(this.c);
        }
        return handler;
    }

    public final void c() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((aw0) it.next()).a(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        this.e.clear();
    }
}