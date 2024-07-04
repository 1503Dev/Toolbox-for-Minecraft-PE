package defpackage;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: qf2  reason: default package */
public final class qf2 implements mg2 {
    @Override // defpackage.mg2
    public final /* bridge */ /* synthetic */ void b(Object obj, Map map) {
        JSONObject mo6a;
        y03 y03Var = (y03) obj;
        mc2 d0 = y03Var.d0();
        if (d0 == null || (mo6a = d0.mo6a()) == null) {
            y03Var.p("nativeAdViewSignalsReady", new JSONObject());
        } else {
            y03Var.p("nativeAdViewSignalsReady", mo6a);
        }
    }
}