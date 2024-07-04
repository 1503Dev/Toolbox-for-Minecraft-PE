package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: bk4  reason: default package */
public final class bk4 extends f0 {
    public static final Parcelable.Creator<bk4> CREATOR = new ck4();
    @Nullable
    public final Context P;
    public final int Q;
    public final ak4 R;
    public final int S;
    public final int T;
    public final int U;
    public final String V;
    public final int W;
    public final int X;
    public final int Y;

    public bk4(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        ak4[] values = ak4.values();
        this.P = null;
        this.Q = i;
        this.R = values[i];
        this.S = i2;
        this.T = i3;
        this.U = i4;
        this.V = str;
        this.W = i5;
        this.Y = new int[]{1, 2, 3}[i5];
        this.X = i6;
        int i7 = new int[]{1}[i6];
    }

    public bk4(@Nullable Context context, ak4 ak4Var, int i, int i2, int i3, String str, String str2, String str3) {
        ak4.values();
        this.P = context;
        this.Q = ak4Var.ordinal();
        this.R = ak4Var;
        this.S = i;
        this.T = i2;
        this.U = i3;
        this.V = str;
        int i4 = 2;
        if ("oldest".equals(str2)) {
            i4 = 1;
        } else if (!"lru".equals(str2) && "lfu".equals(str2)) {
            i4 = 3;
        }
        this.Y = i4;
        this.W = i4 - 1;
        "onAdClosed".equals(str3);
        this.X = 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.g(parcel, 1, this.Q);
        tv2.g(parcel, 2, this.S);
        tv2.g(parcel, 3, this.T);
        tv2.g(parcel, 4, this.U);
        tv2.k(parcel, 5, this.V);
        tv2.g(parcel, 6, this.W);
        tv2.g(parcel, 7, this.X);
        tv2.A(parcel, s);
    }
}