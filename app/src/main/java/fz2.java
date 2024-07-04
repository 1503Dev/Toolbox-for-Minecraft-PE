package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;
import com.google.android.gms.ads.internal.ClientApi;
import defpackage.hw;
import java.util.HashMap;

/* renamed from: fz2  reason: default package */
public abstract class fz2 extends j22 implements h03 {
    public fz2() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        IInterface g2;
        Object obj = null;
        switch (i) {
            case 1:
                hw Z = hw.a.Z(parcel.readStrongBinder());
                zr5 zr5Var = (zr5) k22.a(parcel, zr5.CREATOR);
                String readString = parcel.readString();
                wk2 t4 = vk2.t4(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                k22.b(parcel);
                g2 = ((ClientApi) this).g2(Z, zr5Var, readString, t4, readInt);
                break;
            case 2:
                hw Z2 = hw.a.Z(parcel.readStrongBinder());
                zr5 zr5Var2 = (zr5) k22.a(parcel, zr5.CREATOR);
                String readString2 = parcel.readString();
                wk2 t42 = vk2.t4(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                k22.b(parcel);
                g2 = ((ClientApi) this).o1(Z2, zr5Var2, readString2, t42, readInt2);
                break;
            case 3:
                hw Z3 = hw.a.Z(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                wk2 t43 = vk2.t4(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                k22.b(parcel);
                g2 = ((ClientApi) this).T3(Z3, readString3, t43, readInt3);
                break;
            case 4:
            case 7:
                hw.a.Z(parcel.readStrongBinder());
                k22.b(parcel);
                parcel2.writeNoException();
                k22.e(parcel2, null);
                return true;
            case 5:
                g2 = ((ClientApi) this).B1(hw.a.Z(parcel.readStrongBinder()), uv0.b(parcel, parcel));
                break;
            case 6:
                hw Z4 = hw.a.Z(parcel.readStrongBinder());
                wk2 t44 = vk2.t4(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                k22.b(parcel);
                Context context = (Context) va0.c0(Z4);
                k94 V = q23.c(context, t44, readInt4).V();
                context.getClass();
                V.R = context;
                g2 = (wh4) V.a().d.c();
                break;
            case 8:
                g2 = ((ClientApi) this).S(uv0.b(parcel, parcel));
                break;
            case 9:
                hw Z5 = hw.a.Z(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                k22.b(parcel);
                g2 = ((ClientApi) this).b0(Z5, readInt5);
                break;
            case 10:
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                k22.b(parcel);
                g2 = ((ClientApi) this).Z0(hw.a.Z(parcel.readStrongBinder()), (zr5) k22.a(parcel, zr5.CREATOR), readString4, readInt6);
                break;
            case 11:
                zl3 zl3Var = new zl3((View) va0.c0(hw.a.Z(parcel.readStrongBinder())), (HashMap) va0.c0(hw.a.Z(parcel.readStrongBinder())), (HashMap) va0.c0(uv0.b(parcel, parcel)));
                parcel2.writeNoException();
                k22.e(parcel2, zl3Var);
                return true;
            case 12:
                hw Z6 = hw.a.Z(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                wk2 t45 = vk2.t4(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                k22.b(parcel);
                g2 = ((ClientApi) this).J3(Z6, readString5, t45, readInt7);
                break;
            case 13:
                hw Z7 = hw.a.Z(parcel.readStrongBinder());
                zr5 zr5Var3 = (zr5) k22.a(parcel, zr5.CREATOR);
                String readString6 = parcel.readString();
                wk2 t46 = vk2.t4(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                k22.b(parcel);
                g2 = ((ClientApi) this).V2(Z7, zr5Var3, readString6, t46, readInt8);
                break;
            case 14:
                hw Z8 = hw.a.Z(parcel.readStrongBinder());
                wk2 t47 = vk2.t4(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                k22.b(parcel);
                g2 = ((ClientApi) this).P1(Z8, t47, readInt9);
                break;
            case 15:
                hw Z9 = hw.a.Z(parcel.readStrongBinder());
                wk2 t48 = vk2.t4(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                k22.b(parcel);
                g2 = ((ClientApi) this).d2(Z9, t48, readInt10);
                break;
            case 16:
                hw Z10 = hw.a.Z(parcel.readStrongBinder());
                wk2 t49 = vk2.t4(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
                    if (queryLocalInterface instanceof gh2) {
                        obj = (gh2) queryLocalInterface;
                    } else {
                        obj = new dh2(readStrongBinder);
                    }
                }
                k22.b(parcel);
                Context context2 = (Context) va0.c0(Z10);
                kn2 kn2Var = new kn2(q23.c(context2, t49, readInt11).c);
                context2.getClass();
                kn2Var.Q = context2;
                obj.getClass();
                kn2Var.R = obj;
                tv2.E(Context.class, (Context) kn2Var.Q);
                tv2.E(gh2.class, (gh2) kn2Var.R);
                g2 = (xs3) new n43((w33) kn2Var.P, (Context) kn2Var.Q, (gh2) kn2Var.R).e.c();
                break;
            case 17:
                hw Z11 = hw.a.Z(parcel.readStrongBinder());
                wk2 t410 = vk2.t4(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                k22.b(parcel);
                g2 = ((ClientApi) this).o2(Z11, t410, readInt12);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        k22.e(parcel2, g2);
        return true;
    }
}