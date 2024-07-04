package defpackage;

import android.content.Context;
import android.os.Bundle;

/* renamed from: t42  reason: default package */
public final class t42 {
    public final km5 a;
    public final xk5 b;
    public final ic4 c;
    public final we2 d;
    public final mo2 e;
    public jp2 f;

    public t42(km5 km5Var, xk5 xk5Var, ic4 ic4Var, we2 we2Var, mo2 mo2Var) {
        this.a = km5Var;
        this.b = xk5Var;
        this.c = ic4Var;
        this.d = we2Var;
        this.e = mo2Var;
    }

    public static void a(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        n62 n62Var = n62.f;
        mv2 mv2Var = n62Var.a;
        String str2 = n62Var.d.P;
        mv2Var.getClass();
        mv2.j(context, str2, bundle, new nj2(1, mv2Var));
    }
}