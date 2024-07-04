package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: bh2  reason: default package */
public final class bh2 implements mg2 {
    public final Context P;

    public bh2(Context context) {
        this.P = context;
    }

    @Override // defpackage.mg2
    public final void b(Object obj, Map map) {
        if (map.containsKey("text") && !TextUtils.isEmpty((CharSequence) map.get("text"))) {
            vz3.k("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
            if (map.containsKey("title")) {
                intent.putExtra("android.intent.extra.TITLE", (String) map.get("title"));
            }
            try {
                cu5 cu5Var = jv5.A.c;
                cu5.l(this.P, intent);
            } catch (ActivityNotFoundException e) {
                jv5.A.g.f("ShareSheetGmsgHandler.onGmsg", e);
            }
        }
    }
}