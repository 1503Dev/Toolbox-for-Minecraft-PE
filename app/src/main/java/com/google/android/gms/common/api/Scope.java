package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class Scope extends f0 implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new lj1();
    public final int P;
    public final String Q;

    public Scope() {
        throw null;
    }

    public Scope(int i, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.P = i;
            this.Q = str;
            return;
        }
        throw new IllegalArgumentException("scopeUri must not be null or empty");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.Q.equals(((Scope) obj).Q);
        }
        return false;
    }

    public final int hashCode() {
        return this.Q.hashCode();
    }

    public final String toString() {
        return this.Q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.g(parcel, 1, this.P);
        tv2.k(parcel, 2, this.Q);
        tv2.A(parcel, s);
    }
}