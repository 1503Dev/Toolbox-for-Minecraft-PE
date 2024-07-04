package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* renamed from: yg2  reason: default package */
public final class yg2 implements mg2 {
    public final Object P = new Object();
    public final HashMap Q = new HashMap();

    @Override // defpackage.mg2
    public final void b(Object obj, Map map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String concat = TextUtils.isEmpty(str4) ? "" : "\n".concat(String.valueOf(str4));
        synchronized (this.P) {
            xg2 xg2Var = (xg2) this.Q.remove(str);
            if (xg2Var == null) {
                sv2.g("Received result for unexpected method invocation: " + str);
            } else if (!TextUtils.isEmpty(str2)) {
                xg2Var.m(str3 + concat);
            } else if (str5 == null) {
                xg2Var.n(null);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (vz3.m()) {
                        String jSONObject2 = jSONObject.toString(2);
                        vz3.k("Result GMSG: " + jSONObject2);
                    }
                    xg2Var.n(jSONObject);
                } catch (JSONException e) {
                    xg2Var.m(e.getMessage());
                }
            }
        }
    }
}