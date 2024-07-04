package defpackage;

import android.content.Context;
import java.util.HashMap;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@Deprecated
/* renamed from: ka2  reason: default package */
public final class ka2 implements pt2, wy4 {
    public final Object P;
    public final Object Q;

    public /* synthetic */ ka2() {
        fo4 fo4Var = new fo4();
        this.P = fo4Var;
        this.Q = new e83(5, fo4Var);
    }

    public /* synthetic */ ka2(Context context, String str) {
        this.P = context;
        this.Q = str;
    }

    public /* synthetic */ ka2(la2 la2Var) {
        this.Q = la2Var;
        this.P = new HashMap();
    }

    public /* synthetic */ ka2(qu3 qu3Var, String str) {
        this.Q = qu3Var;
        this.P = str;
    }

    @Override // defpackage.pt2
    public final void c(m23 m23Var) {
        Context context = (Context) this.P;
        m23Var.Y2(new va0(context), (String) this.Q, context.getPackageName());
    }

    @Override // defpackage.wy4
    public final void f(Object obj) {
        ((ut3) obj).Z = true;
        ((qu3) this.Q).R.e((String) this.P);
    }

    @Override // defpackage.wy4
    public final void h(Throwable th) {
    }
}