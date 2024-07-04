package defpackage;

import android.os.Parcel;
import android.view.View;

/* renamed from: id2  reason: default package */
public abstract class id2 extends j22 {
    public id2() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                hw b = uv0.b(parcel, parcel);
                zl3 zl3Var = (zl3) this;
                synchronized (zl3Var) {
                    if (zl3Var.T != null) {
                        Object c0 = va0.c0(b);
                        if (!(c0 instanceof View)) {
                            sv2.g("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                        }
                        jl3 jl3Var = zl3Var.T;
                        View view = (View) c0;
                        synchronized (jl3Var) {
                            jl3Var.k.n(view);
                        }
                    }
                }
            } else {
                zl3 zl3Var2 = (zl3) this;
                synchronized (zl3Var2) {
                    jl3 jl3Var2 = zl3Var2.T;
                    if (jl3Var2 != null) {
                        jl3Var2.g(zl3Var2);
                        zl3Var2.T = null;
                    }
                }
            }
        } else {
            hw b2 = uv0.b(parcel, parcel);
            zl3 zl3Var3 = (zl3) this;
            synchronized (zl3Var3) {
                Object c02 = va0.c0(b2);
                if (!(c02 instanceof jl3)) {
                    sv2.g("Not an instance of InternalNativeAd. This is most likely a transient error");
                } else {
                    jl3 jl3Var3 = zl3Var3.T;
                    if (jl3Var3 != null) {
                        jl3Var3.g(zl3Var3);
                    }
                    jl3 jl3Var4 = (jl3) c02;
                    if (jl3Var4.m.d()) {
                        zl3Var3.T = jl3Var4;
                        jl3Var4.f(zl3Var3);
                        zl3Var3.T.e(zl3Var3.e());
                    } else {
                        sv2.d("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
                    }
                }
            }
        }
        parcel2.writeNoException();
        return true;
    }
}