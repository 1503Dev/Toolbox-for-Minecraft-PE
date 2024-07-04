package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bo2  reason: default package */
public final class bo2 extends b70 {
    public final ue2 a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();

    public bo2(ue2 ue2Var) {
        this.a = ue2Var;
        try {
            List u = ue2Var.u();
            if (u != null) {
                for (Object obj : u) {
                    ad2 t4 = obj instanceof IBinder ? lc2.t4((IBinder) obj) : null;
                    if (t4 != null) {
                        this.b.add(new ao2(t4));
                    }
                }
            }
        } catch (RemoteException e) {
            sv2.e("", e);
        }
        try {
            List r = this.a.r();
            if (r != null) {
                for (Object obj2 : r) {
                    de3 t42 = obj2 instanceof IBinder ? n84.t4((IBinder) obj2) : null;
                    if (t42 != null) {
                        this.c.add(new te3(t42));
                    }
                }
            }
        } catch (RemoteException e2) {
            sv2.e("", e2);
        }
        try {
            ad2 l = this.a.l();
            if (l != null) {
                new ao2(l);
            }
        } catch (RemoteException e3) {
            sv2.e("", e3);
        }
        try {
            if (this.a.g() != null) {
                new zn2(this.a.g());
            }
        } catch (RemoteException e4) {
            sv2.e("", e4);
        }
    }

    @Override // defpackage.b70
    public final String a() {
        try {
            return this.a.t();
        } catch (RemoteException e) {
            sv2.e("", e);
            return null;
        }
    }

    @Override // defpackage.b70
    public final String b() {
        try {
            return this.a.q();
        } catch (RemoteException e) {
            sv2.e("", e);
            return null;
        }
    }

    @Override // defpackage.b70
    public final rl0 c() {
        mq3 mq3Var;
        try {
            mq3Var = this.a.h();
        } catch (RemoteException e) {
            sv2.e("", e);
            mq3Var = null;
        }
        if (mq3Var != null) {
            return new rl0(mq3Var);
        }
        return null;
    }

    @Override // defpackage.b70
    public final /* bridge */ /* synthetic */ hw d() {
        try {
            return this.a.o();
        } catch (RemoteException e) {
            sv2.e("", e);
            return null;
        }
    }
}