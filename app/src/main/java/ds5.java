package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: ds5  reason: default package */
public final class ds5 extends pj1 {
    public ds5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final hw b2(va0 va0Var, String str, int i, va0 va0Var2) {
        Parcel Z = Z();
        lw2.b(Z, va0Var);
        Z.writeString(str);
        Z.writeInt(i);
        lw2.b(Z, va0Var2);
        return uv0.a(A(Z, 8));
    }

    public final hw c0(va0 va0Var, String str, int i) {
        Parcel Z = Z();
        lw2.b(Z, va0Var);
        Z.writeString(str);
        Z.writeInt(i);
        return uv0.a(A(Z, 2));
    }

    public final hw d3(va0 va0Var, String str, int i) {
        Parcel Z = Z();
        lw2.b(Z, va0Var);
        Z.writeString(str);
        Z.writeInt(i);
        return uv0.a(A(Z, 4));
    }

    public final hw n3(va0 va0Var, String str, boolean z, long j) {
        Parcel Z = Z();
        lw2.b(Z, va0Var);
        Z.writeString(str);
        Z.writeInt(z ? 1 : 0);
        Z.writeLong(j);
        return uv0.a(A(Z, 7));
    }
}