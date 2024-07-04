package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;

/* renamed from: t13  reason: default package */
public final class t13 {
    public final u13 a;
    public final wk1 b;

    public t13(u13 u13Var, wk1 wk1Var) {
        this.b = wk1Var;
        this.a = u13Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [u13, e23] */
    @JavascriptInterface
    public String getClickSignals(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "Click string is empty, not proceeding.";
        } else {
            ?? r0 = this.a;
            rz1 r = r0.r();
            if (r == null) {
                str2 = "Signal utils is empty, ignoring.";
            } else {
                nz1 nz1Var = r.b;
                if (nz1Var == null) {
                    str2 = "Signals object is empty, ignoring.";
                } else if (r0.getContext() == null) {
                    str2 = "Context is null, ignoring.";
                } else {
                    Context context = this.a.getContext();
                    u13 u13Var = this.a;
                    return nz1Var.i(context, str, (View) u13Var, u13Var.g());
                }
            }
        }
        vz3.k(str2);
        return "";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [u13, e23] */
    @JavascriptInterface
    public String getViewSignals() {
        String str;
        ?? r0 = this.a;
        rz1 r = r0.r();
        if (r == null) {
            str = "Signal utils is empty, ignoring.";
        } else {
            nz1 nz1Var = r.b;
            if (nz1Var == null) {
                str = "Signals object is empty, ignoring.";
            } else if (r0.getContext() == null) {
                str = "Context is null, ignoring.";
            } else {
                Context context = this.a.getContext();
                u13 u13Var = this.a;
                return nz1Var.e(context, (View) u13Var, u13Var.g());
            }
        }
        vz3.k(str);
        return "";
    }

    @JavascriptInterface
    public void notify(String str) {
        if (TextUtils.isEmpty(str)) {
            sv2.g("URL is empty, ignoring message");
        } else {
            cu5.i.post(new s13(0, this, str));
        }
    }
}