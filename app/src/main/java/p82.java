package defpackage;

import android.os.Parcel;

/* renamed from: p82  reason: default package */
public final class p82 extends j22 implements qc2 {
    public final vj1 P;

    public p82(vj1 vj1Var) {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
        this.P = vj1Var;
    }

    @Override // defpackage.qc2
    public final void c() {
        this.P.J();
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            c();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}