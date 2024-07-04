package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: dt5  reason: default package */
public final class dt5 extends pj1 {
    public dt5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final hw b2(va0 va0Var, String str, int i, va0 va0Var2) {
        Parcel Z = Z();
        lw2.b(Z, va0Var);
        Z.writeString(str);
        Z.writeInt(i);
        lw2.b(Z, va0Var2);
        return uv0.a(A(Z, 3));
    }

    public final hw c0(va0 va0Var, String str, int i, va0 va0Var2) {
        Parcel Z = Z();
        lw2.b(Z, va0Var);
        Z.writeString(str);
        Z.writeInt(i);
        lw2.b(Z, va0Var2);
        return uv0.a(A(Z, 2));
    }
}