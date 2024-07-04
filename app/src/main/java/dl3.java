package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: dl3  reason: default package */
public final class dl3 extends xc2 {
    public final nl3 P;
    public hw Q;

    public dl3(nl3 nl3Var) {
        this.P = nl3Var;
    }

    public static float t4(hw hwVar) {
        Drawable drawable;
        if (hwVar == null || (drawable = (Drawable) va0.c0(hwVar)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // defpackage.yc2
    public final hw g() {
        hw hwVar = this.Q;
        if (hwVar != null) {
            return hwVar;
        }
        ad2 h = this.P.h();
        if (h == null) {
            return null;
        }
        return h.e();
    }
}