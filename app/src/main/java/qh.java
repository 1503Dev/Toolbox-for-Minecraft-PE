package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import defpackage.cg;
import defpackage.ph;
import defpackage.yv;

/* renamed from: qh  reason: default package */
public abstract class qh implements ServiceConnection {
    public Context a;

    /* renamed from: qh$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends oh {
        public a(yv yvVar, ComponentName componentName) {
            super(yvVar, componentName);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    @Override // android.content.ServiceConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        yv c0049a;
        rh rhVar;
        vj5 vj5Var;
        if (this.a != null) {
            int i = yv.a.P;
            if (iBinder == null) {
                c0049a = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                if (queryLocalInterface != null && (queryLocalInterface instanceof yv)) {
                    c0049a = (yv) queryLocalInterface;
                } else {
                    c0049a = new yv.a.C0049a(iBinder);
                }
            }
            a aVar = new a(c0049a, componentName);
            ua2 ua2Var = (ua2) ((vj5) this).b.get();
            if (ua2Var != null) {
                ua2Var.b = aVar;
                try {
                    c0049a.V3();
                } catch (RemoteException unused) {
                }
                ta2 ta2Var = ua2Var.d;
                if (ta2Var != null) {
                    gp5 gp5Var = (gp5) ta2Var;
                    ua2 ua2Var2 = gp5Var.a;
                    oh ohVar = ua2Var2.b;
                    if (ohVar != null) {
                        if (ua2Var2.a == null) {
                            nh nhVar = new nh();
                            if (ohVar.a.U1(nhVar)) {
                                rhVar = new rh(ohVar.a, nhVar, ohVar.b);
                                ua2Var2.a = rhVar;
                            }
                        }
                        ph a2 = new ph.a(ua2Var2.a).a();
                        a2.a.setPackage(s45.g(gp5Var.b));
                        Context context = gp5Var.b;
                        a2.a.setData(gp5Var.c);
                        Intent intent = a2.a;
                        Bundle bundle = a2.b;
                        Object obj = cg.a;
                        cg.a.b(context, intent, bundle);
                        ua2 ua2Var3 = gp5Var.a;
                        Activity activity = (Activity) gp5Var.b;
                        vj5Var = ua2Var3.c;
                        if (vj5Var == null) {
                            activity.unbindService(vj5Var);
                            ua2Var3.b = null;
                            ua2Var3.a = null;
                            ua2Var3.c = null;
                            return;
                        }
                        return;
                    }
                    rhVar = null;
                    ua2Var2.a = rhVar;
                    ph a22 = new ph.a(ua2Var2.a).a();
                    a22.a.setPackage(s45.g(gp5Var.b));
                    Context context2 = gp5Var.b;
                    a22.a.setData(gp5Var.c);
                    Intent intent2 = a22.a;
                    Bundle bundle2 = a22.b;
                    Object obj2 = cg.a;
                    cg.a.b(context2, intent2, bundle2);
                    ua2 ua2Var32 = gp5Var.a;
                    Activity activity2 = (Activity) gp5Var.b;
                    vj5Var = ua2Var32.c;
                    if (vj5Var == null) {
                    }
                }
            }
        } else {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
    }
}