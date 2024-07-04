package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import javax.annotation.Nullable;

/* renamed from: gw0  reason: default package */
public final class gw0 extends f0 {
    public static final Parcelable.Creator<gw0> CREATOR = new ig1();
    public final int P;
    @Nullable
    public List<e60> Q;

    public gw0(int i, @Nullable List<e60> list) {
        this.P = i;
        this.Q = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.g(parcel, 1, this.P);
        tv2.p(parcel, 2, this.Q);
        tv2.A(parcel, s);
    }
}