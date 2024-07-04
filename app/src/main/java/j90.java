package defpackage;

import android.content.Context;
import android.os.Build;

/* renamed from: j90  reason: default package */
public final class j90 extends of<l90> {
    public static final String e = y20.e("NetworkMeteredCtrlr");

    public j90(Context context, bw0 bw0Var) {
        super(l01.a(context, bw0Var).c);
    }

    @Override // defpackage.of
    public final boolean b(l71 l71Var) {
        if (l71Var.j.a == o90.METERED) {
            return true;
        }
        return false;
    }

    @Override // defpackage.of
    public final boolean c(l90 l90Var) {
        l90 l90Var2 = l90Var;
        boolean z = true;
        if (Build.VERSION.SDK_INT < 26) {
            y20.c().a(e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
            return !l90Var2.a;
        }
        if (l90Var2.a && l90Var2.c) {
            z = false;
        }
        return z;
    }
}