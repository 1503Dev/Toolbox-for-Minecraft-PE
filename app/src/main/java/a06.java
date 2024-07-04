package defpackage;

import android.os.Parcel;

/* renamed from: a06  reason: default package */
public abstract class a06 extends l82 implements z06 {
    public a06() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override // defpackage.l82
    public final boolean A(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int i2 = ((al5) this).P;
            parcel2.writeNoException();
            parcel2.writeInt(i2);
        } else {
            va0 i3 = ((al5) this).i();
            parcel2.writeNoException();
            lw2.b(parcel2, i3);
        }
        return true;
    }
}