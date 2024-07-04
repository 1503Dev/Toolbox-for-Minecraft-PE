package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: k82  reason: default package */
public class k82 extends Binder implements IInterface {
    public k82() {
        attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Status createFromParcel;
        ew2 createFromParcel2;
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        oz3 oz3Var = (oz3) this;
        boolean z = false;
        if (i == 1) {
            Parcelable.Creator<Status> creator = Status.CREATOR;
            int i3 = kw2.a;
            z6 z6Var = null;
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = creator.createFromParcel(parcel);
            }
            Status status = createFromParcel;
            Parcelable.Creator<ew2> creator2 = ew2.CREATOR;
            if (parcel.readInt() == 0) {
                createFromParcel2 = null;
            } else {
                createFromParcel2 = creator2.createFromParcel(parcel);
            }
            ew2 ew2Var = createFromParcel2;
            dq5 dq5Var = (dq5) oz3Var;
            if (ew2Var != null) {
                z6Var = new z6(ew2Var.P, ew2Var.Q);
            }
            aw0 aw0Var = dq5Var.P;
            if (status.Q <= 0) {
                z = true;
            }
            if (z) {
                aw0Var.a.n(z6Var);
                return true;
            }
            aw0Var.a.m(new m4(status));
            return true;
        }
        return false;
    }
}