package defpackage;

import android.net.Uri;

/* renamed from: s13  reason: default package */
public final /* synthetic */ class s13 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;

    public /* synthetic */ s13(int i, Object obj, Object obj2) {
        this.P = i;
        this.Q = obj;
        this.R = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                wk1 wk1Var = ((t13) this.Q).b;
                Uri parse = Uri.parse((String) this.R);
                g13 g13Var = ((o13) ((y03) wk1Var.P)).e0;
                if (g13Var == null) {
                    sv2.d("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                    return;
                } else {
                    g13Var.m(parse);
                    return;
                }
            default:
                ((dh4) this.Q).T.e.p((tz3) this.R);
                return;
        }
    }
}