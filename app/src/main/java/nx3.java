package defpackage;

import android.os.ParcelFileDescriptor;

/* renamed from: nx3  reason: default package */
public final class nx3 extends gq2 {
    public final /* synthetic */ ox3 P;

    public nx3(ox3 ox3Var) {
        this.P = ox3Var;
    }

    @Override // defpackage.hq2
    public final void T(ParcelFileDescriptor parcelFileDescriptor) {
        this.P.a.a(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }

    @Override // defpackage.hq2
    public final void n0(h72 h72Var) {
        bx2 bx2Var = this.P.a;
        h72Var.getClass();
        bx2Var.c(new o62(h72Var.P, h72Var.Q));
    }
}