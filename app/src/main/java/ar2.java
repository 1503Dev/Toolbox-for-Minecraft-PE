package defpackage;

import android.os.Parcel;

/* renamed from: ar2  reason: default package */
public final class ar2 extends j22 implements cr2 {
    public final String P;
    public final int Q;

    public ar2(String str, int i) {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
        this.P = str;
        this.Q = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof ar2)) {
            ar2 ar2Var = (ar2) obj;
            if (wa0.a(this.P, ar2Var.P) && wa0.a(Integer.valueOf(this.Q), Integer.valueOf(ar2Var.Q))) {
                return true;
            }
        }
        return false;
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