package defpackage;

import android.os.Parcel;
import java.util.ArrayList;

/* renamed from: ci2  reason: default package */
public abstract class ci2 extends j22 implements di2 {
    public ci2() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            ArrayList createTypedArrayList = parcel.createTypedArrayList(vh2.CREATOR);
            k22.b(parcel);
            l2(createTypedArrayList);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}