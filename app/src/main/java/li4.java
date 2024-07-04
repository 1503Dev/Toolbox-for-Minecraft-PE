package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import defpackage.e70;
import java.util.ArrayList;
import java.util.List;

/* renamed from: li4  reason: default package */
public final class li4 {
    public final zq4 a;
    public final gi2 b;
    public final t64 c;
    public final pn5 d;
    public final zr5 e;
    public final String f;
    public final ArrayList g;
    public final ArrayList h;
    public final nc2 i;
    public final by5 j;
    public final int k;
    public final u2 l;
    public final rg0 m;
    public final px2 n;
    public final we3 o;
    public final boolean p;
    public final boolean q;
    public final c13 r;

    public li4(ki4 ki4Var) {
        boolean z;
        this.e = ki4Var.b;
        this.f = ki4Var.c;
        this.r = ki4Var.s;
        pn5 pn5Var = ki4Var.a;
        int i = pn5Var.P;
        long j = pn5Var.Q;
        Bundle bundle = pn5Var.R;
        int i2 = pn5Var.S;
        List list = pn5Var.T;
        boolean z2 = pn5Var.U;
        int i3 = pn5Var.V;
        if (!pn5Var.W && !ki4Var.e) {
            z = false;
        } else {
            z = true;
        }
        this.d = new pn5(i, j, bundle, i2, list, z2, i3, z, pn5Var.X, pn5Var.Y, pn5Var.Z, pn5Var.a0, pn5Var.b0, pn5Var.c0, pn5Var.d0, pn5Var.e0, pn5Var.f0, pn5Var.g0, pn5Var.h0, pn5Var.i0, pn5Var.j0, pn5Var.k0, cu5.q(pn5Var.l0), ki4Var.a.m0);
        zq4 zq4Var = ki4Var.d;
        nc2 nc2Var = null;
        if (zq4Var == null) {
            nc2 nc2Var2 = ki4Var.h;
            if (nc2Var2 != null) {
                zq4Var = nc2Var2.U;
            } else {
                zq4Var = null;
            }
        }
        this.a = zq4Var;
        ArrayList arrayList = ki4Var.f;
        this.g = arrayList;
        this.h = ki4Var.g;
        if (arrayList != null && (nc2Var = ki4Var.h) == null) {
            nc2Var = new nc2(new e70(new e70.a()));
        }
        this.i = nc2Var;
        this.j = ki4Var.i;
        this.k = ki4Var.m;
        this.l = ki4Var.j;
        this.m = ki4Var.k;
        this.n = ki4Var.l;
        this.b = ki4Var.n;
        this.o = new we3(ki4Var.o);
        this.p = ki4Var.p;
        this.c = ki4Var.q;
        this.q = ki4Var.r;
    }

    public final pe2 a() {
        rg0 rg0Var = this.m;
        if (rg0Var == null && this.l == null) {
            return null;
        }
        if (rg0Var != null) {
            IBinder iBinder = rg0Var.R;
            if (iBinder == null) {
                return null;
            }
            int i = oe2.P;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
            if (queryLocalInterface instanceof pe2) {
                return (pe2) queryLocalInterface;
            }
            return new ne2(iBinder);
        }
        IBinder iBinder2 = this.l.Q;
        if (iBinder2 == null) {
            return null;
        }
        int i2 = oe2.P;
        IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        if (queryLocalInterface2 instanceof pe2) {
            return (pe2) queryLocalInterface2;
        }
        return new ne2(iBinder2);
    }

    public final boolean b() {
        return this.f.matches((String) w82.d.c.a(x92.x2));
    }
}