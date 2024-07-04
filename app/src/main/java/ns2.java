package defpackage;

import android.os.Parcel;

/* renamed from: ns2  reason: default package */
public final class ns2 extends j22 implements tr2 {
    public final String P;
    public final int Q;

    public ns2(String str, int i) {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        this.P = str;
        this.Q = i;
    }

    @Override // defpackage.tr2
    public final int b() {
        return this.Q;
    }

    @Override // defpackage.tr2
    public final String e() {
        return this.P;
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int i2 = this.Q;
            parcel2.writeNoException();
            parcel2.writeInt(i2);
            return true;
        }
        String str = this.P;
        parcel2.writeNoException();
        parcel2.writeString(str);
        return true;
    }
}