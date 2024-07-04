package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: o82  reason: default package */
public final class o82 {
    public final Context a;
    public boolean b;
    public final ys2 c;
    public final up2 d = new up2(Collections.emptyList(), false);

    public o82(Context context, ys2 ys2Var) {
        this.a = context;
        this.c = ys2Var;
    }

    public final void a(String str) {
        boolean z;
        List<String> list;
        ys2 ys2Var = this.c;
        if ((ys2Var != null && ys2Var.a().U) || this.d.P) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        if (str == null) {
            str = "";
        }
        ys2 ys2Var2 = this.c;
        if (ys2Var2 != null) {
            ys2Var2.X(str, null, 3);
            return;
        }
        up2 up2Var = this.d;
        if (up2Var.P && (list = up2Var.Q) != null) {
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    cu5 cu5Var = jv5.A.c;
                    cu5.f(this.a, "", replace);
                }
            }
        }
    }

    public final boolean b() {
        boolean z;
        ys2 ys2Var = this.c;
        if ((ys2Var != null && ys2Var.a().U) || this.d.P) {
            z = true;
        } else {
            z = false;
        }
        if (z && !this.b) {
            return false;
        }
        return true;
    }
}