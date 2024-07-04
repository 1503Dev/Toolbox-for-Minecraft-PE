package defpackage;

import android.os.IBinder;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: tf2  reason: default package */
public final class tf2 implements mg2 {
    @Override // defpackage.mg2
    public final void b(Object obj, Map map) {
        int i;
        float f;
        String str;
        y03 y03Var = (y03) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            str = "Missing App Id, cannot show LMD Overlay without it";
        } else {
            lr4 lr4Var = new lr4();
            lr4Var.p(8388691);
            lr4Var.q(-1.0f);
            lr4Var.W = (byte) (((byte) (lr4Var.W | 8)) | 1);
            lr4Var.R = (String) map.get("appId");
            lr4Var.U = y03Var.getWidth();
            lr4Var.W = (byte) (lr4Var.W | 16);
            IBinder windowToken = y03Var.x().getWindowToken();
            if (windowToken != null) {
                lr4Var.Q = windowToken;
                if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
                    i = Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY"));
                } else {
                    i = 81;
                }
                lr4Var.p(i);
                if (map.containsKey("verticalMargin")) {
                    f = Float.parseFloat((String) map.get("verticalMargin"));
                } else {
                    f = 0.02f;
                }
                lr4Var.q(f);
                if (map.containsKey("enifd")) {
                    lr4Var.V = (String) map.get("enifd");
                }
                try {
                    jv5.A.q.d(y03Var, lr4Var.r());
                    return;
                } catch (NullPointerException e) {
                    jv5.A.g.f("DefaultGmsgHandlers.ShowLMDOverlay", e);
                    str = "Missing parameters for LMD Overlay show request";
                }
            } else {
                throw new NullPointerException("Null windowToken");
            }
        }
        vz3.k(str);
    }
}