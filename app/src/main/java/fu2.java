package defpackage;

import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import defpackage.hw;
import java.util.ArrayList;

/* renamed from: fu2  reason: default package */
public abstract class fu2 extends j22 implements gu2 {
    public static final /* synthetic */ int P = 0;

    public fu2() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        dz4 b;
        du2 du2Var = null;
        View view = null;
        switch (i) {
            case 1:
                hw Z = hw.a.Z(parcel.readStrongBinder());
                ku2 ku2Var = (ku2) k22.a(parcel, ku2.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    if (queryLocalInterface instanceof du2) {
                        du2Var = (du2) queryLocalInterface;
                    } else {
                        du2Var = new bu2(readStrongBinder);
                    }
                }
                k22.b(parcel);
                ((dk1) this).u3(Z, ku2Var, du2Var);
                parcel2.writeNoException();
                break;
            case 2:
                hw b2 = uv0.b(parcel, parcel);
                dk1 dk1Var = (dk1) this;
                if (((Boolean) w82.d.c.a(x92.w6)).booleanValue()) {
                    MotionEvent motionEvent = (MotionEvent) va0.c0(b2);
                    ep2 ep2Var = dk1Var.X;
                    if (ep2Var != null) {
                        view = ep2Var.P;
                    }
                    int[] iArr = new int[2];
                    if (view != null) {
                        view.getLocationOnScreen(iArr);
                    }
                    dk1Var.Y = new Point(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
                    if (motionEvent.getAction() == 0) {
                        dk1Var.Z = dk1Var.Y;
                    }
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    Point point = dk1Var.Y;
                    obtain.setLocation(point.x, point.y);
                    dk1Var.S.b.b(obtain);
                    obtain.recycle();
                }
                parcel2.writeNoException();
                break;
            case 3:
                hw.a.Z(parcel.readStrongBinder());
            case 4:
                hw.a.Z(parcel.readStrongBinder());
                k22.b(parcel);
                parcel2.writeNoException();
                k22.e(parcel2, null);
                break;
            case 5:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                hw Z2 = hw.a.Z(parcel.readStrongBinder());
                bp2 t4 = ap2.t4(parcel.readStrongBinder());
                k22.b(parcel);
                ((dk1) this).x4(createTypedArrayList, Z2, t4, false);
                parcel2.writeNoException();
                break;
            case 6:
                ArrayList createTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                hw Z3 = hw.a.Z(parcel.readStrongBinder());
                bp2 t42 = ap2.t4(parcel.readStrongBinder());
                k22.b(parcel);
                ((dk1) this).w4(createTypedArrayList2, Z3, t42, false);
                parcel2.writeNoException();
                break;
            case 7:
                k22.b(parcel);
                dk1 dk1Var2 = (dk1) this;
                dk1Var2.X = (ep2) k22.a(parcel, ep2.CREATOR);
                dk1Var2.T.b(1);
                parcel2.writeNoException();
                break;
            case 8:
                hw b3 = uv0.b(parcel, parcel);
                dk1 dk1Var3 = (dk1) this;
                l92 l92Var = x92.W7;
                w82 w82Var = w82.d;
                if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                    if (Build.VERSION.SDK_INT < 21) {
                        sv2.g("Not registering the webview because the Android API level is lower than Lollopop which has security risks on webviews.");
                    } else {
                        if (((Boolean) w82Var.c.a(x92.X7)).booleanValue()) {
                            if (!((Boolean) w82Var.c.a(x92.a8)).booleanValue()) {
                                if (((Boolean) w82Var.c.a(x92.F8)).booleanValue()) {
                                    b = zw4.D(new eg3(1, dk1Var3), zw2.a);
                                } else {
                                    b = dk1Var3.u4(dk1Var3.R, null, "BANNER", null, null).b();
                                }
                                zw4.J(b, new y06(dk1Var3), dk1Var3.Q.a());
                            }
                        }
                        WebView webView = (WebView) va0.c0(b3);
                        if (webView == null) {
                            sv2.d("The webView cannot be null.");
                        } else if (dk1Var3.a0.contains(webView)) {
                            sv2.f("This webview has already been registered.");
                        } else {
                            dk1Var3.a0.add(webView);
                            webView.addJavascriptInterface(new xv0(webView, dk1Var3.S, dk1Var3.c0, dk1Var3.d0), "gmaSdk");
                        }
                    }
                }
                parcel2.writeNoException();
                break;
            case 9:
                ArrayList createTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                hw Z4 = hw.a.Z(parcel.readStrongBinder());
                bp2 t43 = ap2.t4(parcel.readStrongBinder());
                k22.b(parcel);
                ((dk1) this).x4(createTypedArrayList3, Z4, t43, true);
                parcel2.writeNoException();
                break;
            case 10:
                ArrayList createTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                hw Z5 = hw.a.Z(parcel.readStrongBinder());
                bp2 t44 = ap2.t4(parcel.readStrongBinder());
                k22.b(parcel);
                ((dk1) this).w4(createTypedArrayList4, Z5, t44, true);
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}