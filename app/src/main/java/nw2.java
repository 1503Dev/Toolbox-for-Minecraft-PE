package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: nw2  reason: default package */
public final class nw2 extends bk5 implements pz3 {
    public nw2(IBinder iBinder) {
        super(iBinder);
    }

    @Override // defpackage.pz3
    public final Bundle I1(String str, String str2, Bundle bundle) {
        Parcel A = bk5.A();
        A.writeInt(3);
        A.writeString(str);
        A.writeString(str2);
        int i = rl5.a;
        A.writeInt(1);
        bundle.writeToParcel(A, 0);
        Parcel Z = Z(A, 2);
        Bundle bundle2 = (Bundle) rl5.a(Z, Bundle.CREATOR);
        Z.recycle();
        return bundle2;
    }

    @Override // defpackage.pz3
    public final Bundle T0(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel A = bk5.A();
        A.writeInt(i);
        A.writeString(str);
        A.writeString(str2);
        A.writeString(str3);
        A.writeString(null);
        int i2 = rl5.a;
        A.writeInt(1);
        bundle.writeToParcel(A, 0);
        Parcel Z = Z(A, 8);
        Bundle bundle2 = (Bundle) rl5.a(Z, Bundle.CREATOR);
        Z.recycle();
        return bundle2;
    }

    @Override // defpackage.pz3
    public final Bundle X0(String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel A = bk5.A();
        A.writeInt(10);
        A.writeString(str);
        A.writeString(str2);
        int i = rl5.a;
        A.writeInt(1);
        bundle.writeToParcel(A, 0);
        A.writeInt(1);
        bundle2.writeToParcel(A, 0);
        Parcel Z = Z(A, 901);
        Bundle bundle3 = (Bundle) rl5.a(Z, Bundle.CREATOR);
        Z.recycle();
        return bundle3;
    }

    @Override // defpackage.pz3
    public final int a3(int i, String str, String str2, Bundle bundle) {
        Parcel A = bk5.A();
        A.writeInt(i);
        A.writeString(str);
        A.writeString(str2);
        int i2 = rl5.a;
        A.writeInt(1);
        bundle.writeToParcel(A, 0);
        Parcel Z = Z(A, 10);
        int readInt = Z.readInt();
        Z.recycle();
        return readInt;
    }

    @Override // defpackage.pz3
    public final Bundle m4(String str, String str2, String str3) {
        Parcel A = bk5.A();
        A.writeInt(3);
        A.writeString(str);
        A.writeString(str2);
        A.writeString(str3);
        Parcel Z = Z(A, 4);
        Bundle bundle = (Bundle) rl5.a(Z, Bundle.CREATOR);
        Z.recycle();
        return bundle;
    }

    @Override // defpackage.pz3
    public final int q1(String str, String str2, int i) {
        Parcel A = bk5.A();
        A.writeInt(i);
        A.writeString(str);
        A.writeString(str2);
        Parcel Z = Z(A, 1);
        int readInt = Z.readInt();
        Z.recycle();
        return readInt;
    }

    @Override // defpackage.pz3
    public final Bundle r3(String str, String str2, String str3) {
        Parcel A = bk5.A();
        A.writeInt(3);
        A.writeString(str);
        A.writeString(str2);
        A.writeString(str3);
        A.writeString(null);
        Parcel Z = Z(A, 3);
        Bundle bundle = (Bundle) rl5.a(Z, Bundle.CREATOR);
        Z.recycle();
        return bundle;
    }

    @Override // defpackage.pz3
    public final Bundle v3(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel A = bk5.A();
        A.writeInt(i);
        A.writeString(str);
        A.writeString(str2);
        A.writeString(str3);
        int i2 = rl5.a;
        A.writeInt(1);
        bundle.writeToParcel(A, 0);
        Parcel Z = Z(A, 11);
        Bundle bundle2 = (Bundle) rl5.a(Z, Bundle.CREATOR);
        Z.recycle();
        return bundle2;
    }
}