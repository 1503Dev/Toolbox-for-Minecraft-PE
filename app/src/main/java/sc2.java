package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;

/* renamed from: sc2  reason: default package */
public final class sc2 extends i22 implements uc2 {
    public sc2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // defpackage.uc2
    public final ArrayList f() {
        Parcel Z = Z(A(), 3);
        ArrayList readArrayList = Z.readArrayList(k22.a);
        Z.recycle();
        return readArrayList;
    }

    @Override // defpackage.uc2
    public final String h() {
        Parcel Z = Z(A(), 2);
        String readString = Z.readString();
        Z.recycle();
        return readString;
    }
}