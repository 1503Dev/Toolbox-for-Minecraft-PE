package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: k9  reason: default package */
public abstract class k9<T extends IInterface> {
    public static final wp[] x = new wp[0];
    public volatile String a;
    public dw5 b;
    public final Context c;
    public final ft d;
    public final jt e;
    public final h82 f;
    public final Object g;
    public final Object h;
    @GuardedBy("mServiceBrokerLock")
    public aw i;
    public c j;
    @GuardedBy("mLock")
    public T k;
    public final ArrayList<gw2<?>> l;
    @GuardedBy("mLock")
    public mz3 m;
    @GuardedBy("mLock")
    public int n;
    public final a o;
    public final b p;
    public final int q;
    public final String r;
    public volatile String s;
    public gf t;
    public boolean u;
    public volatile ql5 v;
    public AtomicInteger w;

    /* renamed from: k9$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a {
        void A(int i);

        void c0();
    }

    /* renamed from: k9$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface b {
        void Z(gf gfVar);
    }

    /* renamed from: k9$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface c {
        void a(gf gfVar);
    }

    /* renamed from: k9$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class d implements c {
        public d() {
        }

        @Override // defpackage.k9.c
        public final void a(gf gfVar) {
            boolean z;
            if (gfVar.Q == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                k9 k9Var = k9.this;
                k9Var.m(null, k9Var.u());
                return;
            }
            b bVar = k9.this.p;
            if (bVar != null) {
                bVar.Z(gfVar);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k9(Context context, Looper looper, int i, a aVar, b bVar) {
        this(context, looper, r3, r4, i, aVar, bVar, null);
        ct5 a2 = ft.a(context);
        jt jtVar = jt.b;
        uf0.f(aVar);
        uf0.f(bVar);
    }

    public static /* bridge */ /* synthetic */ boolean z(k9 k9Var, int i, int i2, IInterface iInterface) {
        synchronized (k9Var.g) {
            if (k9Var.n != i) {
                return false;
            }
            k9Var.A(i2, iInterface);
            return true;
        }
    }

