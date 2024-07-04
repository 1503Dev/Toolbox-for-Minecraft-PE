package defpackage;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: i63  reason: default package */
public final class i63 implements w53 {
    public final xh4 a;

    public i63(xh4 xh4Var) {
        this.a = xh4Var;
    }

    @Override // defpackage.w53
    public final void a(HashMap hashMap) {
        String str = (String) hashMap.get("render_in_browser");
        if (!TextUtils.isEmpty(str)) {
            try {
                xh4 xh4Var = this.a;
                if (Boolean.parseBoolean(str)) {
                    xh4Var.b(1, 2);
                } else {
                    xh4Var.b(2, 1);
                }
            } catch (Exception unused) {
                throw new IllegalStateException("Invalid render_in_browser state");
            }
        }
    }
}