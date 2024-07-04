package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
/* renamed from: o3  reason: default package */
public final class o3 {
    @GuardedBy("this")
    public la a;
    @GuardedBy("this")
    public qi4 b;
    @GuardedBy("this")
    public boolean c;
    public final Object d = new Object();
    @GuardedBy("mAutoDisconnectTaskLock")
    public n82 e;
    @GuardedBy("this")
    public final Context f;
    public final long g;

    /* renamed from: o3$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a {
        public final String a;
        public final boolean b;

        @Deprecated
        public a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final String toString() {
            String str = this.a;
            boolean z = this.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    public o3(Context context, long j, boolean z) {
        Context applicationContext;
        uf0.f(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f = context;
        this.c = false;
        this.g = j;
    }

    public static a a(Context context) {
        o3 o3Var = new o3(context, -1L, true);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            o3Var.d(false);
            a f = o3Var.f();
            e(f, SystemClock.elapsedRealtime() - elapsedRealtime, null);
            return f;
        } finally {
        }
    }

    public static boolean b(Context context) {
        boolean i;
        o3 o3Var = new o3(context, -1L, false);
        try {
            o3Var.d(false);
            uf0.c("Calling this from your main thread can lead to deadlock");
            synchronized (o3Var) {
                if (!o3Var.c) {
                    synchronized (o3Var.d) {
                        n82 n82Var = o3Var.e;
                        if (n82Var == null || !n82Var.S) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        o3Var.d(false);
                        if (!o3Var.c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                uf0.f(o3Var.a);
                uf0.f(o3Var.b);
                try {
                    i = o3Var.b.i();
                } catch (RemoteException e2) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                    throw new IOException("Remote exception");
                }
            }
            o3Var.g();
            return i;
        } finally {
            o3Var.c();
        }
    }

    public static void e(a aVar, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            String str = "1";
            hashMap.put("app_context", "1");
            if (aVar != null) {
                if (true != aVar.b) {
                    str = "0";
                }
                hashMap.put("limit_ad_tracking", str);
                String str2 = aVar.a;
                if (str2 != null) {
                    hashMap.put("ad_id_size", Integer.toString(str2.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j));
            new tj1(hashMap).start();
        }
    }

    public final void c() {
        uf0.c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f == null || this.a == null) {
                return;
            }
            if (this.c) {
                mf.a().b(this.f, this.a);
            }
            this.c = false;
            this.b = null;
            this.a = null;
        }
    }

    public final void d(boolean z) {
        qi4 kg3Var;
        uf0.c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.c) {
                c();
            }
            Context context = this.f;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int c = jt.b.c(context, 12451000);
                if (c != 0 && c != 2) {
                    throw new IOException("Google Play services not available");
                }
                la laVar = new la();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (mf.a().c(context, context.getClass().getName(), intent, laVar, 1, null)) {
                    this.a = laVar;
                    try {
                        IBinder a2 = laVar.a(TimeUnit.MILLISECONDS);
                        int i = nz3.P;
                        IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        if (queryLocalInterface instanceof qi4) {
                            kg3Var = (qi4) queryLocalInterface;
                        } else {
                            kg3Var = new kg3(a2);
                        }
                        this.b = kg3Var;
                        this.c = true;
                        if (z) {
                            g();
                        }
                    } catch (InterruptedException unused) {
                        throw new IOException("Interrupted exception");
                    } catch (Throwable th) {
                        throw new IOException(th);
                    }
                } else {
                    throw new IOException("Connection failure");
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new mt();
            }
        }
    }

    public final a f() {
        a aVar;
        uf0.c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.c) {
                synchronized (this.d) {
                    n82 n82Var = this.e;
                    if (n82Var == null || !n82Var.S) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    d(false);
                    if (!this.c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                }
            }
            uf0.f(this.a);
            uf0.f(this.b);
            try {
                aVar = new a(this.b.d(), this.b.b());
            } catch (RemoteException e2) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                throw new IOException("Remote exception");
            }
        }
        g();
        return aVar;
    }

    public final void finalize() {
        c();
        super.finalize();
    }

    public final void g() {
        synchronized (this.d) {
            n82 n82Var = this.e;
            if (n82Var != null) {
                n82Var.R.countDown();
                try {
                    this.e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.g;
            if (j > 0) {
                this.e = new n82(this, j);
            }
        }
    }
}