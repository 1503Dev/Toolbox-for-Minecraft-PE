package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import defpackage.jd;
import defpackage.l4;
import defpackage.l4.c;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Executor;

/* renamed from: gt  reason: default package */
public abstract class gt<O extends l4.c> {
    public final Context a;
    public final String b;
    public final l4<O> c;
    public final O d;
    public final n4<O> e;
    public final int f;
    public final ga1 g;
    public final lt h;

    /* renamed from: gt$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        public static final a b = new a(new ga1(), Looper.getMainLooper());
        public final ga1 a;

        public a(ga1 ga1Var, Looper looper) {
            this.a = ga1Var;
        }
    }

    public gt() {
        throw null;
    }

    public gt(Context context, l4<O> l4Var, O o, a aVar) {
        if (context == null) {
            throw new NullPointerException("Null context is not permitted.");
        }
        if (l4Var == null) {
            throw new NullPointerException("Api must not be null.");
        }
        if (aVar != null) {
            this.a = context.getApplicationContext();
            String str = null;
            if (qe0.b()) {
                try {
                    str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            }
            this.b = str;
            this.c = l4Var;
            this.d = o;
            this.e = new n4<>(l4Var, o, str);
            lt e = lt.e(this.a);
            this.h = e;
            this.f = e.W.getAndIncrement();
            this.g = aVar.a;
            aj1 aj1Var = e.b0;
            aj1Var.sendMessage(aj1Var.obtainMessage(7, this));
            return;
        }
        throw new NullPointerException("Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
    }

    public final jd.a b() {
        Account a2;
        Collection<? extends Scope> emptySet;
        GoogleSignInAccount b;
        GoogleSignInAccount b2;
        jd.a aVar = new jd.a();
        O o = this.d;
        if ((o instanceof l4.c.b) && (b2 = ((l4.c.b) o).b()) != null) {
            String str = b2.S;
            if (str != null) {
                a2 = new Account(str, "com.google");
            }
            a2 = null;
        } else {
            O o2 = this.d;
            if (o2 instanceof l4.c.a) {
                a2 = ((l4.c.a) o2).a();
            }
            a2 = null;
        }
        aVar.a = a2;
        O o3 = this.d;
        if ((o3 instanceof l4.c.b) && (b = ((l4.c.b) o3).b()) != null) {
            emptySet = b.c();
        } else {
            emptySet = Collections.emptySet();
        }
        if (aVar.b == null) {
            aVar.b = new g7<>();
        }
        aVar.b.addAll(emptySet);
        aVar.d = this.a.getClass().getName();
        aVar.c = this.a.getPackageName();
        return aVar;
    }

    public final ay5 c(int i, th1 th1Var) {
        long j;
        boolean z;
        aw0 aw0Var = new aw0();
        lt ltVar = this.h;
        ga1 ga1Var = this.g;
        ltVar.getClass();
        int i2 = th1Var.c;
        if (i2 != 0) {
            n4<O> n4Var = this.e;
            yb0 yb0Var = null;
            if (ltVar.a()) {
                gm0 gm0Var = fm0.a().a;
                boolean z2 = true;
                if (gm0Var != null) {
                    if (gm0Var.Q) {
                        boolean z3 = gm0Var.R;
                        zg1 zg1Var = (zg1) ltVar.Y.get(n4Var);
                        if (zg1Var != null) {
                            l4.e eVar = zg1Var.Q;
                            if (eVar instanceof k9) {
                                k9 k9Var = (k9) eVar;
                                if (k9Var.v != null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z && !k9Var.g()) {
                                    kf a2 = lh1.a(zg1Var, k9Var, i2);
                                    if (a2 != null) {
                                        zg1Var.a0++;
                                        z2 = a2.R;
                                    }
                                }
                            }
                        }
                        z2 = z3;
                    }
                }
                long j2 = 0;
                if (z2) {
                    j = System.currentTimeMillis();
                } else {
                    j = 0;
                }
                if (z2) {
                    j2 = SystemClock.elapsedRealtime();
                }
                yb0Var = new lh1(ltVar, i2, n4Var, j, j2);
            }
            if (yb0Var != null) {
                yv0 yv0Var = aw0Var.a;
                final aj1 aj1Var = ltVar.b0;
                aj1Var.getClass();
                yv0Var.c(new Executor() { // from class: tg1
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        aj1Var.post(runnable);
                    }
                }, yb0Var);
            }
        }
        ei1 ei1Var = new ei1(i, th1Var, aw0Var, ga1Var);
        aj1 aj1Var2 = ltVar.b0;
        aj1Var2.sendMessage(aj1Var2.obtainMessage(4, new oh1(ei1Var, ltVar.X.get(), this)));
        return aw0Var.a;
    }
}