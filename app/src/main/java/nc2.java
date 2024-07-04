package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: nc2  reason: default package */
public final class nc2 extends f0 {
    public static final Parcelable.Creator<nc2> CREATOR = new rc2();
    public final int P;
    public final boolean Q;
    public final int R;
    public final boolean S;
    public final int T;
    public final zq4 U;
    public final boolean V;
    public final int W;
    public final int X;
    public final boolean Y;

    public nc2(int i, boolean z, int i2, boolean z2, int i3, zq4 zq4Var, boolean z3, int i4, int i5, boolean z4) {
        this.P = i;
        this.Q = z;
        this.R = i2;
        this.S = z2;
        this.T = i3;
        this.U = zq4Var;
        this.V = z3;
        this.W = i4;
        this.Y = z4;
        this.X = i5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nc2(e70 e70Var) {
        this(4, r2, r3, r4, r5, r0 != null ? new zq4(r0) : null, e70Var.g, e70Var.c, 0, false);
        boolean z = e70Var.a;
        int i = e70Var.b;
        boolean z2 = e70Var.d;
        int i2 = e70Var.e;
        q31 q31Var = e70Var.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.g(parcel, 1, this.P);
        tv2.a(parcel, 2, this.Q);
        tv2.g(parcel, 3, this.R);
        tv2.a(parcel, 4, this.S);
        tv2.g(parcel, 5, this.T);
        tv2.i(parcel, 6, this.U, i);
        tv2.a(parcel, 7, this.V);
        tv2.g(parcel, 8, this.W);
        tv2.g(parcel, 9, this.X);
        tv2.a(parcel, 10, this.Y);
        tv2.A(parcel, s);
    }
}