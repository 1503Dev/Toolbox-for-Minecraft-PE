package defpackage;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: c63  reason: default package */
public final class c63 implements w53 {
    public final cu3 a;

    public c63(cu3 cu3Var) {
        this.a = cu3Var;
    }

    @Override // defpackage.w53
    public final void a(HashMap hashMap) {
        char c;
        cu3 cu3Var;
        yt3 yt3Var;
        String str = (String) hashMap.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 97520651) {
            if (hashCode == 109399814 && str.equals("shake")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("flick")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                cu3Var = this.a;
                yt3Var = yt3.NONE;
            } else {
                cu3Var = this.a;
                yt3Var = yt3.FLICK;
            }
        } else {
            cu3Var = this.a;
            yt3Var = yt3.SHAKE;
        }
        cu3Var.j(yt3Var, true);
    }
}