package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: up2  reason: default package */
public final class up2 extends f0 {
    public static final Parcelable.Creator<up2> CREATOR = new vp2();
    public final boolean P;
    public final List Q;

    public up2(List list, boolean z) {
        this.P = z;
        this.Q = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.a(parcel, 2, this.P);
        tv2.m(parcel, 3, this.Q);
        tv2.A(parcel, s);
    }
}