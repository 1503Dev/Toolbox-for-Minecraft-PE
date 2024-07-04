package defpackage;

import android.content.Context;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: zj2  reason: default package */
public final class zj2 {
    public static final zf b;
    public final rj2 a;

    static {
        new p5();
        b = new zf();
    }

    public zj2(Context context, xv2 xv2Var, String str, @Nullable rm4 rm4Var) {
        this.a = new rj2(context, xv2Var, str, rm4Var);
    }

    public final ck2 a(String str, xj2 xj2Var, wj2 wj2Var) {
        return new ck2(this.a, str, xj2Var, wj2Var);
    }
}