    public final void A(int i, T t) {
        boolean z;
        boolean z2;
        String str;
        dw5 dw5Var;
        boolean z3 = false;
        if (i != 4) {
            z = false;
        } else {
            z = true;
        }
        if (t == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z == z2) {
            z3 = true;
        }
        if (z3) {
            synchronized (this.g) {
                try {
                    this.n = i;
                    this.k = t;
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            if (i == 4) {
                                uf0.f(t);
                                System.currentTimeMillis();
                            }
                        } else {
                            mz3 mz3Var = this.m;
                            if (mz3Var != null && (dw5Var = this.b) != null) {
                                String str2 = dw5Var.a;
                                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                                sb.append("Calling connect() while still connected, missing disconnect() for ");
                                sb.append(str2);
                                sb.append(" on ");
                                sb.append("com.google.android.gms");
                                Log.e("GmsClient", sb.toString());
                                ft ftVar = this.d;
                                String str3 = this.b.a;
                                uf0.f(str3);
                                this.b.getClass();
                                if (this.r == null) {
                                    this.c.getClass();
                                }
                                ftVar.b(str3, "com.google.android.gms", 4225, mz3Var, this.b.b);
                                this.w.incrementAndGet();
                            }
                            mz3 mz3Var2 = new mz3(this, this.w.get());
                            this.m = mz3Var2;
                            String x2 = x();
                            Object obj = ft.a;
                            boolean y = y();
                            this.b = new dw5(x2, y);
                            if (y && f() < 17895000) {
                                String valueOf = String.valueOf(this.b.a);
                                if (valueOf.length() != 0) {
                                    str = "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(valueOf);
                                } else {
                                    str = new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ");
                                }
                                throw new IllegalStateException(str);
                            }
                            ft ftVar2 = this.d;
                            String str4 = this.b.a;
                            uf0.f(str4);
                            this.b.getClass();
                            String str5 = this.r;
                            if (str5 == null) {
                                str5 = this.c.getClass().getName();
                            }
                            boolean z4 = this.b.b;
                            s();
                            if (!ftVar2.c(new ip5(str4, 4225, "com.google.android.gms", z4), mz3Var2, str5, null)) {
                                String str6 = this.b.a;
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str6).length() + 34 + "com.google.android.gms".length());
                                sb2.append("unable to connect to service: ");
                                sb2.append(str6);
                                sb2.append(" on ");
                                sb2.append("com.google.android.gms");
                                Log.w("GmsClient", sb2.toString());
                                int i2 = this.w.get();
                                h82 h82Var = this.f;
                                h82Var.sendMessage(h82Var.obtainMessage(7, i2, -1, new h25(this, 16)));
                            }
                        }
                    } else {
                        mz3 mz3Var3 = this.m;
                        if (mz3Var3 != null) {
                            ft ftVar3 = this.d;
                            String str7 = this.b.a;
                            uf0.f(str7);
                            this.b.getClass();
                            if (this.r == null) {
                                this.c.getClass();
                            }
                            ftVar3.b(str7, "com.google.android.gms", 4225, mz3Var3, this.b.b);
                            this.m = null;
                        }
                    }
                } finally {
                }
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public final boolean a() {
        boolean z;
        synchronized (this.g) {
            z = this.n == 4;
        }
        return z;
    }

    public final void c(yg1 yg1Var) {
        yg1Var.a.b0.b0.post(new xg1(yg1Var));
    }

    public final void d(String str) {
        this.a = str;
        p();
    }

    public final boolean e() {
        return true;
    }

    public int f() {
        return jt.a;
    }

    public final boolean g() {
        boolean z;
        synchronized (this.g) {
            int i = this.n;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public final wp[] h() {
        ql5 ql5Var = this.v;
        if (ql5Var == null) {
            return null;
        }
        return ql5Var.Q;
    }

    public final String i() {
        if (!a() || this.b == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return "com.google.android.gms";
    }

    public final void j(c cVar) {
        this.j = cVar;
        A(2, null);
    }

    public final String k() {
        return this.a;
    }

    public boolean l() {
        return false;
    }

    public final void m(rv rvVar, Set<Scope> set) {
        Bundle t = t();
        dt dtVar = new dt(this.q, this.s);
        dtVar.S = this.c.getPackageName();
        dtVar.V = t;
        if (set != null) {
            dtVar.U = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (l()) {
            Account q = q();
            if (q == null) {
                q = new Account("<<default account>>", "com.google");
            }
            dtVar.W = q;
            if (rvVar != null) {
                dtVar.T = rvVar.asBinder();
            }
        }
        dtVar.X = x;
        dtVar.Y = r();
        if (this instanceof yf3) {
            dtVar.b0 = true;
        }
        try {
            synchronized (this.h) {
                aw awVar = this.i;
                if (awVar != null) {
                    awVar.k4(new hg3(this, this.w.get()), dtVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            h82 h82Var = this.f;
            h82Var.sendMessage(h82Var.obtainMessage(6, this.w.get(), 3));
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i = this.w.get();
            h82 h82Var2 = this.f;
            h82Var2.sendMessage(h82Var2.obtainMessage(1, i, -1, new zi4(this, 8, null, null)));
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i2 = this.w.get();
            h82 h82Var22 = this.f;
            h82Var22.sendMessage(h82Var22.obtainMessage(1, i2, -1, new zi4(this, 8, null, null)));
        }
    }

    public final void n() {
        int c2 = this.e.c(this.c, f());
        if (c2 != 0) {
            A(1, null);
            this.j = new d();
            h82 h82Var = this.f;
            h82Var.sendMessage(h82Var.obtainMessage(3, this.w.get(), c2, null));
            return;
        }
        j(new d());
    }

    public abstract T o(IBinder iBinder);

    public final void p() {
        this.w.incrementAndGet();
        synchronized (this.l) {
            try {
                int size = this.l.size();
                for (int i = 0; i < size; i++) {
                    gw2<?> gw2Var = this.l.get(i);
                    synchronized (gw2Var) {
                        gw2Var.a = null;
                    }
                }
                this.l.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.h) {
            this.i = null;
        }
        A(1, null);
    }

    public Account q() {
        return null;
    }

    public wp[] r() {
        return x;
    }

    public void s() {
    }

    public Bundle t() {
        return new Bundle();
    }

    public Set<Scope> u() {
        return Collections.emptySet();
    }

    public final T v() {
        T t;
        synchronized (this.g) {
            try {
                if (this.n != 5) {
                    if (a()) {
                        t = this.k;
                        uf0.g(t, "Client is connected but service is null");
                    } else {
                        throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                    }
                } else {
                    throw new DeadObjectException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }

    public abstract String w();

    public abstract String x();

    public boolean y() {
        return f() >= 211700000;
    }

    public k9(Context context, Looper looper, ct5 ct5Var, jt jtVar, int i, a aVar, b bVar, String str) {
        this.a = null;
        this.g = new Object();
        this.h = new Object();
        this.l = new ArrayList<>();
        this.n = 1;
        this.t = null;
        this.u = false;
        this.v = null;
        this.w = new AtomicInteger(0);
        if (context == null) {
            throw new NullPointerException("Context must not be null");
        }
        this.c = context;
        if (looper == null) {
            throw new NullPointerException("Looper must not be null");
        }
        if (ct5Var == null) {
            throw new NullPointerException("Supervisor must not be null");
        }
        this.d = ct5Var;
        uf0.g(jtVar, "API availability must not be null");
        this.e = jtVar;
        this.f = new h82(this, looper);
        this.q = i;
        this.o = aVar;
        this.p = bVar;
        this.r = str;
    }
}