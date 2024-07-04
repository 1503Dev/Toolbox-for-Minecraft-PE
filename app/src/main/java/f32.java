package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: f32  reason: default package */
public final class f32 {
    public final Object a = new Object();
    public d32 b = null;
    public boolean c = false;

    public final Activity a() {
        synchronized (this.a) {
            try {
                d32 d32Var = this.b;
                if (d32Var != null) {
                    return d32Var.P;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(e32 e32Var) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new d32();
            }
            d32 d32Var = this.b;
            synchronized (d32Var.R) {
                d32Var.U.add(e32Var);
            }
        }
    }

    public final void c(Context context) {
        Application application;
        synchronized (this.a) {
            try {
                if (!this.c) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                    } else {
                        application = null;
                    }
                    if (application == null) {
                        sv2.g("Can not cast Context to Application");
                        return;
                    }
                    if (this.b == null) {
                        this.b = new d32();
                    }
                    d32 d32Var = this.b;
                    if (!d32Var.X) {
                        application.registerActivityLifecycleCallbacks(d32Var);
                        if (context instanceof Activity) {
                            d32Var.a((Activity) context);
                        }
                        d32Var.Q = application;
                        d32Var.Y = ((Long) w82.d.c.a(x92.E0)).longValue();
                        d32Var.X = true;
                    }
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(u73 u73Var) {
        synchronized (this.a) {
            d32 d32Var = this.b;
            if (d32Var == null) {
                return;
            }
            synchronized (d32Var.R) {
                d32Var.U.remove(u73Var);
            }
        }
    }
}