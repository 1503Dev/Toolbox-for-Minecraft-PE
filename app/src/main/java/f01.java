package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* renamed from: f01  reason: default package */
public final class f01 {
    public static void a(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            e01.a(charSequence, view);
            return;
        }
        g01 g01Var = g01.Y;
        if (g01Var != null && g01Var.P == view) {
            g01.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new g01(charSequence, view);
            return;
        }
        g01 g01Var2 = g01.Z;
        if (g01Var2 != null && g01Var2.P == view) {
            g01Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}