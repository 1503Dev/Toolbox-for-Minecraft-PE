package defpackage;

import android.os.Parcel;

/* renamed from: xw2  reason: default package */
public abstract class xw2 extends j22 implements px2 {
    public static final /* synthetic */ int P = 0;

    public xw2() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            k22.b(parcel);
            ((z22) this).A2(readString, readString2);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}