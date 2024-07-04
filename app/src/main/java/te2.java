package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* renamed from: te2  reason: default package */
public abstract class te2 extends j22 implements ue2 {
    public te2() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        String q;
        List u;
        IInterface l;
        List list;
        boolean z;
        n84 n84Var;
        yc2 yc2Var;
        int i2;
        boolean z2 = false;
        re2 re2Var = null;
        za3 za3Var = null;
        switch (i) {
            case 2:
                q = ((cp3) this).q();
                parcel2.writeNoException();
                parcel2.writeString(q);
                break;
            case 3:
                u = ((cp3) this).u();
                parcel2.writeNoException();
                parcel2.writeList(u);
                break;
            case 4:
                q = ((cp3) this).t();
                parcel2.writeNoException();
                parcel2.writeString(q);
                break;
            case 5:
                l = ((cp3) this).l();
                parcel2.writeNoException();
                k22.e(parcel2, l);
                break;
            case 6:
                q = ((cp3) this).m();
                parcel2.writeNoException();
                parcel2.writeString(q);
                break;
            case 7:
                q = ((cp3) this).k();
                parcel2.writeNoException();
                parcel2.writeString(q);
                break;
            case 8:
                double b = ((cp3) this).b();
                parcel2.writeNoException();
                parcel2.writeDouble(b);
                break;
            case 9:
                q = ((cp3) this).G();
                parcel2.writeNoException();
                parcel2.writeString(q);
                break;
            case 10:
                q = ((cp3) this).s();
                parcel2.writeNoException();
                parcel2.writeString(q);
                break;
            case 11:
                l = ((cp3) this).f();
                parcel2.writeNoException();
                k22.e(parcel2, l);
                break;
            case 12:
                q = ((cp3) this).P;
                parcel2.writeNoException();
                parcel2.writeString(q);
                break;
            case 13:
                ((cp3) this).Q.q();
                parcel2.writeNoException();
                break;
            case 14:
                l = ((cp3) this).g();
                parcel2.writeNoException();
                k22.e(parcel2, l);
                break;
            case 15:
                Bundle bundle = (Bundle) k22.a(parcel, Bundle.CREATOR);
                k22.b(parcel);
                jl3 jl3Var = ((cp3) this).Q;
                synchronized (jl3Var) {
                    jl3Var.k.u(bundle);
                }
                parcel2.writeNoException();
                break;
            case 16:
                k22.b(parcel);
                boolean i3 = ((cp3) this).Q.i((Bundle) k22.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                i2 = i3;
                parcel2.writeInt(i2);
                break;
            case 17:
                Bundle bundle2 = (Bundle) k22.a(parcel, Bundle.CREATOR);
                k22.b(parcel);
                jl3 jl3Var2 = ((cp3) this).Q;
                synchronized (jl3Var2) {
                    jl3Var2.k.b(bundle2);
                }
                parcel2.writeNoException();
                break;
            case 18:
                l = ((cp3) this).o();
                parcel2.writeNoException();
                k22.e(parcel2, l);
                break;
            case 19:
                l = ((cp3) this).n();
                parcel2.writeNoException();
                k22.e(parcel2, l);
                break;
            case 20:
                Bundle f = ((cp3) this).R.f();
                parcel2.writeNoException();
                k22.d(parcel2, f);
                break;
            case 21:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    if (queryLocalInterface instanceof re2) {
                        re2Var = (re2) queryLocalInterface;
                    } else {
                        re2Var = new qe2(readStrongBinder);
                    }
                }
                k22.b(parcel);
                ((cp3) this).u4(re2Var);
                parcel2.writeNoException();
                break;
            case 22:
                jl3 jl3Var3 = ((cp3) this).Q;
                synchronized (jl3Var3) {
                    jl3Var3.k.f();
                }
                parcel2.writeNoException();
                break;
            case 23:
                u = ((cp3) this).r();
                parcel2.writeNoException();
                parcel2.writeList(u);
                break;
            case 24:
                cp3 cp3Var = (cp3) this;
                nl3 nl3Var = cp3Var.R;
                synchronized (nl3Var) {
                    list = nl3Var.f;
                }
                if (!list.isEmpty()) {
                    nl3 nl3Var2 = cp3Var.R;
                    synchronized (nl3Var2) {
                        n84Var = nl3Var2.g;
                    }
                    if (n84Var != null) {
                        z2 = true;
                    }
                }
                z = z2;
                parcel2.writeNoException();
                ClassLoader classLoader = k22.a;
                i2 = z;
                parcel2.writeInt(i2);
                break;
            case 25:
                de3 t4 = n84.t4(parcel.readStrongBinder());
                k22.b(parcel);
                jl3 jl3Var4 = ((cp3) this).Q;
                synchronized (jl3Var4) {
                    jl3Var4.k.k(t4);
                }
                parcel2.writeNoException();
                break;
            case 26:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
                    if (queryLocalInterface2 instanceof za3) {
                        za3Var = (za3) queryLocalInterface2;
                    } else {
                        za3Var = new i93(readStrongBinder2);
                    }
                }
                k22.b(parcel);
                jl3 jl3Var5 = ((cp3) this).Q;
                synchronized (jl3Var5) {
                    jl3Var5.k.i(za3Var);
                }
                parcel2.writeNoException();
                break;
            case 27:
                jl3 jl3Var6 = ((cp3) this).Q;
                synchronized (jl3Var6) {
                    jl3Var6.k.r();
                }
                parcel2.writeNoException();
                break;
            case 28:
                final jl3 jl3Var7 = ((cp3) this).Q;
                synchronized (jl3Var7) {
                    ym3 ym3Var = jl3Var7.t;
                    if (ym3Var == null) {
                        sv2.b("Ad should be associated with an ad view before calling recordCustomClickGesture()");
                    } else {
                        final boolean z3 = ym3Var instanceof zl3;
                        jl3Var7.i.execute(new Runnable() { // from class: hl3
                            @Override // java.lang.Runnable
                            public final void run() {
                                jl3 jl3Var8 = jl3.this;
                                jl3Var8.k.d(null, jl3Var8.t.e(), jl3Var8.t.n(), jl3Var8.t.o(), z3, jl3Var8.k(), 0);
                            }
                        });
                    }
                }
                parcel2.writeNoException();
                break;
            case 29:
                ll3 ll3Var = ((cp3) this).Q.B;
                synchronized (ll3Var) {
                    yc2Var = ll3Var.a;
                }
                l = yc2Var;
                parcel2.writeNoException();
                k22.e(parcel2, l);
                break;
            case 30:
                z = ((cp3) this).v4();
                parcel2.writeNoException();
                ClassLoader classLoader2 = k22.a;
                i2 = z;
                parcel2.writeInt(i2);
                break;
            case 31:
                l = ((cp3) this).h();
                parcel2.writeNoException();
                k22.e(parcel2, l);
                break;
            case 32:
                yk3 t42 = gk3.t4(parcel.readStrongBinder());
                k22.b(parcel);
                ((cp3) this).t4(t42);
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}