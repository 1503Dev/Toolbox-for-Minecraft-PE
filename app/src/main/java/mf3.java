package defpackage;

import android.os.Parcel;

/* renamed from: mf3  reason: default package */
public abstract class mf3 extends j22 implements og3 {
    public mf3() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            k22.b(parcel);
            P3((tz3) k22.a(parcel, tz3.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}