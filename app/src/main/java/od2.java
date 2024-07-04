package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* renamed from: od2  reason: default package */
public abstract class od2 extends j22 implements pd2 {
    public od2() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        IInterface va0Var;
        String a;
        List list;
        String str;
        switch (i) {
            case 2:
                va0Var = new va0(((vo3) this).Q);
                parcel2.writeNoException();
                k22.e(parcel2, va0Var);
                return true;
            case 3:
                nl3 nl3Var = ((vo3) this).R;
                synchronized (nl3Var) {
                    a = nl3Var.a("headline");
                }
                str = a;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 4:
                nl3 nl3Var2 = ((vo3) this).R;
                synchronized (nl3Var2) {
                    list = nl3Var2.e;
                }
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 5:
                nl3 nl3Var3 = ((vo3) this).R;
                synchronized (nl3Var3) {
                    a = nl3Var3.a("body");
                }
                str = a;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 6:
                nl3 nl3Var4 = ((vo3) this).R;
                synchronized (nl3Var4) {
                    va0Var = nl3Var4.s;
                }
                parcel2.writeNoException();
                k22.e(parcel2, va0Var);
                return true;
            case 7:
                nl3 nl3Var5 = ((vo3) this).R;
                synchronized (nl3Var5) {
                    a = nl3Var5.a("call_to_action");
                }
                str = a;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 8:
                nl3 nl3Var6 = ((vo3) this).R;
                synchronized (nl3Var6) {
                    a = nl3Var6.a("advertiser");
                }
                str = a;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 9:
                Bundle f = ((vo3) this).R.f();
                parcel2.writeNoException();
                k22.d(parcel2, f);
                return true;
            case 10:
                ((vo3) this).Q.q();
                parcel2.writeNoException();
                return true;
            case 11:
                va0Var = ((vo3) this).R.g();
                parcel2.writeNoException();
                k22.e(parcel2, va0Var);
                return true;
            case 12:
                Bundle bundle = (Bundle) k22.a(parcel, Bundle.CREATOR);
                k22.b(parcel);
                jl3 jl3Var = ((vo3) this).Q;
                synchronized (jl3Var) {
                    jl3Var.k.u(bundle);
                }
                parcel2.writeNoException();
                return true;
            case 13:
                k22.b(parcel);
                boolean i2 = ((vo3) this).Q.i((Bundle) k22.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(i2 ? 1 : 0);
                return true;
            case 14:
                Bundle bundle2 = (Bundle) k22.a(parcel, Bundle.CREATOR);
                k22.b(parcel);
                jl3 jl3Var2 = ((vo3) this).Q;
                synchronized (jl3Var2) {
                    jl3Var2.k.b(bundle2);
                }
                parcel2.writeNoException();
                return true;
            case 15:
                nl3 nl3Var7 = ((vo3) this).R;
                synchronized (nl3Var7) {
                    va0Var = nl3Var7.c;
                }
                parcel2.writeNoException();
                k22.e(parcel2, va0Var);
                return true;
            case 16:
                nl3 nl3Var8 = ((vo3) this).R;
                synchronized (nl3Var8) {
                    va0Var = nl3Var8.p;
                }
                parcel2.writeNoException();
                k22.e(parcel2, va0Var);
                return true;
            case 17:
                str = ((vo3) this).P;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            default:
                return false;
        }
    }
}