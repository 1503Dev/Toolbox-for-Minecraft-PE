package defpackage;

import android.os.ParcelFileDescriptor;

/* renamed from: vv3  reason: default package */
public final class vv3 extends jq2 {
    public final /* synthetic */ wv3 P;

    public vv3(wv3 wv3Var) {
        this.P = wv3Var;
    }

    @Override // defpackage.kq2
    public final void T(ParcelFileDescriptor parcelFileDescriptor) {
        this.P.a.a(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }

    @Override // defpackage.kq2
    public final void n0(h72 h72Var) {
        bx2 bx2Var = this.P.a;
        h72Var.getClass();
        bx2Var.c(new o62(h72Var.P, h72Var.Q));
    }
}