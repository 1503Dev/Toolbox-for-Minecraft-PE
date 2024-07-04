package defpackage;

import java.io.IOException;
import java.util.Map;

/* renamed from: yf2  reason: default package */
public final class yf2 implements mg2 {
    @Override // defpackage.mg2
    public final void b(Object obj, Map map) {
        y03 y03Var = (y03) obj;
        try {
            String str = (String) map.get("enabled");
            if (!q05.m("true", str) && !q05.m("false", str)) {
                return;
            }
            gr4.f(y03Var.getContext()).f.a("paidv2_user_option", Boolean.valueOf(Boolean.parseBoolean(str)));
        } catch (IOException e) {
            jv5.A.g.f("DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled", e);
        }
    }
}