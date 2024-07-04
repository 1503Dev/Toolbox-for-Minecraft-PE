package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: sk0  reason: default package */
public abstract class sk0<T> {
    public final String a;
    public T b;

    /* renamed from: sk0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends Exception {
        public a() {
            super("Could not get remote context.");
        }

        public a(String str, ReflectiveOperationException reflectiveOperationException) {
            super(str, reflectiveOperationException);
        }
    }

    public sk0(String str) {
        this.a = str;
    }

    public abstract T a(IBinder iBinder);

    public final T b(Context context) {
        Context context2;
        if (this.b == null) {
            uf0.f(context);
            AtomicBoolean atomicBoolean = ot.a;
            try {
                context2 = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                context2 = null;
            }
            if (context2 != null) {
                try {
                    this.b = a((IBinder) context2.getClassLoader().loadClass(this.a).newInstance());
                } catch (ClassNotFoundException e) {
                    throw new a("Could not load creator class.", e);
                } catch (IllegalAccessException e2) {
                    throw new a("Could not access creator.", e2);
                } catch (InstantiationException e3) {
                    throw new a("Could not instantiate creator.", e3);
                }
            } else {
                throw new a();
            }
        }
        return this.b;
    }
}