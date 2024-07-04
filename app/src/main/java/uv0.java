package defpackage;

import android.os.Parcel;
import defpackage.hw;
import defpackage.wv0;

/* renamed from: uv0  reason: default package */
public final /* synthetic */ class uv0 implements wv0.b {
    public static hw a(Parcel parcel) {
        hw Z = hw.a.Z(parcel.readStrongBinder());
        parcel.recycle();
        return Z;
    }

    public static hw b(Parcel parcel, Parcel parcel2) {
        hw Z = hw.a.Z(parcel.readStrongBinder());
        k22.b(parcel2);
        return Z;
    }

    @Override // defpackage.wv0.b
    public tv0 get() {
        return new yx();
    }
}