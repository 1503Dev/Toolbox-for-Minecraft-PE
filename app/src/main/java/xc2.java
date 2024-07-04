package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: xc2  reason: default package */
public abstract class xc2 extends j22 implements yc2 {
    public xc2() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        float f;
        float f2;
        float f3 = 0.0f;
        int i2 = 0;
        cs3 cs3Var = null;
        ee2 ee2Var = null;
        switch (i) {
            case 2:
                dl3 dl3Var = (dl3) this;
                if (((Boolean) w82.d.c.a(x92.i5)).booleanValue()) {
                    nl3 nl3Var = dl3Var.P;
                    synchronized (nl3Var) {
                        f = nl3Var.w;
                    }
                    if (f != 0.0f) {
                        nl3 nl3Var2 = dl3Var.P;
                        synchronized (nl3Var2) {
                            f3 = nl3Var2.w;
                        }
                    } else if (dl3Var.P.g() != null) {
                        try {
                            f3 = dl3Var.P.g().b();
                        } catch (RemoteException e) {
                            sv2.e("Remote exception getting video controller aspect ratio.", e);
                        }
                    } else {
                        hw hwVar = dl3Var.Q;
                        if (hwVar != null) {
                            f3 = dl3.t4(hwVar);
                        } else {
                            ad2 h = dl3Var.P.h();
                            if (h != null) {
                                if (h.i() != -1 && h.d() != -1) {
                                    f2 = h.i() / h.d();
                                } else {
                                    f2 = 0.0f;
                                }
                                f3 = f2 == 0.0f ? dl3.t4(h.e()) : f2;
                            }
                        }
                    }
                }
                parcel2.writeNoException();
                parcel2.writeFloat(f3);
                break;
            case 3:
                ((dl3) this).Q = uv0.b(parcel, parcel);
                parcel2.writeNoException();
                break;
            case 4:
                hw g = ((dl3) this).g();
                parcel2.writeNoException();
                k22.e(parcel2, g);
                break;
            case 5:
                dl3 dl3Var2 = (dl3) this;
                if (((Boolean) w82.d.c.a(x92.j5)).booleanValue() && dl3Var2.P.g() != null) {
                    f3 = dl3Var2.P.g().h();
                }
                parcel2.writeNoException();
                parcel2.writeFloat(f3);
                break;
            case 6:
                dl3 dl3Var3 = (dl3) this;
                if (((Boolean) w82.d.c.a(x92.j5)).booleanValue() && dl3Var3.P.g() != null) {
                    f3 = dl3Var3.P.g().e();
                }
                parcel2.writeNoException();
                parcel2.writeFloat(f3);
                break;
            case 7:
                dl3 dl3Var4 = (dl3) this;
                if (((Boolean) w82.d.c.a(x92.j5)).booleanValue()) {
                    cs3Var = dl3Var4.P.g();
                }
                parcel2.writeNoException();
                k22.e(parcel2, cs3Var);
                break;
            case 8:
                dl3 dl3Var5 = (dl3) this;
                if (((Boolean) w82.d.c.a(x92.j5)).booleanValue() && dl3Var5.P.g() != null) {
                    i2 = 1;
                }
                parcel2.writeNoException();
                ClassLoader classLoader = k22.a;
                parcel2.writeInt(i2);
                break;
            case 9:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    if (queryLocalInterface instanceof ee2) {
                        ee2Var = (ee2) queryLocalInterface;
                    } else {
                        ee2Var = new ee2(readStrongBinder);
                    }
                }
                k22.b(parcel);
                dl3 dl3Var6 = (dl3) this;
                if (((Boolean) w82.d.c.a(x92.j5)).booleanValue() && (dl3Var6.P.g() instanceof q13)) {
                    q13 q13Var = (q13) dl3Var6.P.g();
                    synchronized (q13Var.Q) {
                        q13Var.c0 = ee2Var;
                    }
                }
                parcel2.writeNoException();
                break;
            case 10:
                dl3 dl3Var7 = (dl3) this;
                if (((Boolean) w82.d.c.a(x92.j5)).booleanValue()) {
                    nl3 nl3Var3 = dl3Var7.P;
                    synchronized (nl3Var3) {
                        if (nl3Var3.j != null) {
                            i2 = 1;
                        }
                    }
                }
                parcel2.writeNoException();
                ClassLoader classLoader2 = k22.a;
                parcel2.writeInt(i2);
                break;
            default:
                return false;
        }
        return true;
    }
}