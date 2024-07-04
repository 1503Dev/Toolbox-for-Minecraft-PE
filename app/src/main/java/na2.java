package defpackage;

import android.os.Parcel;
import android.view.View;

/* renamed from: na2  reason: default package */
public abstract class na2 extends j22 {
    public na2() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        String str;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return false;
                        }
                        ((ma2) this).P.d();
                    } else {
                        ((ma2) this).P.c();
                    }
                } else {
                    hw b = uv0.b(parcel, parcel);
                    ma2 ma2Var = (ma2) this;
                    if (b != null) {
                        ma2Var.P.g((View) va0.c0(b));
                    }
                }
                parcel2.writeNoException();
                return true;
            }
            str = ((ma2) this).R;
        } else {
            str = ((ma2) this).Q;
        }
        parcel2.writeNoException();
        parcel2.writeString(str);
        return true;
    }
}