package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.wa0;
import java.util.Arrays;

/* renamed from: wp  reason: default package */
public final class wp extends f0 {
    public static final Parcelable.Creator<wp> CREATOR = new fw2();
    public final String P;
    @Deprecated
    public final int Q;
    public final long R;

    public wp(long j, int i, String str) {
        this.P = str;
        this.Q = i;
        this.R = j;
    }

    public wp(String str) {
        this.P = str;
        this.R = 1L;
        this.Q = -1;
    }

    public final long c() {
        long j = this.R;
        return j == -1 ? this.Q : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wp) {
            wp wpVar = (wp) obj;
            String str = this.P;
            if (((str != null && str.equals(wpVar.P)) || (this.P == null && wpVar.P == null)) && c() == wpVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.P, Long.valueOf(c())});
    }

    public final String toString() {
        wa0.a aVar = new wa0.a(this);
        aVar.a("name", this.P);
        aVar.a("version", Long.valueOf(c()));
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.k(parcel, 1, this.P);
        tv2.g(parcel, 2, this.Q);
        tv2.h(parcel, 3, c());
        tv2.A(parcel, s);
    }
}