package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

/* renamed from: wj1  reason: default package */
public final class wj1 {
    public static final boolean a(Context context, Intent intent, b16 b16Var, zy5 zy5Var, boolean z) {
        int i;
        if (z) {
            Uri data = intent.getData();
            try {
                jv5.A.c.getClass();
                i = cu5.v(context, data);
                if (b16Var != null) {
                    b16Var.h();
                }
            } catch (ActivityNotFoundException e) {
                sv2.g(e.getMessage());
                i = 6;
            }
            if (zy5Var != null) {
                zy5Var.B(i);
            }
            if (i == 5) {
                return true;
            }
            return false;
        }
        try {
            String uri = intent.toURI();
            vz3.k("Launching an intent: " + uri);
            cu5 cu5Var = jv5.A.c;
            cu5.l(context, intent);
            if (b16Var != null) {
                b16Var.h();
            }
            if (zy5Var != null) {
                zy5Var.d(true);
            }
            return true;
        } catch (ActivityNotFoundException e2) {
            sv2.g(e2.getMessage());
            if (zy5Var != null) {
                zy5Var.d(false);
            }
            return false;
        }
    }

    public static final boolean b(Context context, tw2 tw2Var, b16 b16Var, zy5 zy5Var) {
        String concat;
        int i = 0;
        if (tw2Var == null) {
            concat = "No intent data for launcher overlay.";
        } else {
            x92.a(context);
            Intent intent = tw2Var.W;
            if (intent == null) {
                intent = new Intent();
                if (TextUtils.isEmpty(tw2Var.Q)) {
                    concat = "Open GMSG did not contain a URL.";
                } else {
                    if (!TextUtils.isEmpty(tw2Var.R)) {
                        intent.setDataAndType(Uri.parse(tw2Var.Q), tw2Var.R);
                    } else {
                        intent.setData(Uri.parse(tw2Var.Q));
                    }
                    intent.setAction("android.intent.action.VIEW");
                    if (!TextUtils.isEmpty(tw2Var.S)) {
                        intent.setPackage(tw2Var.S);
                    }
                    if (!TextUtils.isEmpty(tw2Var.T)) {
                        String[] split = tw2Var.T.split("/", 2);
                        if (split.length < 2) {
                            concat = "Could not parse component name from open GMSG: ".concat(String.valueOf(tw2Var.T));
                        } else {
                            intent.setClassName(split[0], split[1]);
                        }
                    }
                    String str = tw2Var.U;
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            i = Integer.parseInt(str);
                        } catch (NumberFormatException unused) {
                            sv2.g("Could not parse intent flags.");
                        }
                        intent.addFlags(i);
                    }
                    l92 l92Var = x92.I3;
                    w82 w82Var = w82.d;
                    if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                        intent.addFlags(268435456);
                        intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
                    } else {
                        if (((Boolean) w82Var.c.a(x92.H3)).booleanValue()) {
                            cu5 cu5Var = jv5.A.c;
                            cu5.x(context, intent);
                        }
                    }
                }
            }
            return a(context, intent, b16Var, zy5Var, tw2Var.Y);
        }
        sv2.g(concat);
        return false;
    }
}