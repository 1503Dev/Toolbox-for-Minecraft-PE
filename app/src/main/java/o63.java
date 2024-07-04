package defpackage;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: o63  reason: default package */
public final class o63 implements w53 {
    public final cu3 a;

    public o63(cu3 cu3Var) {
        this.a = cu3Var;
    }

    @Override // defpackage.w53
    public final void a(HashMap hashMap) {
        String str = (String) hashMap.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.e(str.equals("true"));
    }
}