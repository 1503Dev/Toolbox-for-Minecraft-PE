package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import defpackage.hw;

/* renamed from: ii2  reason: default package */
public abstract class ii2 extends j22 implements ji2 {
    public ii2() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        ll3 ll3Var;
        IInterface iInterface = null;
        iInterface = null;
        iInterface = null;
        iInterface = null;
        li2 li2Var = null;
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i != 6) {
                        if (i != 7) {
                            return false;
                        }
                        so3 so3Var = (so3) this;
                        uf0.b("#008 Must be called on the main UI thread.");
                        if (so3Var.S) {
                            sv2.d("getVideoController: Instream ad should not be used after destroyed");
                        } else {
                            jl3 jl3Var = so3Var.R;
                            if (jl3Var != null && (ll3Var = jl3Var.B) != null) {
                                synchronized (ll3Var) {
                                    iInterface = ll3Var.a;
                                }
                            }
                        }
                    } else {
                        hw b = uv0.b(parcel, parcel);
                        uf0.b("#008 Must be called on the main UI thread.");
                        ((so3) this).t4(b, new ro3());
                    }
                } else {
                    hw Z = hw.a.Z(parcel.readStrongBinder());
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder != null) {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                        if (queryLocalInterface instanceof li2) {
                            li2Var = (li2) queryLocalInterface;
                        } else {
                            li2Var = new ki2(readStrongBinder);
                        }
                    }
                    k22.b(parcel);
                    ((so3) this).t4(Z, li2Var);
                }
            } else {
                so3 so3Var2 = (so3) this;
                uf0.b("#008 Must be called on the main UI thread.");
                View view = so3Var2.P;
                if (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(so3Var2.P);
                    }
                }
                jl3 jl3Var2 = so3Var2.R;
                if (jl3Var2 != null) {
                    jl3Var2.q();
                }
                so3Var2.R = null;
                so3Var2.P = null;
                so3Var2.Q = null;
                so3Var2.S = true;
            }
            parcel2.writeNoException();
            return true;
        }
        so3 so3Var3 = (so3) this;
        uf0.b("#008 Must be called on the main UI thread.");
        if (so3Var3.S) {
            sv2.d("getVideoController: Instream ad should not be used after destroyed");
        } else {
            iInterface = so3Var3.Q;
        }
        parcel2.writeNoException();
        k22.e(parcel2, iInterface);
        return true;
    }
}