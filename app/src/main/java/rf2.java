package defpackage;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: rf2  reason: default package */
public final class rf2 implements mg2 {
    @Override // defpackage.mg2
    public final /* bridge */ /* synthetic */ void b(Object obj, Map map) {
        JSONObject c;
        y03 y03Var = (y03) obj;
        mc2 d0 = y03Var.d0();
        if (d0 == null || (c = d0.c()) == null) {
            y03Var.p("nativeClickMetaReady", new JSONObject());
        } else {
            y03Var.p("nativeClickMetaReady", c);
        }
    }
}