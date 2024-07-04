package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* renamed from: zo2  reason: default package */
public final class zo2 extends i22 implements bp2 {
    public zo2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // defpackage.bp2
    public final void D(String str) {
        Parcel A = A();
        A.writeString(str);
        c0(A, 2);
    }

    @Override // defpackage.bp2
    public final void Z1(List list) {
        Parcel A = A();
        A.writeTypedList(list);
        c0(A, 1);
    }
}