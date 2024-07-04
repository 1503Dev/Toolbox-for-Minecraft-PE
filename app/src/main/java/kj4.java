package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: kj4  reason: default package */
public final class kj4 implements ex2, nf3 {
    public static kj4 T;
    public final /* synthetic */ int P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public kj4(Context context, e53 e53Var) {
        this.P = 0;
        this.S = new AtomicReference();
        this.Q = context;
        this.R = e53Var;
    }

    public static kj4 b(Context context) {
        synchronized (kj4.class) {
            kj4 kj4Var = T;
            if (kj4Var != null) {
                return kj4Var;
            }
            Context applicationContext = context.getApplicationContext();
            long longValue = ((Long) qb2.b.d()).longValue();
            e53 e53Var = null;
            if (longValue > 0 && longValue <= 231004600) {
                try {
                    e53Var = r43.asInterface((IBinder) applicationContext.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(applicationContext));
                } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                    sv2.e("Failed to retrieve lite SDK info.", e);
                }
            }
            kj4 kj4Var2 = new kj4(applicationContext, e53Var);
            T = kj4Var2;
            return kj4Var2;
        }
    }

    public final xv2 a(int i) {
        cu5 cu5Var = jv5.A.c;
        boolean H = cu5.H((Context) this.Q);
        xv2 xv2Var = new xv2(i, H);
        if (((Boolean) qb2.c.d()).booleanValue()) {
            e53 e53Var = (e53) this.R;
            da4 da4Var = null;
            if (e53Var != null) {
                try {
                    da4Var = e53Var.getLiteSdkVersion();
                } catch (RemoteException unused) {
                }
            }
            if (da4Var == null) {
                return xv2Var;
            }
            return new xv2(da4Var.Q, H);
        }
        return xv2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x002d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(wk2 wk2Var) {
        boolean z;
        wk2 adapterCreator;
        AtomicReference atomicReference;
        boolean z2;
        if (((Boolean) qb2.a.d()).booleanValue()) {
            e53 e53Var = (e53) this.R;
            if (e53Var != null) {
                try {
                    adapterCreator = e53Var.getAdapterCreator();
                } catch (RemoteException unused) {
                }
                atomicReference = (AtomicReference) this.S;
                if (adapterCreator == null) {
                    adapterCreator = wk2Var;
                }
                while (true) {
                    if (!atomicReference.compareAndSet(null, adapterCreator)) {
                        z2 = true;
                    } else if (atomicReference.get() != null) {
                        z2 = false;
                    } else {
                        continue;
                    }
                    if (!z2 || atomicReference.get() != null) {
                        return;
                    }
                }
            }
            adapterCreator = null;
            atomicReference = (AtomicReference) this.S;
            if (adapterCreator == null) {
            }
            while (true) {
                if (!atomicReference.compareAndSet(null, adapterCreator)) {
                }
                if (!z2) {
                    return;
                }
            }
        } else {
            AtomicReference atomicReference2 = (AtomicReference) this.S;
            while (true) {
                if (atomicReference2.compareAndSet(null, wk2Var)) {
                    z = true;
                } else if (atomicReference2.get() != null) {
                    z = false;
                } else {
                    continue;
                }
                if (z || atomicReference2.get() != null) {
                    return;
                }
            }
        }
    }

    @Override // defpackage.ex2
    public final void e(Object obj) {
        rm4 rm4Var;
        switch (this.P) {
            case 1:
                ui2 ui2Var = (ui2) obj;
                synchronized (((rj2) this.S).a) {
                    Object obj2 = this.S;
                    ((rj2) obj2).g = 0;
                    qj2 qj2Var = ((rj2) obj2).f;
                    if (qj2Var != null && ((qj2) this.Q) != qj2Var) {
                        vz3.k("New JS engine is loaded, marking previous one as destroyable.");
                        ((rj2) this.S).f.i();
                    }
                    ((rj2) this.S).f = (qj2) this.Q;
                    if (((Boolean) fb2.d.d()).booleanValue() && (rm4Var = ((rj2) this.S).e) != null) {
                        hm4 hm4Var = (hm4) this.R;
                        hm4Var.k0(true);
                        rm4Var.c(hm4Var.n());
                    }
                }
                return;
            default:
                ((mh4) obj).l((cr2) this.Q, (String) this.R, (String) this.S);
                return;
        }
    }

    public kj4(rj2 rj2Var, qj2 qj2Var, hm4 hm4Var) {
        this.P = 1;
        this.S = rj2Var;
        this.Q = qj2Var;
        this.R = hm4Var;
    }

    public /* synthetic */ kj4(cr2 cr2Var, String str, String str2) {
        this.P = 2;
        this.Q = cr2Var;
        this.R = str;
        this.S = str2;
    }
}