package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: r53  reason: default package */
public final class r53 extends i22 implements q73 {
    public r53(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // defpackage.q73
    public final void I2(mm4 mm4Var) {
        Parcel A = A();
        k22.c(A, mm4Var);
        c0(A, 14);
    }

    @Override // defpackage.q73
    public final void O0(String str) {
        Parcel A = A();
        A.writeString(str);
        c0(A, 18);
    }

    @Override // defpackage.q73
    public final void Q1(di2 di2Var) {
        Parcel A = A();
        k22.e(A, di2Var);
        c0(A, 12);
    }

    @Override // defpackage.q73
    public final void f2(hw hwVar, String str) {
        Parcel A = A();
        A.writeString(null);
        k22.e(A, hwVar);
        c0(A, 6);
    }

    @Override // defpackage.q73
    public final List h() {
        Parcel Z = Z(A(), 13);
        ArrayList createTypedArrayList = Z.createTypedArrayList(vh2.CREATOR);
        Z.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.q73
    public final void i2(wk2 wk2Var) {
        Parcel A = A();
        k22.e(A, wk2Var);
        c0(A, 11);
    }

    @Override // defpackage.q73
    public final void l() {
        c0(A(), 1);
    }
}