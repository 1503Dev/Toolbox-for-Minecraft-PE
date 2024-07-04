package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: yo3  reason: default package */
public final class yo3 extends i22 implements mq3 {
    public yo3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // defpackage.mq3
    public final Bundle b() {
        Parcel Z = Z(A(), 5);
        Bundle bundle = (Bundle) k22.a(Z, Bundle.CREATOR);
        Z.recycle();
        return bundle;
    }

    @Override // defpackage.mq3
    public final fw5 e() {
        Parcel Z = Z(A(), 4);
        fw5 fw5Var = (fw5) k22.a(Z, fw5.CREATOR);
        Z.recycle();
        return fw5Var;
    }

    @Override // defpackage.mq3
    public final String f() {
        Parcel Z = Z(A(), 6);
        String readString = Z.readString();
        Z.recycle();
        return readString;
    }

    @Override // defpackage.mq3
    public final String g() {
        Parcel Z = Z(A(), 2);
        String readString = Z.readString();
        Z.recycle();
        return readString;
    }

    @Override // defpackage.mq3
    public final String h() {
        Parcel Z = Z(A(), 1);
        String readString = Z.readString();
        Z.recycle();
        return readString;
    }

    @Override // defpackage.mq3
    public final List j() {
        Parcel Z = Z(A(), 3);
        ArrayList createTypedArrayList = Z.createTypedArrayList(fw5.CREATOR);
        Z.recycle();
        return createTypedArrayList;
    }
}