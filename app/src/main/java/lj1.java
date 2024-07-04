package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* renamed from: lj1  reason: default package */
public final class lj1 implements Parcelable.Creator<Scope> {
    @Override // android.os.Parcelable.Creator
    public final Scope createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    in0.n(parcel, readInt);
                } else {
                    str = in0.d(parcel, readInt);
                }
            } else {
                i = in0.k(parcel, readInt);
            }
        }
        in0.h(parcel, o);
        return new Scope(i, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Scope[] newArray(int i) {
        return new Scope[i];
    }
}