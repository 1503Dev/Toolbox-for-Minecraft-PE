package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;

/* renamed from: di1  reason: default package */
public final class di1 extends f0 implements tl0 {
    public static final Parcelable.Creator<di1> CREATOR = new gi1();
    public final List<String> P;
    public final String Q;

    public di1(String str, ArrayList arrayList) {
        this.P = arrayList;
        this.Q = str;
    }

    @Override // defpackage.tl0
    public final Status a() {
        return this.Q != null ? Status.U : Status.V;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.m(parcel, 1, this.P);
        tv2.k(parcel, 2, this.Q);
        tv2.A(parcel, s);
    }
}