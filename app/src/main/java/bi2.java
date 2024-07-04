package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* renamed from: bi2  reason: default package */
public final class bi2 extends i22 implements di2 {
    public bi2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // defpackage.di2
    public final void l2(List list) {
        Parcel A = A();
        A.writeTypedList(list);
        c0(A, 1);
    }
}