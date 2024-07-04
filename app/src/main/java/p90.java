package defpackage;

import android.content.Context;
import android.os.Build;

/* renamed from: p90  reason: default package */
public final class p90 extends of<l90> {
    public p90(Context context, bw0 bw0Var) {
        super(l01.a(context, bw0Var).c);
    }

    @Override // defpackage.of
    public final boolean b(l71 l71Var) {
        o90 o90Var = l71Var.j.a;
        if (o90Var != o90.UNMETERED && (Build.VERSION.SDK_INT < 30 || o90Var != o90.TEMPORARILY_UNMETERED)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.of
    public final boolean c(l90 l90Var) {
        l90 l90Var2 = l90Var;
        if (l90Var2.a && !l90Var2.c) {
            return false;
        }
        return true;
    }
}