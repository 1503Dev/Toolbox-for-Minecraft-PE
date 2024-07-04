package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: lo5  reason: default package */
public final class lo5 extends WebViewClient {
    public final /* synthetic */ gu5 a;

    public lo5(gu5 gu5Var) {
        this.a = gu5Var;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        gf2 gf2Var = this.a.V;
        if (gf2Var != null) {
            try {
                gf2Var.p(oj4.d(1, null, null));
            } catch (RemoteException e) {
                sv2.i("#007 Could not call remote method.", e);
            }
        }
        gf2 gf2Var2 = this.a.V;
        if (gf2Var2 != null) {
            try {
                gf2Var2.y(0);
            } catch (RemoteException e2) {
                sv2.i("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        int i = 0;
        if (str.startsWith(this.a.q())) {
            return false;
        }
        try {
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            gf2 gf2Var = this.a.V;
            if (gf2Var != null) {
                try {
                    gf2Var.p(oj4.d(3, null, null));
                } catch (RemoteException e2) {
                    sv2.i("#007 Could not call remote method.", e2);
                }
            }
            gf2 gf2Var2 = this.a.V;
            if (gf2Var2 != null) {
                gf2Var2.y(3);
            }
            this.a.t4(i);
            return true;
        }
        if (str.startsWith("gmsg://scriptLoadFailed")) {
            gf2 gf2Var3 = this.a.V;
            if (gf2Var3 != null) {
                try {
                    gf2Var3.p(oj4.d(1, null, null));
                } catch (RemoteException e3) {
                    sv2.i("#007 Could not call remote method.", e3);
                }
            }
            gf2 gf2Var4 = this.a.V;
            if (gf2Var4 != null) {
                gf2Var4.y(0);
            }
        } else if (str.startsWith("gmsg://adResized")) {
            gf2 gf2Var5 = this.a.V;
            if (gf2Var5 != null) {
                try {
                    gf2Var5.g();
                } catch (RemoteException e4) {
                    sv2.i("#007 Could not call remote method.", e4);
                }
            }
            gu5 gu5Var = this.a;
            gu5Var.getClass();
            String queryParameter = Uri.parse(str).getQueryParameter("height");
            if (!TextUtils.isEmpty(queryParameter)) {
                try {
                    mv2 mv2Var = n62.f.a;
                    i = mv2.k(gu5Var.S, Integer.parseInt(queryParameter));
                } catch (NumberFormatException unused) {
                }
            }
        } else if (str.startsWith("gmsg://")) {
            return true;
        } else {
            gf2 gf2Var6 = this.a.V;
            if (gf2Var6 != null) {
                try {
                    gf2Var6.d();
                    this.a.V.f();
                } catch (RemoteException e5) {
                    sv2.i("#007 Could not call remote method.", e5);
                }
            }
            gu5 gu5Var2 = this.a;
            if (gu5Var2.W != null) {
                Uri parse = Uri.parse(str);
                try {
                    parse = gu5Var2.W.a(parse, gu5Var2.S, null, null);
                } catch (sz1 e6) {
                    sv2.h("Unable to process ad data", e6);
                }
                str = parse.toString();
            }
            gu5 gu5Var3 = this.a;
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            gu5Var3.S.startActivity(intent);
            return true;
        }
        this.a.t4(i);
        return true;
        this.a.t4(i);
        return true;
    }
}