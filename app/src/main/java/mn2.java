package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: mn2  reason: default package */
public final class mn2 extends f0 {
    public static final Parcelable.Creator<mn2> CREATOR = new nn2();
    public final int P;
    public final int Q;
    public final int R;

    public mn2(int i, int i2, int i3) {
        this.P = i;
        this.Q = i2;
        this.R = i3;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof mn2)) {
            mn2 mn2Var = (mn2) obj;
            if (mn2Var.R == this.R && mn2Var.Q == this.Q && mn2Var.P == this.P) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.P, this.Q, this.R});
    }

    public final String toString() {
        int i = this.P;
        int i2 = this.Q;
        int i3 = this.R;
        return i + "." + i2 + "." + i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.g(parcel, 1, this.P);
        tv2.g(parcel, 2, this.Q);
        tv2.g(parcel, 3, this.R);
        tv2.A(parcel, s);
    }
}