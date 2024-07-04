package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.rv;

/* renamed from: fj1  reason: default package */
public final class fj1 extends f0 {
    public static final Parcelable.Creator<fj1> CREATOR = new gj1();
    public final int P;
    public final IBinder Q;
    public final gf R;
    public final boolean S;
    public final boolean T;

    public fj1(int i, IBinder iBinder, gf gfVar, boolean z, boolean z2) {
        this.P = i;
        this.Q = iBinder;
        this.R = gfVar;
        this.S = z;
        this.T = z2;
    }

    public final boolean equals(Object obj) {
        Object cx5Var;
        Object cx5Var2;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fj1)) {
            return false;
        }
        fj1 fj1Var = (fj1) obj;
        if (this.R.equals(fj1Var.R)) {
            IBinder iBinder = this.Q;
            Object obj2 = null;
            if (iBinder == null) {
                cx5Var = null;
            } else {
                int i = rv.a.P;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof rv) {
                    cx5Var = (rv) queryLocalInterface;
                } else {
                    cx5Var = new cx5(iBinder);
                }
            }
            IBinder iBinder2 = fj1Var.Q;
            if (iBinder2 != null) {
                int i2 = rv.a.P;
                IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface2 instanceof rv) {
                    cx5Var2 = (rv) queryLocalInterface2;
                } else {
                    cx5Var2 = new cx5(iBinder2);
                }
                obj2 = cx5Var2;
            }
            if (wa0.a(cx5Var, obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.g(parcel, 1, this.P);
        tv2.f(parcel, 2, this.Q);
        tv2.i(parcel, 3, this.R, i);
        tv2.a(parcel, 4, this.S);
        tv2.a(parcel, 5, this.T);
        tv2.A(parcel, s);
    }
}