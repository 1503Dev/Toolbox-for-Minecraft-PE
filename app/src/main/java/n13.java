package defpackage;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: n13  reason: default package */
public final class n13 implements mg2 {
    public final /* synthetic */ o13 P;

    public n13(o13 o13Var) {
        this.P = o13Var;
    }

    @Override // defpackage.mg2
    public final /* bridge */ /* synthetic */ void b(Object obj, Map map) {
        y03 y03Var = (y03) obj;
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.P) {
                        o13 o13Var = this.P;
                        if (o13Var.x0 != parseInt) {
                            o13Var.x0 = parseInt;
                            o13Var.requestLayout();
                        }
                    }
                } catch (Exception e) {
                    sv2.h("Exception occurred while getting webview content height", e);
                }
            }
        }
    }
}