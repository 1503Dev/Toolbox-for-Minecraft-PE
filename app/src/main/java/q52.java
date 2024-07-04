package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* renamed from: q52  reason: default package */
public abstract class q52 {
    public static final h03 a;

    static {
        h03 h03Var = null;
        try {
            Object newInstance = t42.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (newInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    h03Var = queryLocalInterface instanceof h03 ? (h03) queryLocalInterface : new my2(iBinder);
                }
            } else {
                sv2.g("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            sv2.g("Failed to instantiate ClientApi class.");
        }
        a = h03Var;
    }

    public abstract Object a();

    public abstract Object b(h03 h03Var);

    public abstract Object c();

    public final Object d(Context context, boolean z) {
        boolean z2;
        boolean z3;
        Object obj;
        Object obj2;
        boolean z4;
        boolean z5 = false;
        if (!z) {
            mv2 mv2Var = n62.f.a;
            if (jt.b.c(context, 12451000) == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                sv2.b("Google Play Services is not available.");
                z = true;
            }
        }
        if (DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) > DynamiteModule.d(context, ModuleDescriptor.MODULE_ID, false)) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z6 = !z2;
        x92.a(context);
        if (((Boolean) hb2.a.d()).booleanValue()) {
            z3 = false;
        } else if (((Boolean) hb2.b.d()).booleanValue()) {
            z3 = true;
            z5 = true;
        } else {
            z3 = z | z6;
        }
        Object obj3 = null;
        if (z3) {
            h03 h03Var = a;
            if (h03Var != null) {
                try {
                    obj2 = b(h03Var);
                } catch (RemoteException e) {
                    sv2.h("Cannot invoke local loader using ClientApi class.", e);
                }
                if (obj2 == null && !z5) {
                    try {
                        obj3 = c();
                    } catch (RemoteException e2) {
                        sv2.h("Cannot invoke remote loader.", e2);
                    }
                    obj2 = obj3;
                }
            } else {
                sv2.g("ClientApi class cannot be loaded.");
            }
            obj2 = null;
            if (obj2 == null) {
                obj3 = c();
                obj2 = obj3;
            }
        } else {
            try {
                obj = c();
            } catch (RemoteException e3) {
                sv2.h("Cannot invoke remote loader.", e3);
                obj = null;
            }
            if (obj == null) {
                int intValue = ((Long) wb2.a.d()).intValue();
                n62 n62Var = n62.f;
                if (n62Var.e.nextInt(intValue) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    mv2 mv2Var2 = n62Var.a;
                    String str = n62Var.d.P;
                    mv2Var2.getClass();
                    mv2.j(context, str, bundle, new nj2(1, mv2Var2));
                }
            }
            if (obj == null) {
                h03 h03Var2 = a;
                if (h03Var2 != null) {
                    try {
                        obj3 = b(h03Var2);
                    } catch (RemoteException e4) {
                        sv2.h("Cannot invoke local loader using ClientApi class.", e4);
                    }
                } else {
                    sv2.g("ClientApi class cannot be loaded.");
                }
                obj2 = obj3;
            } else {
                obj2 = obj;
            }
        }
        if (obj2 == null) {
            return a();
        }
        return obj2;
    }
}