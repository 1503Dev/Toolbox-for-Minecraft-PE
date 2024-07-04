package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* renamed from: jd2  reason: default package */
public abstract class jd2 extends j22 implements nd2 {
    public jd2() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        IInterface va0Var;
        String a;
        List list;
        double d;
        String str;
        switch (i) {
            case 2:
                va0Var = new va0(((to3) this).Q);
                parcel2.writeNoException();
                k22.e(parcel2, va0Var);
                return true;
            case 3:
                nl3 nl3Var = ((to3) this).R;
                synchronized (nl3Var) {
                    a = nl3Var.a("headline");
                }
                str = a;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 4:
                nl3 nl3Var2 = ((to3) this).R;
                synchronized (nl3Var2) {
                    list = nl3Var2.e;
                }
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 5:
                nl3 nl3Var3 = ((to3) this).R;
                synchronized (nl3Var3) {
                    a = nl3Var3.a("body");
                }
                str = a;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 6:
                nl3 nl3Var4 = ((to3) this).R;
                synchronized (nl3Var4) {
                    va0Var = nl3Var4.r;
                }
                parcel2.writeNoException();
                k22.e(parcel2, va0Var);
                return true;
            case 7:
                nl3 nl3Var5 = ((to3) this).R;
                synchronized (nl3Var5) {
                    a = nl3Var5.a("call_to_action");
                }
                str = a;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 8:
                nl3 nl3Var6 = ((to3) this).R;
                synchronized (nl3Var6) {
                    d = nl3Var6.q;
                }
                parcel2.writeNoException();
                parcel2.writeDouble(d);
                return true;
            case 9:
                nl3 nl3Var7 = ((to3) this).R;
                synchronized (nl3Var7) {
                    a = nl3Var7.a("store");
                }
                str = a;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 10:
                nl3 nl3Var8 = ((to3) this).R;
                synchronized (nl3Var8) {
                    a = nl3Var8.a("price");
                }
                str = a;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 11:
                Bundle f = ((to3) this).R.f();
                parcel2.writeNoException();
                k22.d(parcel2, f);
                return true;
            case 12:
                ((to3) this).Q.q();
                parcel2.writeNoException();
                return true;
            case 13:
                va0Var = ((to3) this).R.g();
                parcel2.writeNoException();
                k22.e(parcel2, va0Var);
                return true;
            case 14:
                Bundle bundle = (Bundle) k22.a(parcel, Bundle.CREATOR);
                k22.b(parcel);
                jl3 jl3Var = ((to3) this).Q;
                synchronized (jl3Var) {
                    jl3Var.k.u(bundle);
                }
                parcel2.writeNoException();
                return true;
            case 15:
                k22.b(parcel);
                boolean i2 = ((to3) this).Q.i((Bundle) k22.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(i2 ? 1 : 0);
                return true;
            case 16:
                Bundle bundle2 = (Bundle) k22.a(parcel, Bundle.CREATOR);
                k22.b(parcel);
                jl3 jl3Var2 = ((to3) this).Q;
                synchronized (jl3Var2) {
                    jl3Var2.k.b(bundle2);
                }
                parcel2.writeNoException();
                return true;
            case 17:
                nl3 nl3Var9 = ((to3) this).R;
                synchronized (nl3Var9) {
                    va0Var = nl3Var9.c;
                }
                parcel2.writeNoException();
                k22.e(parcel2, va0Var);
                return true;
            case 18:
                nl3 nl3Var10 = ((to3) this).R;
                synchronized (nl3Var10) {
                    va0Var = nl3Var10.p;
                }
                parcel2.writeNoException();
                k22.e(parcel2, va0Var);
                return true;
            case 19:
                str = ((to3) this).P;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            default:
                return false;
        }
    }
}