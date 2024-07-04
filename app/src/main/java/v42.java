package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* renamed from: v42  reason: default package */
public final class v42 extends f0 {
    public static final Parcelable.Creator<v42> CREATOR = new w42();
    public ParcelFileDescriptor P;
    public final boolean Q;
    public final boolean R;
    public final long S;
    public final boolean T;

    public v42() {
        this(null, false, false, 0L, false);
    }

    public v42(ParcelFileDescriptor parcelFileDescriptor, boolean z, boolean z2, long j, boolean z3) {
        this.P = parcelFileDescriptor;
        this.Q = z;
        this.R = z2;
        this.S = j;
        this.T = z3;
    }

    public final synchronized ParcelFileDescriptor.AutoCloseInputStream c() {
        if (this.P == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.P);
        this.P = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean d() {
        return this.P != null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ParcelFileDescriptor parcelFileDescriptor;
        boolean z;
        boolean z2;
        long j;
        boolean z3;
        int s = tv2.s(parcel, 20293);
        synchronized (this) {
            parcelFileDescriptor = this.P;
        }
        tv2.i(parcel, 2, parcelFileDescriptor, i);
        synchronized (this) {
            z = this.Q;
        }
        tv2.a(parcel, 3, z);
        synchronized (this) {
            z2 = this.R;
        }
        tv2.a(parcel, 4, z2);
        synchronized (this) {
            j = this.S;
        }
        tv2.h(parcel, 5, j);
        synchronized (this) {
            z3 = this.T;
        }
        tv2.a(parcel, 6, z3);
        tv2.A(parcel, s);
    }
}