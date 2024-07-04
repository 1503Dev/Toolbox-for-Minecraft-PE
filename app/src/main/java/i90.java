package defpackage;

import android.content.Context;
import android.os.Build;

/* renamed from: i90  reason: default package */
public final class i90 extends of<l90> {
    public i90(Context context, bw0 bw0Var) {
        super(l01.a(context, bw0Var).c);
    }

    @Override // defpackage.of
    public final boolean b(l71 l71Var) {
        if (l71Var.j.a == o90.CONNECTED) {
            return true;
        }
        return false;
    }

    @Override // defpackage.of
    public final boolean c(l90 l90Var) {
        l90 l90Var2 = l90Var;
        if (Build.VERSION.SDK_INT >= 26) {
            if (!l90Var2.a || !l90Var2.b) {
                return true;
            }
            return false;
        }
        return true ^ l90Var2.a;
    }
}