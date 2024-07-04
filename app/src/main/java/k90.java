package defpackage;

import android.content.Context;
import android.os.Build;

/* renamed from: k90  reason: default package */
public final class k90 extends of<l90> {
    public static final String e = y20.e("NetworkNotRoamingCtrlr");

    public k90(Context context, bw0 bw0Var) {
        super(l01.a(context, bw0Var).c);
    }

    @Override // defpackage.of
    public final boolean b(l71 l71Var) {
        if (l71Var.j.a == o90.NOT_ROAMING) {
            return true;
        }
        return false;
    }

    @Override // defpackage.of
    public final boolean c(l90 l90Var) {
        l90 l90Var2 = l90Var;
        boolean z = true;
        if (Build.VERSION.SDK_INT < 24) {
            y20.c().a(e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
            return !l90Var2.a;
        }
        if (l90Var2.a && l90Var2.d) {
            z = false;
        }
        return z;
    }
}